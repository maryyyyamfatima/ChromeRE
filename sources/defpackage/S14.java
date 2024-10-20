package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class S14 {
    public static int a(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 > j4 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(java.lang.String r13) {
        /*
            int r0 = r13.length()
            if (r0 == 0) goto L5d
            int[] r0 = defpackage.R14.c
            r1 = 10
            r0 = r0[r1]
            r2 = 1
            int r0 = r0 - r2
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r4
        L13:
            int r9 = r13.length()
            if (r6 >= r9) goto L5c
            char r9 = r13.charAt(r6)
            int r9 = java.lang.Character.digit(r9, r1)
            r10 = -1
            if (r9 == r10) goto L56
            if (r6 <= r0) goto L4f
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 < 0) goto L3f
            long[] r10 = defpackage.R14.a
            r11 = r10[r1]
            int r10 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r10 >= 0) goto L33
            goto L3d
        L33:
            if (r10 <= 0) goto L36
            goto L3f
        L36:
            int[] r10 = defpackage.R14.b
            r10 = r10[r1]
            if (r9 <= r10) goto L3d
            goto L3f
        L3d:
            r10 = r3
            goto L40
        L3f:
            r10 = r2
        L40:
            if (r10 != 0) goto L43
            goto L4f
        L43:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Too large for unsigned long: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        L4f:
            long r10 = (long) r1
            long r7 = r7 * r10
            long r9 = (long) r9
            long r7 = r7 + r9
            int r6 = r6 + 1
            goto L13
        L56:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r0.<init>(r13)
            throw r0
        L5c:
            return r7
        L5d:
            java.lang.NumberFormatException r13 = new java.lang.NumberFormatException
            java.lang.String r0 = "empty string"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S14.b(java.lang.String):long");
    }

    public static String c(long j) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        char[] cArr = new char[64];
        long j2 = (j >>> 1) / 5;
        long j3 = 10;
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % j3), 10);
            j2 /= j3;
        }
        return new String(cArr, i, 64 - i);
    }
}
