package com.example.kukuapp.ui.learning.health;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChickenHealthViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ChickenHealthViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chicken Health");
    }



    public LiveData<String> getText() {
        return mText;
    }
}