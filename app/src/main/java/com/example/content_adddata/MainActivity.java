package com.example.content_adddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button displayContentButton = (Button)findViewById(R.id.dispaly_content);
        displayContentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displayIntent = new Intent(MainActivity.this, DisplayContentActivity.class);
                startActivity(displayIntent);
            }
        });*/
        Button addContentButton = (Button)findViewById(R.id.add_new_content);
        addContentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //stop();
                Intent addIntent = new Intent(MainActivity.this, AddContentActivity.class);
                startActivity(addIntent);
            }
        });

    }

}
