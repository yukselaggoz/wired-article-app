package com.lyadirga.mobilhaberuygulamasi;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Icerik  extends Activity{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_webview);

        webView = (WebView) findViewById(R.id.webView);

        String link=getIntent().getStringExtra("link");

        webView.getSettings().setJavaScriptEnabled(true);


        webView.setWebViewClient(new WebViewClient() {

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Sayfa Yüklenemedi!", Toast.LENGTH_SHORT).show();
            }

        });

        webView.loadUrl(link);
    }
}
