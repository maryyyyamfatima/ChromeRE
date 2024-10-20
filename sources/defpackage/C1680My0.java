package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: My0 */
/* loaded from: classes.dex */
public final class C1680My0 extends WZ {
    public static final /* synthetic */ int I = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    H10 D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC6115hx0 E;

    @SY(type = 10)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    WZ F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC8520ox0 G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC11372xG3 H;

    @Override // defpackage.AbstractC10593v00
    public final C5277fX3 n(C5277fX3 c5277fX3) {
        C5277fX3 c5277fX32 = new C5277fX3();
        if (c5277fX3 != null) {
            synchronized (c5277fX3.a) {
                c5277fX32.a.putAll(c5277fX3.a);
            }
        }
        c5277fX32.b(InterfaceC8520ox0.class, this.G);
        c5277fX32.b(InterfaceC6115hx0.class, this.E);
        c5277fX32.b(H10.class, this.D);
        c5277fX32.b(InterfaceC11372xG3.class, this.H);
        return c5277fX32;
    }

    public C1680My0() {
        super("ElementsRootFlat");
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        C1680My0 c1680My0 = (C1680My0) super.k0();
        WZ wz = c1680My0.F;
        c1680My0.F = wz != null ? wz.k0() : null;
        return c1680My0;
    }

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        return this.F;
    }
}
