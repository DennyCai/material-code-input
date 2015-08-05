package com.github.glomadrian.codeinputlib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.github.glomadrian.codeinputlib.model.UnderPoint;
import com.nineoldandroids.animation.ValueAnimator;

/**
 * Created by Administrator on 2015/8/5.
 */
public class IpAddressInput extends CodeInput {

    private Paint mPointPaint;
    private UnderPoint[] mPoints;

    private int mHeight;
    private float mMaxRadius=2.5f;

    private ValueAnimator mRadiusAnimator;

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
        initPaints();
        initAnim();
    }

    private void initAnim() {
        mRadiusAnimator = ValueAnimator.ofFloat(0,mMaxRadius).setDuration(200);
    }

    private void initPaints() {
        mPointPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPointPaint.setColor(underlineColor);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mHeight = h;
        initPoints();
    }

    private void initPoints() {
        mPoints = new UnderPoint[underlines.length-1];
        for(int i=0;i<mPoints.length;i++)
            mPoints[i] = createPoint(i);
    }

    private UnderPoint createPoint(int pos) {
        float x = underlines[pos].getToX();
        return new UnderPoint(x,mHeight);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawPoints(canvas);
    }

    private void drawPoints(Canvas canvas) {
        for (int i = 0;i<mPoints.length;i++)
            mPoints[i].draw(canvas,mPointPaint);
    }
}
