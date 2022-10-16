package com.rahul.techynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    //Variables
    Animation topAnim,bottomAnim;
    ImageView spimg;
    TextView logo,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //full scree of splash
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        //Define intent to go to main activity
        Intent iHome = new Intent(SplashActivity.this,LoginActivity.class);
        //Handeler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Define intent to go to main activity
                Intent iHome = new Intent(SplashActivity.this,LoginActivity.class);
                //Call of intent
                startActivity(iHome);
                //finish Activity
                finish();
            }
        },3000);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        spimg = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);
        slogan = findViewById(R.id.textView2);

        spimg.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);



    }
}