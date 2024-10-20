package defpackage;

import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4869eL implements InterfaceC11490xd3 {
    public final Choreographer a;

    public C4869eL(Choreographer choreographer) {
        this.a = choreographer;
    }

    @Override // defpackage.InterfaceC11490xd3
    public final boolean c() {
        try {
            return this.a == Choreographer.getInstance();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // defpackage.MF3
    public final void b(Runnable runnable) {
        this.a.postFrameCallback(new ChoreographerFrameCallbackC4182cL(runnable));
    }

    @Override // defpackage.MF3
    public final void a(Runnable runnable, long j) {
        this.a.postFrameCallbackDelayed(new ChoreographerFrameCallbackC4526dL(runnable), j);
    }
}
