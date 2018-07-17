package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspCentrosComerciales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_centros_comerciales);

        WebView webViewCentroscomerciales = (WebView) findViewById(R.id.WebViewCentrosComerciales);
        webViewCentroscomerciales.loadUrl("https://drive.google.com/open?id=1UjVYU7k2xAgoXS4JtX-lzhRjtRmSj6wP&usp=sharing");

        WebSettings webSettingsCentroscomerciales = webViewCentroscomerciales.getSettings();
        webSettingsCentroscomerciales.setJavaScriptEnabled(true);

        webViewCentroscomerciales.setWebViewClient(new WebViewClient());

    }
}
