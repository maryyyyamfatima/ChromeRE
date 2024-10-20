package defpackage;

import android.transition.Transition;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kk0 */
/* loaded from: classes.dex */
public final class C1351Kk0 extends AbstractC1221Jk0 {
    public final Object c;
    public final boolean d;
    public final Object e;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:            if (r5 == androidx.fragment.app.c.a0) goto L198;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:            if (r5 == androidx.fragment.app.c.a0) goto L184;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1351Kk0(defpackage.C1983Pg3 r4, defpackage.QF r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            int r5 = r4.a
            r0 = 2
            r1 = 1
            r2 = 0
            androidx.fragment.app.c r4 = r4.c
            if (r5 != r0) goto L2a
            if (r6 == 0) goto L1a
            NS0 r5 = r4.O
            if (r5 != 0) goto L13
            goto L1d
        L13:
            java.lang.Object r5 = r5.j
            java.lang.Object r0 = androidx.fragment.app.c.a0
            if (r5 != r0) goto L1e
            goto L1d
        L1a:
            r4.getClass()
        L1d:
            r5 = r2
        L1e:
            r3.c = r5
            if (r6 == 0) goto L25
            NS0 r5 = r4.O
            goto L27
        L25:
            NS0 r5 = r4.O
        L27:
            r3.d = r1
            goto L40
        L2a:
            if (r6 == 0) goto L38
            NS0 r5 = r4.O
            if (r5 != 0) goto L31
            goto L3b
        L31:
            java.lang.Object r5 = r5.i
            java.lang.Object r0 = androidx.fragment.app.c.a0
            if (r5 != r0) goto L3c
            goto L3b
        L38:
            r4.getClass()
        L3b:
            r5 = r2
        L3c:
            r3.c = r5
            r3.d = r1
        L40:
            if (r7 == 0) goto L5a
            if (r6 == 0) goto L54
            NS0 r4 = r4.O
            if (r4 != 0) goto L49
            goto L51
        L49:
            java.lang.Object r4 = r4.k
            java.lang.Object r5 = androidx.fragment.app.c.a0
            if (r4 != r5) goto L50
            goto L51
        L50:
            r2 = r4
        L51:
            r3.e = r2
            goto L5c
        L54:
            r4.getClass()
            r3.e = r2
            goto L5c
        L5a:
            r3.e = r2
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1351Kk0.<init>(Pg3, QF, boolean, boolean):void");
    }

    public final AbstractC4228cU0 c(Object obj) {
        if (obj == null) {
            return null;
        }
        C3541aU0 c3541aU0 = UT0.a;
        if (obj instanceof Transition) {
            return c3541aU0;
        }
        AbstractC4228cU0 abstractC4228cU0 = UT0.b;
        if (abstractC4228cU0 != null && abstractC4228cU0.e(obj)) {
            return abstractC4228cU0;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
    }
}
