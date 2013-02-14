package com.example.debugme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = (TextView) findViewById(R.id.textView1);
        setContentView(R.layout.activity_main);
        textView.setText("Ooops!");
    }
}
