package com.example.kukuapp.ui.learning.health;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kukuapp.databinding.FragmentChickenHealthBinding;


public class ChickenHealthFragment extends Fragment {

    private ChickenHealthViewModel mViewModel;
    private FragmentChickenHealthBinding binding;


    public static ChickenHealthFragment newInstance() {
        return new ChickenHealthFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(ChickenHealthViewModel.class);
        binding = FragmentChickenHealthBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.text;
        mViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return  root;
    }



}