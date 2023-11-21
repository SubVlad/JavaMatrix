package com.example.secondapp;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.util.Log;  // Log.d()  -  it is System.out.println()  -  log will be in Logcat down there
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public EditText cell111;
    public EditText cell121;
    public EditText cell131;
    public EditText cell112;
    public EditText cell122;
    public EditText cell132;
    public EditText cell113;
    public EditText cell123;
    public EditText cell133;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcDET(View v)
    {
        Button button = (Button) v;
        double d111 = Double.parseDouble(cell111.getText().toString());
        double d121 = Double.parseDouble(cell121.getText().toString());
        double d131 = Double.parseDouble(cell131.getText().toString());
        double d112 = Double.parseDouble(cell112.getText().toString());
        double d122 = Double.parseDouble(cell122.getText().toString());
        double d132 = Double.parseDouble(cell132.getText().toString());
        double d113 = Double.parseDouble(cell113.getText().toString());
        double d123 = Double.parseDouble(cell123.getText().toString());
        double d133 = Double.parseDouble(cell133.getText().toString());

        double det = findDET(d111, d121, d131, d112, d122, d132, d113, d123, d133);
        CharSequence answer = Double.toString(det);
        button.setText(answer);

    }

    public double findDET(double n111,    double n121,    double n131,    double n112,    double n122,    double n132,    double n113,    double n123,    double n133)
    {
        return n111 * n122 * n133 + n112 * n123 * n131 + n113 * n121 * n132 - n113 * n122 * n131 - n112 * n121 * n133 - n111 * n123 * n132;
    }
}