package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WV2 implements Callback {
    public final /* synthetic */ AtomicInteger a;
    public final /* synthetic */ Callback g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public WV2(AtomicInteger atomicInteger, Callback callback) {
        this.a = atomicInteger;
        this.g = callback;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        if (this.a.decrementAndGet() == 0) {
            QF3 qf3 = QF3.h;
            final Callback callback = this.g;
            PostTask.c(qf3, new Runnable() { // from class: VV2
                @Override // java.lang.Runnable
                public final void run() {
                    Callback.this.onResult(null);
                }
            });
        }
    }
}
