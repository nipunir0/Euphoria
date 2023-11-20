package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView articleback= findViewById(R.id.cardarticleback);
        articleback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this,HomeActivity.class));

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView article1= findViewById(R.id.cardarticle1);
        article1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this, ArticleoneActivity.class));

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView article2= findViewById(R.id.cardarticle2);
        article2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this, ArticletwoActivity.class));

            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView article3= findViewById(R.id.cardarticle3);
        article3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this,ThirdArticle.class));
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView article4= findViewById(R.id.cardarticle4);
        article4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this,FourthArticle.class));
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView article5= findViewById(R.id.cardarticle5);
        article5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ArticleActivity.this,FifthArticle.class));
            }
        });
    }
}