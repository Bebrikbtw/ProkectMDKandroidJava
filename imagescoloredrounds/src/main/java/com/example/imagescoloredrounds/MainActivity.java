package com.example.imagescoloredrounds;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView fstw = findViewById(R.id.textView);
        TextView stw = findViewById(R.id.textView2);
        TextView ttw = findViewById(R.id.textView3);
        TextView ftw = findViewById(R.id.textView4);
        ImageView image = findViewById(R.id.imageView4);
        image.setOnClickListener(view -> {
            String[] phrases = {
                    "Синий круг",
                    "Зеленый круг",
                    "Коричневый круг",
                    "Розовый круг",
                    "Пурпурный круг",
                    "Голубой круг",
                    "Фиолетовый круг"
            };
            shuffleArray(phrases);
            stw.setText(phrases[0]);
            ttw.setText(phrases[1]);
            ftw.setText(phrases[2]);
            fstw.setText(phrases[3]);

        });
    }
    void shuffleArray(String[] ar){
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--){
            int index = rnd.nextInt(i+1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}