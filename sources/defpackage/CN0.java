package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CN0 implements InterfaceC11609xx3 {
    public final /* synthetic */ DN0 a;

    @Override // defpackage.InterfaceC11266wx3
    public final void b(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void g(C0249Bx3 c0249Bx3) {
    }

    @Override // defpackage.InterfaceC11266wx3
    public final void k(C0249Bx3 c0249Bx3) {
        Callback callback = this.a.d;
        if (callback == null) {
            return;
        }
        callback.onResult(Integer.valueOf(c0249Bx3.e == 0 ? 0 : 1));
    }

    public CN0(DN0 dn0) {
        this.a = dn0;
    }
}
