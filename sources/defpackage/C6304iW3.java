package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iW3 */
/* loaded from: classes.dex */
public final class C6304iW3 implements GO2 {
    public final /* synthetic */ C6646jW3 a;

    public final float a(C11356xD2 c11356xD2) {
        C3603af2 c3603af2;
        InterfaceC1045Ib interfaceC1045Ib = c11356xD2.b;
        C4241cW3 c4241cW3 = (C4241cW3) this.a.b.a(c11356xD2.a);
        C5272fW3 c5272fW3 = (C5272fW3) c4241cW3.a.get(interfaceC1045Ib);
        if (c5272fW3 != null) {
            return c5272fW3.a.c;
        }
        if (c4241cW3.c == 0) {
            c3603af2 = c4241cW3.e;
        } else {
            c3603af2 = c4241cW3.d;
        }
        if (c3603af2 == null) {
            throw new RuntimeException("Both LayoutOutputs were null!");
        }
        return interfaceC1045Ib.c((C10926vy1) c3603af2.c());
    }

    public C6304iW3(C6646jW3 c6646jW3) {
        this.a = c6646jW3;
    }
}
