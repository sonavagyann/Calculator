package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    int IDS[]={
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
            R.id.button15,
            R.id.button16,
            R.id.button17,
            R.id.button18,
            R.id.button19,
            R.id.button20,
    };

    TextView textViewArray[] = new TextView[IDS.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i=0; i<textViewArray.length; i++){
            textViewArray[i].setOnClickListener(this);
        }
    }



    @Override
    public void onClick() {
        Thread view;
        switch (view.getId());
    }
}