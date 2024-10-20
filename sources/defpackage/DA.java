package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DA extends AbstractC4472dA0 {
    public final /* synthetic */ GA a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void b(PB pb) {
        GA ga = this.a;
        if (pb != ga.f) {
            C0056Al0 c0056Al0 = ga.c;
            c0056Al0.getClass();
            c0056Al0.a = true;
            ((m) ga.e).o(ga.d);
            if (ga.k) {
                FI2.a("MobileBookmark.SaveFlow.ClosedWithoutEditAction");
            }
            LA la = ga.g;
            la.j.o(la);
            la.j = null;
            la.i = null;
            la.k = null;
            C4496dF c4496dF = la.h;
            if (c4496dF != null) {
                c4496dF.a();
                la.h = null;
            }
            ga.g = null;
            ga.h = null;
            ga.i.c();
            ga.i = null;
            ga.b.b();
        }
    }

    public DA(GA ga) {
        this.a = ga;
    }
}
