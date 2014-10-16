package com.example.SchoolApp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Home extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public void onCal(View view)
    {
        Intent intent = new Intent(this, Mail.class);
        startActivity(intent);
    }
    public void onWebsite(View view)
    {
        Uri uri = Uri.parse("https://www.htl-kaindorf.at/index.php?Itemid=101");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}