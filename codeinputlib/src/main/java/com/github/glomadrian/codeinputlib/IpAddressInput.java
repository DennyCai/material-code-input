package com.github.glomadrian.codeinputlib;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.github.glomadrian.codeinputlib.model.UnderPoint;

/**
 * Created by Administrator on 2015/8/5.
 */
public class IpAddressInput extends CodeInput {

    private UnderPoint[] mPoints;
    private int mHeight;

    public IpAddressInput(Context context) {
        super(context);
        init();
    }

    public IpAddressInput(Context context, AttributeSet attributeset) {
        super(context, attributeset);
        init();
    }

    public IpAddressInput(Context context, AttributeSet attributeset, int defStyledAttrs) {
        super(context, attributeset, defStyledAttrs);
        init();
    }

    private void init() {
        initPoints();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mHeight = h;
        initPoints();
    }

    private void initPoints() {
        mPoints = new UnderPoint[3];
        for(int i=0;i<mPoints.length;i++)
            mPoints[i] = createPoint(mPoints.length,i);
    }

    private UnderPoint createPoint(int total,int pos) {
        float length = getUnderlineLength();
        float x = length*(pos/total);
        return new UnderPoint(x,mHeight);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPoints(canvas);
    }

    private void drawPoints(Canvas canvas) {
//        canvas.dra
    }
}
