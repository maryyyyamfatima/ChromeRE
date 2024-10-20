package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kb */
/* loaded from: classes.dex */
public abstract class AbstractC7012kb {
    public static final C2826Vt1 a = C2826Vt1.a("k", "x", "y");

    public static C6668jb a(C3346Zt1 c3346Zt1, C8985qJ1 c8985qJ1) {
        ArrayList arrayList = new ArrayList();
        if (c3346Zt1.u() == 1) {
            c3346Zt1.b();
            while (c3346Zt1.i()) {
                arrayList.add(new C2407Sn2(c8985qJ1, AbstractC0237Bv1.b(c3346Zt1, c8985qJ1, C74.c(), C2797Vn2.a, c3346Zt1.u() == 3, false)));
            }
            c3346Zt1.e();
            AbstractC0367Cv1.b(arrayList);
        } else {
            arrayList.add(new C12282zv1(AbstractC4036bu1.b(c3346Zt1, C74.c())));
        }
        return new C6668jb(arrayList);
    }

    public static InterfaceC10445ub b(C3346Zt1 c3346Zt1, C8985qJ1 c8985qJ1) {
        c3346Zt1.c();
        C6668jb c6668jb = null;
        C5638gb c5638gb = null;
        boolean z = false;
        C5638gb c5638gb2 = null;
        while (c3346Zt1.u() != 4) {
            int C = c3346Zt1.C(a);
            if (C == 0) {
                c6668jb = a(c3346Zt1, c8985qJ1);
            } else if (C != 1) {
                if (C == 2) {
                    if (c3346Zt1.u() != 6) {
                        c5638gb = AbstractC10788vb.a(c3346Zt1, c8985qJ1, true);
                    } else {
                        c3346Zt1.I();
                        z = true;
                    }
                } else {
                    c3346Zt1.F();
                    c3346Zt1.I();
                }
            } else if (c3346Zt1.u() != 6) {
                c5638gb2 = AbstractC10788vb.a(c3346Zt1, c8985qJ1, true);
            } else {
                c3346Zt1.I();
                z = true;
            }
        }
        c3346Zt1.f();
        if (z) {
            c8985qJ1.a("Lottie doesn't support expressions.");
        }
        return c6668jb != null ? c6668jb : new C8388ob(c5638gb2, c5638gb);
    }
}
