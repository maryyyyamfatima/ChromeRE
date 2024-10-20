package org.chromium.chrome.browser.vr;

import android.os.Handler;
import defpackage.RunnableC2729Va;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class AndroidUiGestureTarget {
    public long a;

    public final long getNativeObject() {
        return 0L;
    }

    public final void inject(int i, long j) {
        throw null;
    }

    public final void setPointer(int i, int i2) {
        throw null;
    }

    public final void setDelayedEvent(int i, int i2, int i3, long j, int i4) {
        new Handler().postDelayed(new RunnableC2729Va(this, j, i4, i, i2, i3), i4);
    }
}
