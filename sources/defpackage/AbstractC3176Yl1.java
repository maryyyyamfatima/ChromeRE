package defpackage;

import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3176Yl1 {
    public static InterfaceC3046Xl1 a = new InterfaceC3046Xl1() { // from class: Wl1
        @Override // defpackage.InterfaceC3046Xl1
        public final void a() {
            System.loadLibrary("sketchology_native");
        }
    };
    public static volatile boolean b = false;

    public static void a() {
        if ("robolectric".equals(Build.FINGERPRINT) || System.getProperty("ROBOLECTRIC") != null) {
            AbstractC4508dH1.c("not attempting to load ink native code in robolectric environment");
            return;
        }
        if (b) {
            return;
        }
        synchronized (AbstractC3176Yl1.class) {
            if (b) {
                return;
            }
            AbstractC4508dH1.c("loading native code");
            try {
                a.a();
            } finally {
                b = true;
            }
        }
    }
}
