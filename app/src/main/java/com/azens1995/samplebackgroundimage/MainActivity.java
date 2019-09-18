package com.azens1995.samplebackgroundimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import jp.wasabeef.blurry.Blurry;

/**
 * Created by Azens Eklak on 2019-09-18.
 * Ishani Technology Pvt. Ltd
 * azens1995@gmail.com
 */
public class MainActivity extends AppCompatActivity {
    private ConstraintLayout mContainerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        mContainerView = findViewById(R.id.root);
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.tharu_girl);
        Bitmap blurredBitmap = BlurBuilder.blur( this, originalBitmap );
        mContainerView.setBackground(new BitmapDrawable(getResources(), blurredBitmap));

    }
}
