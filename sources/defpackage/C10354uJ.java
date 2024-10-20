package defpackage;

import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uJ */
/* loaded from: classes.dex */
public final class C10354uJ extends AbstractC11726yJ {
    public final C11383xJ k;
    public final C11383xJ l;

    @Override // defpackage.AbstractC11726yJ
    public final int e() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // defpackage.AbstractC11726yJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.VJ c(android.content.Context r6, android.os.Bundle r7, defpackage.C10011tJ r8) {
        /*
            r5 = this;
            xJ r0 = r5.k
            VJ r1 = r0.f(r6, r7)
            r2 = 0
            if (r1 != 0) goto La
            goto L24
        La:
            boolean r3 = r0.i
            java.lang.String r4 = "ChildProcessConnection.tryStart"
            org.chromium.base.TraceEvent.b(r4, r2)     // Catch: java.lang.Throwable -> L35
            boolean r3 = r1.b(r3)     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L1c
            org.chromium.base.TraceEvent.c(r4)
            r3 = 0
            goto L22
        L1c:
            r1.g = r8     // Catch: java.lang.Throwable -> L35
            org.chromium.base.TraceEvent.c(r4)
            r3 = 1
        L22:
            if (r3 != 0) goto L26
        L24:
            r1 = r2
            goto L2b
        L26:
            fk r0 = r0.l
            r0.add(r1)
        L2b:
            if (r1 == 0) goto L2e
            return r1
        L2e:
            xJ r0 = r5.l
            VJ r6 = r0.c(r6, r7, r8)
            return r6
        L35:
            r6 = move-exception
            org.chromium.base.TraceEvent.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10354uJ.c(android.content.Context, android.os.Bundle, tJ):VJ");
    }

    @Override // defpackage.AbstractC11726yJ
    public final void d(VJ vj) {
        C11383xJ c11383xJ = this.k;
        if (c11383xJ.l.contains(vj)) {
            c11383xJ.d(vj);
            return;
        }
        C11383xJ c11383xJ2 = this.l;
        if (c11383xJ2.l.contains(vj)) {
            c11383xJ2.d(vj);
        }
    }

    public C10354uJ(Handler handler, RunnableC6240iK runnableC6240iK, String str) {
        super(handler, runnableC6240iK, str, "org.chromium.content.app.SandboxedProcessService", null, false);
        this.k = new C11383xJ(handler, runnableC6240iK, str, "org.chromium.content.app.SandboxedProcessService0", null);
        this.l = new C11383xJ(handler, runnableC6240iK, str, "org.chromium.content.app.SandboxedProcessService1", null);
    }
}
