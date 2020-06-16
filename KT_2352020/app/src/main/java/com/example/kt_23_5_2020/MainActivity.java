package com.example.kt_23_5_2020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rbtn_a1 ,rbtn_b1 ,rbtn_c1 ,rbtn_d1;
    RadioButton rbtn_a2 , rbtn_b2 ,rbtn_c2 ,rbtn_d2;
    RadioButton rbtn_a3 , rbtn_b3 , rbtn_c3 ,rbtn_d3;
    Button btn_ketqua;
    Button btn_lamlai;
    RadioGroup rgr_1 , rgr_2 , rgr_3;
    int a = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbtn_a1=(RadioButton) findViewById(R.id.rbtn_a1);
        rbtn_b1=(RadioButton) findViewById(R.id.rbtn_b1);
        rbtn_c1=(RadioButton) findViewById(R.id.rbtn_c1);
        rbtn_d1=(RadioButton) findViewById(R.id.rbtn_d1);
        rbtn_a2=(RadioButton) findViewById(R.id.rbtn_a2);
        rbtn_b2=(RadioButton) findViewById(R.id.rbtn_b2);
        rbtn_c2=(RadioButton) findViewById(R.id.rbtn_c2);
        rbtn_d2=(RadioButton) findViewById(R.id.rbtn_d2);
        rbtn_a3=(RadioButton) findViewById(R.id.rbtn_a3);
        rbtn_b3=(RadioButton) findViewById(R.id.rbtn_b3);
        rbtn_c3=(RadioButton) findViewById(R.id.rbtn_c3);
        rbtn_d3=(RadioButton) findViewById(R.id.rbtn_d3);
        btn_ketqua=(Button) findViewById(R.id.btn_ketqua);
        btn_lamlai =(Button) findViewById(R.id.btn_lamlai);
        btn_lamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }
    public void ketqua(View view)
    {
        if (rbtn_a1.isChecked())
            a+=3;
        if (rbtn_c2.isChecked())
            a+=3;
        if (rbtn_d3.isChecked())
            a+=3;
        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
        ab.setTitle("Score");
        ab.setMessage(a+"/10");
        ab.show();
        a=0;
    }
    public  void  reset(View view)
    {
            rgr_1.clearCheck();
            rgr_2.clearCheck();
            rgr_3.clearCheck();
            Toast.makeText(MainActivity.this , "Thành Công",Toast.LENGTH_SHORT).show();

    }

}
