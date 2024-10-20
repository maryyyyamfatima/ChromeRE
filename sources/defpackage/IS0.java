package defpackage;

import android.app.Activity;
import android.view.Choreographer;
import android.view.WindowManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class IS0 implements Choreographer.FrameCallback {
    public final AW0 a;
    public final C12125zU0 i;
    public final Choreographer g = Choreographer.getInstance();
    public boolean h = false;
    public volatile boolean j = false;
    public volatile boolean k = false;

    public IS0(Activity activity, AW0 aw0) {
        this.a = aw0;
        float refreshRate = ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRefreshRate();
        AbstractC4508dH1.c("WindowManager's reported refresh rate is " + refreshRate + "Hz");
        if (refreshRate < 10.0f) {
            AbstractC4508dH1.c("I don't believe that, so I'm going with 60.0Hz");
            refreshRate = 60.0f;
        }
        this.i = new C12125zU0(refreshRate);
        a();
    }

    public final void a() {
        if (this.j) {
            return;
        }
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                this.g.postFrameCallback(this);
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        synchronized (this) {
            this.h = false;
        }
        C12125zU0 c12125zU0 = this.i;
        boolean z = this.k;
        ReentrantReadWriteLock reentrantReadWriteLock = c12125zU0.b;
        reentrantReadWriteLock.writeLock().lock();
        try {
            c12125zU0.f++;
            if (c12125zU0.a() != 0) {
                long j2 = c12125zU0.e;
                int a = c12125zU0.a();
                if (j < j2 + (a > 0 ? 1000000000 / a : 0L) && c12125zU0.f < c12125zU0.d) {
                    z = false;
                }
                z = true;
            }
            if (z) {
                c12125zU0.e = j;
                c12125zU0.f = 0;
            }
            if (z) {
                this.a.e();
            }
            if (this.i.a() > 0 || this.k) {
                a();
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
