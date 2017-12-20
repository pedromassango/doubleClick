package com.pedromassango.doubleclick;

import android.view.View;

import org.jetbrains.annotations.NotNull;

/**
 * Created by pedromassango on 12/20/17.
 */
/*
    Interface to be notified from a new click event.
 */
public interface DoubleClickListener {

    /*
        Called when the user make a single click.
    */
    void onSingleClick(@NotNull View view);

    /*
        Called when the user make a double click.
    */
    void onDoubleClick(@NotNull View view);
}
