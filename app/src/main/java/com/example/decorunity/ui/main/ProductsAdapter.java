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
import com.example.decorunity.pojo.ProductModel;

import java.util.ArrayList;
import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> implements Filterable {
    private List<ProductModel> productsList = new ArrayList<>();
    private List<ProductModel> producrsListFull = new ArrayList<>();

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_products, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.productNameTV.setText(productsList.get(position).getProductName());
        holder.brandTV.setText(productsList.get(position).getBrand());
        holder.priceTV.setText(productsList.get(position).getProductPrice());
        holder.productImage.setImageResource(productsList.get(position).getProductImg());
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }

    public void setList(List<ProductModel> designsList) {
        this.productsList = designsList;
        producrsListFull = new ArrayList<>(designsList);
        notifyDataSetChanged();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView brandTV, productNameTV, priceTV;
        ImageView productImage;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            brandTV = itemView.findViewById(R.id.product_brand);
            productNameTV = itemView.findViewById(R.id.product_name);
            priceTV = itemView.findViewById(R.id.product_price);
            productImage = itemView.findViewById(R.id.product_img);

        }
    }

    @Override
    public Filter getFilter() {
        return productFilter;
    }

    private Filter productFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ProductModel> filteredProduct=new ArrayList<>();
            if(constraint==null||constraint.length()==0)
            {
                filteredProduct.addAll(producrsListFull);
            }
            else {

                String filtterPattern=constraint.toString().toLowerCase().trim();
                for (ProductModel item:producrsListFull){
                    if(item.getProductName().toLowerCase().contains(filtterPattern)){

                        filteredProduct.add(item);
                    }



                }
            }
            FilterResults results=new FilterResults();
            results.values=filteredProduct;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            productsList.clear();
            productsList.addAll((List)results.values);
            notifyDataSetChanged();

        }


    };
}

