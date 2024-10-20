package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class IT2 implements Iterable {
    public ET2 a;
    public ET2 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public ET2 a(Object obj) {
        ET2 et2 = this.a;
        while (et2 != null && !et2.a.equals(obj)) {
            et2 = et2.h;
        }
        return et2;
    }

    public Object b(Object obj) {
        ET2 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((HT2) it.next()).a(a);
            }
        }
        ET2 et2 = a.i;
        if (et2 != null) {
            et2.h = a.h;
        } else {
            this.a = a.h;
        }
        ET2 et22 = a.h;
        if (et22 != null) {
            et22.i = et2;
        } else {
            this.g = et2;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        CT2 ct2 = new CT2(this.a, this.g);
        this.h.put(ct2, Boolean.FALSE);
        return ct2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:            if (r3.hasNext() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:            if (((defpackage.GT2) r7).hasNext() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:            return false;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.IT2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            IT2 r7 = (defpackage.IT2) r7
            int r1 = r6.i
            int r3 = r7.i
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            GT2 r3 = (defpackage.GT2) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            GT2 r4 = (defpackage.GT2) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            GT2 r7 = (defpackage.GT2) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IT2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            GT2 gt2 = (GT2) it;
            if (!gt2.hasNext()) {
                return i;
            }
            i += ((Map.Entry) gt2.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            GT2 gt2 = (GT2) it;
            if (gt2.hasNext()) {
                sb.append(((Map.Entry) gt2.next()).toString());
                if (gt2.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
