package defpackage;

import J.N;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aj4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC3629aj4 implements Runnable {
    public final /* synthetic */ int[] a;
    public final /* synthetic */ C3973bj4 g;

    public RunnableC3629aj4(C3973bj4 c3973bj4, int[] iArr) {
        this.g = c3973bj4;
        this.a = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VrShellDelegate.h();
        VrShell vrShell = this.g.a.a;
        long j = vrShell.A;
        if (j != 0) {
            N.MfjYy43V(j, vrShell, this.a[0] == 0);
        }
    }
}
