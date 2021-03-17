package com.pict.walletappphonepeclone.Fragments;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;
import com.pict.walletappphonepeclone.Activityw.Payment;
import com.pict.walletappphonepeclone.R;

import java.security.Permission;
import java.security.Permissions;


public class Payment_Fragement extends Fragment {

    View view;
    EditText UPI;
    Button PAY;
    CodeScanner codeScanner;
    CodeScannerView scannerView;

    public Payment_Fragement() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_payment__fragement, container, false);
        scannerView = view.findViewById(R.id.scanner_view);
        codeScanner = new CodeScanner(getContext(), scannerView);
        UPI=view.findViewById(R.id.UPI);
        PAY=view.findViewById(R.id.Pay);
        scanner();


        PAY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String upi=UPI.getText().toString().trim();
                validate(upi);
            }
        });
        return view;
    }

    private void scanner() {
        codeScanner.startPreview();
        codeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull Result result) {
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        String upi=UPI.getText().toString().trim();
                        validate(upi);
                        Toast.makeText(getContext(), result.getText(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void validate(String upi) {
        if(upi==""&&upi.length()<5)
        {
            Toast.makeText(getActivity(),"Please Provide a Valid UPI ID",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent=new Intent(getActivity(),Payment.class);
            intent.putExtra("UPI",upi);
            startActivity(intent);

        }
    }


}