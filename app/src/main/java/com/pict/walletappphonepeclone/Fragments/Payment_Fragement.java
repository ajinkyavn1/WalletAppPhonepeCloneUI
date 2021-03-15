package com.pict.walletappphonepeclone.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;
import com.pict.walletappphonepeclone.R;


public class Payment_Fragement extends Fragment {

  View view;
  CodeScanner codeScanner;
  CodeScannerView scannerView;

    public Payment_Fragement() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_payment__fragement, container, false);
       scannerView=view.findViewById(R.id.scanner_view);
       codeScanner=new CodeScanner(getContext(),scannerView);
       codeScanner.startPreview();
        codeScanner.setDecodeCallback(new DecodeCallback() {
           @Override
           public void onDecoded(@NonNull Result result) {
               getActivity().runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       Toast.makeText(getContext(),result.getText(),Toast.LENGTH_SHORT).show();
                   }
               });
           }
       });
       return  view;
    }
    @Override
    public void onResume() {
        super.onResume();
        codeScanner.startPreview();
    }
}