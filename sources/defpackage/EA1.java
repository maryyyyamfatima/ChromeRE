package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EA1 implements Runnable {
    public final /* synthetic */ LifecycleCallback a;
    public final /* synthetic */ String g;
    public final /* synthetic */ FA1 h;

    public EA1(FA1 fa1, LifecycleCallback lifecycleCallback, String str) {
        this.h = fa1;
        this.a = lifecycleCallback;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FA1 fa1 = this.h;
        int i = fa1.g;
        LifecycleCallback lifecycleCallback = this.a;
        if (i >= 1) {
            Bundle bundle = fa1.h;
            lifecycleCallback.e(bundle != null ? bundle.getBundle(this.g) : null);
        }
        if (fa1.g >= 2) {
            lifecycleCallback.h();
        }
        if (fa1.g >= 3) {
            lifecycleCallback.f();
        }
        if (fa1.g >= 4) {
            lifecycleCallback.i();
        }
        if (fa1.g >= 5) {
            lifecycleCallback.getClass();
        }
    }
}
