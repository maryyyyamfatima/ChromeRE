package org.chromium.content_public.app;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ZygotePreload implements android.app.ZygotePreload {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void doPreload(android.content.pm.ApplicationInfo r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ZygotePreload"
            java.lang.String r1 = "Loaded Zygote. version=105.0.5195.136 minSdkVersion=23 isBundle=true"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            defpackage.AbstractC4851eH1.d(r0, r1, r3)
            r0 = 1
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L54
            long r3 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> L54
            defpackage.BK.q = r1     // Catch: java.lang.Throwable -> L54
            defpackage.BK.r = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L54
            org.chromium.base.JNIUtils.a = r1     // Catch: java.lang.Throwable -> L54
            org.chromium.base.library_loader.b r1 = org.chromium.base.library_loader.b.n     // Catch: java.lang.Throwable -> L54
            org.chromium.base.library_loader.a r3 = r1.i     // Catch: java.lang.Throwable -> L54
            org.chromium.base.library_loader.b r4 = r3.d     // Catch: java.lang.Throwable -> L54
            boolean r4 = r4.l()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L54
            r5 = 30
            if (r4 > r5) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r2
        L30:
            if (r4 != 0) goto L3e
            org.chromium.base.library_loader.b r4 = r3.d     // Catch: java.lang.Throwable -> L54
            org.chromium.base.library_loader.d r4 = r4.d()     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r4.d(r5, r2, r0)     // Catch: java.lang.Throwable -> L54
            goto L42
        L3e:
            org.chromium.base.library_loader.b r4 = r3.d     // Catch: java.lang.Throwable -> L54
            r4.b = r0     // Catch: java.lang.Throwable -> L54
        L42:
            r3.c = r0     // Catch: java.lang.Throwable -> L54
            java.lang.Object r3 = r1.j     // Catch: java.lang.Throwable -> L54
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L54
            r1.g(r8, r0)     // Catch: java.lang.Throwable -> L51
            r1.h()     // Catch: java.lang.Throwable -> L51
            r1.l = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            goto L60
        L51:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L51
            throw r8     // Catch: java.lang.Throwable -> L54
        L54:
            r8 = move-exception
            java.lang.String r1 = "ZygotePreload"
            java.lang.String r3 = "Exception in zygote"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            defpackage.AbstractC4851eH1.f(r1, r3, r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content_public.app.ZygotePreload.doPreload(android.content.pm.ApplicationInfo):void");
    }
}
