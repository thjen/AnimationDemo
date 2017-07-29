package com.example.qthjen.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv,iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        iv1 = (ImageView) findViewById(R.id.iv1);

        final Animation animationUtils = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_alpha);
        final Animation animationRotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_rotate);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animationUtils);
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animationRotate);
            }
        });

    }
}
