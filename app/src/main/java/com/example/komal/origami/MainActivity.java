package com.example.komal.origami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    TextView tv;
    Animation fadein;
    Button one, two, three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.title);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
        tv.startAnimation(fadein);
        fadein.setAnimationListener(this);
        one.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Intent i = new Intent(MainActivity.this, boat.class);
               startActivity(i);
           }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, fish.class);
                startActivity(i);
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, rose.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.VISIBLE);
        three.setVisibility(View.VISIBLE);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
