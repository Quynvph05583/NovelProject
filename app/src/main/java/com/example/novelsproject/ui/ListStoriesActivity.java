package com.example.novelsproject.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.novelsproject.R;
import com.example.novelsproject.dao.CategoryDao;
import com.example.novelsproject.dao.StoriesDao;
import com.example.novelsproject.db.ConnectionDB;

import java.util.ArrayList;

import adapter.lv_storyApdapter;


public class ListStoriesActivity extends AppCompatActivity {
    ListView listCategory;
    ArrayList list = new ArrayList();
    ConnectionDB connectionDB;
    StoriesDao storiesDao = new StoriesDao();
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_stories);


//        listCategory = (ListView) findViewById(R.id.listCategory);
//        list = storiesDao.getListStories();
//        lv_storyApdapter apdapter = new lv_storyApdapter();
//        listCategory.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//        listCategory.setAdapter(apdapter);
        ArrayAdapter adapter = new ArrayAdapter(ListStoriesActivity.this,
                android.R.layout.simple_list_item_1, list);
        listCategory.setAdapter(adapter);
        startActivity(new Intent(ListStoriesActivity.this, StoryActivity.class));



    }

}
