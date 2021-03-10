package com.pict.walletappphonepeclone.Activityw;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.pict.walletappphonepeclone.R;

public class Add_Money extends AppCompatActivity {
    Button ADDMONEY;
    ProgressDialog pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__money);
        pb=new ProgressDialog(this);
        ADDMONEY=findViewById(R.id.Addmoney);
        ADDMONEY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pb.setTitle("Payment Processing.....");
                pb.show();
                processPayment();
            }
        });
    }

    private void processPayment() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pb.cancel();
            }
        },5000);

    }
}