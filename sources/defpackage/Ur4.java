package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Ur4 {
    public static final Sr4 a(Sr4 sr4, U80 u80) {
        Object a;
        if (u80 == null) {
            return sr4;
        }
        C7950nI1 c7950nI1 = null;
        StringBuilder sb = ((C3184Yn) u80).l;
        String sb2 = sb != null ? sb.toString() : null;
        C7262lI1 b = u80.b();
        if (b != null && (c7950nI1 = b.k) == null) {
            c7950nI1 = C7950nI1.n;
        }
        JX0 jx0 = (JX0) sr4.l(PX0.NEW_BUILDER);
        jx0.m(sr4);
        Rr4 rr4 = (Rr4) jx0;
        if (sb2 != null) {
            if (rr4.h) {
                rr4.l();
                rr4.h = false;
            }
            Sr4 sr42 = (Sr4) rr4.g;
            sr42.getClass();
            sr42.j |= 8;
            sr42.n = sb2;
        }
        if (c7950nI1 != null) {
            OX0 ox0 = C8245o84.s;
            AbstractC0087Ar1.d(ox0, "veLoggingProperties");
            c7950nI1.v(ox0);
            C5563gM0 c5563gM0 = c7950nI1.j;
            c5563gM0.getClass();
            NX0 nx0 = ox0.d;
            nx0.getClass();
            if (c5563gM0.a.get(nx0) != null) {
                c7950nI1.v(ox0);
                Object c = c7950nI1.j.c(nx0);
                if (c == null) {
                    a = ox0.b;
                } else {
                    nx0.getClass();
                    a = ox0.a(c);
                }
                AbstractC0087Ar1.d(a, "getExtension(extension)");
                int i = ((C8245o84) a).l;
                if (rr4.h) {
                    rr4.l();
                    rr4.h = false;
                }
                Sr4 sr43 = (Sr4) rr4.g;
                sr43.j |= 16;
                sr43.o = i;
            }
        }
        QX0 j = rr4.j();
        AbstractC0087Ar1.d(j, "_builder.build()");
        return (Sr4) j;
    }
}
