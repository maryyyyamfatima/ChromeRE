package defpackage;

import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class DG0 implements GG0 {
    public final Runnable a;
    public final Runnable b;
    public final Handler c;

    public DG0(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    @Override // defpackage.GG0
    public final void b() {
        Runnable runnable = this.a;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.GG0
    public final void c() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.GG0
    public final void a() {
        Handler handler = this.c;
        Runnable runnable = this.a;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.b;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
    }
}
