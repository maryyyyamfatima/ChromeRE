package org.chromium.chrome.browser;

import J.N;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NearOomMonitor implements ComponentCallbacks2 {
    public final long a;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public static NearOomMonitor create(long j) {
        return new NearOomMonitor(j);
    }

    public NearOomMonitor(long j) {
        this.a = j;
        V60.a.registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        N.MvDhdpTR(this.a, this);
    }
}
