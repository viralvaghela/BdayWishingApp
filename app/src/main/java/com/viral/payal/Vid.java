package com.viral.payal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Random;

public class Vid extends AppCompatActivity {

    String u[]={"https://www.youtube.com/watch?v=u_LrOydjNTE","https://www.youtube.com/watch?v=svK0DfFsa_4",
            "https://www.youtube.com/watch?v=0rBQnNZ0tCU","https://www.youtube.com/watch?v=DXUAyRRkI6k&t=57s","https://www.youtube.com/watch?v=5dsGWM5XGdg",
            "https://www.youtube.com/watch?v=rNSnfXl1ZjU","https://www.youtube.com/watch?v=4IP_E7efGWE&t=64s","https://www.youtube.com/watch?v=6p89wveUNFc",
            "https://www.youtube.com/watch?v=sYa-QqB5hHQ","https://www.youtube.com/watch?v=cQAlJacgB0o"};

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);
        webView=(WebView)findViewById(R.id.web);
        WebSettings webSettings=webView.getSettings();
         webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        final int r = new Random().nextInt(9);
        webView.loadUrl( u[r] );

    }
}

