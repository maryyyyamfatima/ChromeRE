package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PQ0 extends AbstractC10591v {
    public final DV0 c;

    public PQ0(BQ0 bq0, DV0 dv0) {
        super(bq0);
        this.c = dv0;
    }

    @Override // defpackage.BQ0
    public final void c(InterfaceC0334Co3 interfaceC0334Co3) {
        boolean z = interfaceC0334Co3 instanceof AbstractC3359Zw;
        DV0 dv0 = this.c;
        BQ0 bq0 = this.b;
        if (z) {
            bq0.a(new NQ0((AbstractC3359Zw) interfaceC0334Co3, dv0));
        } else {
            bq0.a(new OQ0(interfaceC0334Co3, dv0));
        }
    }
}
