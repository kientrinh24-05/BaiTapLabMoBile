package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btnChangeImage;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeImage = (Button) findViewById(R.id.btnChangeImage);
        imgView = (ImageView) findViewById(R.id.imgView);
        imgView.setBackgroundResource(R.mipmap.ic_launcher);
        btnChangeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView.setBackgroundResource(R.mipmap.xeco);
            }
        });

    }
}
