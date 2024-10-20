package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dm0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4674dm0 {
    public static boolean a;

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(3:5|(1:7)(2:18|(3:20|(4:23|(1:34)(3:25|26|(2:28|29)(1:30))|31|21)|35))|(4:9|10|11|12)(1:17))|36|(1:38)(1:48)|39|40|41|42|(1:44)(1:45)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0093, code lost:            r5 = 0;     */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.Runtime r11) {
        /*
            android.content.Context r0 = defpackage.V60.a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            boolean r1 = defpackage.AbstractC4674dm0.a
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = 7
            if (r1 == 0) goto L52
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 27
            if (r1 != r6) goto L52
            Q83 r1 = defpackage.O83.a
            org.chromium.base.BuildInfo r6 = defpackage.AbstractC6547jD.a
            long r6 = r6.d
            r8 = 1
            long r8 = r6 - r8
            java.lang.String r10 = "Chrome.IsolatedSplits.VersionCode"
            long r8 = r1.g(r8, r10)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L2e
            r1.s(r6, r10)
            r5 = 5
            goto L94
        L2e:
            java.lang.String[] r1 = defpackage.AbstractC2484Td.a(r0)
            if (r1 == 0) goto L52
            r6 = r3
        L35:
            int r7 = r1.length
            if (r6 >= r7) goto L52
            r7 = r1[r6]
            java.lang.String r8 = "."
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L43
            goto L4f
        L43:
            java.lang.String[] r7 = r0.splitSourceDirs     // Catch: java.io.IOException -> L94
            r7 = r7[r6]     // Catch: java.io.IOException -> L94
            boolean r7 = dalvik.system.DexFile.isDexOptNeeded(r7)     // Catch: java.io.IOException -> L94
            if (r7 == 0) goto L4f
            r5 = 6
            goto L94
        L4f:
            int r6 = r6 + 1
            goto L35
        L52:
            java.lang.String r0 = r0.sourceDir
            boolean r1 = android.os.Process.is64Bit()
            if (r1 == 0) goto L5d
            java.lang.String r1 = "arm64"
            goto L5f
        L5d:
            java.lang.String r1 = "arm"
        L5f:
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            java.lang.String r0 = r6.getName()
            r7 = 46
            int r7 = r0.lastIndexOf(r7)
            java.lang.String r0 = r0.substring(r3, r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r6 = r6.getParent()
            r7[r3] = r6
            r7[r4] = r1
            r7[r2] = r0
            java.lang.String r0 = "%s/oat/%s/%s.odex"
            java.lang.String r0 = java.lang.String.format(r0, r7)
            android.system.StructStat r0 = android.system.Os.stat(r0)     // Catch: android.system.ErrnoException -> L93
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L93
            r0 = r0 & r5
            if (r0 != 0) goto L91
            r5 = 8
            goto L94
        L91:
            r5 = r2
            goto L94
        L93:
            r5 = r3
        L94:
            if (r5 <= r2) goto Lbf
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0[r3] = r1
            java.lang.String r1 = "DexFixer"
            java.lang.String r2 = "Triggering dex compile. Reason=%d"
            defpackage.AbstractC4851eH1.f(r1, r2, r0)
            java.lang.String r0 = "/system/bin/cmd package compile -r shared "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbf
            r1.<init>()     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            android.content.Context r0 = defpackage.V60.a     // Catch: java.io.IOException -> Lbf
            java.lang.String r0 = r0.getPackageName()     // Catch: java.io.IOException -> Lbf
            r1.append(r0)     // Catch: java.io.IOException -> Lbf
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> Lbf
            r11.exec(r0)     // Catch: java.io.IOException -> Lbf
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4674dm0.a(java.lang.Runtime):void");
    }
}
