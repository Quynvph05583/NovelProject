package com.example.novelsproject.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.novelsproject.R;

import java.sql.Statement;

public class HomeActivity extends AppCompatActivity {
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String[] items = {"Quy", "Huy","Dat", "Tai"};
        listview = (ListView)findViewById(R.id.list_view);
        ListCategoryActivity adapter = new ListCategoryActivity(this,items);
        listview.setAdapter(adapter);
    }
}
