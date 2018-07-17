package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng);

        //QueHacer
        ImageButton imgBtnQuehacer = (ImageButton) findViewById(R.id.btnQueHacer_eng);
        imgBtnQuehacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngQueHacer.class);
                startActivity(intent);
            }
        });
        //Gastronomía
        ImageButton imgBtnGastronoia = (ImageButton) findViewById(R.id.btnGastronomia_eng);
        imgBtnGastronoia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngGastronomy.class);
                startActivity(intent);
            }
        });
        //Calendario
        ImageButton imgBtnCalendario = (ImageButton) findViewById(R.id.btnCalendario_eng);
        imgBtnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngCalendar.class);
                startActivity(intent);
            }
        });
        //Galería
        ImageButton imgBtnGaleria = (ImageButton) findViewById(R.id.btnGaleria_eng);
        imgBtnGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEspGaleria.class);
                startActivity(intent);
            }
        });
        //Nuestra Cultura
        ImageButton imgBtnNuestraCultura = (ImageButton) findViewById(R.id.btnNuestraCultura_eng);
        imgBtnNuestraCultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngNuestraCultura.class);
                startActivity(intent);
            }
        });
        //Nuestra Guía
        ImageButton imgBtnNuestraGuia = (ImageButton) findViewById(R.id.btnNuestraGuia_eng);
        imgBtnNuestraGuia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngNuestraGuia.class);
                startActivity(intent);
            }
        });
        //Mi Municipio
        ImageButton imgBtnMiMunicipio = (ImageButton) findViewById(R.id.btnMiMunicipio_eng);
        imgBtnMiMunicipio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEng.this, ActivityMenuEngMiMunicipio.class);
                startActivity(intent);
            }
        });

    }
}
