package com.example.barrageguardbuttondemo.utils;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.View;

/**
 * Multi tap safe button
 */
public class BarrageGuardButton extends AppCompatButton {
    public BarrageGuardButton(Context context) {
        super(context);
    }

    public BarrageGuardButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BarrageGuardButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setOnClickListener(final View.OnClickListener listener) {
        super.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View view) {

                view.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        view.setEnabled(true);
                    }
                }, 3000L);

                listener.onClick(view);
            }
        });
    }
}
