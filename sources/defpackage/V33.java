package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V33 implements Runnable {
    public Runnable a;
    public final /* synthetic */ X33 g;

    public V33(X33 x33) {
        this.g = x33;
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
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:            r10.a = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:            r0 = java.util.logging.Level.SEVERE;        java.util.Objects.toString(r10.a);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:            throw null;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:            return;     */
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
            X33 r2 = r10.g     // Catch: java.lang.Throwable -> L62
            java.util.ArrayDeque r2 = r2.g     // Catch: java.lang.Throwable -> L62
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L62
            r3 = 1
            if (r0 != 0) goto L26
            X33 r0 = r10.g     // Catch: java.lang.Throwable -> L5f
            int r4 = r0.h     // Catch: java.lang.Throwable -> L5f
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            long r6 = r0.i     // Catch: java.lang.Throwable -> L5f
            r8 = 1
            long r6 = r6 + r8
            r0.i = r6     // Catch: java.lang.Throwable -> L5f
            r0.h = r5     // Catch: java.lang.Throwable -> L5f
            r0 = r3
        L26:
            X33 r4 = r10.g     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayDeque r4 = r4.g     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L5f
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L5f
            r10.a = r4     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L43
            X33 r0 = r10.g     // Catch: java.lang.Throwable -> L5f
            r0.h = r3     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L42
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L62
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.a     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r10.a = r2     // Catch: java.lang.Throwable -> L62
            goto L2
        L52:
            r0 = move-exception
            goto L5c
        L54:
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r0 = r10.a     // Catch: java.lang.Throwable -> L52
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L52
            throw r2     // Catch: java.lang.Throwable -> L52
        L5c:
            r10.a = r2     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L5f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            if (r1 == 0) goto L6c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L6c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.V33.a():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + W33.a(this.g.h) + "}";
    }
}
