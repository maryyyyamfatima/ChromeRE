package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ef0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546Ef0 implements InterfaceC9989tE2 {
    public final C0156Bf0 a;
    public final C0676Ff0 b;
    public final int c;

    public C0546Ef0(C0156Bf0 c0156Bf0, C0676Ff0 c0676Ff0, int i) {
        this.a = c0156Bf0;
        this.b = c0676Ff0;
        this.c = i;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        C0676Ff0 c0676Ff0 = this.b;
        C0156Bf0 c0156Bf0 = this.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return new C11579xs2(c0156Bf0.r, c0156Bf0.s, c0676Ff0.c);
            }
            if (i == 2) {
                C5785h c5785h = C5785h.a;
                return new Tr4(c5785h, c5785h);
            }
            throw new AssertionError(i);
        }
        WB2 wb2 = (WB2) c0156Bf0.b.a;
        C0546Ef0 c0546Ef0 = c0676Ff0.d;
        C0156Bf0 c0156Bf02 = c0676Ff0.a;
        InterfaceC9989tE2 interfaceC9989tE2 = c0156Bf02.r;
        InterfaceC9989tE2 interfaceC9989tE22 = c0156Bf02.t;
        C0546Ef0 c0546Ef02 = c0676Ff0.c;
        AbstractC9179qs2.a(1, c0546Ef0);
        AbstractC9179qs2.a(2, interfaceC9989tE2);
        AbstractC9179qs2.a(3, interfaceC9989tE22);
        AbstractC9179qs2.a(4, c0546Ef02);
        if (((NJ0) wb2).c == null) {
            return new C1870Ok0();
        }
        C0743Fs2 c0743Fs2 = new C0743Fs2(wb2);
        C11579xs2 c11579xs2 = (C11579xs2) c0546Ef0.get();
        P90 p90 = (P90) interfaceC9989tE2.get();
        AbstractC9179qs2.a(5, p90);
        P90 p902 = (P90) interfaceC9989tE22.get();
        AbstractC9179qs2.a(6, p902);
        return new C8836ps2(c0743Fs2, c11579xs2, p90, p902, (Tr4) c0546Ef02.get());
    }
}
