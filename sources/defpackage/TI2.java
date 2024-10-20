package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TI2 extends TZ {
    public VI2 i;
    public final String[] j = {"binder"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (VI2) wz;
    }

    public final void w(InterfaceC2194Qx interfaceC2194Qx) {
        this.i.D = interfaceC2194Qx;
        this.k.set(0);
    }

    public final void x(int i) {
        this.i.E = i;
    }

    @Override // defpackage.TZ
    public final void g(boolean z) {
        this.i.F = z;
    }

    public final void y(boolean z) {
        this.i.F = z;
    }

    public final void z(boolean z) {
        this.i.G = z;
    }

    @Override // defpackage.TZ
    public final void h(String str) {
        super.h(str);
        this.i.H = str;
    }

    public final void A(float f) {
        this.i.I = this.a.a(f);
    }

    public final void B() {
        this.i.K = false;
    }

    public final void C(AbstractC2348Sb3 abstractC2348Sb3) {
        this.i.L = abstractC2348Sb3;
    }

    public final void D() {
        this.i.M = null;
    }

    public final void E(int i) {
        this.i.N = i;
    }

    public final void F(boolean z) {
        this.i.O = z;
    }

    public final void G(CK2 ck2) {
        this.i.P = ck2;
    }

    public final void H(WJ2 wj2) {
        VI2 vi2 = this.i;
        if (vi2.Q == Collections.EMPTY_LIST) {
            vi2.Q = new ArrayList();
        }
        this.i.Q.add(wj2);
    }

    public final void I(List list) {
        if (list == null) {
            return;
        }
        if (this.i.Q.isEmpty()) {
            this.i.Q = list;
        } else {
            this.i.Q.addAll(list);
        }
    }

    public final void J(int i) {
        this.i.R = i;
    }

    public final void K(boolean z) {
        this.i.S = z;
    }

    public final void L(YJ2 yj2) {
        this.i.T = yj2;
    }

    public final void M(int i) {
        this.i.U = i;
    }

    public final void N(C6206iD0 c6206iD0) {
        this.i.V = c6206iD0;
    }

    public final void O() {
        this.i.W = null;
    }

    public final void P(int i) {
        this.i.X = i;
    }

    public final void Q(int i) {
        this.i.Y = i;
    }

    public final void R() {
        this.i.Z = 0;
    }

    public final void S(AbstractC2368Sf3 abstractC2368Sf3) {
        this.i.a0 = abstractC2368Sf3;
    }

    public final void T(int i) {
        this.i.b0 = i;
    }

    public final void U() {
        this.i.c0 = false;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
