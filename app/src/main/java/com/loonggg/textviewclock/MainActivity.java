package com.loonggg.textviewclock;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loonggg.textviewclock.lib.TextViewClock;

public class MainActivity extends AppCompatActivity {
    private TextViewClock tvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvc = (TextViewClock) findViewById(R.id.tvc);
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "fonts/weds.ttf");
        tvc.setFontTypeface(typeface);
    }
}
