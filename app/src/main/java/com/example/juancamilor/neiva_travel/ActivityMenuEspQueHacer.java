package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuEspQueHacer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_que_hacer);

        //Aventuras
        Button btnAventura = (Button) findViewById(R.id.btnAventura);
        btnAventura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspQueHacer.this, ActivityMenuEspAventura.class);
                startActivity(intent);
            }
        });
        //Caminatas
        Button btnCaminatas = (Button) findViewById(R.id.btnCaminatas);
        btnCaminatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspQueHacer.this, ActivityMenuEspCaminatas.class);
                startActivity(intent);
            }
        });
        //Centros comerciales
        Button btnCentrosComeciales = (Button) findViewById(R.id.btnCentrosComerciales);
        btnCentrosComeciales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspQueHacer.this, ActivityMenuEspCentrosComerciales.class);
                startActivity(intent);
            }
        });
        //Monumentos
        Button btnMonumentos = (Button) findViewById(R.id.btnMonumentos);
        btnMonumentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspQueHacer.this, ActivityMenuEspRutaCultural.class);
                startActivity(intent);

            }
        });
        //Parroquias
        Button btnParroquias = (Button) findViewById(R.id.btnParroquias);
        btnParroquias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspQueHacer.this, ActivityMenuEspParroquias.class);
                startActivity(intent);
            }
        });
    }
}
