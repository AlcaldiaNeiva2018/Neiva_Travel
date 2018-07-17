package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEngDirectivos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_directivos);

        WebView webViewDirectivos = (WebView) findViewById(R.id.WebViewDirectivos);
        webViewDirectivos.loadUrl("http://www.alcaldianeiva.gov.co/NuestraAlcaldia/Paginas/Nuestros-Directivos-y-Funcionarios.aspx");

        WebSettings webSettingsDirectivos = webViewDirectivos.getSettings();
        webSettingsDirectivos.setJavaScriptEnabled(true);

        webViewDirectivos.setWebViewClient(new WebViewClient());

    }
}
