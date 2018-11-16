package com.pedromassango.doubleclick;

import android.os.Handler;
import android.view.View;

/**
 * @author pedromassango on 12/20/17.
 *
 * @contributing to development samirtf
 * Interface to be notified from a new click event.
 *
 */
public class DoubleClick implements View.OnClickListener {

  /*
   * Duration of click interval.
   * 200 milliseconds is a best fit to double click interval.
   */
  private static final long DOUBLE_CLICK_INTERVAL = 200L;  // Time to wait the second click.

  /*
   * Handler to process click event.
   */
  private final Handler mHandler = new Handler();

  /*
   * Click callback.
   */
  private final DoubleClickListener doubleClickListener;

  /*
   * Number of clicks in @DOUBLE_CLICK_INTERVAL interval.
   */
  private int clicks;
  
  /**
   * Builds a DoubleClick.
   *
   * @param doubleClickListener the click listener to notify clicks.
   */
  public DoubleClick(final DoubleClickListener doubleClickListener) {
    this.doubleClickListener = doubleClickListener;
  }

  @Override
  public void onClick(final View view) {



      // Increase clicks count
      clicks++;

      mHandler.postDelayed(new Runnable() {
        public final void run() {

          if (clicks >= 2) {  // Double tap.
            doubleClickListener.onDoubleClick(view);
          }

          if (clicks == 1) {  // Single tap
            doubleClickListener.onSingleClick(view);
          }

          // we need to  restore clicks count
          clicks = 0;
        }
      }, DOUBLE_CLICK_INTERVAL);
   

  }
}
