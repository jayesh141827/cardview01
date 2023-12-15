package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sevanth extends AppCompatActivity {

    androidx.cardview.widget.CardView card;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevanth);

        card = (androidx.cardview.widget.CardView) findViewById(R.id.card);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(sevanth.this, Eight.class);
                startActivity(intent);

            }
        });
    }
}
