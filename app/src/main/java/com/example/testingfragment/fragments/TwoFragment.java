package com.example.testingfragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testingfragment.R;

public class TwoFragment extends Fragment {

    private static final String arg_data_to_fragment = "arg_data_to_fragment";
    public static Fragment newInstance(String dataToFragment) {

        TwoFragment fragment = new TwoFragment();
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
        return view;
    }
}
