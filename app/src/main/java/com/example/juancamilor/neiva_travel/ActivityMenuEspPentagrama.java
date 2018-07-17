package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspPentagrama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_pentagrama);

        ImageButton imgBtnWebPentagrama = (ImageButton) findViewById(R.id.imgBtnWebPentagrama);
        imgBtnWebPentagrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspPentagrama.this, ActivityMenuEspPentagramaWeb.class);
                startActivity(intent);
            }
        });

    }
}
