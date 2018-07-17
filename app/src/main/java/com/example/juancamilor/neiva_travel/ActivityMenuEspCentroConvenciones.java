package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspCentroConvenciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_centro_convenciones);

        ImageButton imgBtnCentroConvenciones = (ImageButton) findViewById(R.id.imgBtnWebCentroConvenciones);
        imgBtnCentroConvenciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMenuEspCentroConvenciones.this, ActivityMenuEspCentroConvencionesWeb.class);
                startActivity(intent);
            }
        });

    }
}
