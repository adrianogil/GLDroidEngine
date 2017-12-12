package com.gillabs.gldev.glandroidengine;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.gillabs.gldev.gldroidmeshgeneration.MainActivity;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by gil on 10/12/17.
 */
public class GLManager implements GLSurfaceView.Renderer {

    private GLScene mCurrentScene = null;

    public GLManager(Context context) {

    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {

    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {

    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        GLTime.OnFrameStart();

        if (mCurrentScene != null)
        {

        }
    }

    public GLScene getmCurrentScene() {
        return mCurrentScene;
    }

    public void setmCurrentScene(GLScene mCurrentScene) {
        this.mCurrentScene = mCurrentScene;
    }
}
