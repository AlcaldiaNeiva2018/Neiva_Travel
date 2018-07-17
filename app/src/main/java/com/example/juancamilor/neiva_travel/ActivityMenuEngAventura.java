package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuEngAventura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_aventura);

        //Ruta Achira
        Button btnRutaAchira = (Button) findViewById(R.id.btnRutaAchira);
        btnRutaAchira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngAventura.this, ActivityMenuEngRutaAchira.class);
                startActivity(intent);

            }
        });

        //Parapente
        Button btnParapente = (Button) findViewById(R.id.btnParapente);
        btnParapente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngAventura.this, ActivityMenuEspParapente.class);
                startActivity(intent);
            }
        });

    }
}
