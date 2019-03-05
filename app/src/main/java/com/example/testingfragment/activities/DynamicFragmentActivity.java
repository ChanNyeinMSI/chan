package com.example.testingfragment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.testingfragment.R;
import com.example.testingfragment.fragments.OneFragment;

public class DynamicFragmentActivity extends AppCompatActivity {
    public static final String IE_RETURN_DATA = "IE_RETURN_DATA";


    protected void onCreate (@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_dynamic_fragment);

//        final Button materialBtn_2 = findViewById(R.id.matbtn_2);
//        materialBtn_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.putExtra(IE_RETURN_DATA, "Data from Text Activity");
//                setResult(RESULT_CANCELED, intent);
//                finish();
//            }
//        });

        final Button btnFragmentOne = findViewById(R.id.matbtn_1);
        btnFragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentOne();
            }
        });

        final Button btnMaterial2 = findViewById(R.id.matbtn_2);
        btnMaterial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTestingTow();
            }
        });
    }
    private void showFragmentOne(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_container, OneFragment.newInstance("showFragmentOne"))
//                .addToBackStack(null)
                .commit();
    }
    public void goToTestingTow(){
        startActivity(new Intent(this,testingSecond.class));
    }
}
