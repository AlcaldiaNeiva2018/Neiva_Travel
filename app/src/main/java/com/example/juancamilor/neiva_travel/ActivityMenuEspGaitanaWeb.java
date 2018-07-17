package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspGaitanaWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_gaitana_web);

        WebView webViewGaitana = (WebView) findViewById(R.id.WebViewGaitana);
        webViewGaitana.loadUrl("https://www.google.com/maps/place/Monumento+a+la+Cacica+Gaitana/@2.921423,-75.2941508,17z/data=!3m1!4b1!4m5!3m4!1s0x8e3b74fc9b5e3881:0xf20238a791891561!8m2!3d2.9214176!4d-75.2919621");

        WebSettings webSettingsGaitana = webViewGaitana.getSettings();
        webSettingsGaitana.setJavaScriptEnabled(true);

        webViewGaitana.setWebViewClient(new WebViewClient());

    }
}
