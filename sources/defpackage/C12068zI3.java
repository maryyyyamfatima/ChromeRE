package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zI3 */
/* loaded from: classes.dex */
public final class C12068zI3 extends TZ {
    public BI3 i;
    public C7849n00 j;

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (BI3) wz;
    }

    public final void w(int i) {
        this.i.D = i;
    }

    public final void y(TextUtils.TruncateAt truncateAt) {
        this.i.G = truncateAt;
    }

    public final void z(boolean z) {
        this.i.H = z;
    }

    public final void A(int i) {
        this.i.I = i;
    }

    public final void B(Integer num) {
        this.i.f11437J = num;
    }

    public final void C(CharSequence charSequence) {
        this.i.K = charSequence;
    }

    public final void D() {
        this.i.M = 6;
    }

    public final void E(CharSequence charSequence) {
        this.i.N = charSequence;
    }

    public final void F(ColorDrawable colorDrawable) {
        this.i.O = colorDrawable;
    }

    public final void G(int i) {
        this.i.Q = i;
    }

    public final void H(int i) {
        this.i.R = i;
    }

    public final void I() {
        this.i.U = true;
    }

    public final void J(int i) {
        this.i.V = i;
    }

    public final void K() {
        this.i.X = 5;
    }

    public final void L(ColorStateList colorStateList) {
        this.i.Y = colorStateList;
    }

    public final void M(float f) {
        this.i.Z = FH0.a(f * this.a.a.getDisplayMetrics().scaledDensity);
    }

    public final void N(C8171nw0 c8171nw0) {
        BI3 bi3 = this.i;
        if (bi3.a0 == Collections.EMPTY_LIST) {
            bi3.a0 = new ArrayList();
        }
        this.i.a0.add(c8171nw0);
    }

    public final void O(Typeface typeface) {
        this.i.b0 = typeface;
    }

    @Override // defpackage.TZ
    /* renamed from: x */
    public final BI3 d() {
        String Z = this.i.Z();
        this.i.getClass();
        PD0 pd0 = this.i.e0;
        if (pd0 == null) {
            pd0 = AbstractC10593v00.v(this.j, Z, 1008096338);
        }
        BI3 bi3 = this.i;
        bi3.e0 = pd0;
        PD0 pd02 = bi3.f0;
        if (pd02 == null) {
            pd02 = AbstractC10593v00.v(this.j, Z, -50354224);
        }
        BI3 bi32 = this.i;
        bi32.f0 = pd02;
        PD0 pd03 = bi32.g0;
        if (pd03 == null) {
            pd03 = AbstractC10593v00.v(this.j, Z, -430503342);
        }
        BI3 bi33 = this.i;
        bi33.g0 = pd03;
        PD0 pd04 = bi33.h0;
        if (pd04 == null) {
            pd04 = AbstractC10593v00.v(this.j, Z, 2092727750);
        }
        BI3 bi34 = this.i;
        bi34.h0 = pd04;
        PD0 pd05 = bi34.i0;
        if (pd05 == null) {
            pd05 = AbstractC10593v00.v(this.j, Z, 663828400);
        }
        BI3 bi35 = this.i;
        bi35.i0 = pd05;
        PD0 pd06 = bi35.j0;
        if (pd06 == null) {
            pd06 = AbstractC10593v00.v(this.j, Z, -537896591);
        }
        BI3 bi36 = this.i;
        bi36.j0 = pd06;
        return bi36;
    }
}
