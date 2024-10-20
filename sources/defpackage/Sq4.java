package defpackage;

import java.util.BitSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Sq4 extends TZ {
    public static final String[] k = {"delegate"};
    public final BitSet i = new BitSet(1);
    public Tq4 j;

    @Override // defpackage.TZ
    public final TZ k() {
        return this;
    }

    public final void x(WZ wz) {
        this.i.set(0);
        this.j.D = wz;
    }

    @Override // defpackage.TZ
    public final void r(WZ wz) {
        this.j = (Tq4) wz;
    }

    @Override // defpackage.TZ
    /* renamed from: w */
    public final Tq4 d() {
        TZ.e(1, this.i, k);
        return this.j;
    }
}
