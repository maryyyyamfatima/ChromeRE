package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xw0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3100Xw0 {
    public final WeakReference a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLSurface d;
    public EGLConfig e;
    public EGLContext f;

    public C3100Xw0(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final void c() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new D84("eglGetDisplay failed");
        }
        if (!this.b.eglInitialize(eglGetDisplay, new int[2])) {
            throw new D84("eglInitialize failed");
        }
        AW0 aw0 = (AW0) this.a.get();
        if (aw0 == null) {
            this.e = null;
            this.f = null;
        } else {
            this.e = aw0.h().chooseConfig(this.b, this.c);
            C10837vj0 d = aw0.d();
            EGL10 egl102 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLConfig eGLConfig = this.e;
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            int i = d.a;
            this.f = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, i != 0 ? new int[]{12440, i, 12344} : null);
        }
        EGLContext eGLContext2 = this.f;
        if (eGLContext2 == null || eGLContext2 == EGL10.EGL_NO_CONTEXT) {
            this.f = null;
            throw new D84("createContext failed: " + this.b.eglGetError());
        }
        this.d = null;
    }

    public final boolean a() {
        if (this.b == null) {
            throw new D84("egl not initialized");
        }
        if (this.c == null) {
            throw new D84("eglDisplay not initialized");
        }
        if (this.e == null) {
            throw new D84("mEglConfig not initialized");
        }
        b();
        AW0 aw0 = (AW0) this.a.get();
        EGLSurface eGLSurface = null;
        if (aw0 != null) {
            C2780Vk0 b = aw0.b();
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLConfig eGLConfig = this.e;
            Object a = aw0.a();
            b.getClass();
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, a, null);
            } catch (IllegalArgumentException e) {
                Log.e("WindowSurfaceFactory", "eglCreateWindowSurface", e);
            }
            this.d = eGLSurface;
        } else {
            this.d = null;
        }
        EGLSurface eGLSurface2 = this.d;
        if (eGLSurface2 == null || eGLSurface2 == EGL10.EGL_NO_SURFACE) {
            if (this.b.eglGetError() == 12299) {
                Log.e("EglController", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
            return false;
        }
        if (this.b.eglMakeCurrent(this.c, eGLSurface2, eGLSurface2, this.f)) {
            return true;
        }
        Log.w("EglController", "eglMakeCurrent failed: " + this.b.eglGetError());
        return false;
    }

    public final void b() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.d;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.b.eglMakeCurrent(this.c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        AW0 aw0 = (AW0) this.a.get();
        if (aw0 != null) {
            C2780Vk0 b = aw0.b();
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface3 = this.d;
            b.getClass();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
        }
        this.d = null;
    }
}
