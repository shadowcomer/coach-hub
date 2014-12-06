package com.ssoft.coach_hub;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

public class MainGLRenderer implements GLSurfaceView.Renderer {

	public MainGLRenderer(){}
	
	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		// Set background color
		GLES20.glClearColor(0.3f, 0.2f, 0.1f, 1.0f);
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		GLES20.glViewport(0, 0, width, height);
	}

	@Override
	public void onDrawFrame(GL10 gl) {
		// Redraw background
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
	}

}
