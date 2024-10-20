package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GK3 implements Runnable {
    public final Throwable a;

    public abstract void a(GK3 gk3);

    public GK3(boolean z) {
        if (z) {
            Thread currentThread = Thread.currentThread();
            this.a = new Throwable("Runnable instantiated on thread id: " + currentThread.getId() + ", name: " + currentThread.getName());
            return;
        }
        this.a = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GK3() {
        this(false);
        boolean z = B10.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GK3(defpackage.GK3 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            java.lang.Throwable r1 = r3.a
            if (r1 == 0) goto Lb
            r0 = 1
            goto Lb
        L9:
            boolean r1 = defpackage.B10.a
        Lb:
            r2.<init>(r0)
            java.lang.Throwable r0 = r2.a
            if (r0 == 0) goto L19
            if (r3 == 0) goto L19
            java.lang.Throwable r3 = r3.a
            r0.initCause(r3)
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.GK3.<init>(GK3):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a(this);
        } catch (Throwable th) {
            Throwable th2 = this.a;
            if (th2 != null) {
                Log.w("LithoThreadTracing", "--- start debug trace");
                Log.w("LithoThreadTracing", "Thread tracing stacktrace", th2);
                Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }
}
