package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fV */
/* loaded from: classes.dex */
public final class C5263fV extends AbstractC7094ko3 {
    public static final C4638dg0[] k;
    public static final C4638dg0 l;
    public C1544Lx b;
    public C6500j43[] c;
    public C1063Ie2 d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public C4422d14 i;
    public InterfaceC3506aN0[] j;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(88, 0);
        k = new C4638dg0[]{c4638dg0};
        l = c4638dg0;
    }

    public C5263fV(int i) {
        super(88);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5263fV d(C1730Ni0 c1730Ni0) {
        InterfaceC3506aN0[] interfaceC3506aN0Arr = null;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C5263fV c5263fV = new C5263fV(c1730Ni0.c(k).b);
            c5263fV.b = C1544Lx.b(c1730Ni0, 8);
            C1730Ni0 s = c1730Ni0.s(24, false);
            int i = s.j(-1).b;
            c5263fV.c = new C6500j43[i];
            for (int i2 = 0; i2 < i; i2++) {
                c5263fV.c[i2] = C6500j43.d(AbstractC7558m9.a(i2, 8, 8, s, false));
            }
            c5263fV.d = C1063Ie2.d(c1730Ni0.s(32, true));
            c5263fV.e = c1730Ni0.r(40);
            c5263fV.f = c1730Ni0.r(48);
            c5263fV.g = c1730Ni0.r(56);
            c5263fV.h = c1730Ni0.d(64, 0);
            c5263fV.i = C4422d14.d(c1730Ni0.s(72, true));
            C3850bN0 c3850bN0 = AbstractC6598jN0.a;
            C1730Ni0 s2 = c1730Ni0.s(80, AbstractC3104Xx.a(0));
            if (s2 != null) {
                int i3 = s2.h(-1, 8L).b;
                InterfaceC3506aN0[] interfaceC3506aN0Arr2 = new InterfaceC3506aN0[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    interfaceC3506aN0Arr2[i4] = s2.t((i4 * 8) + 8, false, c3850bN0);
                }
                interfaceC3506aN0Arr = interfaceC3506aN0Arr2;
            }
            c5263fV.j = interfaceC3506aN0Arr;
            return c5263fV;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(l);
        t.l(this.b, 8, false);
        C6500j43[] c6500j43Arr = this.c;
        if (c6500j43Arr == null) {
            t.q(24, false);
        } else {
            KA0 r = t.r(c6500j43Arr.length, 24);
            int i = 0;
            while (true) {
                C6500j43[] c6500j43Arr2 = this.c;
                if (i >= c6500j43Arr2.length) {
                    break;
                }
                r.k(c6500j43Arr2[i], (i * 8) + 8, false);
                i++;
            }
        }
        t.k(this.d, 32, true);
        t.f(40, this.e);
        t.f(48, this.f);
        t.f(56, this.g);
        t.d(64, 0, this.h);
        t.k(this.i, 72, true);
        InterfaceC3506aN0[] interfaceC3506aN0Arr = this.j;
        C3850bN0 c3850bN0 = AbstractC6598jN0.a;
        if (interfaceC3506aN0Arr == null) {
            t.q(80, AbstractC3104Xx.a(0));
            return;
        }
        KA0 s = t.s(8, interfaceC3506aN0Arr.length, 80, -1);
        for (int i2 = 0; i2 < interfaceC3506aN0Arr.length; i2++) {
            s.i(interfaceC3506aN0Arr[i2], (i2 * 8) + 8, false, c3850bN0);
        }
    }
}
