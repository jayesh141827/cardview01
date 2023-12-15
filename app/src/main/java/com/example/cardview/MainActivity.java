package com.example.cardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    androidx.cardview.widget.CardView card;


        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            card = (androidx.cardview.widget.CardView) findViewById(R.id.card);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    intent = new Intent(MainActivity.this, second.class);
                    startActivity(intent);

                }
            });
        }
}



