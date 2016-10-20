package com.example.komal.origami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class boat extends AppCompatActivity {
    ImageView iv;
    Integer imageArray[] = {R.drawable.origami_boat_01, R.drawable.origami_boat_02,
            R.drawable.origami_boat_03,R.drawable.origami_boat_04,R.drawable.origami_boat_05,
            R.drawable.origami_boat_06, R.drawable.origami_boat_07, R.drawable.origami_boat_08,
            R.drawable.origami_boat_09, R.drawable.origami_boat_10, R.drawable.origami_boat_11,
            R.drawable.origami_boat_12,R.drawable.origami_boat_13};
    int i = 0;
    int size = 13;
    Button next, prev, learn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boat);
        i = 0;
        iv = (ImageView)findViewById(R.id.boatsteps);
        tv = (TextView)findViewById(R.id.name1);
        next = (Button)findViewById(R.id.next1);
        prev = (Button)findViewById(R.id.prev1);
        learn = (Button)findViewById(R.id.learn1);
        iv.setImageResource(R.drawable.origami_boat_13);
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
                    Toast t = Toast.makeText(getApplicationContext(), "Sailboat!", Toast.LENGTH_SHORT);
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
