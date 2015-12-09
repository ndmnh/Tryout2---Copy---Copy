package com.example.syuqri.tryout2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Syuqri on 11/29/2015.
 */
public class EditProfileFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_edit_profile,container,false);

        FloatingActionButton callProfile = (FloatingActionButton) rootView.findViewById(R.id.edit_profile_button_to_profile);
        final EditText inputName = (EditText) rootView.findViewById(R.id.enter_name);
        final EditText inputAge = (EditText) rootView.findViewById(R.id.enter_age);
        final EditText inputNumber = (EditText) rootView.findViewById(R.id.enter_mobile_number);

        final TextView setName = (TextView) rootView.findViewById(R.id.name);
        final TextView setAge = (TextView) rootView.findViewById(R.id.age);
        final TextView setNumber = (TextView) rootView.findViewById(R.id.mobilenumber);

        callProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try{
                    String x = inputName.getText().toString();
                    System.out.println(x);
                    setName.setText("hello");
                    setAge.setText(inputAge.getText().toString());
                    setNumber.setText(inputNumber.getText().toString());
                    FragmentManager fm = getFragmentManager();
                    fm.beginTransaction().replace(R.id.content_frame, new ProfileFragment()).commit();
                }
                catch(Exception e){
                    e.printStackTrace();
                }


            }
        });
        return rootView;

    }
}
