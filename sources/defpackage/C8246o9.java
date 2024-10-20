package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o9 */
/* loaded from: classes.dex */
public final class C8246o9 extends AbstractC7094ko3 {
    public static final C4638dg0[] c;
    public static final C4638dg0 d;
    public Map b;

    static {
        C4638dg0 c4638dg0 = new C4638dg0(16, 0);
        c = new C4638dg0[]{c4638dg0};
        d = c4638dg0;
    }

    public C8246o9(int i) {
        super(16);
    }

    public static C8246o9 d(C8697pU1 c8697pU1) {
        C1730Ni0 a = AbstractC7902n9.a(c8697pU1);
        try {
            C8246o9 c8246o9 = new C8246o9(a.c(c).b);
            C1730Ni0 s = a.s(8, false);
            s.i();
            C1730Ni0 s2 = s.s(8, false);
            int i = s2.j(-1).b;
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = AbstractC7214l9.a(i2, 8, 8, s2, false);
            }
            C1730Ni0 s3 = s.s(16, false);
            int i3 = s3.j(i).b;
            DH2[] dh2Arr = new DH2[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                dh2Arr[i4] = DH2.d(AbstractC7558m9.a(i4, 8, 8, s3, false));
            }
            c8246o9.b = new HashMap();
            for (int i5 = 0; i5 < i; i5++) {
                c8246o9.b.put(strArr[i5], dh2Arr[i5]);
            }
            return c8246o9;
        } finally {
            a.a();
        }
    }

    @Override // defpackage.AbstractC7094ko3
    public final void a(KA0 ka0) {
        KA0 t = ka0.t(d);
        if (this.b != null) {
            t.f(8, t.b.d - (t.a + 8));
            KA0 t2 = t.t(AbstractC3104Xx.a);
            int size = this.b.size();
            String[] strArr = new String[size];
            DH2[] dh2Arr = new DH2[size];
            int i = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                strArr[i] = (String) entry.getKey();
                dh2Arr[i] = (DH2) entry.getValue();
                i++;
            }
            KA0 r = t2.r(size, 8);
            for (int i2 = 0; i2 < size; i2++) {
                r.m(strArr[i2], (i2 * 8) + 8, false);
            }
            KA0 r2 = t2.r(size, 16);
            for (int i3 = 0; i3 < size; i3++) {
                r2.k(dh2Arr[i3], (i3 * 8) + 8, false);
            }
            return;
        }
        t.q(8, false);
    }
}
