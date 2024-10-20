package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10166tl3 extends HF {
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ ViewOnLayoutChangeListenerC0059Al3 h;

    public C10166tl3(ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3, RunnableC8108nl3 runnableC8108nl3) {
        this.h = viewOnLayoutChangeListenerC0059Al3;
        this.g = runnableC8108nl3;
    }

    @Override // defpackage.HF
    public final void b() {
        this.g.run();
        this.h.p = null;
    }
}
