package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OO implements InterfaceC3751b42 {
    public InterfaceC1422Ky1 a;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    public OO(C0538Ed2 c0538Ed2) {
        c0538Ed2.j(new Callback() { // from class: NO
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                OO.this.a = (InterfaceC1422Ky1) obj;
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        });
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        InterfaceC1422Ky1 interfaceC1422Ky1 = this.a;
        if (interfaceC1422Ky1 != null && ((C9897sy1) interfaceC1422Ky1).G(2)) {
            return 1;
        }
        return 0;
    }
}
