package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Eight extends AppCompatActivity {

    androidx.cardview.widget.CardView card;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);

        card = (androidx.cardview.widget.CardView) findViewById(R.id.card);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(Eight.this, nighth.class);
                startActivity(intent);

            }
        });
    }
}
