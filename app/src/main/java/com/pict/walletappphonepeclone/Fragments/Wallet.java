package com.pict.walletappphonepeclone.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.pict.walletappphonepeclone.Activityw.Add_Money;
import com.pict.walletappphonepeclone.R;


public class Wallet extends Fragment implements View.OnClickListener {

    View view;
    Button Addmoney,Transactions;

    public Wallet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_wallet, container, false);
        Addmoney=view.findViewById(R.id.Addmoney);
        Transactions=view.findViewById(R.id.Transactions);
        Addmoney.setOnClickListener(this);
        Transactions.setOnClickListener(this);
    return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Addmoney:
                startActivity(new Intent(getContext(), Add_Money.class));
                break;
            case R.id.Transactions:
               getFragmentManager().beginTransaction()
                       .replace(R.id.frame,new Transcation_history())
                       .commit();
        }
    }
}