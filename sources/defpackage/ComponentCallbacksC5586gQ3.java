package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gQ3 */
/* loaded from: classes2.dex */
public final class ComponentCallbacksC5586gQ3 implements ComponentCallbacks {
    public final /* synthetic */ C9707sQ3 a;

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public ComponentCallbacksC5586gQ3(C9707sQ3 c9707sQ3) {
        this.a = c9707sQ3;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        C9707sQ3 c9707sQ3 = this.a;
        if (i == c9707sQ3.y0) {
            return;
        }
        c9707sQ3.y0 = i;
        C8565p5 c8565p5 = c9707sQ3.O;
        if (c8565p5 != null && c8565p5.b && c8565p5.a == null) {
            c8565p5.c();
        }
    }
}
