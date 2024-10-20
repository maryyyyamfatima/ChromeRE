package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UA0 extends SM0 {
    @Override // defpackage.SM0, defpackage.InterfaceC7805ms2
    public final void f(int i, String str, C4025bs2 c4025bs2) {
        g(i, str, c4025bs2, SM0.d);
    }

    @Override // defpackage.SM0, defpackage.InterfaceC7805ms2
    public final void g(int i, String str, C4025bs2 c4025bs2, Callback callback) {
        h(new TA0(this, i, str, c4025bs2, callback));
    }

    @Override // defpackage.SM0, defpackage.InterfaceC7805ms2
    public final void b(int i, String str, C2687Ur2 c2687Ur2) {
        h(new SA0(this, i, str, c2687Ur2));
    }

    @Override // defpackage.SM0, defpackage.InterfaceC7805ms2
    public final void d(int i, String str, C3809bF c3809bF) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        h(new RA0(this, i, str, c3809bF));
    }

    @Override // defpackage.SM0, defpackage.InterfaceC7805ms2
    public final InterfaceC7461ls2 c(int i, String str) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        SM0.i(i, str);
        return C1436Lb0.a(new SA0(this, i, str, null).c());
    }
}
