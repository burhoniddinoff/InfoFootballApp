package com.example.noteapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.antwerp).setOnClickListener(v -> openDetailScreen(0));
        findViewById(R.id.arsenal).setOnClickListener(v -> openDetailScreen(1));
        findViewById(R.id.a_madrid).setOnClickListener(v -> openDetailScreen(2));
        findViewById(R.id.barcelona).setOnClickListener(v -> openDetailScreen(3));
        findViewById(R.id.bayern).setOnClickListener(v -> openDetailScreen(4));
        findViewById(R.id.benfica).setOnClickListener(v -> openDetailScreen(5));
        findViewById(R.id.braga).setOnClickListener(v -> openDetailScreen(6));
        findViewById(R.id.celtic).setOnClickListener(v -> openDetailScreen(7));
        findViewById(R.id.copenhagen).setOnClickListener(v -> openDetailScreen(8));
        findViewById(R.id.crvena_zvezda).setOnClickListener(v -> openDetailScreen(9));
        findViewById(R.id.dortmund).setOnClickListener(v -> openDetailScreen(10));
        findViewById(R.id.porto).setOnClickListener(v -> openDetailScreen(11));
        findViewById(R.id.feyenoord).setOnClickListener(v -> openDetailScreen(12));
        findViewById(R.id.galatasaray).setOnClickListener(v -> openDetailScreen(13));
        findViewById(R.id.internazionale_milano).setOnClickListener(v -> openDetailScreen(14));
        findViewById(R.id.lazio).setOnClickListener(v -> openDetailScreen(15));
        findViewById(R.id.leipzig).setOnClickListener(v -> openDetailScreen(16));
        findViewById(R.id.lens).setOnClickListener(v -> openDetailScreen(17));
        findViewById(R.id.man_city).setOnClickListener(v -> openDetailScreen(18));
        findViewById(R.id.man_united).setOnClickListener(v -> openDetailScreen(19));
        findViewById(R.id.milan).setOnClickListener(v -> openDetailScreen(20));
        findViewById(R.id.napoli).setOnClickListener(v -> openDetailScreen(21));
        findViewById(R.id.new_castle).setOnClickListener(v -> openDetailScreen(22));
        findViewById(R.id.psg).setOnClickListener(v -> openDetailScreen(23));
        findViewById(R.id.psv).setOnClickListener(v -> openDetailScreen(24));
        findViewById(R.id.real_madrid).setOnClickListener(v -> openDetailScreen(25));
        findViewById(R.id.rel_sociedad).setOnClickListener(v -> openDetailScreen(26));
        findViewById(R.id.salzburg).setOnClickListener(v -> openDetailScreen(27));
        findViewById(R.id.sevilla).setOnClickListener(v -> openDetailScreen(28));
        findViewById(R.id.shakhtar).setOnClickListener(v -> openDetailScreen(29));
        findViewById(R.id.union).setOnClickListener(v -> openDetailScreen(30));
        findViewById(R.id.young_boys).setOnClickListener(v -> openDetailScreen(31));
//        findViewById(R.id.liverpool).setOnClickListener(v -> openDetailScreen(-));
//        findViewById(R.id.chelsea).setOnClickListener(v -> openDetailScreen(-));
//        findViewById(R.id.tottenham).setOnClickListener(v -> openDetailScreen(-));
    }

    private void openDetailScreen(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("club", pos);
        startActivity(intent);
    }
}