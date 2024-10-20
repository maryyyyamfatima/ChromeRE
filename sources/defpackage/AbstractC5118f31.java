package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f31 */
/* loaded from: classes.dex */
public abstract class AbstractC5118f31 implements InterfaceC6918kI1, InterfaceC6913kH1 {
    public static final String g = new String();
    public final Level a;
    public final long b;
    public C6569jH1 c;
    public OH1 d;
    public C10000tG3 e;
    public Object[] f;

    @Override // defpackage.InterfaceC6918kI1
    public final InterfaceC6918kI1 g(String str, int i, String str2, String str3) {
        return p(new NH1(str, str2, i, str3));
    }

    public AbstractC5118f31(Level level, boolean z) {
        long k = AbstractC2312Ru2.k();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        AbstractC5203fJ.a(level, "level");
        this.a = level;
        this.b = k;
        if (z) {
            q(AbstractC6227iH1.e, Boolean.TRUE);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final InterfaceC6918kI1 a(TimeUnit timeUnit) {
        C6569jH1 c6569jH1 = this.c;
        if (c6569jH1 != null && Boolean.TRUE.equals(c6569jH1.a(AbstractC6227iH1.e))) {
            return (C5806h31) this;
        }
        GW1 gw1 = AbstractC6227iH1.c;
        RH1 rh1 = TH1.d;
        q(gw1, new SH1(timeUnit));
        return (C5806h31) this;
    }

    public final AbstractC10078tW1 r() {
        C6569jH1 c6569jH1 = this.c;
        return c6569jH1 != null ? c6569jH1 : C9050qW1.a;
    }

    public final void q(GW1 gw1, Object obj) {
        int e;
        if (this.c == null) {
            this.c = new C6569jH1();
        }
        C6569jH1 c6569jH1 = this.c;
        c6569jH1.getClass();
        if (!gw1.c && (e = c6569jH1.e(gw1)) != -1) {
            AbstractC5203fJ.a(obj, "metadata value");
            c6569jH1.a[(e * 2) + 1] = obj;
            return;
        }
        int i = (c6569jH1.b + 1) * 2;
        Object[] objArr = c6569jH1.a;
        if (i > objArr.length) {
            c6569jH1.a = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = c6569jH1.a;
        int i2 = c6569jH1.b * 2;
        objArr2[i2] = gw1;
        AbstractC5203fJ.a(obj, "metadata value");
        objArr2[i2 + 1] = obj;
        c6569jH1.b++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v14, types: [Vg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5118f31.t():boolean");
    }

    public final void s(String str, Object... objArr) {
        this.f = objArr;
        for (Object obj : objArr) {
        }
        if (str != g) {
            C8099nk0 c8099nk0 = C8099nk0.b;
            this.e = new C10000tG3(str);
        }
        ME3 n = AbstractC2312Ru2.n();
        if (!n.a.isEmpty()) {
            AbstractC10078tW1 r = r();
            GW1 gw1 = AbstractC6227iH1.f;
            ME3 me3 = (ME3) r.a(gw1);
            if (me3 != null) {
                GE3 ge3 = me3.a;
                if (!ge3.isEmpty()) {
                    GE3 ge32 = n.a;
                    if (!ge32.isEmpty()) {
                        me3 = new ME3(new GE3(ge32, ge3));
                    }
                    n = me3;
                }
            }
            q(gw1, n);
        }
        AbstractC6232iI1 abstractC6232iI1 = ((C5806h31) this).h.a;
        try {
            QI2 qi2 = (QI2) QI2.g.get();
            int i = qi2.a + 1;
            qi2.a = i;
            if (i == 0) {
                throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
            }
            try {
                if (i <= 100) {
                    abstractC6232iI1.d(this);
                } else {
                    E.h("unbounded recursion in log statement", this);
                }
                qi2.close();
            } catch (Throwable th) {
                try {
                    qi2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (RuntimeException e) {
            try {
                abstractC6232iI1.b(e, this);
            } catch (RuntimeException e2) {
                E.h(e2.getClass().getName() + ": " + e2.getMessage(), this);
                try {
                    e2.printStackTrace(System.err);
                } catch (RuntimeException unused2) {
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final InterfaceC6918kI1 p(NH1 nh1) {
        if (this.d == null) {
            this.d = nh1;
        }
        return (C5806h31) this;
    }

    @Override // defpackage.InterfaceC6918kI1
    public final InterfaceC6918kI1 l(GW1 gw1, Object obj) {
        AbstractC5203fJ.a(gw1, "metadata key");
        if (obj != null) {
            q(gw1, obj);
        }
        return (C5806h31) this;
    }

    @Override // defpackage.InterfaceC6918kI1
    public final InterfaceC6918kI1 f(Throwable th) {
        return l(AbstractC6227iH1.a, th);
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void h(String str) {
        if (t()) {
            s(g, str);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void o(Object obj, String str) {
        if (t()) {
            s(str, obj);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void e(String str, String str2) {
        if (t()) {
            s("Didn't expect to log %s after %s", str, str2);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void b(String str, Object obj, Object obj2, Object obj3) {
        if (t()) {
            s(str, obj, obj2, obj3);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void m(String str, String str2, Object obj, Integer num, Integer num2) {
        if (t()) {
            s("Sending {accountName='%s', clientInstanceId='%s', experimentIds=%s, eventCode=%d, logType=%d}", str, str2, obj, num, num2);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void k(C7664mU c7664mU, Object obj, C7664mU c7664mU2, C7664mU c7664mU3, C7664mU c7664mU4, C7664mU c7664mU5) {
        if (t()) {
            s("[XUiKitFloggerElementsErrorLogger] %s: %s [clientId=%s, featureId=%s, veId=%s, conversionPath=%s]", c7664mU, obj, c7664mU2, c7664mU3, c7664mU4, c7664mU5);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void d(int i, String str) {
        if (t()) {
            s(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void c(String str, Object obj, int i) {
        if (t()) {
            s(str, obj, Integer.valueOf(i));
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void j(int i, String str) {
        if (t()) {
            s("Logging graft for VE type %s with graft %s.", Integer.valueOf(i), str);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void n(long j, Integer num) {
        if (t()) {
            s("Add duration=%d to contentKey=%s", Long.valueOf(j), num);
        }
    }

    @Override // defpackage.InterfaceC6918kI1
    public final void i(int i, boolean z) {
        if (t()) {
            s("endCommandExecution(%b), commandExtensionNumber = %d", Boolean.valueOf(z), Integer.valueOf(i));
        }
    }
}
