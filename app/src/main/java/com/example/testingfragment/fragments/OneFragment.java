package com.example.testingfragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testingfragment.R;

public class OneFragment extends Fragment{
    private static final String arg_data_to_fragment = "arg_data_to_fragment";
    public static Fragment newInstance(String dataToFragment) {

        OneFragment fragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putString(arg_data_to_fragment, dataToFragment);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_testing_third, container, false);
        Bundle bundle = getArguments();
        if(bundle != null){
            String dataForFragment = bundle.getString(arg_data_to_fragment);
            Log.i("","dataForFragment + " + dataForFragment);
        }

        TextView txtGreeting = view.findViewById(R.id.txt_grt);
        txtGreeting.setText("Setting Text From Java");

        final ImageView myLogo = view.findViewById(R.id.my_greetinglogo);
        Button btnGreeting = view.findViewById(R.id.btn_greeting);
        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myLogo.setImageResource(R.drawable.grt2);
            }
        });

        return view;
    }
}
