package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ac3 */
/* loaded from: classes.dex */
public final class C0014Ac3 extends Y03 {

    @SY(type = 10)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    WZ r;

    @Override // defpackage.AbstractC8888q13
    public final boolean h() {
        return true;
    }

    public C0014Ac3() {
        super("SingleComponentSection");
    }

    @Override // defpackage.Y03
    /* renamed from: p */
    public final boolean a(Y03 y03) {
        if (this == y03) {
            return true;
        }
        if (y03 == null || C0014Ac3.class != y03.getClass()) {
            return false;
        }
        WZ wz = this.r;
        WZ wz2 = ((C0014Ac3) y03).r;
        return wz == null ? wz2 == null : wz.a(wz2);
    }

    @Override // defpackage.Y03
    public final Y03 q(boolean z) {
        C0014Ac3 c0014Ac3 = (C0014Ac3) super.q(z);
        WZ wz = c0014Ac3.r;
        c0014Ac3.r = wz != null ? wz.k0() : null;
        return c0014Ac3;
    }

    @Override // defpackage.AbstractC8888q13
    public final void g(C3390a13 c3390a13, MI mi, Y03 y03, Y03 y032) {
        C0014Ac3 c0014Ac3 = (C0014Ac3) y03;
        C0014Ac3 c0014Ac32 = (C0014Ac3) y032;
        WZ wz = c0014Ac3 == null ? null : c0014Ac3.r;
        WZ wz2 = c0014Ac32 == null ? null : c0014Ac32.r;
        C11198wm0 c11198wm0 = new C11198wm0(null, null);
        if (wz == null && wz2 == null) {
            return;
        }
        if (wz != null && wz2 == null) {
            ArrayList arrayList = AI.i;
            mi.b(AI.b(3, 0, A00.r(), null, null));
            return;
        }
        if (wz == null && wz2 != null) {
            C11622y00 c11622y00 = new C11622y00();
            AbstractC0144Bc3.a(c11622y00, null, c11198wm0);
            c11622y00.b = wz2;
            Boolean bool = Boolean.FALSE;
            c11622y00.a(bool, "is_sticky");
            c11622y00.a(1, "span_size");
            c11622y00.a(bool, "is_full_span");
            A00 a00 = new A00(c11622y00);
            C5277fX3 h = c3390a13.h();
            Y03 y033 = mi.b;
            if (y033 != null) {
                a00.m(y033.o);
            }
            mi.b(AI.b(1, 0, new C5621gX3(a00, h), null, null));
            return;
        }
        if (wz.a(wz2)) {
            return;
        }
        C11622y00 c11622y002 = new C11622y00();
        AbstractC0144Bc3.a(c11622y002, null, c11198wm0);
        c11622y002.b = wz2;
        Boolean bool2 = Boolean.FALSE;
        c11622y002.a(bool2, "is_sticky");
        c11622y002.a(1, "span_size");
        c11622y002.a(bool2, "is_full_span");
        mi.b(AI.b(2, 0, new C5621gX3(new A00(c11622y002), c3390a13.h()), null, null));
    }
}
