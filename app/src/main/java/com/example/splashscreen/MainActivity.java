package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation img_anim_splash,txt_anim_splash;
    private ImageView splash_img;
   private TextView splash_txt;
    private static int SPLASH_SCREEN =4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        splash_img =(ImageView) findViewById(R.id.img_splash);
        splash_txt = (TextView) findViewById(R.id.txt_logo);

        img_anim_splash= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        txt_anim_splash = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        splash_img.setAnimation(img_anim_splash);
        splash_txt.setAnimation(txt_anim_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}