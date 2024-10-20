package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12220zl extends FutureTask {
    public final /* synthetic */ AbstractC0185Bl a;

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        TraceEvent i = TraceEvent.i("AsyncTask.run: ".concat(this.a.a.a.getClass().getName()), null);
        try {
            super.run();
            if (i != null) {
                i.close();
            }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12220zl(AbstractC0185Bl abstractC0185Bl, CallableC11877yl callableC11877yl) {
        super(callableC11877yl);
        this.a = abstractC0185Bl;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        AbstractC0185Bl abstractC0185Bl = this.a;
        try {
            Object obj = get();
            if (abstractC0185Bl.d.get()) {
                return;
            }
            abstractC0185Bl.m(obj);
        } catch (InterruptedException e) {
            AbstractC4851eH1.f("AsyncTask", e.toString(), new Object[0]);
        } catch (CancellationException unused) {
            if (abstractC0185Bl.d.get()) {
                return;
            }
            abstractC0185Bl.m(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        }
    }
}
