package defpackage;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3306Zl1 implements InterfaceC1276Jv0 {
    public static final int[] b = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public final boolean a;

    public C3306Zl1(boolean z) {
        this.a = z;
    }

    @Override // defpackage.InterfaceC1276Jv0
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        int[] iArr2 = b;
        egl10.eglChooseConfig(eGLDisplay, iArr2, null, 0, iArr);
        int i = iArr[0];
        if (i <= 0) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i];
        egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr, i, iArr);
        if (!this.a) {
            EGLConfig a = a(egl10, eGLDisplay, eGLConfigArr, 0, 4);
            if (a != null) {
                return a;
            }
            EGLConfig a2 = a(egl10, eGLDisplay, eGLConfigArr, 0, 0);
            if (a2 != null) {
                return a2;
            }
        }
        EGLConfig a3 = a(egl10, eGLDisplay, eGLConfigArr, 8, 4);
        if (a3 != null) {
            return a3;
        }
        EGLConfig a4 = a(egl10, eGLDisplay, eGLConfigArr, 8, 0);
        if (a4 != null) {
            return a4;
        }
        throw new IllegalArgumentException("no transparent context found");
    }

    public static final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, int i, int i2) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            if (b(egl10, eGLDisplay, eGLConfig, 12324) == 8 && b(egl10, eGLDisplay, eGLConfig, 12323) == 8 && b(egl10, eGLDisplay, eGLConfig, 12322) == 8 && b(egl10, eGLDisplay, eGLConfig, 12321) == i && b(egl10, eGLDisplay, eGLConfig, 12337) == i2) {
                return eGLConfig;
            }
        }
        return null;
    }

    public static final int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
