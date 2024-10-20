package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XE2 implements Runnable {
    public final /* synthetic */ C4499dF2 a;

    @Override // java.lang.Runnable
    public final void run() {
        C4499dF2 c4499dF2 = this.a;
        c4499dF2.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = c4499dF2.n;
        long j2 = c4499dF2.k.c;
        if ((j - j2) / 2500 != (uptimeMillis - j2) / 2500 && !c4499dF2.o.a()) {
            c4499dF2.stop();
        } else {
            C4155cF2 c4155cF2 = c4499dF2.k;
            c4155cF2.d = c4155cF2.e.getInterpolation(((float) ((uptimeMillis - c4155cF2.c) % 2500)) / 2500.0f);
            C4155cF2 c4155cF22 = c4499dF2.k;
            c4155cF22.f.a(c4499dF2, c4155cF22.d);
            c4499dF2.n = uptimeMillis;
        }
        if (c4499dF2.m) {
            c4499dF2.scheduleSelf(c4499dF2.a, SystemClock.uptimeMillis() + 16);
        }
    }

    public XE2(C4499dF2 c4499dF2) {
        this.a = c4499dF2;
    }
}
