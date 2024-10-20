package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public abstract class B00 implements InterfaceC1276Jv0 {
    public final int a;
    public final int[] b;
    public final int[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public B00(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i, 12326, 0, 12344};
        if (this.a == 2) {
            int[] iArr2 = new int[15];
            System.arraycopy(iArr, 0, iArr2, 0, 12);
            iArr2[12] = 12352;
            iArr2[13] = 4;
            iArr2[14] = 12344;
            iArr = iArr2;
        }
        this.b = iArr;
        this.a = i2;
        this.c = new int[1];
        this.d = 8;
        this.e = 8;
        this.f = 8;
        this.g = 0;
        this.h = i;
        this.i = 0;
    }

    @Override // defpackage.InterfaceC1276Jv0
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.b, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = 0;
        int i2 = iArr[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(eGLDisplay, this.b, eGLConfigArr, i2, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        while (true) {
            if (i >= i2) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i];
            int a = a(egl10, eGLDisplay, eGLConfig, 12325);
            int a2 = a(egl10, eGLDisplay, eGLConfig, 12326);
            if (a >= this.h && a2 >= this.i) {
                int a3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                int a4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                int a5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                int a6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                if (a3 == this.d && a4 == this.e && a5 == this.f && a6 == this.g) {
                    break;
                }
            }
            i++;
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }

    public final int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = this.c;
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
