package defpackage;

import android.opengl.GLSurfaceView;
import android.os.Build;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class F02 implements GLSurfaceView.EGLConfigChooser {
    public static final boolean a = Build.FINGERPRINT.contains("generic_x86");

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12352, 64, 12339, 4100, 12344};
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2);
        boolean z = a;
        if (!eglChooseConfig && !z) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        iArr[15] = 4;
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = 0;
        int i2 = iArr2[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i2, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        if (!z) {
            while (true) {
                if (i >= i2) {
                    eGLConfig = null;
                    break;
                }
                EGLConfig eGLConfig2 = eGLConfigArr[i];
                int a2 = a(egl10, eGLDisplay, eGLConfig2, 12325);
                int a3 = a(egl10, eGLDisplay, eGLConfig2, 12326);
                int a4 = a(egl10, eGLDisplay, eGLConfig2, 12324);
                int a5 = a(egl10, eGLDisplay, eGLConfig2, 12323);
                int a6 = a(egl10, eGLDisplay, eGLConfig2, 12322);
                int a7 = a(egl10, eGLDisplay, eGLConfig2, 12339);
                if (a4 == 8 && a5 == 8 && a6 == 8 && a2 == 0 && a3 == 0 && (a7 & 4096) != 0) {
                    eGLConfig = eGLConfig2;
                    break;
                }
                i++;
            }
        } else {
            eGLConfig = eGLConfigArr[0];
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }

    public static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }
}
