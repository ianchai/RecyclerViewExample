package com.lomaikai.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Create object for Recycler View
    private RecyclerView contextRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LIk the object to the UI element
        contextRecView=findViewById(R.id.contextRecView);

    }
}