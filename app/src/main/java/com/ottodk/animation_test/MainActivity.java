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

        mImageView2 = (ImageView) findViewById(R.id.imageView2);


        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crossfade();
            }
        });
    }


    private void crossfade() {
        if (mImageView2.getAlpha() == 0) {

            mImageView.animate().alpha(0f).setDuration(2000);
            mImageView2.animate().alpha(1f).setDuration(2000);
        } else {
            mImageView2.animate().alpha(0f).setDuration(2000);
            mImageView.animate().alpha(1f).setDuration(2000);
        }

    }
}
