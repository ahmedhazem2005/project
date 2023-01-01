package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void btnback2(View view) {
        Intent oo = new Intent(this,page2.class);
        startActivity(oo);
    }

public void btnmore (View view){
    Intent ee = new Intent(this,page4.class);
    startActivity(ee);
}


}