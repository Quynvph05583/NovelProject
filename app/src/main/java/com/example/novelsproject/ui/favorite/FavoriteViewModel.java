package com.example.novelsproject.ui.favorite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoriteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FavoriteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Truyện yêu thích");
    }

    public LiveData<String> getText() {
        return mText;
    }
}