package defpackage;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RG3 extends TZ {
    public TG3 i;
    public final String[] j = {"text"};
    public final BitSet k = new BitSet(1);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (TG3) wz;
    }

    public final void w() {
        this.i.D = true;
    }

    public final void x(UG3 ug3) {
        this.i.E = ug3;
    }

    public final void y(int i) {
        this.i.F = i;
    }

    public final void z(boolean z) {
        this.i.G = z;
    }

    public final void A(CharSequence charSequence) {
        this.i.H = charSequence;
    }

    public final void B(TextUtils.TruncateAt truncateAt) {
        this.i.I = truncateAt;
    }

    public final void C(boolean z) {
        this.i.f11471J = z;
    }

    public final void D(float f) {
        this.i.K = FH0.a(f * this.a.a.getDisplayMetrics().scaledDensity);
    }

    public final void E(int i) {
        this.i.L = i;
    }

    public final void F(int i) {
        TG3 tg3 = this.i;
        C10730vP2 c10730vP2 = this.a;
        c10730vP2.getClass();
        TypedArray obtainStyledAttributes = c10730vP2.b.obtainStyledAttributes(new int[]{i});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            tg3.S = color;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void G(int i) {
        this.i.U = i;
    }

    public final void H(int i) {
        this.i.Z = i;
    }

    public final void I(float f) {
        this.i.a0 = this.a.a(f);
    }

    public final void J(float f) {
        this.i.b0 = this.a.a(f);
    }

    public final void K(float f) {
        this.i.c0 = this.a.a(f);
    }

    public final void L(boolean z) {
        this.i.d0 = z;
    }

    public final void M(CharSequence charSequence) {
        this.i.f0 = charSequence;
        this.k.set(0);
    }

    public final void N(C2200Qy0 c2200Qy0) {
        this.i.h0 = c2200Qy0;
    }

    public final void O(int i) {
        this.i.i0 = i;
    }

    public final void P() {
        this.i.k0 = true;
    }

    public final void Q(Typeface typeface) {
        this.i.l0 = typeface;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(1, this.k, this.j);
        return this.i;
    }
}
