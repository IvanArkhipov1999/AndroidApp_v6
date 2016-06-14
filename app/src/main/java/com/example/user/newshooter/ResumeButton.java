package com.example.user.newshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;

/**
 * Created by user on 6/14/2016.
 */
public class ResumeButton {
    RectF rect;

    // The player ship will be represented by a Bitmap
    private Bitmap bitmap;

    Context context;

    // How long and high our paddle will be
    private float width;
    private float height;

    // X is the far left of the rectangle which forms our paddle
    private float x;
    // Y is the top coordinate
    private float y;
    public ResumeButton(Context context, int screenX, int screenY) {
        // Initialize a blank RectF
        rect = new RectF();
        width = screenX / 8;
        height = screenY / 6;
        // Start ship in roughly the screen centre
        x = screenX;
        y = -100;
        // Initialize the bitmap
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.play);
        // stretch the bitmap to a size appropriate for the screen resolution
        bitmap = Bitmap.createScaledBitmap(bitmap, (int) (width), (int) (height), false);
        this.context = context;
    }

    public Bitmap getBitmap(){ return bitmap; }

    public float getX(){ return x; }

    public float getY(){ return y; }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }
}

