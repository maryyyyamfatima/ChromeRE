package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: du2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacksC4723du2 implements ComponentCallbacks {
    public final /* synthetic */ C5067eu2 a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.f();
    }

    public ComponentCallbacksC4723du2(C5067eu2 c5067eu2) {
        this.a = c5067eu2;
    }
}
