package com.example.kukuapp.ui.learning.feeds;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kukuapp.databinding.FragmentChickenFeedsBinding;

public class ChickenFeedsFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ChickenFeedsViewModel mViewModel = new ViewModelProvider(this).get(ChickenFeedsViewModel.class);
        com.example.kukuapp.databinding.FragmentChickenFeedsBinding binding = FragmentChickenFeedsBinding.inflate(inflater, container, false);
        final TextView textView = binding.text;
        mViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return binding.getRoot();
    }



}