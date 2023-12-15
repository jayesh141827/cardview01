package com.example.cardview;

import static com.example.cardview.R.id.card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourth extends AppCompatActivity {

    androidx.cardview.widget.CardView card;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        card = (androidx.cardview.widget.CardView) findViewById(R.id.card);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(fourth.this, fifth.class);
                startActivity(intent);

            }
        });
    }
}
