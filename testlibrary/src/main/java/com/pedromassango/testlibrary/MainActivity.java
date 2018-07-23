package com.pedromassango.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pedromassango.doubleclick.DoubleClick;
import com.pedromassango.doubleclick.DoubleClickListener;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new DoubleClick(new DoubleClickListener() {
            @Override
            public void onSingleClick(View view) {
                Toast.makeText(MainActivity.this,"Single()", Toast.LENGTH_SHORT).show();
                Log.v(TAG, "Single()");
            }

            @Override
            public void onDoubleClick(View view) {
                Toast.makeText(MainActivity.this,"onDoubleClick()", Toast.LENGTH_SHORT).show();
                Log.v(TAG, "onDoubleClick()");
            }
        }));
    }
}
