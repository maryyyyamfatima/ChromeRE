package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.mojo.system.impl.CoreImpl;
import org.chromium.mojo.system.impl.WatcherImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC9644sE0 implements Executor, Qj4 {
    public final InterfaceC11102wV1 a;
    public final InterfaceC11102wV1 g;
    public final ArrayList h;
    public final Object i;
    public final WatcherImpl j;

    public ExecutorC9644sE0(InterfaceC7559m90 interfaceC7559m90) {
        CoreImpl coreImpl = (CoreImpl) interfaceC7559m90;
        coreImpl.getClass();
        WatcherImpl watcherImpl = new WatcherImpl();
        this.j = watcherImpl;
        this.i = new Object();
        C8433oi2 b = coreImpl.b(new C9730sV1());
        InterfaceC11102wV1 interfaceC11102wV1 = (InterfaceC11102wV1) b.a;
        this.g = interfaceC11102wV1;
        this.a = (InterfaceC11102wV1) b.b;
        this.h = new ArrayList();
        watcherImpl.a(interfaceC11102wV1, C7215l90.c, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.Qj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L27
            r6 = 0
            wV1 r0 = r5.g     // Catch: defpackage.HY1 -> L11
            tV1 r1 = defpackage.C10073tV1.c     // Catch: defpackage.HY1 -> L11
            org.chromium.mojo.system.ResultAnd r0 = r0.z()     // Catch: defpackage.HY1 -> L11
            int r0 = r0.a     // Catch: defpackage.HY1 -> L11
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r6
        L12:
            if (r0 == 0) goto L27
            java.lang.Object r0 = r5.i
            monitor-enter(r0)
            java.util.ArrayList r1 = r5.h     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r1.remove(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r6.run()
            goto L59
        L24:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
        L27:
            java.lang.Object r6 = r5.i
            monitor-enter(r6)
            wV1 r0 = r5.a     // Catch: java.lang.Throwable -> L5a
            r0.close()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = r5.h     // Catch: java.lang.Throwable -> L5a
            r0.clear()     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            org.chromium.mojo.system.impl.WatcherImpl r6 = r5.j
            long r0 = r6.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L40
            goto L46
        L40:
            r4 = 0
            r6.b = r4
            J.N.MPTT407x(r6, r0)
        L46:
            org.chromium.mojo.system.impl.WatcherImpl r6 = r5.j
            long r0 = r6.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            goto L54
        L4f:
            J.N.Mi32vqDA(r6, r0)
            r6.a = r2
        L54:
            wV1 r6 = r5.g
            r6.close()
        L59:
            return
        L5a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExecutorC9644sE0.a(int):void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.i) {
            if (!this.a.isValid()) {
                throw new IllegalStateException("Trying to execute an action on a closed executor.");
            }
            this.h.add(runnable);
            InterfaceC11102wV1 interfaceC11102wV1 = this.a;
            ThreadLocal threadLocal = AbstractC9987tE0.a;
            C10759vV1 c10759vV1 = C10759vV1.c;
            interfaceC11102wV1.p(null, null);
        }
    }
}
