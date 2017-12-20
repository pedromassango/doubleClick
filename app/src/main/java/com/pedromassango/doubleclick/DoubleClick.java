package com.pedromassango.doubleclick;

import android.os.Handler;
import android.view.View;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pedromassango on 12/20/17.
 */

public class DoubleClick implements View.OnClickListener {

    private int clicks;
    private final DoubleClickListener doubleClickListener;

    public DoubleClick(@NotNull DoubleClickListener doubleClickListener) {
        this.doubleClickListener = doubleClickListener;
    }

    @Override
    public void onClick(@Nullable final View v) {
        this.clicks++;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public final void run() {
                if (clicks == 1) {
                    doubleClickListener.onSingleClick(v);
                }
                if (clicks >= 2) {
                    doubleClickListener.onDoubleClick(v);
                }
            }
        }, 200L);
    }

}
