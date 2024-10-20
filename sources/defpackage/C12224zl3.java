package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12224zl3 extends HF {
    public final /* synthetic */ ViewOnLayoutChangeListenerC0059Al3 g;

    @Override // defpackage.HF
    public final void b() {
        ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3 = this.g;
        if (((Boolean) viewOnLayoutChangeListenerC0059Al3.m.get()).booleanValue()) {
            viewOnLayoutChangeListenerC0059Al3.n.onResult(new Runnable() { // from class: yl3
                @Override // java.lang.Runnable
                public final void run() {
                    C12224zl3.this.g.c(true);
                }
            });
        } else {
            viewOnLayoutChangeListenerC0059Al3.c(true);
        }
        viewOnLayoutChangeListenerC0059Al3.s = null;
    }

    public C12224zl3(ViewOnLayoutChangeListenerC0059Al3 viewOnLayoutChangeListenerC0059Al3) {
        this.g = viewOnLayoutChangeListenerC0059Al3;
    }
}
