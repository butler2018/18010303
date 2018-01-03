package com.example.student.a18010303;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = findViewById(R.id.webView);
        //wv.setWebViewClient(new WebViewClient()); //使用內建web 服務
        wv.setWebChromeClient(new WebChromeClient()); //使用內建webChrome 服務
        wv.getSettings().setJavaScriptEnabled(true);//使用JavaScript服務
        wv.loadUrl("file:///android_asset/index.html");


    }
}
