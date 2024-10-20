package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vT3 */
/* loaded from: classes2.dex */
public final class C10751vT3 extends AbstractC4472dA0 {
    public final /* synthetic */ C11780yT3 a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        C11780yT3 c11780yT3 = this.a;
        c11780yT3.i.onResult(Integer.valueOf(i));
        ((m) c11780yT3.a).o(c11780yT3.j);
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i != 0) {
            return;
        }
        C11780yT3 c11780yT3 = this.a;
        c11780yT3.i.onResult(0);
        ((m) c11780yT3.a).o(c11780yT3.j);
    }

    public C10751vT3(C11780yT3 c11780yT3) {
        this.a = c11780yT3;
    }
}
