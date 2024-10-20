package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L84 extends TZ {
    public O84 i;
    public final String[] j = {"childComponent"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (O84) wz;
    }

    public final void w(T40 t40) {
        this.i.D = t40.d();
        this.k.set(0);
    }

    public final void x() {
        this.i.E = true;
    }

    public final void y() {
        this.i.F = true;
    }

    public final void z(boolean z) {
        this.i.G = z;
    }

    public final void A(int i) {
        this.i.H = i;
    }

    public final void B(boolean z) {
        this.i.I = z;
    }

    public final void C(C11804yY2 c11804yY2) {
        this.i.f11460J = c11804yY2;
    }

    public final void D(int i) {
        this.i.K = i;
    }

    public final void E(C12147zY2 c12147zY2) {
        this.i.L = c12147zY2;
    }

    public final void F(boolean z) {
        this.i.M = z;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
