package defpackage;

import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2235Rf0 extends AbstractC11884ym0 {
    public final List a;
    public final List b;
    public final C6206iD0 c;
    public final C6206iD0 d;

    public C2235Rf0(C3390a13 c3390a13, List list, List list2) {
        int i = C2105Qf0.w;
        this.c = c3390a13.q() == null ? null : ((C2105Qf0) c3390a13.q()).u;
        this.d = c3390a13.q() != null ? ((C2105Qf0) c3390a13.q()).t : null;
        this.a = list;
        this.b = list2;
    }

    public final int e() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final int d() {
        List list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.AbstractC11884ym0
    public final boolean b(int i, int i2) {
        return c(this.a.get(i), this.b.get(i2));
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        C6206iD0 c6206iD0 = this.c;
        if (c6206iD0 != null) {
            int i = C2105Qf0.w;
            C0923Hc2 c0923Hc2 = new C0923Hc2();
            c0923Hc2.a = obj;
            c0923Hc2.b = obj2;
            return ((Boolean) c6206iD0.a.b().c(c6206iD0, c0923Hc2)).booleanValue();
        }
        return obj.equals(obj2);
    }

    @Override // defpackage.AbstractC11884ym0
    public final boolean a(int i, int i2) {
        Object obj = this.a.get(i);
        Object obj2 = this.b.get(i2);
        if (obj == obj2) {
            return true;
        }
        C6206iD0 c6206iD0 = this.d;
        if (c6206iD0 != null) {
            int i3 = C2105Qf0.w;
            C0793Gc2 c0793Gc2 = new C0793Gc2();
            c0793Gc2.a = obj;
            c0793Gc2.b = obj2;
            return ((Boolean) c6206iD0.a.b().c(c6206iD0, c0793Gc2)).booleanValue();
        }
        return obj.equals(obj2);
    }
}
