package com.cst2335.finalproject.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cst2335.finalproject.models.Data;
import com.cst2335.finalproject.adapters.DataAdapter;
import com.cst2335.finalproject.R;
import com.cst2335.finalproject.databases.DatabaseHandler;
import java.util.List;

class StoredActivity extends AppCompatActivity {

    DatabaseHandler databaseHandler;
    RecyclerView recyclerView;
    DataAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stored);

       /* databaseHandler = new DatabaseHandler(StoredActivity.this);

        recyclerView = findViewById(R.id.recycler_view);
        List<Data> dataList = databaseHandler.getAllData();

        dataAdapter = new DataAdapter(StoredActivity.this, dataList, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(StoredActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(dataAdapter);*/
    }
}