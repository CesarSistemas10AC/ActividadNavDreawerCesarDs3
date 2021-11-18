package com.example.actividadnavdreawercesar;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.actividadnavdreawercesar.ui.gallery.GalleryFragment;

public class splash extends AppCompatActivity {

    private static final long SPLASH_SCREEN_DELAY =5000;
    Animation animation, botonani;
    ImageView img;
    TextView fresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

        animation = AnimationUtils.loadAnimation(this, R.anim.top);
        botonani = AnimationUtils.loadAnimation(this, R.anim.button);
        img = findViewById(R.id.imageView2);
        fresa = findViewById(R.id.textView3);
        img.setAnimation(animation);
        fresa.setAnimation(botonani);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_DELAY);
    }
}
