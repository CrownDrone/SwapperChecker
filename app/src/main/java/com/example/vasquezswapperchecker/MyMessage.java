package com.example.vasquezswapperchecker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyMessage extends Activity {

    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        Intent s2 = getIntent();
        t = (TextView) findViewById(R.id.message);
        String result = s2.getStringExtra("same");
        t.setText(result);

    }
}
