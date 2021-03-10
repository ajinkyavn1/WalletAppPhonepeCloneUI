package com.pict.walletappphonepeclone.Activityw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.pict.walletappphonepeclone.Fragments.HomeFrag;
import com.pict.walletappphonepeclone.Fragments.Payment_Fragement;
import com.pict.walletappphonepeclone.Fragments.ProfileFrag;
import com.pict.walletappphonepeclone.Fragments.Transcation_history;
import com.pict.walletappphonepeclone.Fragments.Wallet;
import com.pict.walletappphonepeclone.R;
import com.sagarkoli.chetanbottomnavigation.*;

public class DashBord extends AppCompatActivity {

    private final static int home=1;
    private  final static  int Wallet=2;
    private  final static  int pay=3;
    private final static  int transactionhistory=4;
    private  final static  int profile=5;
    TextView textView;
    chetanBottomNavigation NavigationBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_bord);
        NavigationBar=findViewById(R.id.BotomNacvigation);
        NavigationBar.add(new chetanBottomNavigation.Model(home,R.drawable.ic_home));
        NavigationBar.add(new chetanBottomNavigation.Model(Wallet,R.drawable.ic_wallet_));
        NavigationBar.add(new chetanBottomNavigation.Model(pay,R.drawable.ic_pay));
        NavigationBar.add(new chetanBottomNavigation.Model(transactionhistory,R.drawable.ic_history));
        NavigationBar.add(new chetanBottomNavigation.Model(profile,R.drawable.ic_user));
        NavigationBar.setDefaultIconColor(R.color.purple_700);

        NavigationBar.setOnShowListener(new chetanBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(chetanBottomNavigation.Model item) {
                switch (item.getId())
                {
                    case home:
                        loadFrag(new HomeFrag());
                        break;
                    case Wallet:
                        loadFrag(new Wallet());
                        break;
                    case pay:
                       loadFrag(new Payment_Fragement());
                        break;
                    case transactionhistory:
                        loadFrag(new Transcation_history());

                        break;
                    case profile:
                        loadFrag(new ProfileFrag());
                }

            }
        });
        NavigationBar.setOnReselectListener(new chetanBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(chetanBottomNavigation.Model item) {


            }
        });
        NavigationBar.setOnClickMenuListener(new chetanBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(chetanBottomNavigation.Model item) {
            }
        });
        NavigationBar.show(home,true);
    }



    private void loadFrag(Fragment fragment) {
             getSupportFragmentManager().beginTransaction()
            .replace(R.id.frame, fragment)
             .commit();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}