package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sg */
/* loaded from: classes.dex */
public final class C2369Sg implements InterfaceC2239Rg {
    public final C3743b30 a;
    public final HashMap b = new HashMap();
    public final C1070Ig c = (C1070Ig) C1200Jg.o.j();
    public final HashSet d = new HashSet();
    public AbstractC9095qe2 e;
    public AbstractC9095qe2 f;
    public AbstractC9095qe2 g;
    public AbstractC9095qe2 h;
    public boolean i;
    public long j;

    @Override // defpackage.InterfaceC2499Tg
    public final C2369Sg a() {
        return this;
    }

    public C2369Sg(C3743b30 c3743b30) {
        C5785h c5785h = C5785h.a;
        this.e = c5785h;
        this.f = c5785h;
        this.g = c5785h;
        this.h = c5785h;
        this.i = false;
        this.a = c3743b30;
    }

    public final C2369Sg c(String str, String str2) {
        Set set;
        HashMap hashMap = this.b;
        if (!hashMap.containsKey(str)) {
            set = new HashSet();
            hashMap.put(str, set);
        } else {
            set = (Set) hashMap.get(str);
        }
        set.add(str2);
        return this;
    }

    public final C1495Ln b() {
        AbstractC9095qe2 abstractC9095qe2;
        C5785h c5785h = C5785h.a;
        long andIncrement = C1495Ln.g.getAndIncrement();
        byte b = (byte) 1;
        AbstractC0952Hi1.b(TL2.l);
        int i = AbstractC1472Li1.h;
        AbstractC1472Li1.o(UL2.o);
        C1070Ig c1070Ig = (C1070Ig) C1200Jg.o.k((C1200Jg) this.c.j());
        AbstractC0952Hi1 b2 = AbstractC0952Hi1.b(this.b);
        C3743b30 c3743b30 = this.a;
        if (c3743b30 == null) {
            throw new NullPointerException("Null event");
        }
        AbstractC1472Li1 o = AbstractC1472Li1.o(this.d);
        C1849Og c1849Og = (C1849Og) C2109Qg.p.j();
        C1589Mg c1589Mg = (C1589Mg) C1719Ng.o.j();
        int i2 = c3743b30.a.a;
        if (c1589Mg.h) {
            c1589Mg.l();
            c1589Mg.h = false;
        }
        C1719Ng c1719Ng = (C1719Ng) c1589Mg.g;
        c1719Ng.j |= 2;
        c1719Ng.l = i2;
        if (c1849Og.h) {
            c1849Og.l();
            c1849Og.h = false;
        }
        C2109Qg c2109Qg = (C2109Qg) c1849Og.g;
        C1719Ng c1719Ng2 = (C1719Ng) c1589Mg.j();
        c2109Qg.getClass();
        c1719Ng2.getClass();
        c2109Qg.n = c1719Ng2;
        c2109Qg.j |= 16;
        if (c1849Og.h) {
            c1849Og.l();
            c1849Og.h = false;
        }
        C2109Qg c2109Qg2 = (C2109Qg) c1849Og.g;
        c2109Qg2.getClass();
        c2109Qg2.m = 1;
        c2109Qg2.j |= 1;
        if (this.g.c()) {
            long longValue = ((Long) this.g.b()).longValue();
            if (c1849Og.h) {
                c1849Og.l();
                c1849Og.h = false;
            }
            C2109Qg c2109Qg3 = (C2109Qg) c1849Og.g;
            c2109Qg3.k = 4;
            c2109Qg3.l = Long.valueOf(longValue);
        }
        if (this.h.c()) {
            String str = (String) this.h.b();
            if (c1849Og.h) {
                c1849Og.l();
                c1849Og.h = false;
            }
            C2109Qg c2109Qg4 = (C2109Qg) c1849Og.g;
            c2109Qg4.getClass();
            str.getClass();
            c2109Qg4.k = 5;
            c2109Qg4.l = str;
        }
        if (c1070Ig.h) {
            c1070Ig.l();
            c1070Ig.h = false;
        }
        C1200Jg c1200Jg = (C1200Jg) c1070Ig.g;
        C2109Qg c2109Qg5 = (C2109Qg) c1849Og.j();
        c1200Jg.getClass();
        c2109Qg5.getClass();
        c1200Jg.k = c2109Qg5;
        c1200Jg.j |= 1;
        if (this.e.c()) {
            C9982tD0 c9982tD0 = (C9982tD0) C10325uD0.n.j();
            int intValue = ((Integer) this.e.b()).intValue();
            if (c9982tD0.h) {
                c9982tD0.l();
                c9982tD0.h = false;
            }
            C10325uD0 c10325uD0 = (C10325uD0) c9982tD0.g;
            c10325uD0.j |= 1;
            c10325uD0.k = intValue;
            if (this.f.c()) {
                String str2 = (String) this.f.b();
                if (c9982tD0.h) {
                    c9982tD0.l();
                    c9982tD0.h = false;
                }
                C10325uD0 c10325uD02 = (C10325uD0) c9982tD0.g;
                c10325uD02.getClass();
                str2.getClass();
                c10325uD02.j |= 2;
                c10325uD02.l = str2;
            }
            C9639sD0 c9639sD0 = (C9639sD0) C10668vD0.m.j();
            if (c9639sD0.h) {
                c9639sD0.l();
                c9639sD0.h = false;
            }
            C10668vD0 c10668vD0 = (C10668vD0) c9639sD0.g;
            C10325uD0 c10325uD03 = (C10325uD0) c9982tD0.j();
            c10668vD0.getClass();
            c10325uD03.getClass();
            c10668vD0.l = c10325uD03;
            c10668vD0.j |= 2;
            if (c1070Ig.h) {
                c1070Ig.l();
                c1070Ig.h = false;
            }
            C1200Jg c1200Jg2 = (C1200Jg) c1070Ig.g;
            C10668vD0 c10668vD02 = (C10668vD0) c9639sD0.j();
            c1200Jg2.getClass();
            c10668vD02.getClass();
            c1200Jg2.l = c10668vD02;
            c1200Jg2.j |= 2;
        }
        if (this.i) {
            abstractC9095qe2 = new C3242Yy2(Long.valueOf(this.j));
            C9639sD0 c9639sD02 = (C9639sD0) C10668vD0.m.j();
            C11064wN3 b3 = AbstractC11750yN3.b(this.j);
            if (c9639sD02.h) {
                c9639sD02.l();
                c9639sD02.h = false;
            }
            C10668vD0 c10668vD03 = (C10668vD0) c9639sD02.g;
            c10668vD03.getClass();
            c10668vD03.k = b3;
            c10668vD03.j |= 1;
            c1070Ig.o((C10668vD0) c9639sD02.j());
        } else {
            abstractC9095qe2 = c5785h;
        }
        if (b == 1 && o != null) {
            return new C1495Ln(andIncrement, abstractC9095qe2, c3743b30, c1070Ig, b2, o);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & b) == 0) {
            sb.append(" sequenceNo");
        }
        if (o == null) {
            sb.append(" testCodes");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
