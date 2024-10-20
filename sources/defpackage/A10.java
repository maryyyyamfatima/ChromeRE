package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class A10 {
    public static String c(WZ wz) {
        if (wz == null) {
            return null;
        }
        AtomicInteger atomicInteger = WZ.B;
        return wz.n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:            if (a(r5 - 5, (java.util.Collection) r8, (java.util.Collection) r9) == false) goto L621;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:            if (((defpackage.UY) r8).a((defpackage.UY) r9) == false) goto L621;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:            if (r8.equals(r9) == false) goto L621;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:            if (r5 == false) goto L621;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0180, code lost:            if (java.lang.Double.compare(((java.lang.Double) r8).doubleValue(), ((java.lang.Double) r9).doubleValue()) != 0) goto L621;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:            if (java.lang.Float.compare(((java.lang.Float) r8).floatValue(), ((java.lang.Float) r9).floatValue()) != 0) goto L621;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.A10.d(java.lang.Object, java.lang.Object):boolean");
    }

    public static boolean a(int i, Collection collection, Collection collection2) {
        if (i < 1) {
            throw new IllegalArgumentException("Level cannot be < 1");
        }
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null ? collection2 != null : !(collection2 != null && collection.size() == collection2.size())) {
            return false;
        }
        Iterator it = collection.iterator();
        Iterator it2 = collection2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (i == 1) {
                if (!((WZ) it.next()).a((WZ) it2.next())) {
                    return false;
                }
            } else if (!a(i - 1, (Collection) it.next(), (Collection) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static void b(C7849n00 c7849n00, UC0 uc0) {
        C6206iD0 b = c7849n00.b();
        if (b != null) {
            b.d(uc0);
        }
    }

    public static C7586mE1 e(C7849n00 c7849n00, Exception exc) {
        if (!(exc instanceof C7586mE1)) {
            return new C7586mE1(c7849n00, null, exc);
        }
        return (C7586mE1) exc;
    }
}
