package com.example.if3_mahfud_10119092;
//nama : Mahfudz Abdulloh
//nim : 10119092
//kelas : if3

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NullInMenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_in_menu);

        Button btnHome             = findViewById(R.id.btnHome);
        Button btnAbout = findViewById(R.id.btnAbout);
        btnHome.setOnClickListener(this);btnAbout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHome:
                Intent int1 = new Intent(NullInMenuActivity.this, MainActivity.class);
                startActivity(int1);
                break;
            case R.id.btnAbout:
                Intent in2 = new Intent(NullInMenuActivity.this, AboutActivity.class);
                startActivity(in2);
                break;
        }
    }
}