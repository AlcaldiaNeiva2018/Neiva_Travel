package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspMitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_mitos);

        WebView webViewMitos = (WebView) findViewById(R.id.WebViewMitos);
        webViewMitos.loadUrl("http://www.alcaldianeiva.gov.co/MiMunicipio/Paginas/Sitios-de-Interes.aspx");

        WebSettings webSettingsMitos = webViewMitos.getSettings();
        webSettingsMitos.setJavaScriptEnabled(true);

        webViewMitos.setWebViewClient(new WebViewClient());


    }
}
