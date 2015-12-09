package com.example.syuqri.tryout2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.concurrent.locks.Lock;

/**
 * Created by Syuqri on 11/27/2015.
 */
public class MainFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        RelativeLayout callLock = (RelativeLayout) rootView.findViewById(R.id.rlLock);
        RelativeLayout callWeight = (RelativeLayout) rootView.findViewById(R.id.rlWeight);
        RelativeLayout callLocation = (RelativeLayout) rootView.findViewById(R.id.rlLocation);
        RelativeLayout callHumidity = (RelativeLayout) rootView.findViewById(R.id.rlHumidity);

        callLock.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new LockFragment()).commit();

            }
        });

        callWeight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new WeightFragment()).commit();

            }
        });

        callLocation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new LocationFragment()).commit();

            }
        });
        callHumidity.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new HumidityFragment()).commit();

            }
        });


        return rootView;
    }
}
