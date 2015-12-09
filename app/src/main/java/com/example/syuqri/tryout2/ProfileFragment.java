package com.example.syuqri.tryout2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Syuqri on 11/28/2015.
 */
public class ProfileFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile,container,false);

        FloatingActionButton callProfileEdit = (FloatingActionButton) rootView.findViewById(R.id.edit_profile_button);

        callProfileEdit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.content_frame, new EditProfileFragment()).commit();

            }
        });
        return rootView;

    }
}
