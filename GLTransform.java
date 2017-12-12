package com.gillabs.gldev.glandroidengine;

/**
 * Created by gil on 10/12/17.
 */
public class GLTransform {

    private Vector3 mRotationAngles;
    private Vector3 mPosition;

    public GLTransform() {
        mPosition = new Vector3(0f,0f,0f);
        mRotationAngles = new Vector3(0f,0f,0f);
    }
}
