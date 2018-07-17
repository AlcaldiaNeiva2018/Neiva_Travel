package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMenuEspCaminatas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_caminatas);

        //CACAO
        Button btnMapaCacao = (Button) findViewById(R.id.btnMapaCacao);
        btnMapaCacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspCaminatas.this, ActivityMenuEspCaminatasCacao.class);
                startActivity(intent);
            }
        });
        //CAFÉ
        Button btnMapaCafe = (Button) findViewById(R.id.btnMapaCafe);
        btnMapaCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspCaminatas.this, ActivityMenuEspCaminatasCafe.class);
                startActivity(intent);
            }
        });
        //BIODIVERSIDAD
        Button btnMapaBiodiversidad = (Button) findViewById(R.id.btnMapaBiodiversidad);
        btnMapaBiodiversidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspCaminatas.this, ActivityMenuEspCaminatasBiodiversidad.class);
                startActivity(intent);
            }
        });

    }
}
