package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456Sx1 {
    public final List a;
    public final C8985qJ1 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final C9759sb i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final C8731pb q;
    public final C9074qb r;
    public final C5638gb s;
    public final List t;
    public final int u;
    public final boolean v;

    public C2456Sx1(List list, C8985qJ1 c8985qJ1, String str, long j, int i, long j2, String str2, List list2, C9759sb c9759sb, int i2, int i3, int i4, float f, float f2, int i5, int i6, C8731pb c8731pb, C9074qb c9074qb, List list3, int i7, C5638gb c5638gb, boolean z) {
        this.a = list;
        this.b = c8985qJ1;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = c9759sb;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = i5;
        this.p = i6;
        this.q = c8731pb;
        this.r = c9074qb;
        this.t = list3;
        this.u = i7;
        this.s = c5638gb;
        this.v = z;
    }

    public final String toString() {
        return a("");
    }

    public final String a(String str) {
        int i;
        StringBuilder a = AbstractC10761vV3.a(str);
        a.append(this.c);
        a.append("\n");
        C8985qJ1 c8985qJ1 = this.b;
        C2456Sx1 c2456Sx1 = (C2456Sx1) c8985qJ1.g.d(this.f);
        if (c2456Sx1 != null) {
            a.append("\t\tParents: ");
            a.append(c2456Sx1.c);
            for (C2456Sx1 c2456Sx12 = (C2456Sx1) c8985qJ1.g.d(c2456Sx1.f); c2456Sx12 != null; c2456Sx12 = (C2456Sx1) c8985qJ1.g.d(c2456Sx12.f)) {
                a.append("->");
                a.append(c2456Sx12.c);
            }
            a.append(str);
            a.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            a.append(str);
            a.append("\tMasks: ");
            a.append(list.size());
            a.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            a.append(str);
            a.append("\tBackground: ");
            a.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            a.append(str);
            a.append("\tShapes:\n");
            for (Object obj : list2) {
                a.append(str);
                a.append("\t\t");
                a.append(obj);
                a.append("\n");
            }
        }
        return a.toString();
    }
}
