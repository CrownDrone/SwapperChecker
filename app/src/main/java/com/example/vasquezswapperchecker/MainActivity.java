package com.example.vasquezswapperchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button check, swap;
    EditText et1,et2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = (Button) findViewById(R.id.check);
        swap = (Button) findViewById(R.id.swap);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MyMessage.class);
                String fir = et1.getText().toString();
                String sec = et2.getText().toString();

                if(fir.equalsIgnoreCase(sec)){
                    i.putExtra("same", "The Same");
                    startActivity(i);
                } else {
                    i.putExtra("same", "Not The Same");
                    startActivity(i);
                }
            }
        });
    }

    public void onSwap(View view){
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        String f1  = String.valueOf(et1.getText());
        String f2  = String.valueOf(et2.getText());
        et1.setText(f2);
        et2.setText(f1);
    }
}