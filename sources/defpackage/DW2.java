package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DW2 {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c = new AtomicReference();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[LOOP:0: B:11:0x003f->B:21:0x0075, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[ORIG_RETURN, RETURN] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.DW2.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.DW2.d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L24
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 == 0) goto L38
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L38
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L38
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L38
            goto L39
        L38:
            r0 = r3
        L39:
            defpackage.DW2.a = r1
            defpackage.DW2.b = r0
            if (r1 == 0) goto L79
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.DW2.c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L4a
            goto L79
        L4a:
            OR2 r2 = new OR2
            java.lang.String r4 = "RxSchedulerPurge"
            r2.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)
        L55:
            boolean r2 = r0.compareAndSet(r1, r5)
            if (r2 == 0) goto L5d
            r0 = r3
            goto L64
        L5d:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L55
            r0 = 0
        L64:
            if (r0 == 0) goto L75
            CW2 r6 = new CW2
            r6.<init>()
            int r0 = defpackage.DW2.b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L79
        L75:
            r5.shutdownNow()
            goto L3f
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DW2.<clinit>():void");
    }
}
