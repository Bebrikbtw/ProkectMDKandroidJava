package com.example.menuinflater;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    CheckBox chb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        chb = findViewById(R.id.chbExtMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"add");
        menu.add(0,2,0,"edit");
        menu.add(0,3,3,"delete");
        menu.add(1,4,1,"copy");
        menu.add(1,5,2,"paste");
        menu.add(1,6,4,"exit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.setGroupVisible(1,chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        StringBuilder sb = new StringBuilder();
        sb.append("Item Menu");
        sb.append("\r\n groupId: ").append(item.getGroupId());
        sb.append("\r\n itemId: ").append(item.getItemId());
        sb.append("\r\n order: ").append(item.getOrder());
        sb.append("\r\n title: ").append(item.getTitle());
        tv.setText(sb.toString());
        return super.onOptionsItemSelected(item);
    }
}