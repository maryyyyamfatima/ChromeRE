package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Jf4 {
    public static final /* synthetic */ int a = 0;

    public static void a(int i, C7580mD0 c7580mD0, H74 h74, VT vt, C1485Ll c1485Ll, boolean z) {
        int i2 = h74.c;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql = (C2134Ql) c1485Ll.g;
        c2134Ql.k |= 4;
        c2134Ql.p = i2;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql2 = (C2134Ql) c1485Ll.g;
        c2134Ql2.k |= 8;
        c2134Ql2.q = h74.d;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql3 = (C2134Ql) c1485Ll.g;
        c2134Ql3.k |= 32;
        c2134Ql3.s = h74.a;
        if (c1485Ll.h) {
            c1485Ll.l();
            c1485Ll.h = false;
        }
        C2134Ql c2134Ql4 = (C2134Ql) c1485Ll.g;
        c2134Ql4.k |= 16;
        c2134Ql4.r = h74.b;
        if (z) {
            if (i != -1) {
                if ((vt.j & 2048) != 0) {
                    JX0 jx0 = (JX0) vt.l(PX0.NEW_BUILDER);
                    jx0.m(vt);
                    UT ut = (UT) jx0;
                    if (ut.h) {
                        ut.l();
                        ut.h = false;
                    }
                    VT vt2 = (VT) ut.g;
                    vt2.s = null;
                    vt2.j &= -2049;
                    if (c1485Ll.h) {
                        c1485Ll.l();
                        c1485Ll.h = false;
                    }
                    C2134Ql.w((C2134Ql) c1485Ll.g, (VT) ut.j());
                }
            }
            if (c1485Ll.h) {
                c1485Ll.l();
                c1485Ll.h = false;
            }
            C2134Ql.w((C2134Ql) c1485Ll.g, vt);
        } else {
            int i3 = vt.k;
            if (c1485Ll.h) {
                c1485Ll.l();
                c1485Ll.h = false;
            }
            C2134Ql c2134Ql5 = (C2134Ql) c1485Ll.g;
            c2134Ql5.l = 10;
            c2134Ql5.m = Integer.valueOf(i3);
        }
        if (i != -1) {
            if (c1485Ll.h) {
                c1485Ll.l();
                c1485Ll.h = false;
            }
            C2134Ql c2134Ql6 = (C2134Ql) c1485Ll.g;
            c2134Ql6.k |= 8192;
            c2134Ql6.x = i;
        }
        c7580mD0.f((C2134Ql) c1485Ll.j());
    }
}
