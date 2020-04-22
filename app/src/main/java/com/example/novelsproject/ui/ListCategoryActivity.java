package com.example.novelsproject.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.novelsproject.R;
import com.example.novelsproject.dao.CategoryDao;
import com.example.novelsproject.db.ConnectionDB;

import java.util.ArrayList;


public class ListCategoryActivity extends AppCompatActivity {
   ListView listCategory;
   ArrayList list = new ArrayList();
   ConnectionDB connectionDB;
   CategoryDao categoryDao = new CategoryDao();
   @Override
    protected void onCreate(Bundle saveInstanceState){
       super.onCreate(saveInstanceState);
       setContentView(R.layout.activity_categorys);

       listCategory = (ListView) findViewById(R.id.listCategory);
       list = categoryDao.getListCategory();
       ArrayAdapter adapter = new ArrayAdapter(ListCategoryActivity.this,
               android.R.layout.simple_list_item_1, list);
       listCategory.setAdapter(adapter);
   }

}
