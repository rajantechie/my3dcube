package com.example.my3dcube;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

public class ES2SurfaceView extends GLSurfaceView {

	float touchedX = 0;
	float touchedY = 0;
	ViewPortRenderer renderer;
	public ES2SurfaceView(Context context) {
		super(context);
		setEGLContextClientVersion(2);
        setRenderer(renderer = new ViewPortRenderer(this));
	}

	

}
