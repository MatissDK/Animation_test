package com.ottodk.animation_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView, mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView) findViewById(R.id.imageView);

        //here I am bringing picture outside the visible view on Y and then
        // bringing back up by clicking on hidden view
        mImageView.setTranslationY(1200f);

        mImageView2 = (ImageView) findViewById(R.id.imageView2);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crossfade();
            }
        });


        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crossfade();
            }
        });
    }


    private void crossfade() {

        // down
        //mImageView.animate().translationYBy(1200f).setDuration(2000);

        //up
        mImageView.animate().translationYBy(-1200f).setDuration(2000);

        // moves right
       // mImageView.animate().translationXBy(600f).setDuration(2000);

        // moves left
        //mImageView.animate().translationXBy(-600f).setDuration(2000);


    }
}
