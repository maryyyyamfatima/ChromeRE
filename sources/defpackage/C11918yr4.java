package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yr4 */
/* loaded from: classes.dex */
public final class C11918yr4 {
    public final InterfaceC3241Yy1 a;
    public final InterfaceC3241Yy1 b;

    public C11918yr4(InterfaceC3241Yy1 interfaceC3241Yy1, InterfaceC3241Yy1 interfaceC3241Yy12) {
        this.a = interfaceC3241Yy1;
        this.b = interfaceC3241Yy12;
    }

    public final InterfaceC9738sX a() {
        return (InterfaceC9738sX) ((C0936Hf0) this.a.get()).y.get();
    }

    public final C2460Sy0 b(C1161Iy0 c1161Iy0, Map map) {
        C1940Oy0 c1940Oy0 = (C1940Oy0) this.b.get();
        C0936Hf0 c0936Hf0 = c1940Oy0.a;
        AbstractC1291Jy0.b(c0936Hf0, c1161Iy0);
        C2479Tc c2479Tc = c1161Iy0.l;
        if (c2479Tc == null) {
            c2479Tc = C2479Tc.k;
        }
        AbstractC4147cE abstractC4147cE = c2479Tc.j;
        C3884bU c3884bU = C3884bU.l;
        if (c3884bU == null) {
            throw new NullPointerException("Null clientContext");
        }
        C2539To c2539To = new C2539To(new Gr4(), c3884bU);
        CS a = CS.a(map);
        C2931Wo1 c2931Wo1 = c1940Oy0.c;
        c2931Wo1.getClass();
        BT bt = (BT) c2931Wo1.a.get();
        C2931Wo1.a(1, bt);
        C5745gs4 c5745gs4 = new C5745gs4(c2539To, new C2801Vo1(bt, a), map);
        C3654ao a2 = c0936Hf0.a();
        a2.f = c5745gs4;
        a2.c = "ElementsSurfaceRenderer";
        C2460Sy0 c2460Sy0 = new C2460Sy0(c1940Oy0.b, a2.a());
        byte[] p = abstractC4147cE.p();
        c2460Sy0.a();
        c2460Sy0.h = p;
        c2460Sy0.i = null;
        c2460Sy0.b();
        return c2460Sy0;
    }
}
