package defpackage;

import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4142cD implements InterfaceC8967qF3 {
    public static boolean b;
    public static boolean c;
    public final WeakHashMap a = new WeakHashMap();

    @Override // defpackage.InterfaceC8967qF3
    public final MF3 a(QF3 qf3) {
        return e(qf3);
    }

    @Override // defpackage.InterfaceC8967qF3
    public final N33 b(QF3 qf3) {
        return e(qf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: all -> 0x0073, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000d, B:8:0x0015, B:11:0x0017, B:15:0x003e, B:17:0x005a, B:19:0x0067, B:21:0x006b, B:22:0x0071, B:24:0x001e, B:26:0x0027, B:29:0x0037), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC11490xd3 e(defpackage.QF3 r8) {
        /*
            r7 = this;
            java.util.WeakHashMap r0 = r7.a
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r7.a     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L73
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L17
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L73
            xd3 r1 = (defpackage.InterfaceC11490xd3) r1     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return r1
        L17:
            boolean r1 = defpackage.C4142cD.c     // Catch: java.lang.Throwable -> L73
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            goto L3b
        L1e:
            QF3 r1 = defpackage.C5791h04.b     // Catch: java.lang.Throwable -> L73
            r8.getClass()     // Catch: java.lang.Throwable -> L73
            byte r1 = r8.d     // Catch: java.lang.Throwable -> L73
            if (r1 != r3) goto L33
            byte[] r1 = r8.e     // Catch: java.lang.Throwable -> L73
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L73
            h04 r4 = new h04     // Catch: java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.Throwable -> L73
            r4.a = r1     // Catch: java.lang.Throwable -> L73
            goto L34
        L33:
            r4 = r2
        L34:
            if (r4 != 0) goto L37
            goto L3b
        L37:
            int r1 = r4.a     // Catch: java.lang.Throwable -> L73
            if (r1 == r3) goto L3d
        L3b:
            r1 = 0
            goto L3e
        L3d:
            r1 = r3
        L3e:
            yd3 r4 = new yd3     // Catch: java.lang.Throwable -> L73
            android.os.Handler r5 = org.chromium.base.ThreadUtils.b()     // Catch: java.lang.Throwable -> L73
            r4.<init>(r5, r8, r1)     // Catch: java.lang.Throwable -> L73
            java.util.WeakHashMap r5 = r7.a     // Catch: java.lang.Throwable -> L73
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L73
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L73
            r5.put(r8, r6)     // Catch: java.lang.Throwable -> L73
            QF3 r5 = defpackage.C5791h04.b     // Catch: java.lang.Throwable -> L73
            r8.getClass()     // Catch: java.lang.Throwable -> L73
            byte r5 = r8.d     // Catch: java.lang.Throwable -> L73
            if (r5 != r3) goto L65
            byte[] r8 = r8.e     // Catch: java.lang.Throwable -> L73
            r8 = r8[r3]     // Catch: java.lang.Throwable -> L73
            h04 r2 = new h04     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            r2.a = r8     // Catch: java.lang.Throwable -> L73
        L65:
            if (r2 == 0) goto L71
            int r8 = r2.a     // Catch: java.lang.Throwable -> L73
            if (r8 != r3) goto L71
            java.lang.String r8 = "Android.TaskScheduling.BootstrapTaskRunnerType"
            r2 = 2
            defpackage.EI2.h(r1, r2, r8)     // Catch: java.lang.Throwable -> L73
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            return r4
        L73:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4142cD.e(QF3):xd3");
    }

    @Override // defpackage.InterfaceC8967qF3
    public final void c(QF3 qf3, Runnable runnable, long j) {
        e(qf3).a(runnable, j);
    }

    @Override // defpackage.InterfaceC8967qF3
    public final boolean d(QF3 qf3) {
        return e(qf3).c();
    }
}
