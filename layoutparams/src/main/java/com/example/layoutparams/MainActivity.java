package com.example.layoutparams;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seekBar;
    Button btnFirst;
    Button btnSecond;
    LinearLayout.LayoutParams btnFparams;
    LinearLayout.LayoutParams btnSparams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(this);
        btnFirst = findViewById(R.id.btn);
        btnSecond = findViewById(R.id.btn2);
        btnFparams = (LinearLayout.LayoutParams) btnFirst.getLayoutParams();
        btnSparams = (LinearLayout.LayoutParams) btnSecond.getLayoutParams();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        int leftValue = i;
        int rightValue = seekBar.getMax() - i;
        btnFparams.weight = leftValue;
        btnSparams.weight = rightValue;
        btnSecond.setText(""+leftValue);
        btnFirst.setText(""+rightValue);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}