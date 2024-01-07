package com.daasuu.gpuvideoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

public class PortraitCameraActivity extends BaseCameraActivity {

    public static void startActivity(Activity activity) {
        Intent intent = new Intent(activity, PortraitCameraActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_portrate);
        videoWidth = 1080;
        videoHeight = 2201;
        cameraWidth = 1080;
        cameraHeight = 2201;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        Log.e("onCreate", "height--->"+height);
        Log.e("onCreate", "width--->"+width);

        onCreateActivity();
    }

}
