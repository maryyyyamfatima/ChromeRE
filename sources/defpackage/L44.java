package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class L44 {
    public static InterfaceC3486aJ0 a(AbstractC9053qX abstractC9053qX) {
        Map b;
        try {
            return (InterfaceC3486aJ0) ((AbstractC2442Su2.a("FeedActions") || (b = b(abstractC9053qX)) == null) ? null : b.get("FeedActions"));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static InterfaceC2548Tp3 c(AbstractC9053qX abstractC9053qX) {
        Map b;
        try {
            return (InterfaceC2548Tp3) ((AbstractC2442Su2.a("GeneralActions") || (b = b(abstractC9053qX)) == null) ? null : b.get("GeneralActions"));
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map b(defpackage.AbstractC9053qX r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L5
        L3:
            r1 = r0
            goto L13
        L5:
            Wn r1 = (defpackage.C2924Wn) r1
            bo r1 = r1.h
            if (r1 != 0) goto Lc
            goto L3
        Lc:
            java.lang.Object r1 = r1.f
            if (r1 != 0) goto L11
            goto L3
        L11:
            gs4 r1 = (defpackage.C5745gs4) r1     // Catch: java.lang.ClassCastException -> L3
        L13:
            if (r1 != 0) goto L16
            return r0
        L16:
            java.lang.Object r1 = r1.c     // Catch: java.lang.ClassCastException -> L1b
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.ClassCastException -> L1b
            return r1
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L44.b(qX):java.util.Map");
    }
}
