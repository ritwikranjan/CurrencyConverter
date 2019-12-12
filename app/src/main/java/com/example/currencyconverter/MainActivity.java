package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText input;
    Button convert;
    TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        convert = findViewById(R.id.convert);
        show = findViewById(R.id.show);
        convert.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                String S = input.getText().toString();
                Double db = Double.parseDouble(S);
                db = db * 0.014;
                String temp = "$"+db.toString();
                show.setText(temp);
            }
        });
    }
}
