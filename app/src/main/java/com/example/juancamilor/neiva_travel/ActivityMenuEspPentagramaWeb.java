package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspPentagramaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_pentagrama_web);

        WebView webViewPentagrama = (WebView) findViewById(R.id.WebViewPentagrama);
        webViewPentagrama.loadUrl("https://www.google.com/maps/place/Parque+Caracol%C3%AD/@2.9317208,-75.2991178,19z/data=!4m5!3m4!1s0x8e3b748910c8826d:0xb2a9d45b257d80f2!8m2!3d2.9315085!4d-75.2987581");

        WebSettings webSettingsPentagrama = webViewPentagrama.getSettings();
        webSettingsPentagrama.setJavaScriptEnabled(true);

        webViewPentagrama.setWebViewClient(new WebViewClient());

    }
}
