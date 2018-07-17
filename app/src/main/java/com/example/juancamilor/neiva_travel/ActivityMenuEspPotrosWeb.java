package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspPotrosWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_potros_web);

        WebView webViewPotros = (WebView) findViewById(R.id.WebViewPotros);
        webViewPotros.loadUrl("https://www.google.com/maps/place/Monumento+Los+Potros/@2.933391,-75.2957493,17z/data=!4m12!1m6!3m5!1s0x8e3b74621df31861:0xd67223c3fd95ccb7!2sMonumento+Los+Potros!8m2!3d2.9333856!4d-75.2935606!3m4!1s0x8e3b74621df31861:0xd67223c3fd95ccb7!8m2!3d2.9333856!4d-75.2935606");

        WebSettings webSettingsPotros = webViewPotros.getSettings();
        webSettingsPotros.setJavaScriptEnabled(true);

        webViewPotros.setWebViewClient(new WebViewClient());

    }
}
