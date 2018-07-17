package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEngProgramacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_programacion);

        WebView webViewProgramacion = (WebView) findViewById(R.id.WebViewProgramacion);
        webViewProgramacion.loadUrl("https://drive.google.com/file/d/12RpkSXJnR9v9xuiYMH1sQcKIGnDN-7N0/view?usp=sharing");

        WebSettings webSettingsProgramacion = webViewProgramacion.getSettings();
        webSettingsProgramacion.setJavaScriptEnabled(true);

        webViewProgramacion.setWebViewClient(new WebViewClient());

    }
}
