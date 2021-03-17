package com.pict.walletappphonepeclone.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pict.walletappphonepeclone.R;
import com.squareup.picasso.Picasso;


public class ProfileFrag extends Fragment {
     public static String profilePath="https://expertphotography.com/wp-content/uploads/2020/08/profile-photos-4.jpg";
View view;
ImageView Profle_Image;
    public ProfileFrag() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view =inflater.inflate(R.layout.fragment_profile, container, false);
        Profle_Image=view.findViewById(R.id.Profle_Image);
        Picasso.with(getActivity())
                .load(profilePath)
                .fit()
                .placeholder(R.drawable.ic_profile_con)
                .into(Profle_Image);
    return view;
    }
}