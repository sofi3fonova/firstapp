package com.example.a3fsof.a21jan2019;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.domik);
        Paint p = new Paint();
        canvas.drawBitmap(img,10,10,p);


    }
}

