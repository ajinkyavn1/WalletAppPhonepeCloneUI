package com.pict.walletappphonepeclone.Activityw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.pict.walletappphonepeclone.Fragments.Payment_Fragement;
import com.pict.walletappphonepeclone.Fragments.ProfileFrag;
import com.pict.walletappphonepeclone.R;
import com.squareup.picasso.Picasso;

public class Payment extends AppCompatActivity {

    ImageView Profle_Image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Profle_Image=findViewById(R.id.Profle_Image);

        Picasso.with(getApplicationContext())
                .load(ProfileFrag.profilePath)
                .placeholder(R.drawable.ic_profile_con)
                .fit()
                .into(Profle_Image);
    }
}