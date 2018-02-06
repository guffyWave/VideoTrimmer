package com.example.gufran.k4lvideotrimgufransample.videotrimmer.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;

/**
 * Created by magicpin on 6/2/18.
 */

public class ThumbSeekBar extends AppCompatSeekBar {

    private Drawable thumb;

    public ThumbSeekBar(Context context) {
        super(context);
    }

    public ThumbSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThumbSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public Drawable getThumb() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            return super.getThumb();
        }
        return thumb;
    }

    @Override
    public void setThumb(Drawable thumb) {
        super.setThumb(thumb);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            this.thumb = thumb;
        }
    }
}