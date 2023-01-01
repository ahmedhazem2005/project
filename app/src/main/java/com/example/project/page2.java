package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void backbto(View view) {
        Intent nn = new Intent(this,login.class);
        startActivity(nn);
    }

    public void morebtn(View view) {
        Intent pp=new Intent(this,page3.class);
        startActivity(pp);
    }
}