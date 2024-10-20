package org.chromium.components.webxr;

import J.N;
import android.app.Activity;
import defpackage.AbstractC4851eH1;
import defpackage.X5;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ArCoreInstallUtils {
    public long a;

    public static void a() {
        try {
            X5.a(Class.forName("org.chromium.components.webxr.ArCoreShimImpl").newInstance());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static ArCoreInstallUtils create(long j) {
        return new ArCoreInstallUtils(j);
    }

    public final void onNativeDestroy() {
        this.a = 0L;
    }

    public ArCoreInstallUtils(long j) {
        this.a = j;
    }

    public static int getArCoreInstallStatus() {
        try {
            a();
            throw null;
        } catch (RuntimeException e) {
            AbstractC4851eH1.f("ArCoreInstallUtils", "ARCore availability check failed with error: %s", e.toString());
            return 6;
        }
    }

    public static boolean shouldRequestInstallSupportedArCore() {
        return getArCoreInstallStatus() != 1;
    }

    public final void requestInstallSupportedArCore(WebContents webContents) {
        WindowAndroid Q0;
        if (((webContents == null || (Q0 = webContents.Q0()) == null) ? null : (Activity) Q0.k().get()) == null) {
            AbstractC4851eH1.f("ArCoreInstallUtils", "Could not get Activity", new Object[0]);
            long j = this.a;
            if (j != 0) {
                N.Mwbowjjp(j, false);
                return;
            }
            return;
        }
        a();
        throw null;
    }
}
