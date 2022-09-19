package com.example.classwork5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Items> ItemsList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items item1 = new Items("Milk" , 0.500 , R.drawable.milk);
        Items item2 = new Items("Eggs" , 2.750 , R.drawable.eggs);
        Items item3 = new Items("Cheese" , 0.750 , R.drawable.cheese);
        Items item4 = new Items("Apples" , 0.300 , R.drawable.apple);
        Items item5 = new Items("Lettuce" , 1.500 , R.drawable.lettuce);
        Items item6 = new Items("Bread" , 0.150 , R.drawable.bread);

        ItemsList.add(item1);
        ItemsList.add(item2);
        ItemsList.add(item3);
        ItemsList.add(item4);
        ItemsList.add(item5);
        ItemsList.add(item6);

        RecyclerView recycler = findViewById(R.id.rv);
        recycler.setHasFixedSize(true);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recycler.setLayoutManager(manager);

        ItemAdapter adapter = new ItemAdapter(ItemsList, this);
        recycler.setAdapter(adapter);

    }
}