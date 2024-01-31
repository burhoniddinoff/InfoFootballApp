package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    private final List<FootballClubData> list = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        loadData();

        int pos = getIntent().getIntExtra("club", 0);
        FootballClubData data = list.get(pos);

        findViewById(R.id.buttonBack).setOnClickListener(v -> finish());

        TextView textView = findViewById(R.id.textFootballClubName);
        textView.setText(data.getClubName());

        ImageView imageView = findViewById(R.id.imageClub);
        imageView.setImageResource(data.getImgResId());

        TextView textDescription = findViewById(R.id.textDescription);
        textDescription.setText(data.getClubDescription());
    }

    private void loadData() {
        list.add(new FootballClubData(R.drawable.antwerp, "Royal Antwerp", R.string.antwerp));
        list.add(new FootballClubData(R.drawable.arsenal_2, "Arsenal", R.string.arsenal));
        list.add(new FootballClubData(R.drawable.a_madrid, "Atletico de Madrid", R.string.atletico_madrid));
        list.add(new FootballClubData(R.drawable.barcelona_2, "Barcelona", R.string.barsa));
        list.add(new FootballClubData(R.drawable.bayern, "Bayern Munchen", R.string.bayern));
        list.add(new FootballClubData(R.drawable.benfica, "Benfica", R.string.benfica));
        list.add(new FootballClubData(R.drawable.braga, "Braga", R.string.braga));
        list.add(new FootballClubData(R.drawable.celtic, "Celtic", R.string.celtic));
        list.add(new FootballClubData(R.drawable.copenhagen, "Copenhagen", R.string.copenhagen));
        list.add(new FootballClubData(R.drawable.crvena_zvezda, "Crvena Zvezda", R.string.crvena_zvezda));
        list.add(new FootballClubData(R.drawable.bvb, "Borussia Dortmund", R.string.dortmund));
        list.add(new FootballClubData(R.drawable.porto, "Porto", R.string.porto));
        list.add(new FootballClubData(R.drawable.feyenoord, "Feyenoord", R.string.feyenoord));
        list.add(new FootballClubData(R.drawable.galatasaray, "Galatasaray", R.string.galatasaray));
        list.add(new FootballClubData(R.drawable.internazionale_milano, "Internazionale Milano", R.string.inter_milan));
        list.add(new FootballClubData(R.drawable.lazio, "Lazio", R.string.lazio));
        list.add(new FootballClubData(R.drawable.leipzig, "Leipzig", R.string.leipzig));
        list.add(new FootballClubData(R.drawable.lens, "Lens", R.string.lens));
        list.add(new FootballClubData(R.drawable.man_city_2, "Manchester City", R.string.man_city));
        list.add(new FootballClubData(R.drawable.man_united_2, "Manchester United", R.string.man_united));
        list.add(new FootballClubData(R.drawable.milan, "Milan", R.string.ac_milan));
        list.add(new FootballClubData(R.drawable.napoli, "Napoli", R.string.napoli));
        list.add(new FootballClubData(R.drawable.new_castle, "New Castle", R.string.newcastle_united));
        list.add(new FootballClubData(R.drawable.psg, "Paris Saint-German", R.string.psg));
        list.add(new FootballClubData(R.drawable.psv, "PSV Eindhoven", R.string.psv));
        list.add(new FootballClubData(R.drawable.real_madrid_2, "Real Madrid", R.string.real));
        list.add(new FootballClubData(R.drawable.rel_sociedad, "Real Sociedad", R.string.real_sociedad));
        list.add(new FootballClubData(R.drawable.salzburg, "Salzburg", R.string.salzburg));
        list.add(new FootballClubData(R.drawable.sevilla, "Sevilla", R.string.sevilla));
        list.add(new FootballClubData(R.drawable.shakhtar, "Shakhtar Donesk", R.string.shakhtar_donetsk));
        list.add(new FootballClubData(R.drawable.union, "Union Berlin", R.string.union_berlin));
        list.add(new FootballClubData(R.drawable.young_boys, "Young Boys", R.string.youngBoys));


//        list.add(new FootballClubData(R.drawable.tottenham_2, "Tottenham", R.string.tottenham));
//        list.add(new FootballClubData(R.drawable.liverpool_2, "Liverpool", R.string.liverpool));
//        list.add(new FootballClubData(R.drawable.arsenal_2, "Arsenal", R.string.arsenal));
//        list.add(new FootballClubData(R.drawable.chelsea_2, "Chelsea", R.string.chelsea));

    }
}