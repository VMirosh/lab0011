package com.example.nadya_pc.lab0011;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class MainActivity extends AppCompatActivity {

    Paint p;
    int mywidth=0, myheight=0;
    Bitmap oleg;
    int bmpx=0,bmpy=0;
    Rect R1,R2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm=new misha(this);
        setContentView(mm);
        oleg = BitmapFactory.decodeResource(getResources(), R.drawable.ui);
        bmpx = oleg.getWidth();
        bmpy = oleg.getHeight();
    }

    class misha extends View {
        public misha(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            mywidth = w;
            myheight = h;
            super.onSizeChanged(w, h, oldw, oldh);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            R1 = new Rect(470,0,927,707);
            R2 = new Rect(250,250,850,1200);
            canvas.drawBitmap(oleg,R1,R2,p);

            R1 = new Rect(0,880,300,1235);
            R2 = new Rect(150, 470,450,820);
            canvas.drawBitmap(oleg,R1,R2,p);
        }
    }
    misha mm;
}