package com.example.animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String c;
    TextView txt;
    CardView cardView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         imageView =(ImageView) findViewById(R.id.heart);
        cardView= findViewById(R.id.card);
        txt = findViewById(R.id.txt);



        ObjectAnimator objectAnimator = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("ScaleX",1.2F),
                PropertyValuesHolder.ofFloat("ScaleY",1.2F)
                );
        objectAnimator.setDuration(1000);
        objectAnimator.setRepeatCount(ValueAnimator.INFINITE);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        objectAnimator.start();
        txt.setText("My Heart is Brok");
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.from_bottom);
        txt.setAnimation(animation);
        ConstraintLayout layout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();




//        MyHandler handler = new MyHandler();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String sequence = "My Heart is Hadeer";
//                for (int i=0;i<sequence.length();i++) {
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    c = String.valueOf(sequence.charAt(i));
//                    Message message = new Message();
//                    Bundle bundle = new Bundle();
//                    bundle.putString("key",c);
//                    message.setData(bundle);
//                    handler.sendMessageAtTime(message, SystemClock.uptimeMillis()+2000);
//
//
//
//
//                }
//
//
//            }
//        };
//        Thread thread = new Thread(runnable);
//        thread.start();

        cardView.setOnClickListener(v->{
            Intent intent =new Intent(MainActivity.this,MainActivity2.class);
            Pair[] pairs = new Pair[2];
            pairs[0]= new Pair<View,String>(imageView,"imageTrans");
            pairs[1]= new Pair<View,String>(txt,"destxt");
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);

            startActivity(intent,activityOptions.toBundle());
        });

      }



}
