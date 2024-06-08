package com.example.desafio_prueba_email.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavHost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desafio_prueba_email.R;

public class NavHostFragment extends Fragment implements NavHost{

    View view;

    public NavHostFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_form, container, false);

        return view;
    }
}