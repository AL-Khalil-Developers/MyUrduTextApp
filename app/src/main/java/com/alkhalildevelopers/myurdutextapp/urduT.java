package com.alkhalildevelopers.myurdutextapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class urduT extends AppCompatTextView {
    public urduT(Context context) {
        super(context);
        myUrduTypeFace(context);
    }

    public urduT(Context context, AttributeSet attrs) {
        super(context, attrs);
        myUrduTypeFace(context);
    }

    public urduT(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        myUrduTypeFace(context);
    }

    //Create a Typeface Object and then set your custom typeface (from assets folder)
    private void myUrduTypeFace (Context context){
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"jameel_nori.ttf");
        this.setTypeface(typeface);
    }
}
