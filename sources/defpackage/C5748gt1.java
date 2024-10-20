package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5748gt1 {
    public final C10067tU0 a;
    public HandlerThread c;
    public Handler d;
    public final RunnableC5404ft1 b = new RunnableC5404ft1(this);
    public final AtomicBoolean e = new AtomicBoolean(false);

    public C5748gt1(C10067tU0 c10067tU0) {
        this.a = c10067tU0;
    }

    public final void c(int i) {
        TraceEvent.j(i + 84186319646187624L, "JankCUJ:".concat(AbstractC4716dt1.a(i)));
        b().post(new RunnableC5060et1(this.a, i, true));
    }

    public final void a(int i) {
        TraceEvent.e(i + 84186319646187624L, "JankCUJ:".concat(AbstractC4716dt1.a(i)));
        b().post(new RunnableC5060et1(this.a, i, false));
    }

    public final Handler b() {
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread("Jank-Tracker");
            this.c = handlerThread;
            handlerThread.start();
            this.d = new Handler(this.c.getLooper());
        }
        return this.d;
    }
}
