package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspCaballoWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_caballo_web);

        WebView webViewCaballoColombiano = (WebView) findViewById(R.id.WebViewCaballoColombiano);
        webViewCaballoColombiano.loadUrl("https://www.google.com/maps/place/El+Caballo+Colombiano/@2.9347029,-75.2828144,17z/data=!3m1!4b1!4m5!3m4!1s0x8e3b7468e809db9b:0x2f7ad686175a63d6!8m2!3d2.9346975!4d-75.2806257");

        WebSettings webSettingsCaballoColombiano = webViewCaballoColombiano.getSettings();
        webSettingsCaballoColombiano.setJavaScriptEnabled(true);

        webViewCaballoColombiano.setWebViewClient(new WebViewClient());

    }
}
