package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspRutaCultural extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_ruta_cultural);

        ImageButton imgBtnRutaCulturalWeb = (ImageButton) findViewById(R.id.btnWebViewRutaCultural);
        imgBtnRutaCulturalWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityMenuEspRutaCultural.this, ActivityMenuEspRutaCulturalWeb.class);
                startActivity(intent);
            }
        });

    }
}
