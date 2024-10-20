package org.chromium.components.webxr;

import android.app.Activity;
import android.content.Context;
import defpackage.C0695Fj;
import defpackage.C1215Jj;
import defpackage.C8385oa2;
import defpackage.SurfaceHolderCallback2C1475Lj;
import defpackage.V60;
import java.util.HashMap;
import org.chromium.base.BundleUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ArCoreJavaUtils {
    public static ArCoreJavaUtils c;
    public static final C8385oa2 d = new C8385oa2();
    public long a;
    public SurfaceHolderCallback2C1475Lj b;

    public static ArCoreJavaUtils create(long j) {
        Object obj = ThreadUtils.a;
        return new ArCoreJavaUtils(j);
    }

    public static Context getApplicationContext() {
        return V60.a;
    }

    public ArCoreJavaUtils(long j) {
        this.a = j;
    }

    public final void startSession(ArCompositorDelegateProvider arCompositorDelegateProvider, WebContents webContents, boolean z, boolean z2) {
        WindowAndroid Q0;
        this.b = new SurfaceHolderCallback2C1475Lj();
        c = this;
        d.p(Boolean.TRUE);
        SurfaceHolderCallback2C1475Lj surfaceHolderCallback2C1475Lj = this.b;
        C0695Fj a = arCompositorDelegateProvider.a(webContents);
        surfaceHolderCallback2C1475Lj.a = this;
        surfaceHolderCallback2C1475Lj.m = webContents;
        surfaceHolderCallback2C1475Lj.g = a;
        surfaceHolderCallback2C1475Lj.h = (webContents == null || (Q0 = webContents.Q0()) == null) ? null : (Activity) Q0.k().get();
        surfaceHolderCallback2C1475Lj.o = new HashMap();
        surfaceHolderCallback2C1475Lj.p = null;
        surfaceHolderCallback2C1475Lj.n = z;
        surfaceHolderCallback2C1475Lj.l = new C1215Jj(surfaceHolderCallback2C1475Lj, z2);
    }

    public final void endSession() {
        SurfaceHolderCallback2C1475Lj surfaceHolderCallback2C1475Lj = this.b;
        if (surfaceHolderCallback2C1475Lj == null) {
            return;
        }
        surfaceHolderCallback2C1475Lj.c();
        this.b = null;
        c = null;
        d.p(Boolean.FALSE);
    }

    public final void onNativeDestroy() {
        this.a = 0L;
    }

    public static String getArCoreShimLibraryPath() {
        return BundleUtils.getNativeLibraryPath("arcore_sdk_c", "");
    }
}
