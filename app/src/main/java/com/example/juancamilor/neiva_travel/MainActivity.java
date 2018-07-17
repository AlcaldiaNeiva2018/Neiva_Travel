package com.example.juancamilor.neiva_travel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Video
        VideoView videoViewEsp = (VideoView) findViewById(R.id.videoView);
        videoViewEsp.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        videoViewEsp.start();

        //Saltar
        Button btnSaltar = (Button) findViewById(R.id.btnContinuar);
        btnSaltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityIdioma.class);
                startActivity(intent);
            }
        });

    }

    public void onBackPressed() {
        onRestart();
    }
}
