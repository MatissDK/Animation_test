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

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rotate();
            }
        });
    }


    //scales according to set axes, we can combine those as well
    private void rotate() {
        mImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        /*mImageView.animate()
                .scaleX(0f)
                .scaleY(0f)
                .alpha(0f)
                .rotation(480f)
                .setDuration(2000);*/

    }
}
