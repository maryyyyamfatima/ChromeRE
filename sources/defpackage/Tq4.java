package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Tq4 extends WZ {

    @InterfaceC6894kD2
    WZ D;

    @Override // defpackage.WZ
    public final boolean U() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        return this;
    }

    public Tq4() {
        super("Wrapper");
    }

    public static Sq4 p0(C7849n00 c7849n00) {
        Sq4 sq4 = new Sq4();
        Tq4 tq4 = new Tq4();
        sq4.m(c7849n00, 0, 0, tq4);
        sq4.j = tq4;
        return sq4;
    }

    @Override // defpackage.AbstractC10593v00
    public final InterfaceC3331Zq1 P(C7849n00 c7849n00) {
        WZ wz = this.D;
        if (wz == null) {
            return C7849n00.p;
        }
        return AbstractC3106Xx1.b(c7849n00, wz, false, false);
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || Tq4.class != wz.getClass()) {
            return false;
        }
        Tq4 tq4 = (Tq4) wz;
        if (this.l == tq4.l) {
            return true;
        }
        WZ wz2 = this.D;
        WZ wz3 = tq4.D;
        return wz2 == null ? wz3 == null : wz2.a(wz3);
    }

    @Override // defpackage.WZ
    public final WZ d0() {
        return this.D;
    }
}
