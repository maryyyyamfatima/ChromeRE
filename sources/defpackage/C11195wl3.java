package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11195wl3 extends HF {
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ ViewOnLayoutChangeListenerC0059Al3 h;

    public C11195wl3(ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3, RunnableC2342Sa2 runnableC2342Sa2) {
        this.h = viewOnLayoutChangeListenerC0059Al3;
        this.g = runnableC2342Sa2;
    }

    @Override // defpackage.HF
    public final void b() {
        this.g.run();
        this.h.r = null;
    }
}
