package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button teaButton,fish,cheese;
    TextView recipet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teaButton = findViewById(R.id.chickenB);
        cheese = findViewById(R.id.cheeseB);
        fish = findViewById(R.id.feloF);
        recipet = findViewById(R.id.textoo);
        Coffe coffe = new Coffe();

        DrPepper Drpepper = new DrPepper();
      final  Tea tea = new Tea();


        teaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                recipet.setText ((tea.prepareRecipe()));
            }



        });


    }





}

