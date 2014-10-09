package com.example.SchoolApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Supplierplan extends Activity {

    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );

        setContentView(R.layout.supplierplan);

        webView= (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://supplierplan.htl-kaindorf.at/supp_neu/default.htm");
        //https://supplierplan.htl-kaindorf.at/supp_neu/41/c/c00013.htm
        //hallo
    }
}