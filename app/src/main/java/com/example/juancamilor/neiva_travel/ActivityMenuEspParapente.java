package com.example.juancamilor.neiva_travel;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class ActivityMenuEspParapente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_parapente);

        //Video
        VideoView videoViewEsp = (VideoView) findViewById(R.id.videoView);
        videoViewEsp.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.parapente));
        videoViewEsp.start();

    }
}
