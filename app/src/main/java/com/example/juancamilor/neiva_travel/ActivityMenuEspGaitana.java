package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityMenuEspGaitana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_gaitana);

        ImageButton imgBtnWebGaitana = (ImageButton) findViewById(R.id.imgBtnWebGaitana);
        imgBtnWebGaitana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMenuEspGaitana.this, ActivityMenuEspGaitanaWeb.class);
                startActivity(intent);
            }
        });

    }
}
