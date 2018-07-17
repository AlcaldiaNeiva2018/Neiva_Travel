package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuEngMiMunicipio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_mi_municipio);

        //info. General
        Button btnInfoGeneral = (Button) findViewById(R.id.btnInfoGeneral);
        btnInfoGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngMiMunicipio.this, ActivityMenuEngInfoGeneral.class);
                startActivity(intent);
            }
        });
        //Nuestro simbolos
        Button btnNuestrosSimbolos = (Button) findViewById(R.id.btnNuestrosSimbolo);
        btnNuestrosSimbolos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngMiMunicipio.this, ActivityMenuEngNuestrosSimbolos.class);
                startActivity(intent);
            }
        });
        //Directivos
        Button btnDirectivos = (Button) findViewById(R.id.btnDirectivos);
        btnDirectivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngMiMunicipio.this, ActivityMenuEngDirectivos.class);
                startActivity(intent);
            }
        });
        //PortalWeb
        Button btnPortalWeb = (Button) findViewById(R.id.btnPortalWebAlcaldia);
        btnPortalWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngMiMunicipio.this, ActivityMenuEspPortalWeb.class);
                startActivity(intent);
            }
        });

    }
}
