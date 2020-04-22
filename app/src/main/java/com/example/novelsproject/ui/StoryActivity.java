package com.example.novelsproject.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.novelsproject.R;
import androidx.appcompat.app.AppCompatActivity;

import com.example.novelsproject.dao.StoriesDaoImpl;
import com.example.novelsproject.db.ConnectionDB;

import java.util.ArrayList;

public class StoryActivity extends AppCompatActivity {
    ListView story;
    ArrayList list = new ArrayList();
    ConnectionDB connectionDB;
    StoriesDaoImpl storiesDao = new StoriesDaoImpl();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        story = (ListView) findViewById(R.id.story);
        list = storiesDao.getStory();
        ArrayAdapter adapter = new ArrayAdapter(StoryActivity.this,
                android.R.layout.simple_list_item_1, list);
        story.setAdapter(adapter);
    }

}
