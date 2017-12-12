package com.gillabs.gldev.glandroidengine;

/**
 * Created by gil on 10/12/17.
 */
public class GLObject {

    private GLTransform mTransform;
    private String mObjectName;

    public GLObject(String objectName) {
        mObjectName = objectName;
        mTransform = new GLTransform();
    }

    public void onStart()
    {

    }

    public void draw() {

    }

    public void onFrameStart() {

    }
}
