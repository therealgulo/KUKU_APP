package com.example.kukuapp.ui.home;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kukuapp.R;
import com.example.kukuapp.models.Product;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.Holder> {
    private ArrayList<Product> products = new ArrayList<>();
   private View view;

   private Context context;
   ProductAdapter( Context context){
       this.context = context;
   }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.product_item,parent,false
        );

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
    holder.productName.setText(products.get(position).getName());
    holder.productPrice.setText(String.format("%s", products.get(position).getPrice()));
//    holder.imageView.setImageURI(Uri.parse(products.get(position).getImageUrl()));
        Glide.with(
context
        ).asBitmap().load(products.get(position).getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
        notifyDataSetChanged();
    }

    static class  Holder extends  RecyclerView.ViewHolder{
        TextView productName;
        TextView productPrice;
        ImageView imageView;

        public Holder(@NonNull View itemView) {

            super(itemView);
            productName = itemView.findViewById(R.id.productName);
            productPrice =itemView.findViewById(R.id.productPrice);
            imageView = itemView.findViewById(R.id.productImage);
        }
    }

}
