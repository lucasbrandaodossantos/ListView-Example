package com.example.lucas.listviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Integer array [] = {1,2,3,4,5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView lv = findViewById(R.id.lv);

        ArrayAdapter <Integer> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Integer content = (Integer) lv.getItemAtPosition(i);
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("number_act_one", content);
                    startActivity(intent);
            }
        });
    }

}
