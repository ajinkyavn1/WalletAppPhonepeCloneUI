package com.pict.walletappphonepeclone.Activityw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.pict.walletappphonepeclone.R;

public class Register extends AppCompatActivity {
    EditText mobile,password,email,name;
    Button Login,Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
            mobile=findViewById(R.id.input_phone);

    }
}