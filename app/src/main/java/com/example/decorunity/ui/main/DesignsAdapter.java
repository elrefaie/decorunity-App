package com.example.decorunity.ui.main;

import android.media.ImageReader;
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
import com.example.decorunity.pojo.DesignModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DesignsAdapter extends RecyclerView.Adapter<DesignsAdapter.DesignViewHolder> implements Filterable {
    private List<DesignModel> designsList = new ArrayList<>();
    private Set<Integer> favorite_Set = new HashSet<Integer>();
    private     Set<Integer> share_Set = new HashSet<Integer>();
    List<DesignModel> designlistAll;
    private RVClick rvClick;

    public DesignsAdapter(RVClick rvClick){
        this.rvClick=rvClick;
    }
    public DesignsAdapter(){
        this.designsList=designsList;
        designlistAll=new ArrayList<>(designsList);
    }
    @NonNull
    @Override
    public DesignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_designs, parent,false);
        final DesignViewHolder holder = new DesignViewHolder(view);

        holder.favorite_icon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("position", "" +holder.getAdapterPosition()) ;
                //   if(  holder.favorite_icon.getDrawable().getConstantState().equals (holder.getResources().getDrawable(R.drawable.favorite_border).getConstantState()))

                if(v.getId()==R.id.favorite){

                    if (favorite_Set.contains(holder.getAdapterPosition())){
                        favorite_Set.remove(holder.getAdapterPosition());
                        holder.favorite_icon.setImageResource(R.drawable.favorite_border);
                    }
                    else {
                        favorite_Set.add(holder.getAdapterPosition());
                        holder.favorite_icon.setImageResource(R.drawable.favorite);
                    }

                }
            }
        });
        return holder;
        // return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_designs, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final DesignViewHolder holder, final int position) {
        holder.descriptionTV.setText(designsList.get(position).getDesciption());
        holder.userTV.setText(designsList.get(position).getDesignerName());
        holder.priceTV.setText(designsList.get(position).getDesignPrice());
        holder.imageView.setImageResource(designsList.get(position).getDesignImg());


        if (favorite_Set.contains(position)){

            holder.favorite_icon.setImageResource(R.drawable.favorite);
        }
        else {

            holder.favorite_icon.setImageResource(R.drawable.favorite_border);
        }

        holder.share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.e("Elrefaie","TEST");

            }
        });
    }

    @Override
    public int getItemCount() {
        return designsList.size();
    }

    public void setList(List<DesignModel> designsList) {
        this.designsList = designsList;
        designlistAll=new ArrayList<>(designsList);
        notifyDataSetChanged();
    }


    public class DesignViewHolder extends RecyclerView.ViewHolder {
        TextView descriptionTV, userTV, priceTV;
        ImageView imageView,favorite_icon,share;
        RecyclerView index;


        public DesignViewHolder(@NonNull View itemView) {
            super(itemView);
            descriptionTV = itemView.findViewById(R.id.desc);
            userTV = itemView.findViewById(R.id.username);
            priceTV = itemView.findViewById(R.id.price);
            imageView=itemView.findViewById(R.id.img);
            favorite_icon=itemView.findViewById(R.id.favorite);
            share=itemView.findViewById(R.id.share);
            index=itemView.findViewById(R.id.searchRV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    rvClick.onItemClick(getAdapterPosition());
                }
            });

        }}
    @Override
    public Filter getFilter() {
        return designsFilter;
    }
    Filter designsFilter=new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<DesignModel> filteredDesigns=new ArrayList<>();


            if (constraint.toString().isEmpty()){
                filteredDesigns.addAll(designlistAll);
            }else{
                String filterPattern=constraint.toString().toLowerCase().trim();
                for (DesignModel item:designlistAll){
                    //startsWith(filterPattern)
                    //contains(filterPattern)
                    if(item.getDesignerName().toLowerCase().contains(filterPattern)){
                        filteredDesigns.add(item);} } }



            FilterResults results=new FilterResults();
            results.values=filteredDesigns;
            return results;
        }
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            designsList.clear();

            designsList.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };
}