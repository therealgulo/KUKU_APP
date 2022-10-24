package com.example.kukuapp.ui.learning.housing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChickenHousingViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ChickenHousingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chicken Housing");
    }



    public LiveData<String> getText() {
        return mText;
    }
}