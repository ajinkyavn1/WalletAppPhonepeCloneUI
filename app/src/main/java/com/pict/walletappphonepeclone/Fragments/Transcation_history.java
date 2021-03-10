package com.pict.walletappphonepeclone.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pict.walletappphonepeclone.R;


public class Transcation_history extends Fragment {
    View view;
    public Transcation_history() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.transcation_history, container, false);
        return view;
    }
}