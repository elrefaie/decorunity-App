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
import com.example.decorunity.pojo.DesignModel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DesignsAdapter extends RecyclerView.Adapter<DesignsAdapter.PostViewHolder> implements Filterable {
    private List<DesignModel> designsList = new ArrayList<>();
    private List<DesignModel> designsListFull = new ArrayList<>();
   private Set<Integer> favorite_Set = new HashSet<Integer>();
    private     Set<Integer> share_Set = new HashSet<Integer>();


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_designs, parent,false);
        final PostViewHolder holder = new PostViewHolder(view);

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
    public void onBindViewHolder(@NonNull final PostViewHolder holder, final int position) {
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
        designsListFull=new ArrayList<>(designsList);
        notifyDataSetChanged();
    }



    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView descriptionTV, userTV, priceTV;
        ImageView imageView,favorite_icon,share;
        RecyclerView index;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            descriptionTV = itemView.findViewById(R.id.desc);
            userTV = itemView.findViewById(R.id.username);
            priceTV = itemView.findViewById(R.id.price);
            imageView=itemView.findViewById(R.id.img);
            favorite_icon=itemView.findViewById(R.id.favorite);
            share=itemView.findViewById(R.id.share);
index=itemView.findViewById(R.id.searchRV);

        }

    }
    @Override
    public Filter getFilter() {
        return null;
    }
}
