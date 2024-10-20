package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z33 implements Runnable {
    public Runnable a;
    public final /* synthetic */ C3752b43 g;

    public Z33(C3752b43 c3752b43) {
        this.g = c3752b43;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Error e) {
            synchronized (this.g.g) {
                this.g.h = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:            r1 = r1 | java.lang.Thread.interrupted();        r2 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:            r10.a.run();     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:            r10.a = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:            throw new java.lang.RuntimeException("Exception while executing runnable " + java.lang.String.valueOf(r10.a), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            b43 r2 = r10.g     // Catch: java.lang.Throwable -> L78
            java.util.ArrayDeque r2 = r2.g     // Catch: java.lang.Throwable -> L78
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L78
            r3 = 1
            if (r0 != 0) goto L26
            b43 r0 = r10.g     // Catch: java.lang.Throwable -> L75
            int r4 = r0.h     // Catch: java.lang.Throwable -> L75
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            long r6 = r0.i     // Catch: java.lang.Throwable -> L75
            r8 = 1
            long r6 = r6 + r8
            r0.i = r6     // Catch: java.lang.Throwable -> L75
            r0.h = r5     // Catch: java.lang.Throwable -> L75
            r0 = r3
        L26:
            b43 r4 = r10.g     // Catch: java.lang.Throwable -> L75
            java.util.ArrayDeque r4 = r4.g     // Catch: java.lang.Throwable -> L75
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L75
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L75
            r10.a = r4     // Catch: java.lang.Throwable -> L75
            if (r4 != 0) goto L43
            b43 r0 = r10.g     // Catch: java.lang.Throwable -> L75
            r0.h = r3     // Catch: java.lang.Throwable -> L75
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L42
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L78
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.a     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r10.a = r2     // Catch: java.lang.Throwable -> L78
            goto L2
        L52:
            r0 = move-exception
            goto L72
        L54:
            r0 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r4 = r10.a     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r5.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L52
            r5.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L52
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L52
        L72:
            r10.a = r2     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L78
        L75:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            if (r1 == 0) goto L82
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Z33.a():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return AbstractC4199cO1.a("SequentialLithoHandler{running=", String.valueOf(runnable), "}");
        }
        return AbstractC4199cO1.a("SequentialLithoHandler{state=", AbstractC3408a43.a(this.g.h), "}");
    }
}
