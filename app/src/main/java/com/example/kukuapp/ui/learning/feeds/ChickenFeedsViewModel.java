package com.example.kukuapp.ui.learning.feeds;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChickenFeedsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ChickenFeedsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chicken Feeds");
    }



    public LiveData<String> getText() {
        return mText;
    }
}