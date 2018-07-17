package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspRutaCulturalWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_ruta_cultural_web);

        WebView webViewRutaCultural = (WebView) findViewById(R.id.WebViewRutaCultural);
        webViewRutaCultural.loadUrl("https://www.google.com/maps/d/embed?mid=1Cp4RCAlLebgz2ICeMsdDWsJaHgo6BpEa");

        WebSettings webSettingsRutaCultural = webViewRutaCultural.getSettings();
        webSettingsRutaCultural.setJavaScriptEnabled(true);

        webViewRutaCultural.setWebViewClient(new WebViewClient());

    }
}
