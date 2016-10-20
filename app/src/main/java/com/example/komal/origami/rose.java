package com.example.komal.origami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class rose extends AppCompatActivity {
    ImageView iv;

    Integer imageArray[] = {R.drawable.rose01, R.drawable.rose02,
            R.drawable.rose03,R.drawable.rose04,R.drawable.rose05,
            R.drawable.rose06, R.drawable.rose07, R.drawable.rose08,
            R.drawable.rose09, R.drawable.rose10, R.drawable.rose11};

    int i = 0;
    int size = 11;
    Button next, prev, learn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose);

        i = 0;

        iv = (ImageView)findViewById(R.id.rosesteps);
        tv = (TextView)findViewById(R.id.name3);
        next = (Button)findViewById(R.id.next3);
        prev = (Button)findViewById(R.id.prev3);
        learn = (Button)findViewById(R.id.learn3);
        iv.setImageResource(R.drawable.rose11);

        learn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                learn.setVisibility(View.INVISIBLE);
                next.setVisibility(View.VISIBLE);
                prev.setVisibility(View.VISIBLE);
                iv.setImageResource(imageArray[i]);
                tv.setText("STEPS:");
            }
        });

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                i++;
                if(i < size) {
                    iv.setImageResource(imageArray[i]);
                }else {
                    i = size -1;
                    iv.setImageResource(imageArray[i]);
                    Toast t = Toast.makeText(getApplicationContext(), "Rose!", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i > 0) {
                    i--;
                    iv.setImageResource(imageArray[i]);
                }else
                    i = 0;
            }
        });
    }
}
