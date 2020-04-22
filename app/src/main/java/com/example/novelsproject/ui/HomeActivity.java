package com.example.novelsproject.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.novelsproject.R;


public class HomeActivity extends AppCompatActivity {
    ImageView imgTheloai, imgDanhsach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imgTheloai = findViewById(R.id.imgTheLoai);
        imgDanhsach = findViewById(R.id.imgDanhsach);

        imgTheloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ListCategoryActivity.class));
            }
        });
        imgDanhsach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, ListStoriesActivity.class));
            }
        });
    }
}
