package com.example.kazajii.local;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PharmacieAdapter extends RecyclerView.Adapter<PharmacieAdapter.MyViewHolder>{

    List<Pharmacie> mPharmacieList;
    Context mContext;

    public PharmacieAdapter(List<Pharmacie> pharmacieList, Context context) {
        mPharmacieList = pharmacieList;
        mContext = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.pharmacie_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.description.setText(mPharmacieList.get(position).Description);
        holder.nom.setText(mPharmacieList.get(position).Name);
        holder.mImageView.setImageResource(mPharmacieList.get(position).Image);
    }

    @Override
    public int getItemCount() {
        return mPharmacieList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageView;
        private TextView nom;
        private TextView description;

        public MyViewHolder(View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.pharmacie_item_img);
            nom = itemView.findViewById(R.id.pharmacie_item_name);
            description = itemView.findViewById(R.id.pharmacie_item_desc);
        }
    }
}