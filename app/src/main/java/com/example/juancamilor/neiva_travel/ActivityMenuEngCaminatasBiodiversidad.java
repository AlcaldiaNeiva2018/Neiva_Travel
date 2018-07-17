package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEngCaminatasBiodiversidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_eng_caminatas_biodiversidad);

        WebView webViewRutaDeLaBiodiversidad = (WebView) findViewById(R.id.WebViewRutaDeLaBiodiversidad);
        webViewRutaDeLaBiodiversidad.loadUrl("https://drive.google.com/file/d/1KMZrI0fEo4Xfd-f71T7NXjKWcBFz2YnX/view?usp=sharing");

        WebSettings webSettingsRutaBiodiversidad = webViewRutaDeLaBiodiversidad.getSettings();
        webSettingsRutaBiodiversidad.setJavaScriptEnabled(true);

        webViewRutaDeLaBiodiversidad.setWebViewClient(new WebViewClient());

    }
}
