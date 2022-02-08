package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.txt);
        imageView = findViewById(R.id.heart);
//        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("ScaleX",5F),
//                PropertyValuesHolder.ofFloat("ScaleY",5F));
//        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
//        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
//        objectAnimator.setDuration(1000);
//        objectAnimator.start();
        String c ="My Heart is Brok";
        textView.setText(c);
        Animation anim = AnimationUtils.loadAnimation(this,R.anim.from_bottom);
        textView.setAnimation(anim);
        Animation anim2 = AnimationUtils.loadAnimation(this,R.anim.from_top);
        imageView.setAnimation(anim2);
        
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//                for (int i=0;i<c.length();i++){
//                    try {
//                        Thread.sleep(1500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//
//                    int finalI = i;
//                    runOnUiThread(new Runnable() {
//                        @SuppressLint("SetTextI18n")
//                        @Override
//                        public void run() {
//                            textView.setText(textView.getText()+String.valueOf(c.charAt(finalI)));
//                        }
//                    });
//                }
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();
    }
}