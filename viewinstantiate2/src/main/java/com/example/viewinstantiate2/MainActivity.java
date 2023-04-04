package com.example.viewinstantiate2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout llmain;
    RadioGroup rgGravity;
    EditText etName;
    Button btnCreate;
    Button btnClear;
    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llmain = findViewById(R.id.llMain);
        rgGravity = findViewById(R.id.rgGravity);
        etName = findViewById(R.id.editTextTextMultiLine);
        btnCreate = findViewById(R.id.button);
        btnClear = findViewById(R.id.button2);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(wrapContent,wrapContent);
                int bntGravity = Gravity.LEFT;
                switch(rgGravity.getCheckedRadioButtonId()){
                    case R.id.rbLeft:
                        bntGravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        bntGravity = Gravity.CENTER;
                        break;
                    case R.id.rbRight:
                        bntGravity = Gravity.RIGHT;
                        break;
                }
                lparams.gravity = bntGravity;
                Button btnNew = new Button(this);
                btnNew.setText(etName.getText().toString());
                llmain.addView(btnNew,lparams);
                break;
            case R.id.button2:
                llmain.removeAllViews();
                Toast.makeText(this,"Удалено",Toast.LENGTH_SHORT);
                break;
        }
    }
}