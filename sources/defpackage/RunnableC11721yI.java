package defpackage;

import android.util.Pair;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11721yI implements Runnable {
    public final /* synthetic */ C12064zI a;

    public RunnableC11721yI(C12064zI c12064zI) {
        this.a = c12064zI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b) {
            return;
        }
        Pair pair = (Pair) this.a.a.pop();
        TraceEvent i = TraceEvent.i("ChainedTask.run: ".concat(((Runnable) pair.second).getClass().getName()), null);
        try {
            ((Runnable) pair.second).run();
            if (i != null) {
                i.close();
            }
            if (this.a.a.isEmpty()) {
                return;
            }
            PostTask.c((QF3) ((Pair) this.a.a.peek()).first, this);
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
