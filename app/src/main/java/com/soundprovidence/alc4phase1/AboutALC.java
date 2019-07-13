package com.soundprovidence.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    private WebView aboutALCPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        aboutALCPage = findViewById(R.id.webView_ALCAboutPage);
        aboutALCPage.getSettings().setJavaScriptEnabled(true);
        aboutALCPage.getSettings().setDomStorageEnabled(true);
        aboutALCPage.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        aboutALCPage.loadUrl("https://andela.com/alc/");
    }
}
