package com.android.foodmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> al_img_Food = new ArrayList<>();
    private ArrayList<String> al_name_Food = new ArrayList<>();
    private ArrayList<String> al_desc_Food = new ArrayList<>();
    private ArrayList<String> al_price_Food = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

    }

    private void RecycleViewAdapterProccess(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(al_img_Food, al_name_Food, al_desc_Food, al_price_Food, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData(){
        al_img_Food.add("https://i.pinimg.com/564x/96/42/d5/9642d5a40071a04be0ef3e4f5fb3612e.jpg");
        al_name_Food.add("Ayam Goreng");
        al_desc_Food.add("Berisikan Nasi dan Ayam Goreng");
        al_price_Food.add("Rp15.000");

        al_img_Food.add("https://www.femina.co.id/images/images/dalam%2869%29.jpg");
        al_name_Food.add("Ayam Krispi");
        al_desc_Food.add("Berisikan Nasi dan Ayam Krispi");
        al_price_Food.add("Rp15.000");

        al_img_Food.add("https://media.istockphoto.com/photos/nasi-goreng-indonesian-friedrice-dish-with-egg-and-chicken-satay-picture-id514825223?k=20&m=514825223&s=612x612&w=0&h=CbwEFFPLYHCdwx1VGKFI6woSmKKKHruW43rvLfhPE30=");
        al_name_Food.add("Nasi Goreng");
        al_desc_Food.add("Berisikan Nasi Goreng dan Telor");
        al_price_Food.add("Rp10.000");

        al_img_Food.add("https://awsimages.detik.net.id/community/media/visual/2019/09/12/a3625622-c3fe-4984-91b5-37cfbcc04805.jpeg?w=700&q=90");
        al_name_Food.add("Mie Goreng");
        al_desc_Food.add("Berisikan Mie Goreng dan Telor");
        al_price_Food.add("Rp10.000");

        al_img_Food.add("https://s2.bukalapak.com/uploads/content_attachment/2ca37d71757b095980725da5/original/foto_utama_mie_ayam.jpg");
        al_name_Food.add("Mie Ayam");
        al_desc_Food.add("Berisikan Mie dan Ayam Potong");
        al_price_Food.add("Rp10.000");

        al_img_Food.add("https://rivaldysite.files.wordpress.com/2017/07/bakso.jpg");
        al_name_Food.add("Bakso");
        al_desc_Food.add("Berisikan Bulatan Bakso dan Kuah");
        al_price_Food.add("Rp10.000");

        al_img_Food.add("https://img-global.cpcdn.com/recipes/976c757d5bff074a/751x532cq70/soto-ayam-sokaraja-foto-resep-utama.jpg");
        al_name_Food.add("Soto");
        al_desc_Food.add("Berisikan Kuah Soto dan Nasi");
        al_price_Food.add("Rp10.000");

        al_img_Food.add("https://www.woke.id/wp-content/uploads/2019/09/sate-nusantara-12-famous-satay-from-indonesia-indoindians-758x500.jpg");
        al_name_Food.add("Sate Ayam");
        al_desc_Food.add("Berisika Ayam tusuk yang dibakar");
        al_price_Food.add("Rp12.000");

        al_img_Food.add("https://asset.kompas.com/crops/_lIfAkUSzNG4uABHbGRjz5KmrAs=/0x0:1000x667/750x500/data/photo/2020/07/29/5f21800132f87.jpg");
        al_name_Food.add("Bubur Ayam");
        al_desc_Food.add("Berisikan Bubur dan Ayam Suwir");
        al_price_Food.add("Rp13.000");

        al_img_Food.add("https://yentit.com/wp-content/uploads/2021/02/sop-10.png");
        al_name_Food.add("Sayur Sop");
        al_desc_Food.add("Berisikan Kuah dan Sayur");
        al_price_Food.add("Rp10.000");

        RecycleViewAdapterProccess();
    }
}