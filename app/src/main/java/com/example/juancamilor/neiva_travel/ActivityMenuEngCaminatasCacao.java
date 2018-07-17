package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEngCaminatasCacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_caminatas_cacao);

        WebView webViewRutaDelCacao = (WebView) findViewById(R.id.WebViewRutaDelCacao);
        webViewRutaDelCacao.loadUrl("https://drive.google.com/file/d/1r7gTfijC3bI1Xcy5v5Ywb1u2bk2GvmDv/view?usp=sharing");

        WebSettings webSettingsRutaDelCacao = webViewRutaDelCacao.getSettings();
        webSettingsRutaDelCacao.setJavaScriptEnabled(true);

        webViewRutaDelCacao.setWebViewClient(new WebViewClient());

    }
}
