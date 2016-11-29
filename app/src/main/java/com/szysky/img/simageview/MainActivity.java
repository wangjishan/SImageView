package com.szysky.img.simageview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "sususu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        SImageView iv= (SImageView) findViewById(R.id.iv_main);
        iv.setDrawStrategy(new DrawCircle());
        long l = System.nanoTime();
        //iv.setImageResource(R.mipmap.icon_test);
        Log.i(TAG, "一张图片执行时间:"+ (System.nanoTime() - l));



        ArrayList<Bitmap> bitmaps = new ArrayList<>();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_test);
        bitmaps.add(bitmap);
        bitmaps.add(bitmap);
        bitmaps.add(bitmap);
        bitmaps.add(bitmap);
        bitmaps.add(bitmap);
        iv.setImages(bitmaps);

    }
}
