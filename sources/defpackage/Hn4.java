package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Hn4 extends AbstractC1501Lo0 {
    public final PC i;

    @Override // defpackage.AbstractC1501Lo0
    public final boolean a() {
        return false;
    }

    public Hn4(PC pc, Dn4 dn4, C6314iY3 c6314iY3, final I5 i5, C9766sc0 c9766sc0) {
        super(c6314iY3, i5, c9766sc0, pc.g());
        this.i = pc;
        dn4.d.add(new Cn4() { // from class: Gn4
            @Override // defpackage.Cn4
            public final void a(C12237zn4 c12237zn4, boolean z) {
                Hn4 hn4 = Hn4.this;
                hn4.getClass();
                if (i5.a() || !z || c12237zn4 == null) {
                    return;
                }
                c12237zn4.b.edit().putBoolean("show_disclosure", true).apply();
                C9423rc0 c9423rc0 = hn4.g.i;
                if ((c9423rc0 == null || c9423rc0.b == 2) ? false : true) {
                    hn4.j();
                }
            }
        });
    }

    @Override // defpackage.AbstractC1501Lo0
    public final void b() {
        Wn4.a.c(this.i.F().a).b.edit().putBoolean("show_disclosure", false).apply();
        this.a.m(C6314iY3.c, 2);
    }

    @Override // defpackage.AbstractC1501Lo0
    public final boolean h() {
        C12237zn4 c;
        PC pc = this.i;
        if (pc.g() == null || pc.g().startsWith("org.chromium.webapk") || (c = Wn4.a.c(pc.F().a)) == null) {
            return false;
        }
        return c.b.getBoolean("show_disclosure", false);
    }
}
