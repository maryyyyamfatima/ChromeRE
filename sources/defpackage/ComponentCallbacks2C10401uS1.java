package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C10401uS1 implements ComponentCallbacks2 {
    public final String a;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void a(int i) {
        EI2.h(i, 9, this.a);
    }

    public ComponentCallbacks2C10401uS1(String str) {
        this.a = "Android.MemoryPressureNotification.".concat(str);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a(8);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 5) {
            a(7);
            return;
        }
        if (i == 10) {
            a(6);
            return;
        }
        if (i == 15) {
            a(5);
            return;
        }
        if (i == 20) {
            a(4);
            return;
        }
        if (i == 40) {
            a(3);
            return;
        }
        if (i == 60) {
            a(2);
        } else if (i == 80) {
            a(1);
        } else {
            a(0);
        }
    }
}
