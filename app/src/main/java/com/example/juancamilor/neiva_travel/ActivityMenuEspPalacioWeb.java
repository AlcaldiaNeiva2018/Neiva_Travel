package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspPalacioWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_palacio_web);

        WebView webViewPalacioNinos = (WebView) findViewById(R.id.WebViewPalacioNinos);
        webViewPalacioNinos.loadUrl("https://www.google.com/maps/place/Parque+de+los+Ni%C3%B1os/@2.9351177,-75.298398,17z/data=!3m1!4b1!4m5!3m4!1s0x8e3b748a424eb8c1:0x424f1ae34c0d5892!8m2!3d2.9351123!4d-75.2962093");

        WebSettings webSettingsPalacioNinos = webViewPalacioNinos.getSettings();
        webSettingsPalacioNinos.setJavaScriptEnabled(true);

        webViewPalacioNinos.setWebViewClient(new WebViewClient());

    }
}
