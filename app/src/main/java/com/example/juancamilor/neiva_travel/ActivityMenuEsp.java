package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEsp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp);

        //QueHacer
        ImageButton imgBtnQuehacer = (ImageButton) findViewById(R.id.btnQueHacer);
        imgBtnQuehacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspQueHacer.class);
                startActivity(intent);
            }
        });
        //Gastronomía
        ImageButton imgBtnGastronoia = (ImageButton) findViewById(R.id.btnGastronomia);
        imgBtnGastronoia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspGastronomia.class);
                startActivity(intent);
            }
        });
        //Calendario
        ImageButton imgBtnCalendario = (ImageButton) findViewById(R.id.btnCalendario);
        imgBtnCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspCalendario.class);
                startActivity(intent);
            }
        });
        //Galería
        ImageButton imgBtnGaleria = (ImageButton) findViewById(R.id.btnGaleria);
        imgBtnGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspGaleria.class);
                startActivity(intent);
            }
        });
        //Nuestra Cultura
        ImageButton imgBtnNuestraCultura = (ImageButton) findViewById(R.id.btnNuestraCultura);
        imgBtnNuestraCultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspNuestraCultura.class);
                startActivity(intent);
            }
        });
        //Nuestra Guía
        ImageButton imgBtnNuestraGuia = (ImageButton) findViewById(R.id.btnNuestraGuia);
        imgBtnNuestraGuia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspNuestraGuia.class);
                startActivity(intent);
            }
        });
        //Mi Municipio
        ImageButton imgBtnMiMunicipio = (ImageButton) findViewById(R.id.btnMiMunicipio);
        imgBtnMiMunicipio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEsp.this, ActivityMenuEspMiMunicipio.class);
                startActivity(intent);
            }
        });

    }
}
