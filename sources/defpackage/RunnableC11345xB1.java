package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xB1 */
/* loaded from: classes.dex */
public final class RunnableC11345xB1 extends L90 implements Runnable, InterfaceC5355fl0 {
    public final L90 h;
    public final int i;
    public final XG1 j;
    public final Object k;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC11345xB1(B14 b14, int i) {
        this.h = b14;
        this.i = i;
        if ((b14 instanceof InterfaceC5355fl0 ? (InterfaceC5355fl0) b14 : null) == null) {
            int i2 = AbstractC0176Bj0.a;
        }
        this.j = new XG1();
        this.k = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:            r0 = r3.k;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:            monitor-enter(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:            r3.runningWorkers--;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:            if (r3.j.c() != 0) goto L173;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:            r3.runningWorkers++;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:            monitor-exit(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:            return;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            XG1 r1 = r3.j
            java.lang.Object r1 = r1.d()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            lA0 r2 = defpackage.C7221lA0.a
            defpackage.O90.a(r2, r1)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            L90 r1 = r3.h
            boolean r1 = r1.C()
            if (r1 == 0) goto L1
            L90 r0 = r3.h
            r0.y(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.k
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L44
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L44
            XG1 r1 = r3.j     // Catch: java.lang.Throwable -> L44
            int r1 = r1.c()     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L44
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            goto L0
        L44:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC11345xB1.run():void");
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        this.j.a(runnable);
        boolean z = true;
        if (this.runningWorkers >= this.i) {
            return;
        }
        synchronized (this.k) {
            if (this.runningWorkers >= this.i) {
                z = false;
            } else {
                this.runningWorkers++;
            }
        }
        if (z) {
            this.h.y(this, this);
        }
    }
}
