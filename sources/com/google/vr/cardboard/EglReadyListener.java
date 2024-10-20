package com.google.vr.cardboard;

import android.opengl.GLES20;
import android.util.Log;
import defpackage.InterfaceC3360Zw0;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class EglReadyListener {
    public volatile EGLContext a;
    public volatile int b;
    public volatile InterfaceC3360Zw0 e;
    public volatile int c = 2;
    public final Object d = new Object();
    public final Object f = new Object();

    public void onEglReady() {
        synchronized (this.d) {
            this.a = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
            if (this.a == null || this.a == EGL10.EGL_NO_CONTEXT) {
                Log.e("EglReadyListener", "Unable to obtain the application's OpenGL context.");
            }
            String glGetString = GLES20.glGetString(7938);
            int i = 2;
            if (glGetString == null) {
                Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
            } else {
                int indexOf = glGetString.indexOf(46);
                if (indexOf <= 0) {
                    Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
                } else {
                    int numericValue = Character.getNumericValue(glGetString.charAt(indexOf - 1));
                    if (numericValue < 0) {
                        Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
                    } else {
                        i = numericValue;
                    }
                }
            }
            this.c = i;
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(33310, iArr, 0);
            GLES20.glGetError();
            this.b = iArr[0];
        }
        synchronized (this.f) {
            if (this.e != null) {
                this.e.onEglReady();
            }
        }
    }
}
