package com.gillabs.gldev.glandroidengine;

/**
 * Created by gil on 12/12/17.
 */
public class GLMeshObject extends GLObject {

    private GLMaterial mMaterial;

    public GLMeshObject(String objectName) {
        super(objectName);

        mMaterial = new GLMaterial();
    }
}
