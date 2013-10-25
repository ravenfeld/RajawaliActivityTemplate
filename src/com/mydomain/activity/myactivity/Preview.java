package com.mydomain.activity.myactivity;

import android.os.Bundle;

import rajawali.RajawaliActivity;

public class Preview extends RajawaliActivity {


    private Renderer mRenderer;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRenderer = new Renderer(this);
        mRenderer.setSurfaceView(mSurfaceView);
        super.setRenderer(mRenderer);
    }
}
