package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VU3 extends AbstractC7094ko3 {
    public static final C4638dg0[] i;
    public static final C4638dg0 j;
    public C5263fV b;
    public C11788yV1[] c;
    public C11788yV1[] d;
    public C6158i43[] e;
    public C10924vy[] f;
    public F44 g;
    public int h;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(64, 0);
        i = new C4638dg0[]{c4638dg0};
        j = c4638dg0;
    }

    public VU3(int i2) {
        super(64);
        this.h = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VU3 d(C8697pU1 c8697pU1) {
        VU3 vu3;
        boolean z;
        C1730Ni0 s;
        int i2;
        int i3;
        F44 f44;
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            vu3 = new VU3(a.c(i).b);
            z = false;
            vu3.b = C5263fV.d(a.s(8, false));
            C1730Ni0 s2 = a.s(16, false);
            int i4 = s2.j(-1).b;
            vu3.c = new C11788yV1[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                vu3.c[i5] = C11788yV1.d(AbstractC7558m9.a(i5, 8, 8, s2, false));
            }
            C1730Ni0 s3 = a.s(24, false);
            int i6 = s3.j(-1).b;
            vu3.d = new C11788yV1[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                vu3.d[i7] = C11788yV1.d(AbstractC7558m9.a(i7, 8, 8, s3, false));
            }
            s = a.s(32, false);
            i2 = s.j(-1).b;
            vu3.e = new C6158i43[i2];
            i3 = 0;
        } finally {
        }
        while (true) {
            f44 = null;
            if (i3 >= i2) {
                break;
            }
            C1730Ni0 a2 = AbstractC7558m9.a(i3, 8, 8, s, false);
            C6158i43[] c6158i43Arr = vu3.e;
            if (a2 != null) {
                a2.b();
                try {
                    C6158i43 c6158i43 = new C6158i43(a2.c(C6158i43.c).b);
                    c6158i43.b = C1544Lx.b(a2, 8);
                    a2.a();
                    f44 = c6158i43;
                } catch (Throwable th) {
                    a2.a();
                    throw th;
                }
            }
            c6158i43Arr[i3] = f44;
            i3++;
            a.a();
        }
        C1730Ni0 s4 = a.s(40, false);
        int i8 = s4.j(-1).b;
        vu3.f = new C10924vy[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            vu3.f[i9] = C10924vy.d(AbstractC7558m9.a(i9, 8, 8, s4, false));
        }
        C1730Ni0 s5 = a.s(48, true);
        if (s5 != null) {
            s5.b();
            try {
                f44 = new F44(s5.c(F44.d).b);
                f44.b = s5.d(8, 0);
                f44.c = s5.d(8, 1);
            } finally {
                s5.a();
            }
        }
        vu3.g = f44;
        int o = a.o(56);
        vu3.h = o;
        if (o >= 0 && o <= 2) {
            z = true;
        }
        if (!z) {
            throw new C12221zl0("Invalid enum value.");
        }
        vu3.h = o;
        return vu3;
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(j);
        t.k(this.b, 8, false);
        C11788yV1[] c11788yV1Arr = this.c;
        if (c11788yV1Arr == null) {
            t.q(16, false);
        } else {
            KA0 r = t.r(c11788yV1Arr.length, 16);
            int i2 = 0;
            while (true) {
                C11788yV1[] c11788yV1Arr2 = this.c;
                if (i2 >= c11788yV1Arr2.length) {
                    break;
                }
                r.k(c11788yV1Arr2[i2], (i2 * 8) + 8, false);
                i2++;
            }
        }
        C11788yV1[] c11788yV1Arr3 = this.d;
        if (c11788yV1Arr3 == null) {
            t.q(24, false);
        } else {
            KA0 r2 = t.r(c11788yV1Arr3.length, 24);
            int i3 = 0;
            while (true) {
                C11788yV1[] c11788yV1Arr4 = this.d;
                if (i3 >= c11788yV1Arr4.length) {
                    break;
                }
                r2.k(c11788yV1Arr4[i3], (i3 * 8) + 8, false);
                i3++;
            }
        }
        C6158i43[] c6158i43Arr = this.e;
        if (c6158i43Arr == null) {
            t.q(32, false);
        } else {
            KA0 r3 = t.r(c6158i43Arr.length, 32);
            int i4 = 0;
            while (true) {
                C6158i43[] c6158i43Arr2 = this.e;
                if (i4 >= c6158i43Arr2.length) {
                    break;
                }
                r3.k(c6158i43Arr2[i4], (i4 * 8) + 8, false);
                i4++;
            }
        }
        C10924vy[] c10924vyArr = this.f;
        if (c10924vyArr == null) {
            t.q(40, false);
        } else {
            KA0 r4 = t.r(c10924vyArr.length, 40);
            int i5 = 0;
            while (true) {
                C10924vy[] c10924vyArr2 = this.f;
                if (i5 >= c10924vyArr2.length) {
                    break;
                }
                r4.k(c10924vyArr2[i5], (i5 * 8) + 8, false);
                i5++;
            }
        }
        t.k(this.g, 48, true);
        t.b(this.h, 56);
    }
}
