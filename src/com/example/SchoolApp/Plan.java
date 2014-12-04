package com.example.SchoolApp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class Plan extends Activity {

@Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.plan);


    final Spinner spinner=(Spinner) findViewById(R.id.spinner);
    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

           String str=spinner.getSelectedItem().toString();
            TextView tx= (TextView) findViewById(R.id.textView);
            tx.setText(str);

        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            return;
        }
    });
}


}
