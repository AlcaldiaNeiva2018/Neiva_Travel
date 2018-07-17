package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspCentroConvencionesWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_centro_convenciones_web);

        WebView webViewCentroConvenciones = (WebView) findViewById(R.id.WebViewLosGuaduales);
        webViewCentroConvenciones.loadUrl("https://www.google.com/maps/place/Centro+Convenciones+Jos%C3%A9+Eustasio+Rivera/@2.9369778,-75.2955213,17z/data=!3m1!4b1!4m5!3m4!1s0x8e3b74603f4bc1d9:0x2e0fc66d89d9bdf7!8m2!3d2.9369724!4d-75.2933326");

        WebSettings webSettingsCentroConvenciones = webViewCentroConvenciones.getSettings();
        webSettingsCentroConvenciones.setJavaScriptEnabled(true);

        webViewCentroConvenciones.setWebViewClient(new WebViewClient());

    }
}
