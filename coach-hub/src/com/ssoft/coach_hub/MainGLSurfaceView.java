package com.ssoft.coach_hub;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MainGLSurfaceView extends GLSurfaceView {

	public MainGLSurfaceView(Context context) {
		super(context);
		
		// OpenGL-ES 2.0
		setEGLContextClientVersion(2);
		
		// Set renderer
		setRenderer(new MainGLRenderer());
	
		// When to update
		setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

	}

}
