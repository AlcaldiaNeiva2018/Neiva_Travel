package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspPortalWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_portal_web);

        WebView webViewPortalWebAlcaldia = (WebView) findViewById(R.id.WebViewPortalWebAlcaldia);
        webViewPortalWebAlcaldia.loadUrl("http://www.alcaldianeiva.gov.co/Paginas/default.aspx");

        WebSettings webSettingsPortalWebAlcaldia = webViewPortalWebAlcaldia.getSettings();
        webSettingsPortalWebAlcaldia.setJavaScriptEnabled(true);

        webViewPortalWebAlcaldia.setWebViewClient(new WebViewClient());

    }
}
