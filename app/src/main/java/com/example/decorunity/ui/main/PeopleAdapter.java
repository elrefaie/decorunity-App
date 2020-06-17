package com.example.decorunity.ui.main;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decorunity.R;
import com.example.decorunity.data.RVClick;
import com.example.decorunity.pojo.PeopleModel;

import java.util.ArrayList;
import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> implements Filterable {
    private List<PeopleModel> pepoleList = new ArrayList<>();
    private List<PeopleModel> peoplelistAll= new ArrayList<>();;
    private RVClick rvClick;

    public PeopleAdapter(RVClick rvClick) {
        this.rvClick=rvClick;
    }


    public PeopleAdapter(List<PeopleModel> peopleList) {
        this.pepoleList = peopleList;
        peoplelistAll = new ArrayList<>(peopleList);

    }



    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PeopleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_people, parent, false),rvClick);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
         holder.userNameTV.setText(pepoleList.get(position).getName());
         holder.bioTV.setText(pepoleList.get(position).getBio());
         holder.imageView.setImageResource(pepoleList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return pepoleList.size();
    }

    public void setList(List<PeopleModel> peopleList) {
        this.pepoleList = peopleList;
        peoplelistAll =new ArrayList<>(peopleList);
        notifyDataSetChanged();
    }

    public static class PeopleViewHolder extends RecyclerView.ViewHolder {
         TextView userNameTV, bioTV;
        ImageView imageView;

        public PeopleViewHolder(@NonNull View itemView, final RVClick rvclick) {
            super(itemView);
             userNameTV = itemView.findViewById(R.id.username);
             bioTV= itemView.findViewById(R.id.bio);
             imageView = itemView.findViewById(R.id.photo);

             itemView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                    rvclick.onItemClick(getAdapterPosition());

                 }
             });

        }

    }

    @Override
    public Filter getFilter() {
        return peopleFilter;
    }
    private Filter peopleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<PeopleModel> filteredPeople=new ArrayList<>();
            if(constraint==null||constraint.length()==0)
            { filteredPeople.addAll(peoplelistAll);
            }
            else {
                String filterPattern=constraint.toString().toLowerCase().trim();
                for (PeopleModel item:peoplelistAll){
                    //startsWith(filterPattern)
                    //contains(filterPattern)
                    if(item.getName().toLowerCase().contains(filterPattern)){

                        filteredPeople.add(item);
                    }

                }
            }
            FilterResults results=new FilterResults();
            results.values=filteredPeople;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            pepoleList.clear();
            pepoleList.addAll((List)results.values);
            notifyDataSetChanged();

        }


    };
}

