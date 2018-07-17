package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspParroquias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_parroquias);

        WebView webViewParroquias = (WebView) findViewById(R.id.WebViewParroquias);
        webViewParroquias.loadUrl("http://www.diocesisdeneiva.org/v2012/parroquias");

        WebSettings webSettingsParroquias = webViewParroquias.getSettings();
        webSettingsParroquias.setJavaScriptEnabled(true);

        webViewParroquias.setWebViewClient(new WebViewClient());
    }
}
