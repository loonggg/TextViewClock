package com.loonggg.textviewclock.lib;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by loonggg on 2017/3/27.
 */

public class TextViewClock extends LinearLayout {
    private CountDownTimer cdTimer;
    private float textSize = 16, space;
    private int textColor;
    private TextClock hourTc, minuteTc;
    private TextView mTv;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public TextViewClock(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(HORIZONTAL);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextViewClock);
        textSize = typedArray.getDimension(R.styleable.TextViewClock_clockTextSize, 16f);
        space = typedArray.getDimension(R.styleable.TextViewClock_space, 5);
        textColor = typedArray.getColor(R.styleable.TextViewClock_clockTextColor, Color.BLACK);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins((int) space, 0, 0, 0);
        hourTc = new TextClock(context);
        hourTc.setTextSize(textSize);
        hourTc.setTextColor(textColor);
        hourTc.setFormat24Hour("kk");
        mTv = new TextView(context);
        mTv.setText(":");
        mTv.setTextSize(textSize);
        mTv.setTextColor(textColor);
        mTv.setLayoutParams(lp);
        minuteTc = new TextClock(context);
        minuteTc.setFormat24Hour("mm");
        minuteTc.setLayoutParams(lp);
        minuteTc.setTextColor(textColor);
        minuteTc.setTextSize(textSize);
        addView(hourTc);
        addView(mTv);
        addView(minuteTc);

        cdTimer = new CountDownTimer(60000 * 24, 500) {
            @Override
            public void onTick(long l) {
                if (mTv.getVisibility() != VISIBLE) {
                    mTv.setVisibility(VISIBLE);
                } else {
                    mTv.setVisibility(INVISIBLE);
                }
            }

            @Override
            public void onFinish() {
                mTv.setVisibility(VISIBLE);
                cdTimer.start();
            }
        };
        cdTimer.start();
    }

    public void setFontTypeface(Typeface tf) {
        minuteTc.setTypeface(tf);
        hourTc.setTypeface(tf);
        mTv.setTypeface(tf);
    }

}
