package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEngMeLlevaras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_me_llevaras);

        ImageButton imgBtnMeLlevarasEnTiWeb = (ImageButton) findViewById(R.id.imgBtnWebMeLlevarasEnTi);
        imgBtnMeLlevarasEnTiWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityMenuEngMeLlevaras.this, ActivityMenuEspMeLlevarasWeb.class);
                startActivity(intent);

            }
        });

    }
}
