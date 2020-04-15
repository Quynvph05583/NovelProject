package com.example.novelsproject.ui.theloai;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.novelsproject.Model.Category;
import com.example.novelsproject.db.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TheloaiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TheloaiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Thể loại");
    }

    public LiveData<String> getText() {
        return mText;
    }
}