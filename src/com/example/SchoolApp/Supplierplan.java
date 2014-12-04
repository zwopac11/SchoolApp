package com.example.SchoolApp;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Calendar;
import java.util.Locale;

public class Supplierplan extends Activity {
    private Login login=new Login();
    private WebView webView;
    private Calendar cal;
    private Student student;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState );

        setContentView(R.layout.mail);

        cal = Calendar.getInstance(Locale.GERMAN);
        int calWeek=cal.get(Calendar.WEEK_OF_YEAR);

        webView= (WebView) findViewById(R.id.webView);
        //WebSettings webSettings = webView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setHttpAuthUsernamePassword("supplierplan.htl-kaindorf.at/supp_neu/default.htm","",login.getUsername(),login.getPassword());
        //webView.loadUrl("https://supplierplan.htl-kaindorf.at/supp_neu/default.htm");
        //webView.loadURL("https://supplierplan.htl-kaindorf.at/supp_neu/"+calWeek+"/c/c00009.htm");
       // Student student = Login.st;
        //https://supplierplan.htl-kaindorf.at/supp_neu/41/c/c00013.htm
    }
}