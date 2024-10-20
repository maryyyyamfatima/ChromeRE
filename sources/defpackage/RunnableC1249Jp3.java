package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1249Jp3 implements Runnable {
    public final /* synthetic */ LifecycleCallback a;
    public final /* synthetic */ String g;
    public final /* synthetic */ C1379Kp3 h;

    public RunnableC1249Jp3(C1379Kp3 c1379Kp3, LifecycleCallback lifecycleCallback, String str) {
        this.h = c1379Kp3;
        this.a = lifecycleCallback;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1379Kp3 c1379Kp3 = this.h;
        int i = c1379Kp3.c0;
        LifecycleCallback lifecycleCallback = this.a;
        if (i >= 1) {
            Bundle bundle = c1379Kp3.d0;
            lifecycleCallback.e(bundle != null ? bundle.getBundle(this.g) : null);
        }
        if (c1379Kp3.c0 >= 2) {
            lifecycleCallback.h();
        }
        if (c1379Kp3.c0 >= 3) {
            lifecycleCallback.f();
        }
        if (c1379Kp3.c0 >= 4) {
            lifecycleCallback.i();
        }
        if (c1379Kp3.c0 >= 5) {
            lifecycleCallback.getClass();
        }
    }
}
