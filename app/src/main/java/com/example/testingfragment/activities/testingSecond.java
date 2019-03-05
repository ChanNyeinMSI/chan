package com.example.testingfragment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testingfragment.R;

public class testingSecond extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_second);

        TextView txtGreeting = findViewById(R.id.txt_grt);
        txtGreeting.setText("Setting Text From Java");

        final ImageView myLogo = findViewById(R.id.my_greetinglogo);
        Button btnGreeting = findViewById(R.id.btn_greeting);
        btnGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myLogo.setImageResource(R.drawable.grt2);
            }
        });

        final Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMain();
            }
        });
    }


//    private void showFragmentTwo(){
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.frame_container, TwoFragment.newInstance("showFragmentTwo"))
//                .addToBackStack(null)
//                .commit();
//    }


public void backToMain(){
//    startActivity(new Intent(this,DynamicFragmentActivity.class));

   // Intent intent = new Intent();

//              intent.putExtra(IE_RETURN_DATA, "Data from Text Activity");

//                setResult(RESULT_FIRST_USER, intent);
//                finish();

                onBackPressed();
}


}
