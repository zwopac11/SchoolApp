package com.example.SchoolApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Edumoodle extends Activity {




    private WebView webView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.edumoodle);

        webView= (WebView) findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ////this is comment






        //webView.setHttpAuthUsernamePassword("login.microsoftonline.com","",login.getUsername()+"@htlkaindorf.at",login.getPassword());
        webView.loadUrl("https://www3.edumoodle.at/eaa/login/index.php");
    }
}
