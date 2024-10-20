package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QJ2 extends TZ {
    public SJ2 i;
    public C7849n00 j;
    public final String[] k = {"section"};
    public final BitSet l = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (SJ2) wz;
    }

    public final void w(float f) {
        this.i.D = this.a.a(f);
    }

    public final void y(boolean z) {
        this.i.E = z;
    }

    @Override // defpackage.TZ
    public final void g(boolean z) {
        this.i.F = z;
    }

    public final void z() {
        this.i.F = false;
    }

    public final void A() {
        this.i.G = false;
    }

    public final void B() {
        this.i.H = true;
    }

    public final void C(YJ2 yj2) {
        this.i.K = yj2;
    }

    public final void D(boolean z) {
        this.i.L = z;
    }

    public final void E(I52 i52) {
        this.i.M = i52;
    }

    public final void F(CK2 ck2) {
        this.i.N = ck2;
    }

    public final void G(float f) {
        this.i.O = this.a.a(f);
    }

    public final void H(boolean z) {
        this.i.Q = z;
    }

    public final void I(C4237cW c4237cW) {
        SJ2 sj2 = this.i;
        if (sj2.R == Collections.EMPTY_LIST) {
            sj2.R = new ArrayList();
        }
        this.i.R.add(c4237cW);
    }

    public final void J(int i) {
        this.i.S = i;
    }

    public final void K(InterfaceC3493aK2 interfaceC3493aK2) {
        this.i.T = interfaceC3493aK2;
    }

    public final void L(float f) {
        this.i.W = this.a.a(f);
    }

    public final void M(Y03 y03) {
        this.i.X = y03;
        this.l.set(0);
    }

    public final void N(float f) {
        this.i.Y = this.a.a(f);
    }

    @Override // defpackage.TZ
    /* renamed from: x */
    public final SJ2 d() {
        TZ.e(1, this.l, this.k);
        String Z = this.i.Z();
        this.i.getClass();
        PD0 pd0 = this.i.Z;
        if (pd0 == null) {
            pd0 = AbstractC10593v00.v(this.j, Z, -1505688212);
        }
        SJ2 sj2 = this.i;
        sj2.Z = pd0;
        PD0 pd02 = sj2.a0;
        if (pd02 == null) {
            pd02 = AbstractC10593v00.v(this.j, Z, -238194236);
        }
        SJ2 sj22 = this.i;
        sj22.a0 = pd02;
        return sj22;
    }
}
