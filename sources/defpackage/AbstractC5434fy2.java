package defpackage;

import android.os.Looper;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fy2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5434fy2 {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            Log.wtf("LensSdk", AbstractC5195fH1.b("Not running on main thread", new Object[0]), new RuntimeException());
        }
    }
}
