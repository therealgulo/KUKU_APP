package com.example.kukuapp.ui.learning.breeds;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChickenBreedsViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public ChickenBreedsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chicken Breeds");
    }



    public LiveData<String> getText() {
        return mText;
    }
}