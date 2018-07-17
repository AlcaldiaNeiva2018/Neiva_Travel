package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspPuertoWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_puerto_web);

        WebView webViewPuertoCaracoli = (WebView) findViewById(R.id.WebViewPuertoCaracoli);
        webViewPuertoCaracoli.loadUrl("https://www.google.com/maps/place/Cra.+1+%2317-2+a+17-66,+Neiva,+Huila/@2.9322264,-75.3025598,17z/data=!3m1!4b1!4m5!3m4!1s0x8e3b7489357da4cb:0x88e956e73314eb9a!8m2!3d2.932221!4d-75.3003711");

        WebSettings webSettingsPuertoCaracoli = webViewPuertoCaracoli.getSettings();
        webSettingsPuertoCaracoli.setJavaScriptEnabled(true);

        webViewPuertoCaracoli.setWebViewClient(new WebViewClient());

    }
}
