package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuEngNuestraCultura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_nuestra_cultura);

        //Mitos y leyendas
        Button btnMitos = (Button) findViewById(R.id.btnMitosYLeyendas);
        btnMitos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngNuestraCultura.this, ActivityMenuEngMitos.class);
                startActivity(intent);
            }
        });
        //Dichos y refranes
        Button btnDichos = (Button) findViewById(R.id.btnDichosYRefranes);
        btnDichos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngNuestraCultura.this, ActivityMenuEngDichos.class);
                startActivity(intent);
            }
        });
        //Monumentos
        Button btnMonumentos = (Button) findViewById(R.id.btnMonumentos);
        btnMonumentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngNuestraCultura.this, ActivityMenuEngMonumentos.class);
                startActivity(intent);
            }
        });
        //Programación
        Button btnPRogramacion = (Button) findViewById(R.id.btnProgramacion);
        btnPRogramacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEngNuestraCultura.this, ActivityMenuEngProgramacion.class);
                startActivity(intent);
            }
        });

    }
}
