package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PB1 implements InterfaceC4058by1 {
    public final NB1 a;

    @Override // defpackage.InterfaceC4058by1
    public final void o(InterfaceC3366Zx1 interfaceC3366Zx1) {
    }

    public PB1(int i, boolean z) {
        NB1 nb1 = new NB1(i, z);
        this.a = nb1;
        nb1.h = false;
    }

    @Override // defpackage.InterfaceC4058by1
    public final int p() {
        return this.a.p;
    }

    @Override // defpackage.InterfaceC3605af4
    public final int g() {
        return this.a.R0();
    }

    @Override // defpackage.InterfaceC3605af4
    public final int s() {
        return this.a.T0();
    }

    @Override // defpackage.InterfaceC3605af4
    public final int l() {
        return this.a.O0();
    }

    @Override // defpackage.InterfaceC3605af4
    public final int m() {
        return this.a.S0();
    }

    @Override // defpackage.InterfaceC3605af4
    public final int a() {
        return this.a.C();
    }

    @Override // defpackage.InterfaceC4058by1
    public final AbstractC12077zK2 q() {
        return this.a;
    }

    @Override // defpackage.InterfaceC4058by1
    public final void r(int i, int i2) {
        this.a.i1(i, i2);
    }

    @Override // defpackage.InterfaceC4058by1
    public final int n(int i, int i2, int i3, int i4) {
        double ceil;
        if (this.a.p == 0) {
            ceil = Math.ceil(i3 / i);
        } else {
            ceil = Math.ceil(i4 / i2);
        }
        int i5 = (int) ceil;
        int i6 = 2;
        if (i5 >= 2) {
            i6 = 10;
            if (i5 <= 10) {
                return i5;
            }
        }
        return i6;
    }

    @Override // defpackage.InterfaceC4058by1
    public final int d(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        return this.a.p != 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    @Override // defpackage.InterfaceC4058by1
    public final int k(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        return this.a.p != 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.InterfaceC4058by1
    public final InterfaceC3715ay1 i(int i, int i2) {
        return new OB1(i, i2, this.a.p);
    }
}
