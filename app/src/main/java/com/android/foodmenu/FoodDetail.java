package com.android.foodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FoodDetail extends AppCompatActivity {
    private ImageView img_food;
    private TextView txt_name_food, txt_desc_food, txt_price_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        img_food = findViewById(R.id.detail_imgFood);
        txt_name_food = findViewById(R.id.detail_nameFood);
        txt_desc_food = findViewById(R.id.detail_descFood);
        txt_price_food = findViewById(R.id.detail_priceFood);

        getDataAdapter();
    }

    private void getDataAdapter() {
        if (getIntent().hasExtra("imgFood") && getIntent().hasExtra("nameFood") && getIntent().hasExtra("descFood") && getIntent().hasExtra("priceFood")){
            String image_Makanan = getIntent().getStringExtra("imgFood");
            String name_Makanan = getIntent().getStringExtra("nameFood");
            String desc_Makanan = getIntent().getStringExtra("descFood");
            String price_Makanan = getIntent().getStringExtra("priceFood");

            setDataDetail(image_Makanan, name_Makanan, desc_Makanan, price_Makanan);
        }
    }

    private void setDataDetail(String image_makanan, String name_makanan, String desc_makanan, String price_makanan) {
        Glide.with(this).asBitmap().load(image_makanan).into(img_food);

        txt_name_food.setText(name_makanan);
        txt_desc_food.setText(desc_makanan);
        txt_price_food.setText(price_makanan);
    }


}