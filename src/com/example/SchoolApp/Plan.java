package com.example.SchoolApp;

import android.app.Activity;
import android.content.Context;
import android.graphics.*;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Plan extends Activity {
    public int alteHoehe;
    public int alteBreite;

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

            ImageView iv=(ImageView) findViewById(R.id.imageView);
            iv.invalidate();
            Bitmap bmp = Bitmap.createBitmap(iv.getWidth(), iv.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas c = new Canvas(bmp);
            iv.draw(c);
            Paint p = new Paint();

            //iv.invalidate();

            if(str.equals("Turnsaal"))
            {

                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.GREEN);
                int hoehe= (int) (iv.getHeight()*0.4);
                int breite=(int) (iv.getWidth()*0.44);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Physiksaal"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.GREEN);
                int hoehe= (int) (iv.getHeight()*0.63);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else{
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                iv.setImageBitmap(bmp);
                p.setColor(Color.GREEN);
            }

        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            return;
        }
    });
}


}
