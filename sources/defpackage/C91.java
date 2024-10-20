package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C91 extends TZ {
    public F91 i;
    public final String[] j = {"contentProps"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (F91) wz;
    }

    public final void w(T40 t40) {
        this.i.D = t40.d();
        this.k.set(0);
    }

    public final void x() {
        this.i.E = true;
    }

    public final void y(int i) {
        this.i.F = i;
    }

    public final void z(AY2 ay2) {
        this.i.G = ay2;
    }

    public final void A(int i) {
        this.i.H = i;
    }

    public final void B(BY2 by2) {
        this.i.I = by2;
    }

    public final void C(boolean z) {
        this.i.f11441J = z;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
