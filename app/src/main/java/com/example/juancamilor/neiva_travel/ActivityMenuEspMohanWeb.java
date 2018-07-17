package com.example.juancamilor.neiva_travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityMenuEspMohanWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_esp_mohan_web);

        WebView webViewMohan = (WebView) findViewById(R.id.WebViewMohan);
        webViewMohan.loadUrl("https://www.google.com/maps/place/Torre+del+Moh%C3%A1n/@2.9266529,-75.2966152,17z/data=!4m8!1m2!2m1!1smohan+neiva!3m4!1s0x0:0xd36780e86e6d4274!8m2!3d2.9272038!4d-75.2949822");

        WebSettings webSettingsMohan = webViewMohan.getSettings();
        webSettingsMohan.setJavaScriptEnabled(true);

        webViewMohan.setWebViewClient(new WebViewClient());

    }
}
