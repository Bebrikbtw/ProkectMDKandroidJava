package com.example.datatransferinactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class Form extends Activity {
    public void onClick(View v){
        Intent intent = new Intent(Form.this, Hello.class);
        EditText myEt = (EditText) findViewById(R.id.editText1);
        EditText myE = (EditText) findViewById(R.id.editText2);
        intent.putExtra("username",myEt.getText().toString());
        intent.putExtra("gift",myE.getText().toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
    }
}
