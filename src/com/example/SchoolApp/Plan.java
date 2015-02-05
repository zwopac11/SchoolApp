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
                p.setColor(Color.MAGENTA);
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
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.63);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Chemiesaal"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.63);
                int breite=(int) (iv.getWidth()*0.87);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("EDV1"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.24);
                int breite=(int) (iv.getWidth()*0.66);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("EDV2"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.21);
                int breite=(int) (iv.getWidth()*0.66);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("EDV3"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.44);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("EDV4"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.4);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Tinf-Labor"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.34);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Cisco-Labor"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.31);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Sekretariat"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.44);
                int breite=(int) (iv.getWidth()*0.62);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Cafeteria"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.35);
                int breite=(int) (iv.getWidth()*0.62);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Werkstätten"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.25);
                int breite=(int) (iv.getWidth()*0.73);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("KÜ-Saal"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.36);
                int breite=(int) (iv.getWidth()*0.55);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("PRR-Labor"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.11);
                int breite=(int) (iv.getWidth()*0.66);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Bibliothek"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.55);
                int breite=(int) (iv.getWidth()*0.9);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }else if(str.equals("Schularzt"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.36);
                int breite=(int) (iv.getWidth()*0.48);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else if(str.equals("Schulwart"))
            {
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                p.setColor(Color.MAGENTA);
                int hoehe= (int) (iv.getHeight()*0.3);
                int breite=(int) (iv.getWidth()*0.69);
                c.drawOval(new RectF(hoehe, breite, hoehe+10, breite+10), p);
                alteHoehe=hoehe;
                alteBreite=breite;
                iv.setImageBitmap(bmp);
            }
            else{
                p.setColor(Color.BLACK);
                c.drawOval(new RectF(alteHoehe, alteBreite, alteHoehe+10, alteBreite+10), p);
                iv.setImageBitmap(bmp);
                p.setColor(Color.MAGENTA);
            }

        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            return;
        }
    });
}


}
