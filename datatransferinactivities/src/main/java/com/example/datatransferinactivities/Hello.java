package com.example.datatransferinactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Hello extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        TextView txtInfo = findViewById(R.id.Text1);
        TextView txtCom = findViewById(R.id.Text2);
        String user = "Не задано";
        String gift = "Не задано";
        user = getIntent().getExtras().getString("username");
        gift = getIntent().getExtras().getString("gift");
        txtInfo.setText("Имя: "+user);
        txtCom.setText("Комментарий: "+gift);
    }
}
