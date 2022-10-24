package com.example.kukuapp.ui.learning.housing;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kukuapp.R;
import com.example.kukuapp.databinding.FragmentChickenHousingBinding;

public class ChickenHousingFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ChickenHousingViewModel mViewModel = new ViewModelProvider(this).get(ChickenHousingViewModel.class);
        com.example.kukuapp.databinding.FragmentChickenHousingBinding binding = FragmentChickenHousingBinding.inflate(inflater, container, false);
        final TextView textView = binding.text;

        mViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return  binding.getRoot();

    }



}