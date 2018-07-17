package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspMeLlevarasWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_me_llevaras_web);

        WebView webViewMeLlevarasEnTi = (WebView) findViewById(R.id.WebViewMeLlevarasEnTi);
        webViewMeLlevarasEnTi.loadUrl("https://www.google.com/maps/place/%22Me+llevaras+en+T%C3%AD%22/@2.9439608,-75.2943084,16z/data=!4m5!3m4!1s0x8e3b74594b7462dd:0x2fe5cc05c6af2a73!8m2!3d2.943184!4d-75.2899096");

        WebSettings webSettingsMeLlevarasEnTi = webViewMeLlevarasEnTi.getSettings();
        webSettingsMeLlevarasEnTi.setJavaScriptEnabled(true);

        webViewMeLlevarasEnTi.setWebViewClient(new WebViewClient());

    }
}
