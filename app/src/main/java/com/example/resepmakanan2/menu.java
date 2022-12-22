package com.example.resepmakanan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.resepmakanan2.Adapter.AdaperResep;
import com.example.resepmakanan2.Adapter.Resep;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {

    private List<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        for (int i = 0; i < gambarResep.length; i++) {
            Resep resep = new Resep(gambarResep[i],judulResep[i],bahanResep[i],tahapanResep[i],idResepVideo[i]);
            list.add(resep);
        }
        recyclerView.setAdapter(new AdaperResep(this,list));
    }

    private int[] gambarResep = {

    };

    private String[] judulResep = {

    };

    private String[] bahanResep = {

    };

    private String[] tahapanResep = {

    };

    private String[] idResepVideo = {

    };

}