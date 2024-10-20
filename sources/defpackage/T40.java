package defpackage;

import android.graphics.drawable.Drawable;
import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T40 extends TZ {
    public U40 i;
    public final String[] j = {"children", "flexDirection"};
    public final BitSet k = new BitSet(2);

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.i = (U40) wz;
    }

    public final void w(EnumC8151ns4 enumC8151ns4) {
        this.i.D = enumC8151ns4;
    }

    public final void x(EnumC8151ns4 enumC8151ns4) {
        this.i.E = enumC8151ns4;
    }

    public final void y(Drawable drawable) {
        this.i.G = drawable;
    }

    public final void z(EnumC10552us4 enumC10552us4) {
        this.i.f11472J = enumC10552us4;
    }

    public final void A(float f) {
        this.i.L = f;
    }

    public final void B(float f) {
        this.i.M = Float.valueOf(this.a.a(f));
    }

    public final void C(float f) {
        this.i.N = Float.valueOf(this.a.a(f));
    }

    public final void D(float f) {
        this.i.O = this.a.a(f);
    }

    public final void E(Integer num) {
        this.i.P = num;
    }

    public final void F(Bs4 bs4) {
        this.i.Q = bs4;
    }

    @Override // defpackage.TZ
    public final WZ d() {
        TZ.e(2, this.k, this.j);
        return this.i;
    }
}
