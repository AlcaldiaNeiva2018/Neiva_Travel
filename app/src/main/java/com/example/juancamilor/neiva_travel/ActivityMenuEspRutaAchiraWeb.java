package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspRutaAchiraWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_ruta_achira_web);

        WebView webViewRutaAchira = (WebView) findViewById(R.id.WebViewRutaAchira);
        webViewRutaAchira.loadUrl("https://www.google.com/maps/d/embed?mid=1vp_0BSPmM8FnKpVTlYocefyO1sUCR4CG");

        WebSettings webSettingsRutaAchira = webViewRutaAchira.getSettings();
        webSettingsRutaAchira.setJavaScriptEnabled(true);

        webViewRutaAchira.setWebViewClient(new WebViewClient());

    }
}
