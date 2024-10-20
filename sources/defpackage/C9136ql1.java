package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ql1 */
/* loaded from: classes.dex */
public final class C9136ql1 extends AbstractC4472dA0 {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC9478rl1 a;

    public C9136ql1(ViewOnAttachStateChangeListenerC9478rl1 viewOnAttachStateChangeListenerC9478rl1) {
        this.a = viewOnAttachStateChangeListenerC9478rl1;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        ViewOnAttachStateChangeListenerC9478rl1 viewOnAttachStateChangeListenerC9478rl1 = this.a;
        if (viewOnAttachStateChangeListenerC9478rl1.a.l.isHidden()) {
            return;
        }
        viewOnAttachStateChangeListenerC9478rl1.a.q.setVisibility(i == 3 ? 4 : 0);
    }
}
