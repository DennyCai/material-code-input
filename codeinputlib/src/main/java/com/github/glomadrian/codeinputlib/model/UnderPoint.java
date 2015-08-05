package com.github.glomadrian.codeinputlib.model;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Administrator on 2015/8/5.
 */
public class UnderPoint {

    private float mX;
    private float mY;
    private float mRadius=0;

    public float getRadius() {
        return mRadius;
    }

    public void setRadius(float mRadius) {
        this.mRadius = mRadius;
    }


    public UnderPoint() {
        this(0,0);
    }

    public UnderPoint(float mX, float mY) {
        this.mX = mX;
        this.mY = mY - mRadius;
    }

    public float getX() {
        return mX;
    }

    public void setX(float mX) {
        this.mX = mX;
    }

    public float getY() {
        return mY;
    }

    public void setY(float mY) {
        this.mY = mY;
    }

    public void draw(Canvas canvas,Paint paint){
        canvas.drawCircle(this.getX(),this.getY(),this.getRadius(),paint);
    }
}
