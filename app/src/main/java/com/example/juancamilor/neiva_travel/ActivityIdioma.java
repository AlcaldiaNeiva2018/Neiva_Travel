package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityIdioma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioma);

        //INGLÉS
        Button btnEng = (Button) findViewById(R.id.btnEng);
        btnEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityIdioma.this, ActivityMenuEng.class);
                startActivity(intent);
            }
        });
        //ESPAÑOL
        Button btnEsp = (Button) findViewById(R.id.btnEsp);
        btnEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityIdioma.this, ActivityMenuEsp.class);
                startActivity(intent);
            }
        });

    }

    public void onBackPressed() {
        onRestart();
    }
}
