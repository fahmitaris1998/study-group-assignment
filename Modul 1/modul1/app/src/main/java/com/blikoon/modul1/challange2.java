package com.blikoon.modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class challange2 extends AppCompatActivity {
    Button b1,b2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange2);
        b1 = (Button) findViewById(R.id.button1_challange2);
        b2 = (Button) findViewById(R.id.button2_challange2);
        tv = (TextView) findViewById(R.id.textView);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(v);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp(v);
            }
        });



    }

    public void countUp(View view) {
        String isi = tv.getText().toString();
        int count = Integer.parseInt(isi);
        count++;
        isi = String.valueOf(count);
        tv.setText(isi);

    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}
