package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspLavanderaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_lavandera_web);

        WebView webViewLavandera = (WebView) findViewById(R.id.WebViewLaLavandera);
        webViewLavandera.loadUrl("https://www.google.com/maps/place/Monumento+La+Lavandera/@2.9439608,-75.2910254,18z/data=!4m12!1m6!3m5!1s0x8e3b74594b7462dd:0x2fe5cc05c6af2a73!2zIk1lIGxsZXZhcmFzIGVuIFTDrSI!8m2!3d2.943184!4d-75.2899096!3m4!1s0x0:0xda774681a33d3e34!8m2!3d2.9434491!4d-75.2897281");

        WebSettings webSettingsLavandera = webViewLavandera.getSettings();
        webSettingsLavandera.setJavaScriptEnabled(true);

        webViewLavandera.setWebViewClient(new WebViewClient());

    }
}
