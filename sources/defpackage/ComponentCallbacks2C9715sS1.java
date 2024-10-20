package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C9715sS1 implements ComponentCallbacks2 {
    public final /* synthetic */ C10058tS1 a;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public ComponentCallbacks2C9715sS1(C10058tS1 c10058tS1) {
        this.a = c10058tS1;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.a(2);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Integer num;
        if (i >= 80 || i == 15) {
            num = 2;
        } else {
            num = i >= 40 ? 1 : null;
        }
        if (num != null) {
            this.a.a(num.intValue());
        }
    }
}
