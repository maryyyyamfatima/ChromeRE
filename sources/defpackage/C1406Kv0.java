package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kv0 */
/* loaded from: classes2.dex */
public final class C1406Kv0 extends AbstractC7094ko3 {
    public static final C4638dg0[] e;
    public static final C4638dg0 f;
    public C7407lj2 b;
    public int c;
    public int d;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(24, 0);
        e = new C4638dg0[]{c4638dg0};
        f = c4638dg0;
    }

    public C1406Kv0(int i) {
        super(24);
    }

    public static C1406Kv0 d(C1730Ni0 c1730Ni0) {
        C7407lj2 c7407lj2 = null;
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            C1406Kv0 c1406Kv0 = new C1406Kv0(c1730Ni0.c(e).b);
            boolean z = false;
            C1730Ni0 s = c1730Ni0.s(8, false);
            if (s != null) {
                s.b();
                try {
                    C7407lj2 c7407lj22 = new C7407lj2(s.c(C7407lj2.p).b);
                    C1730Ni0 s2 = s.s(8, false);
                    int i = s2.j(-1).b;
                    c7407lj22.b = new J50[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        c7407lj22.b[i2] = J50.d(AbstractC7558m9.a(i2, 8, 8, s2, false));
                    }
                    c7407lj22.c = M8.b(s);
                    c7407lj22.d = C2735Vb0.d(s.s(32, false));
                    c7407lj22.e = C2865Wb0.d(s.s(40, false));
                    int o = s.o(48);
                    c7407lj22.f = o;
                    if (!(o >= 0 && o <= 2)) {
                        throw new C12221zl0("Invalid enum value.");
                    }
                    c7407lj22.f = o;
                    int o2 = s.o(52);
                    c7407lj22.i = o2;
                    if (!(o2 >= 0 && o2 <= 5)) {
                        throw new C12221zl0("Invalid enum value.");
                    }
                    c7407lj22.i = o2;
                    int[] q = s.q(56, 1);
                    c7407lj22.g = q;
                    if (q != null) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr = c7407lj22.g;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            AbstractC5703gl4.a(iArr[i3]);
                            i3++;
                        }
                    }
                    int[] q2 = s.q(64, 1);
                    c7407lj22.h = q2;
                    if (q2 != null) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr2 = c7407lj22.h;
                            if (i4 >= iArr2.length) {
                                break;
                            }
                            AbstractC5703gl4.a(iArr2[i4]);
                            i4++;
                        }
                    }
                    C1730Ni0 s3 = s.s(72, false);
                    int i5 = s3.j(-1).b;
                    c7407lj22.j = new ZB1[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        c7407lj22.j[i6] = ZB1.d(AbstractC7558m9.a(i6, 8, 8, s3, false));
                    }
                    c7407lj22.k = C12093zN3.b(s);
                    c7407lj22.l = s.d(96, 0);
                    C1730Ni0 s4 = s.s(104, true);
                    if (s4 == null) {
                        c7407lj22.m = null;
                    } else {
                        s4.i();
                        C1730Ni0 s5 = s4.s(8, false);
                        int i7 = s5.j(-1).b;
                        String[] strArr = new String[i7];
                        for (int i8 = 0; i8 < i7; i8++) {
                            strArr[i8] = AbstractC7214l9.a(i8, 8, 8, s5, false);
                        }
                        C1730Ni0 s6 = s4.s(16, false);
                        int i9 = s6.j(i7).b;
                        String[] strArr2 = new String[i9];
                        for (int i10 = 0; i10 < i9; i10++) {
                            strArr2[i10] = AbstractC7214l9.a(i10, 8, 8, s6, false);
                        }
                        c7407lj22.m = new HashMap();
                        for (int i11 = 0; i11 < i7; i11++) {
                            c7407lj22.m.put(strArr[i11], strArr2[i11]);
                        }
                    }
                    C1730Ni0 s7 = s.s(112, true);
                    if (s7 == null) {
                        c7407lj22.n = null;
                    } else {
                        int i12 = s7.j(-1).b;
                        c7407lj22.n = new S74[i12];
                        for (int i13 = 0; i13 < i12; i13++) {
                            c7407lj22.n[i13] = S74.d(AbstractC7558m9.a(i13, 8, 8, s7, false));
                        }
                    }
                    C1730Ni0 s8 = s.s(120, true);
                    if (s8 == null) {
                        c7407lj22.o = null;
                    } else {
                        int i14 = s8.j(-1).b;
                        c7407lj22.o = new String[i14];
                        for (int i15 = 0; i15 < i14; i15++) {
                            c7407lj22.o[i15] = AbstractC7214l9.a(i15, 8, 8, s8, false);
                        }
                    }
                    s.a();
                    c7407lj2 = c7407lj22;
                } catch (Throwable th) {
                    s.a();
                    throw th;
                }
            }
            c1406Kv0.b = c7407lj2;
            int o3 = c1730Ni0.o(16);
            c1406Kv0.c = o3;
            if (o3 >= 0 && o3 <= 8) {
                z = true;
            }
            c1406Kv0.c = z ? o3 : 1;
            int o4 = c1730Ni0.o(20);
            c1406Kv0.d = o4;
            AbstractC4710ds1.a(o4);
            c1406Kv0.d = c1406Kv0.d;
            return c1406Kv0;
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(f);
        t.k(this.b, 8, false);
        t.b(this.c, 16);
        t.b(this.d, 20);
    }
}
