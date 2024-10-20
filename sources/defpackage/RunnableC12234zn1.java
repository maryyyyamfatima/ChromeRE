package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12234zn1 implements Runnable {
    public long a;
    public final /* synthetic */ C0197Bn1 g;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0197Bn1 c0197Bn1 = this.g;
        String str = c0197Bn1.c;
        c0197Bn1.getClass();
        try {
            V60.a.getPackageManager().getPackageInfo(str, 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        boolean z2 = SystemClock.elapsedRealtime() - this.a > c0197Bn1.e;
        if (!z && c0197Bn1.g && !z2) {
            c0197Bn1.b.postDelayed(this, c0197Bn1.d);
            return;
        }
        c0197Bn1.g = false;
        C2791Vm1 c2791Vm1 = ((C2531Tm1) c0197Bn1.f).a;
        C0197Bn1 c0197Bn12 = c2791Vm1.d;
        RunnableC12234zn1 runnableC12234zn1 = c0197Bn12.a;
        if (runnableC12234zn1 != null) {
            runnableC12234zn1.g.g = false;
            c0197Bn12.a = null;
        }
        c2791Vm1.d = null;
        c2791Vm1.a(z ? 6 : -21, 0);
    }

    public RunnableC12234zn1(C0197Bn1 c0197Bn1) {
        this.g = c0197Bn1;
    }
}
