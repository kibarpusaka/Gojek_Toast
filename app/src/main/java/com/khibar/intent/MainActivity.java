package com.khibar.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgosend,imgoride,imgoffod,imgomart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgosend = findViewById(R.id.gosend);
        imgoride = findViewById(R.id.goride);
        imgoffod = findViewById(R.id.gofod);
        imgomart = findViewById(R.id.gomart);

        imgosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ini Halaman GOSEND", Toast.LENGTH_SHORT).show();
            }
        });

        imgoride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Ini Halaman GORIDE", Toast.LENGTH_SHORT).show();
            }
        });

        imgoffod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ini Halaman GOFFOD", Toast.LENGTH_SHORT).show();
            }
        });

        imgomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ini Halaman GOMART", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
