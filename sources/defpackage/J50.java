package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class J50 extends AbstractC7094ko3 {
    public static final C4638dg0[] o;
    public static final C4638dg0 p;
    public C7019kc0 b;
    public HashMap c;
    public HashMap d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public K50 i;
    public boolean j;
    public String[] k;
    public int l;
    public C7707mc0 m;
    public String[] n;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(80, 0);
        o = new C4638dg0[]{c4638dg0};
        p = c4638dg0;
    }

    public J50(int i) {
        super(80);
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = 0;
        this.j = false;
        this.l = 0;
    }

    public static J50 d(C1730Ni0 c1730Ni0) {
        if (c1730Ni0 == null) {
            return null;
        }
        c1730Ni0.b();
        try {
            J50 j50 = new J50(c1730Ni0.c(o).b);
            j50.b = C7019kc0.d(c1730Ni0.s(8, false));
            C1730Ni0 s = c1730Ni0.s(16, false);
            s.i();
            int[] q = s.q(8, 0);
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= q.length) {
                    C1730Ni0 s2 = s.s(16, false);
                    int i2 = s2.j(q.length).b;
                    String[] strArr = new String[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        strArr[i3] = AbstractC7214l9.a(i3, 8, 8, s2, false);
                    }
                    j50.c = new HashMap();
                    for (int i4 = 0; i4 < q.length; i4++) {
                        j50.c.put(Integer.valueOf(q[i4]), strArr[i4]);
                    }
                    C1730Ni0 s3 = c1730Ni0.s(24, false);
                    s3.i();
                    int[] q2 = s3.q(8, 0);
                    for (int i5 = 0; i5 < q2.length; i5++) {
                        int i6 = q2[i5];
                        if (!(i6 >= 0 && i6 <= 30)) {
                            throw new C12221zl0("Invalid enum value.");
                        }
                    }
                    C1730Ni0 s4 = s3.s(16, false);
                    int i7 = s4.j(q2.length).b;
                    C7363lc0[] c7363lc0Arr = new C7363lc0[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        c7363lc0Arr[i8] = C7363lc0.d(AbstractC7558m9.a(i8, 8, 8, s4, false));
                    }
                    j50.d = new HashMap();
                    for (int i9 = 0; i9 < q2.length; i9++) {
                        j50.d.put(Integer.valueOf(q2[i9]), c7363lc0Arr[i9]);
                    }
                    j50.e = c1730Ni0.d(32, 0);
                    j50.f = c1730Ni0.d(32, 1);
                    j50.g = c1730Ni0.d(32, 2);
                    j50.j = c1730Ni0.d(32, 3);
                    j50.h = c1730Ni0.o(36);
                    j50.i = K50.d(c1730Ni0.s(40, false));
                    C1730Ni0 s5 = c1730Ni0.s(48, false);
                    int i10 = s5.j(-1).b;
                    j50.k = new String[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        j50.k[i11] = AbstractC7214l9.a(i11, 8, 8, s5, false);
                    }
                    int o2 = c1730Ni0.o(56);
                    j50.l = o2;
                    if (!(o2 >= 0 && o2 <= 1)) {
                        throw new C12221zl0("Invalid enum value.");
                    }
                    j50.l = o2;
                    j50.m = C7707mc0.d(c1730Ni0.s(64, true));
                    C1730Ni0 s6 = c1730Ni0.s(72, false);
                    int i12 = s6.j(-1).b;
                    j50.n = new String[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        j50.n[i13] = AbstractC7214l9.a(i13, 8, 8, s6, false);
                    }
                    return j50;
                }
                int i14 = q[i];
                if (i14 < 0 || i14 > 30) {
                    z = false;
                }
                if (!z) {
                    throw new C12221zl0("Invalid enum value.");
                }
                i++;
            }
        } finally {
            c1730Ni0.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(p);
        t.k(this.b, 8, false);
        HashMap hashMap = this.c;
        C4638dg0 c4638dg0 = AbstractC3104Xx.a;
        int i = t.a;
        IA0 ia0 = t.b;
        if (hashMap == null) {
            t.q(16, false);
        } else {
            t.f(16, ia0.d - (i + 16));
            KA0 t2 = t.t(c4638dg0);
            int size = this.c.size();
            int[] iArr = new int[size];
            String[] strArr = new String[size];
            int i2 = 0;
            for (Map.Entry entry : this.c.entrySet()) {
                iArr[i2] = ((Integer) entry.getKey()).intValue();
                strArr[i2] = (String) entry.getValue();
                i2++;
            }
            t2.o(iArr, 8, 0);
            KA0 r = t2.r(size, 16);
            for (int i3 = 0; i3 < size; i3++) {
                r.m(strArr[i3], (i3 * 8) + 8, false);
            }
        }
        if (this.d == null) {
            t.q(24, false);
        } else {
            t.f(24, ia0.d - (i + 24));
            KA0 t3 = t.t(c4638dg0);
            int size2 = this.d.size();
            int[] iArr2 = new int[size2];
            C7363lc0[] c7363lc0Arr = new C7363lc0[size2];
            int i4 = 0;
            for (Map.Entry entry2 : this.d.entrySet()) {
                iArr2[i4] = ((Integer) entry2.getKey()).intValue();
                c7363lc0Arr[i4] = (C7363lc0) entry2.getValue();
                i4++;
            }
            t3.o(iArr2, 8, 0);
            KA0 r2 = t3.r(size2, 16);
            for (int i5 = 0; i5 < size2; i5++) {
                r2.k(c7363lc0Arr[i5], (i5 * 8) + 8, false);
            }
        }
        t.d(32, 0, this.e);
        t.d(32, 1, this.f);
        t.d(32, 2, this.g);
        t.d(32, 3, this.j);
        t.b(this.h, 36);
        t.k(this.i, 40, false);
        String[] strArr2 = this.k;
        if (strArr2 == null) {
            t.q(48, false);
        } else {
            KA0 r3 = t.r(strArr2.length, 48);
            int i6 = 0;
            while (true) {
                String[] strArr3 = this.k;
                if (i6 >= strArr3.length) {
                    break;
                }
                r3.m(strArr3[i6], (i6 * 8) + 8, false);
                i6++;
            }
        }
        t.b(this.l, 56);
        t.k(this.m, 64, true);
        String[] strArr4 = this.n;
        if (strArr4 == null) {
            t.q(72, false);
            return;
        }
        KA0 r4 = t.r(strArr4.length, 72);
        int i7 = 0;
        while (true) {
            String[] strArr5 = this.n;
            if (i7 >= strArr5.length) {
                return;
            }
            r4.m(strArr5[i7], (i7 * 8) + 8, false);
            i7++;
        }
    }
}
