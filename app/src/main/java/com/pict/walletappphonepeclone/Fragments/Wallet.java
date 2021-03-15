package com.pict.walletappphonepeclone.Fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.MultiFormatUPCEANReader;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.pict.walletappphonepeclone.Activityw.Add_Money;
import com.pict.walletappphonepeclone.R;


public class Wallet extends Fragment implements View.OnClickListener {

    View view;
    ImageView Barcode;
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
        Barcode=view.findViewById(R.id.MYQR);
        Transactions=view.findViewById(R.id.Transactions);
        Addmoney.setOnClickListener(this);
        Transactions.setOnClickListener(this);
        MultiFormatWriter wr=new MultiFormatWriter();
        try {
            BitMatrix bt=wr.encode("9881211594", BarcodeFormat.QR_CODE,1450,750);
            BarcodeEncoder barcodeEncoder=new BarcodeEncoder();
            Bitmap bitmap=barcodeEncoder.createBitmap(bt);
            Barcode.setImageBitmap(bitmap);

        } catch (WriterException e) {
            e.printStackTrace();
        }
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