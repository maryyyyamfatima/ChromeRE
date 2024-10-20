package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: d42, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4438d42 {
    public static final byte[][] b = {new byte[]{Byte.MIN_VALUE, 115, -64, 33, -64, 87, 89, 117, 98, 105, 75, 101, 121}, new byte[]{89, 117, 98, 105, 107, 101, 121, 78, 69, 79, 114, 51}};
    public static C4438d42 c;
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C4438d42() {
        /*
            r14 = this;
            r14.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.a = r0
            java.lang.String r0 = "WebNFCBlockList"
            java.lang.String r1 = "historical_bytes_additions"
            java.lang.String r0 = J.N.MOVY9QtZ(r0, r1)
            if (r0 == 0) goto L84
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            goto L84
        L1b:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L24:
            if (r3 >= r1) goto L84
            r4 = r0[r3]
            int r5 = r4.length()
            int r6 = r5 % 2
            r7 = 1
            java.lang.String r8 = "NfcBlocklist"
            if (r6 != r7) goto L3d
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r2] = r4
            java.lang.String r4 = "Length of %s is odd"
            defpackage.AbstractC4851eH1.f(r8, r4, r5)
            goto L79
        L3d:
            int r6 = r5 / 2
            byte[] r6 = new byte[r6]
            r9 = r2
        L42:
            if (r9 >= r5) goto L7a
            char r10 = r4.charAt(r9)
            int r11 = r9 + 1
            char r11 = r4.charAt(r11)
            r12 = 16
            int r13 = java.lang.Character.digit(r10, r12)
            if (r13 < 0) goto L70
            int r13 = java.lang.Character.digit(r11, r12)
            if (r13 >= 0) goto L5d
            goto L70
        L5d:
            int r13 = r9 / 2
            int r10 = java.lang.Character.digit(r10, r12)
            int r10 = r10 << 4
            int r11 = java.lang.Character.digit(r11, r12)
            int r11 = r11 + r10
            byte r10 = (byte) r11
            r6[r13] = r10
            int r9 = r9 + 2
            goto L42
        L70:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r2] = r4
            java.lang.String r4 = "Invalid hex character found in %s"
            defpackage.AbstractC4851eH1.f(r8, r4, r5)
        L79:
            r6 = 0
        L7a:
            if (r6 == 0) goto L81
            java.util.ArrayList r4 = r14.a
            r4.add(r6)
        L81:
            int r3 = r3 + 1
            goto L24
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4438d42.<init>():void");
    }
}
