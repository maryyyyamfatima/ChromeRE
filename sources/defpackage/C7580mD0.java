package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mD0 */
/* loaded from: classes.dex */
public final class C7580mD0 {
    public boolean a;
    public C3986bm b;
    public int c = 1;
    public final ArrayList d = new ArrayList();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public TD0 f;
    public String g;
    public final Random h;
    public int i;

    public C7580mD0() {
        Random random = new Random();
        this.h = random;
        this.a = true;
        this.i = random.nextInt();
    }

    public final synchronized void f(C2134Ql c2134Ql) {
        if (Log.isLoggable("AttentionEventLogger", 3)) {
            a(c2134Ql);
        }
        this.d.add(c2134Ql);
    }

    public final synchronized void e() {
        if (this.b != null && !this.d.isEmpty()) {
            C1355Kl c1355Kl = (C1355Kl) C2264Rl.r.j();
            if (c1355Kl.h) {
                c1355Kl.l();
                c1355Kl.h = false;
            }
            C2264Rl c2264Rl = (C2264Rl) c1355Kl.g;
            c2264Rl.getClass();
            c2264Rl.j |= 8;
            c2264Rl.n = "V";
            int i = this.c;
            if (c1355Kl.h) {
                c1355Kl.l();
                c1355Kl.h = false;
            }
            C2264Rl c2264Rl2 = (C2264Rl) c1355Kl.g;
            c2264Rl2.j |= 1;
            c2264Rl2.k = i;
            int i2 = this.i;
            if (c1355Kl.h) {
                c1355Kl.l();
                c1355Kl.h = false;
            }
            C2264Rl c2264Rl3 = (C2264Rl) c1355Kl.g;
            c2264Rl3.j |= 16;
            c2264Rl3.p = i2;
            for (TD0 td0 : this.e.keySet()) {
                g(td0, ((Integer) this.e.get(td0)).intValue());
            }
            c1355Kl.o(this.d);
            TD0 td02 = this.f;
            if (td02 != null) {
                if (c1355Kl.h) {
                    c1355Kl.l();
                    c1355Kl.h = false;
                }
                C2264Rl c2264Rl4 = (C2264Rl) c1355Kl.g;
                c2264Rl4.getClass();
                c2264Rl4.m = td02;
                c2264Rl4.j |= 4;
            }
            String str = this.g;
            if (str != null) {
                if (c1355Kl.h) {
                    c1355Kl.l();
                    c1355Kl.h = false;
                }
                C2264Rl c2264Rl5 = (C2264Rl) c1355Kl.g;
                c2264Rl5.getClass();
                c2264Rl5.j |= 2;
                c2264Rl5.l = str;
            }
            this.b.a((C2264Rl) c1355Kl.j());
            this.c += this.d.size();
            this.d.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.TD0 r12, int r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7580mD0.g(TD0, int):void");
    }

    public static C2134Ql d(long j, int i, int i2, int i3) {
        C2134Ql c = c(j, 1);
        JX0 jx0 = (JX0) c.l(PX0.NEW_BUILDER);
        jx0.m(c);
        C1485Ll c1485Ll = (C1485Ll) jx0;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql = (C2134Ql) c1485Ll.g;
        c2134Ql.k |= 32;
        c2134Ql.s = i;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql2 = (C2134Ql) c1485Ll.g;
        c2134Ql2.k |= 16;
        c2134Ql2.r = i2;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql3 = (C2134Ql) c1485Ll.g;
        c2134Ql3.k |= 64;
        c2134Ql3.t = i3;
        return (C2134Ql) c1485Ll.j();
    }

    public static C2134Ql b(long j, int i) {
        C2134Ql c = c(j, 7);
        JX0 jx0 = (JX0) c.l(PX0.NEW_BUILDER);
        jx0.m(c);
        C1485Ll c1485Ll = (C1485Ll) jx0;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql = (C2134Ql) c1485Ll.g;
        c2134Ql.getClass();
        c2134Ql.w = AbstractC1874Ol.a(i);
        c2134Ql.k |= 4096;
        return (C2134Ql) c1485Ll.j();
    }

    public final void a(C2134Ql c2134Ql) {
        int intValue;
        int i;
        int hashCode = hashCode();
        int a = AbstractC1614Ml.a(c2134Ql.o);
        if (a == 0) {
            a = 1;
        }
        int b = AbstractC2373Sg3.b(a);
        if (b == 0) {
            String.format("%d|VP:%dx%d top=%d", Integer.valueOf(hashCode), Integer.valueOf(c2134Ql.s), Integer.valueOf(c2134Ql.r), Integer.valueOf(c2134Ql.t));
            return;
        }
        if (b == 1) {
            int i2 = c2134Ql.l;
            if (i2 == 19) {
                intValue = (i2 == 19 ? (VT) c2134Ql.m : VT.v).k;
                i = (i2 == 19 ? (VT) c2134Ql.m : VT.v).n;
            } else {
                intValue = i2 == 10 ? ((Integer) c2134Ql.m).intValue() : 0;
                i = 0;
            }
            String.format("%d|VE<%d,%d,%d> %dx%d top=%d", Integer.valueOf(hashCode), Integer.valueOf(c2134Ql.x), Integer.valueOf(intValue), Integer.valueOf(i), Integer.valueOf(c2134Ql.s), Integer.valueOf(c2134Ql.r), Integer.valueOf(c2134Ql.p));
            return;
        }
        if (b == 2) {
            String.format("%d|PAUSE(idle=%d)", Integer.valueOf(hashCode), Long.valueOf(c2134Ql.v));
            return;
        }
        if (b == 3) {
            String.format("%d|SC:%d,%d indeterministic:%s", Integer.valueOf(hashCode), Integer.valueOf(c2134Ql.t), Integer.valueOf(c2134Ql.u), Boolean.valueOf(c2134Ql.A));
            return;
        }
        if (b == 6) {
            String.format("%d|EXIT", Integer.valueOf(hashCode));
            return;
        }
        switch (b) {
            case 9:
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(hashCode);
                objArr[1] = Integer.valueOf(c2134Ql.t);
                objArr[2] = Integer.valueOf(c2134Ql.u);
                objArr[3] = Integer.valueOf(c2134Ql.x);
                objArr[4] = Integer.valueOf(c2134Ql.l == 10 ? ((Integer) c2134Ql.m).intValue() : 0);
                String.format("%d|SW:%d,%d,%d,%d", objArr);
                return;
            case 10:
                String.format("%d|DOM_CHANGE", Integer.valueOf(hashCode));
                return;
            case 11:
                String.format("%d|EI(%d=%s)", Integer.valueOf(hashCode), Integer.valueOf(c2134Ql.x), c2134Ql.y);
                return;
            default:
                String.format("%d|%s", Integer.valueOf(hashCode), c2134Ql);
                return;
        }
    }

    public static C2134Ql c(long j, int i) {
        C1485Ll c1485Ll = (C1485Ll) C2134Ql.C.j();
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql = (C2134Ql) c1485Ll.g;
        c2134Ql.getClass();
        if (i == 0) {
            throw null;
        }
        c2134Ql.o = i - 1;
        c2134Ql.k |= 2;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql2 = (C2134Ql) c1485Ll.g;
        c2134Ql2.k |= 1;
        c2134Ql2.n = j;
        return (C2134Ql) c1485Ll.j();
    }
}
