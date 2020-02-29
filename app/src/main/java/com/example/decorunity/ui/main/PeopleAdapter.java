package com.example.decorunity.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.decorunity.R;
import com.example.decorunity.pojo.PeopleModel;

import java.util.ArrayList;
import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> implements Filterable {
    private List<PeopleModel> pepoleList = new ArrayList<>();
    private List<PeopleModel> pepoleListFull = new ArrayList<>();

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PeopleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_people, parent, false));
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

    public void setList(List<PeopleModel> pepoleList) {
        this.pepoleList = pepoleList;
        pepoleListFull=new ArrayList<>(pepoleList);
        notifyDataSetChanged();
    }

    public class PeopleViewHolder extends RecyclerView.ViewHolder {
         TextView userNameTV, bioTV;
        ImageView imageView;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
             userNameTV = itemView.findViewById(R.id.username);
             bioTV= itemView.findViewById(R.id.bio);
             imageView = itemView.findViewById(R.id.photo);


        }

    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
