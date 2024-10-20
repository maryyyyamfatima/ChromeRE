package defpackage;

import org.chromium.chrome.browser.vr.AndroidUiGestureTarget;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Va, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC2729Va implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ AndroidUiGestureTarget k;

    public RunnableC2729Va(AndroidUiGestureTarget androidUiGestureTarget, long j, int i, int i2, int i3, int i4) {
        this.k = androidUiGestureTarget;
        this.a = j;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.a + this.g;
        AndroidUiGestureTarget androidUiGestureTarget = this.k;
        if (androidUiGestureTarget.a > j) {
            return;
        }
        androidUiGestureTarget.getClass();
        throw null;
    }
}
