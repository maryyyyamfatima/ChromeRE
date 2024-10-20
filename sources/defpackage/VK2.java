package defpackage;

import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class VK2 {
    public TK2 b;
    public UK2 c;
    public long e;
    public long a = -1;
    public int d = -2;

    public static boolean a() {
        return C4845eG0.b.b();
    }

    public final void c(int i, boolean z, boolean z2, long j, int i2, boolean z3, boolean z4) {
        int i3;
        this.e = j;
        if (a()) {
            boolean z5 = z || (z4 && !z2);
            UK2 uk2 = this.c;
            if (uk2 != null && z5) {
                uk2.c = false;
            } else {
                int i4 = i & 255;
                boolean z6 = ((i & 134217728) != 0) && this.b != null;
                boolean z7 = i4 == 8;
                boolean z8 = i4 == 1;
                boolean z9 = i4 == 7;
                if (!z6) {
                    this.b = null;
                }
                this.c = new UK2(this, !z3, new SK2(z4, z2, z7, z8, z9, z6));
                this.d = i2;
            }
            if ((i & 16777216) != 0) {
                this.c.g = true;
                return;
            }
            return;
        }
        long j2 = this.a;
        this.a = SystemClock.elapsedRealtime();
        int i5 = i & 255;
        UK2 uk22 = this.c;
        boolean z10 = uk22 == null;
        boolean z11 = (134217728 & i) != 0;
        if (!z && ((i & 16777216) != 0 || ((i5 != 0 && i5 != 7) || j2 == -1 || z11 || j > j2))) {
            z10 = true;
        }
        if (!z10) {
            uk22.c = false;
            return;
        }
        if (!z11 || this.b == null) {
            this.b = null;
            i3 = i5 == 1 ? 2 : (i5 == 8 || (i & 16777216) != 0) ? 4 : (i5 != 0 || z2) ? 5 : 3;
        } else {
            i3 = 1;
        }
        this.c = new UK2(this, i3, !z3);
        this.d = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:            if (r5.c.a == 3) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:            if (r0.b == false) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            boolean r0 = a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            UK2 r0 = r5.c
            SK2 r0 = r0.h
            boolean r3 = r0.a
            if (r3 == 0) goto L15
            boolean r0 = r0.b
            if (r0 != 0) goto L15
            goto L1e
        L15:
            r1 = r2
            goto L1e
        L17:
            UK2 r0 = r5.c
            int r0 = r0.a
            r3 = 3
            if (r0 != r3) goto L15
        L1e:
            if (r1 != 0) goto L21
            return
        L21:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.e
            long r0 = r0 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "External navigation blocked due to missing gesture. Last input was "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "ms ago."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "RedirectHandler"
            defpackage.AbstractC4851eH1.f(r4, r3, r2)
            java.lang.String r2 = "Android.Intent.BlockedExternalNavLastGestureTime"
            defpackage.EI2.n(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VK2.b():void");
    }
}
