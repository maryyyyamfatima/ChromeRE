package defpackage;

import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ld0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7369ld0 implements Runnable {
    public final /* synthetic */ C8057nd0 a;

    @Override // java.lang.Runnable
    public final void run() {
        C8057nd0 c8057nd0 = this.a;
        ((ViewGroup) c8057nd0.n.getParent()).removeView(c8057nd0.n);
        c8057nd0.n = null;
    }

    public RunnableC7369ld0(C8057nd0 c8057nd0) {
        this.a = c8057nd0;
    }
}
