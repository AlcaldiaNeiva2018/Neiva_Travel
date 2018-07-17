package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspCaballo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_caballo);

        ImageButton imgBtnCaballoColombianoWeb = (ImageButton) findViewById(R.id.imgBtnWebCaballoColombiano);
        imgBtnCaballoColombianoWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspCaballo.this, ActivityMenuEspCaballoWeb.class);
                startActivity(intent);
            }
        });


    }
}
