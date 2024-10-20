package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ln */
/* loaded from: classes.dex */
public final class C1495Ln {
    public static final AtomicLong g = new AtomicLong();
    public final long a;
    public final AbstractC9095qe2 b;
    public final C3743b30 c;
    public final C1070Ig d;
    public final AbstractC0952Hi1 e;
    public final AbstractC1472Li1 f;

    public C1495Ln(long j, AbstractC9095qe2 abstractC9095qe2, C3743b30 c3743b30, C1070Ig c1070Ig, AbstractC0952Hi1 abstractC0952Hi1, AbstractC1472Li1 abstractC1472Li1) {
        this.a = j;
        this.b = abstractC9095qe2;
        this.c = c3743b30;
        this.d = c1070Ig;
        this.e = abstractC0952Hi1;
        this.f = abstractC1472Li1;
    }

    public final AbstractC1472Li1 a() {
        AbstractC1472Li1 abstractC1472Li1;
        C3743b30 c3743b30 = this.c;
        synchronized (c3743b30) {
            if (!c3743b30.h) {
                C1342Ki1 c1342Ki1 = new C1342Ki1();
                for (int i : c3743b30.g) {
                    C5946hU c5946hU = c3743b30.a.b;
                    c1342Ki1.f(new C2759Vg(i, c5946hU.a, c5946hU.b));
                }
                c3743b30.i = c1342Ki1.g();
                c3743b30.h = true;
            }
            abstractC1472Li1 = c3743b30.i;
        }
        return abstractC1472Li1;
    }

    /* renamed from: b */
    public final String toString() {
        StringBuilder a = AbstractC10761vV3.a("<");
        C3743b30 c3743b30 = this.c;
        a.append(c3743b30.b);
        a.append("> (ID:");
        C2759Vg c2759Vg = c3743b30.a;
        a.append(c2759Vg.a);
        a.append(") ");
        a.append(c2759Vg.b);
        C1070Ig c1070Ig = this.d;
        C10668vD0 c10668vD0 = ((C1200Jg) c1070Ig.g).l;
        if (c10668vD0 == null) {
            c10668vD0 = C10668vD0.m;
        }
        boolean z = true;
        if ((c10668vD0.j & 2) != 0) {
            a.append(" Status: ");
            C10668vD0 c10668vD02 = ((C1200Jg) c1070Ig.g).l;
            C10325uD0 c10325uD0 = (c10668vD02 == null ? C10668vD0.m : c10668vD02).l;
            if (c10325uD0 == null) {
                c10325uD0 = C10325uD0.n;
            }
            if ((c10325uD0.j & 2) != 0) {
                if (c10668vD02 == null) {
                    c10668vD02 = C10668vD0.m;
                }
                C10325uD0 c10325uD02 = c10668vD02.l;
                if (c10325uD02 == null) {
                    c10325uD02 = C10325uD0.n;
                }
                a.append(c10325uD02.l);
                a.append(":");
                C10668vD0 c10668vD03 = ((C1200Jg) c1070Ig.g).l;
                if (c10668vD03 == null) {
                    c10668vD03 = C10668vD0.m;
                }
                C10325uD0 c10325uD03 = c10668vD03.l;
                if (c10325uD03 == null) {
                    c10325uD03 = C10325uD0.n;
                }
                a.append(c10325uD03.k);
            } else {
                if (c10668vD02 == null) {
                    c10668vD02 = C10668vD0.m;
                }
                C10325uD0 c10325uD04 = c10668vD02.l;
                if (c10325uD04 == null) {
                    c10325uD04 = C10325uD0.n;
                }
                int a2 = NV.a(c10325uD04.k);
                if (a2 == 0) {
                    a2 = 3;
                }
                a.append(NV.c(a2));
            }
        }
        a.append(" Timestamp");
        AbstractC9095qe2 abstractC9095qe2 = this.b;
        if (abstractC9095qe2.c()) {
            a.append(" [Custom]: ");
            a.append(abstractC9095qe2.b());
        } else {
            a.append(": ");
            C10668vD0 c10668vD04 = ((C1200Jg) c1070Ig.g).l;
            if (c10668vD04 == null) {
                c10668vD04 = C10668vD0.m;
            }
            C11064wN3 c11064wN3 = c10668vD04.k;
            if (c11064wN3 == null) {
                c11064wN3 = C11064wN3.l;
            }
            AbstractC11750yN3.a(c11064wN3);
            a.append(FI1.a(FI1.b(c11064wN3.j, 1000000000L), c11064wN3.k));
        }
        a.append("ns. ");
        AbstractC0952Hi1 abstractC0952Hi1 = this.e;
        if (!abstractC0952Hi1.isEmpty()) {
            a.append(", Tags: [");
            C14 it = abstractC0952Hi1.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!z) {
                    a.append("; ");
                }
                a.append(str);
                a.append(":");
                Set set = (Set) abstractC0952Hi1.get(str);
                if (set == null) {
                    a.append("<null>");
                } else {
                    new C1007Ht1(",").a(a, set.iterator());
                }
                z = false;
            }
            a.append("]");
        }
        a.append("}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1495Ln)) {
            return false;
        }
        C1495Ln c1495Ln = (C1495Ln) obj;
        return this.a == c1495Ln.a && this.b.equals(c1495Ln.b) && this.c.equals(c1495Ln.c) && this.d.equals(c1495Ln.d) && this.e.equals(c1495Ln.e) && this.f.equals(c1495Ln.f);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
