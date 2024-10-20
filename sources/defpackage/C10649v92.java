package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: v92 */
/* loaded from: classes.dex */
public final class C10649v92 extends AbstractC6816k0 {
    public final DV0 g;
    public final boolean h;
    public final int i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10649v92(X82 x82, int i, int i2) {
        super(x82);
        PV0 pv0 = TV0.a;
        this.g = pv0;
        this.h = false;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        DV0 dv0 = this.g;
        InterfaceC7353la2 interfaceC7353la2 = this.a;
        if (AbstractC7009ka2.a(interfaceC7353la2, interfaceC11128wa2, dv0)) {
            return;
        }
        interfaceC7353la2.a(new C10306u92(this.i, this.j, interfaceC11128wa2, this.g, this.h));
    }
}
