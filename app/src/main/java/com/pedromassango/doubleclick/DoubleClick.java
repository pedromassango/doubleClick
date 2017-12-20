package com.pedromassango.doubleclick;

import android.os.Handler;
import android.view.View;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by pedromassango on 12/20/17.
 */

public class DoubleClick implements View.OnClickListener {

    private final long TIME_TO_LISTEN_A_DOUBLE_CLICK = 400L;
    private int clicks;
    private final DoubleClickListener doubleClickListener;

    public DoubleClick(@NotNull DoubleClickListener doubleClickListener) {
        this.doubleClickListener = doubleClickListener;
    }

    @Override
    public void onClick(@Nullable final View v) {

        // Increase clicks count
        this.clicks++;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public final void run() {

                if (clicks >= 2) {  // Double tap.
                    doubleClickListener.onDoubleClick(v);
                }

                if (clicks == 1) {  // Single tap
                    doubleClickListener.onSingleClick(v);
                }

                // we need to  restore clicks count
                clicks = 0;
            }
        }, TIME_TO_LISTEN_A_DOUBLE_CLICK);
    }
}
