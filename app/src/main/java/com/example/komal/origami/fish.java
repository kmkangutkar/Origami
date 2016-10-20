package com.example.komal.origami;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class fish extends AppCompatActivity {
    ImageView iv;
    Integer imageArray[] = {R.drawable.fish_01, R.drawable.fish_011, R.drawable.fish_02,
            R.drawable.fish_03,R.drawable.fish_04,R.drawable.fish_05,
            R.drawable.fish_06, R.drawable.fish_07};
    int i = 0;
    int size = 8;
    Button next, prev, learn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);
        i = 0;
        iv = (ImageView)findViewById(R.id.fishsteps);
        tv = (TextView)findViewById(R.id.name2);
        next = (Button)findViewById(R.id.next2);
        prev = (Button)findViewById(R.id.prev2);
        learn = (Button)findViewById(R.id.learn2);
        iv.setImageResource(R.drawable.fish_07);
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
                    Toast t = Toast.makeText(getApplicationContext(), "Fish!", Toast.LENGTH_SHORT);
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
