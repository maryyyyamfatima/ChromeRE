package defpackage;

import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3495aL implements Runnable {
    public final /* synthetic */ C3839bL a;

    public RunnableC3495aL(C3839bL c3839bL) {
        this.a = c3839bL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3839bL c3839bL = this.a;
        c3839bL.getClass();
        c3839bL.b = Choreographer.getInstance();
    }
}
