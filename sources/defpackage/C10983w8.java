package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w8 */
/* loaded from: classes.dex */
public final class C10983w8 extends AbstractC4472dA0 {
    public final /* synthetic */ C11669y8 a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        C11669y8 c11669y8 = this.a;
        c11669y8.g.onResult(Integer.valueOf(i));
        ((m) c11669y8.a).o(c11669y8.j);
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i != 0) {
            return;
        }
        C11669y8 c11669y8 = this.a;
        c11669y8.g.onResult(0);
        ((m) c11669y8.a).o(c11669y8.j);
    }

    public C10983w8(C11669y8 c11669y8) {
        this.a = c11669y8;
    }
}
