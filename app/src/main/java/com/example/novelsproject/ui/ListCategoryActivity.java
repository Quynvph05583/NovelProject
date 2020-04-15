package com.example.novelsproject.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.novelsproject.R;

public class ListCategoryActivity extends BaseAdapter {
    private String[] items;
    private Activity activity;

    public ListCategoryActivity(Activity activity, String[] items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        //Ánh xạ view Data
        LayoutInflater inflater = activity.getLayoutInflater();
         view = inflater.inflate(R.layout.activity_categorys, null);

        Button tvName = (Button)view.findViewById(R.id.btnview);
        tvName.setText(items[i]);
        return view;
    }

}
