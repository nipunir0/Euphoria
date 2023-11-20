package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthArticle extends AppCompatActivity {
    Button articleback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_article);
        articleback=findViewById(R.id.buttonarticleback);

        articleback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FourthArticle.this, ArticleActivity.class));
            }
        });
    }
}