package com.ftninformatika.flavors;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    
    public void onButtonClick(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
    public void onKlikneMe(View v) {
        Toast.makeText(this, "Ovo je full verzija!", Toast.LENGTH_SHORT).show();
    }
}