package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacksC2968Wv3 implements ComponentCallbacks {
    public final /* synthetic */ C3228Yv3 a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C3228Yv3 c3228Yv3 = this.a;
        T8 t8 = c3228Yv3.d;
        if (t8 == null || !t8.c()) {
            return;
        }
        c3228Yv3.d.b();
    }

    public ComponentCallbacksC2968Wv3(C3228Yv3 c3228Yv3) {
        this.a = c3228Yv3;
    }
}
