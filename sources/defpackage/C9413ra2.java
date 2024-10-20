package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ra2 */
/* loaded from: classes.dex */
public final class C9413ra2 extends AbstractC6816k0 {
    public final DV0 g;
    public final int h;

    public C9413ra2(X82 x82, C3387a10 c3387a10, int i) {
        super(x82);
        this.g = c3387a10;
        this.h = i;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        InterfaceC7353la2 interfaceC7353la2 = this.a;
        DV0 dv0 = this.g;
        if (AbstractC7009ka2.a(interfaceC7353la2, interfaceC11128wa2, dv0)) {
            return;
        }
        interfaceC7353la2.a(new C9071qa2(interfaceC11128wa2, dv0, this.h));
    }
}
