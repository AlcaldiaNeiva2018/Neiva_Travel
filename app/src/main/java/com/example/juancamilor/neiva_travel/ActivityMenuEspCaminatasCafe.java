package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspCaminatasCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_caminatas_cafe);

        WebView webViewRutaDelCafe = (WebView) findViewById(R.id.WebViewRutaDelCafe);
        webViewRutaDelCafe.loadUrl("https://drive.google.com/file/d/1i-6HTbvm-CPZSEz1DZvh06t3xzeXuYOe/view?usp=sharing");

        WebSettings webSettingsRutaDelCafe = webViewRutaDelCafe.getSettings();
        webSettingsRutaDelCafe.setJavaScriptEnabled(true);

        webViewRutaDelCafe.setWebViewClient(new WebViewClient());

    }
}
