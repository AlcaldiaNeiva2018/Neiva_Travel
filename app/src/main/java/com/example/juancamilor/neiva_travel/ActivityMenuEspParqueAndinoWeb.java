package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspParqueAndinoWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_parque_andino_web);

        WebView webViewParqueAndino = (WebView) findViewById(R.id.WebViewParqueAndino);
        webViewParqueAndino.loadUrl("https://www.google.com/maps/place/Parque+Andino/@2.9299754,-75.28023,19z/data=!4m5!3m4!1s0x8e3b746e4ebd199d:0x27ade2ad465659ec!8m2!3d2.9299731!4d-75.279715");

        WebSettings webSettingsParqueAndino = webViewParqueAndino.getSettings();
        webSettingsParqueAndino.setJavaScriptEnabled(true);

        webViewParqueAndino.setWebViewClient(new WebViewClient());

    }
}
