package com.example.newsrecy.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import com.example.newsrecy.R;

public class WebView extends AppCompatActivity {
    Toolbar toolbar;
    android.webkit.WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView=findViewById(R.id.webview);

        Intent intent=getIntent();
        String url=intent.getStringExtra("url");

        webView.loadUrl(url);
    }


}