package com.example.logandmess;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "myLogs";
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Найдём View-элементы");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);
        Log.d(TAG, "Присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(this::onClick);
        btnCancel.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View view) {
        Log.d(TAG, "По id определямем кнопку, вызвавшую этот обработчик");
        if (view.getId() == R.id.btnOk){
            Log.d(TAG, "Кнопка ОК");
            tvOut.setText("Нажата кнопка ОК");
            Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
        }
        else{
            Log.d(TAG, "Кнопка Cancel");
            tvOut.setText("Нажата кнопка Cancel");
            Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture){
        super.onPointerCaptureChanged(hasCapture);
    }
}