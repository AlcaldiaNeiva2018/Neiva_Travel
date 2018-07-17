package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspGaleria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_galeria);

        WebView webViewGaleria = (WebView) findViewById(R.id.WebViewGaleria);
        webViewGaleria.loadUrl("https://drive.google.com/file/d/1-Vp2v1P5JwCadzaVs7653NWNHO09yAte/view?usp=sharing");

        WebSettings webSettingsGaleria = webViewGaleria.getSettings();
        webSettingsGaleria.setJavaScriptEnabled(true);

        webViewGaleria.setWebViewClient(new WebViewClient());


    }
}
