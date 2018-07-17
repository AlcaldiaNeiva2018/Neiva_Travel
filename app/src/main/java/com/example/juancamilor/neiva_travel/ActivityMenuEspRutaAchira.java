package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspRutaAchira extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_ruta_achira);

        ImageButton btnWebViewRutaAchira = (ImageButton) findViewById(R.id.btnWebViewRutaAchira);
        btnWebViewRutaAchira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspRutaAchira.this, ActivityMenuEspRutaAchiraWeb.class);
                startActivity(intent);
            }
        });

    }
}
