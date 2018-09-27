package com.example.lucas.listviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras_from_act_one = getIntent().getExtras();
        int number_from_activity_one = extras_from_act_one.getInt("number_act_one");


        TextView txt_content_act_one = findViewById(R.id.txt_content_act_1);

        if (extras_from_act_one != null && number_from_activity_one % 2 != 0){
            txt_content_act_one.setText("Your number is: " + number_from_activity_one + "\n and its odd");
        }else if (number_from_activity_one % 2 == 0){
            txt_content_act_one.setText("Your number is: " + number_from_activity_one + "\n and its even");
        } else {
            txt_content_act_one.setText("No number have passed between the activities");
        }
    }
}
