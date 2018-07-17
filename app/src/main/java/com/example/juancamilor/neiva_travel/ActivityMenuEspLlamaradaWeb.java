package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspLlamaradaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_llamarada_web);

        WebView webViewLlamarada = (WebView) findViewById(R.id.WebViewLlamarada);
        webViewLlamarada.loadUrl("https://www.google.com/maps/place/Cra.+7+%2354-43+a+54-1,+Neiva,+Huila/@2.9572269,-75.2895734,19z/data=!4m8!1m2!2m1!1smonumento+llamarada!3m4!1s0x8e3b7454ade26e95:0x7d62d29d34782c02!8m2!3d2.9572363!4d-75.2893105");

        WebSettings webSettingsLlamarada = webViewLlamarada.getSettings();
        webSettingsLlamarada.setJavaScriptEnabled(true);

        webViewLlamarada.setWebViewClient(new WebViewClient());

    }
}
