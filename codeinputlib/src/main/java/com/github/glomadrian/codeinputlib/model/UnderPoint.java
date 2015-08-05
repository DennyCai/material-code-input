package com.github.glomadrian.codeinputlib.model;

/**
 * Created by Administrator on 2015/8/5.
 */
public class UnderPoint {

    private float mX;
    private float mY;

    public UnderPoint() {
        this(0,0);
    }

    public UnderPoint(float mX, float mY) {
        this.mX = mX;
        this.mY = mY;
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
}
