package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspRazaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_raza_web);

        WebView webViewLaRaza = (WebView) findViewById(R.id.WebViewLaRaza);
        webViewLaRaza.loadUrl("https://www.google.com/maps/place/Monumento+Al+Mestizaje/@2.9415664,-75.299939,17z/data=!4m12!1m6!3m5!1s0x8e3b74f44c40384d:0x550275bd217466b6!2sMonumento+Los+Guaduales!8m2!3d2.941561!4d-75.2977503!3m4!1s0x0:0x260c121b398e77c0!8m2!3d2.9408377!4d-75.297134");

        WebSettings webSettingsLaRaza = webViewLaRaza.getSettings();
        webSettingsLaRaza.setJavaScriptEnabled(true);

        webViewLaRaza.setWebViewClient(new WebViewClient());

    }
}
