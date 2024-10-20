package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z41 implements InterfaceC4058by1 {
    public final GridLayoutManager a;
    public InterfaceC3366Zx1 b;

    public Z41(int i, int i2, boolean z, boolean z2) {
        GridLayoutManager x41;
        if (z2) {
            x41 = new GridLayoutManager(i, i2, z);
        } else {
            x41 = new X41(i, i2, z);
        }
        this.a = x41;
        x41.K = new V41(this);
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
    public final void o(InterfaceC3366Zx1 interfaceC3366Zx1) {
        this.b = interfaceC3366Zx1;
    }

    @Override // defpackage.InterfaceC4058by1
    public final void r(int i, int i2) {
        this.a.i1(i, i2);
    }

    @Override // defpackage.InterfaceC4058by1
    public final InterfaceC3715ay1 i(int i, int i2) {
        GridLayoutManager gridLayoutManager = this.a;
        return new Y41(i, i2, gridLayoutManager.p, gridLayoutManager.F);
    }

    @Override // defpackage.InterfaceC4058by1
    public final int d(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.p != 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) interfaceC7976nN2.l("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (interfaceC7976nN2.q()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        int i2 = gridLayoutManager.F;
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) / i2) * interfaceC7976nN2.e(), 1073741824);
    }

    @Override // defpackage.InterfaceC4058by1
    public final int k(int i, InterfaceC7976nN2 interfaceC7976nN2) {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.p == 0) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        Integer num = (Integer) interfaceC7976nN2.l("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (interfaceC7976nN2.q()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        int i2 = gridLayoutManager.F;
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) / i2) * interfaceC7976nN2.e(), 1073741824);
    }

    @Override // defpackage.InterfaceC4058by1
    public final int p() {
        return this.a.p;
    }

    @Override // defpackage.InterfaceC4058by1
    public final int n(int i, int i2, int i3, int i4) {
        double ceil;
        GridLayoutManager gridLayoutManager = this.a;
        int i5 = gridLayoutManager.F;
        if (gridLayoutManager.p == 0) {
            ceil = Math.ceil(i3 / i);
        } else {
            ceil = Math.ceil(i4 / i2);
        }
        return ((int) ceil) * i5;
    }
}
