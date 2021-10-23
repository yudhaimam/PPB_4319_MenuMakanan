package com.android.foodmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private ArrayList<String> al_img_Food = new ArrayList<>();
    private ArrayList<String> al_name_Food = new ArrayList<>();
    private ArrayList<String> al_desc_Food = new ArrayList<>();
    private ArrayList<String> al_price_Food = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<String> al_img_Food, ArrayList<String> al_name_Food, ArrayList<String> al_desc_Food, ArrayList<String> al_price_Food, Context context) {
        this.al_img_Food = al_img_Food;
        this.al_name_Food = al_name_Food;
        this.al_desc_Food = al_desc_Food;
        this.al_price_Food = al_price_Food;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap().load(al_img_Food.get(position)).into(holder.imgFood);
        holder.txt_nameFood.setText(al_name_Food.get(position));
        holder.txt_descFood.setText(al_desc_Food.get(position));
        holder.txt_priceFood.setText(al_price_Food.get(position));

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, al_name_Food.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, FoodDetail.class);
                intent.putExtra("imgFood", al_img_Food.get(position));
                intent.putExtra("nameFood", al_name_Food.get(position));
                intent.putExtra("descFood", al_desc_Food.get(position));
                intent.putExtra("priceFood", al_price_Food.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return al_name_Food.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgFood;
        TextView txt_nameFood, txt_descFood, txt_priceFood;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.img_food);
            txt_nameFood = itemView.findViewById(R.id.tv_name_food);
            txt_descFood = itemView.findViewById(R.id.tv_desc_food);
            txt_priceFood = itemView.findViewById(R.id.tv_price_food);
            linearLayout = itemView.findViewById(R.id.adapter_constraintLayout);
        }
    }
}
