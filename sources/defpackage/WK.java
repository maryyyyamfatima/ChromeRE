package defpackage;

import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WK implements Choreographer.FrameCallback {
    public final /* synthetic */ YK a;

    public WK(YK yk) {
        this.a = yk;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        YK yk = this.a;
        yk.c.getAndSet(null);
        try {
            yk.a(j);
        } finally {
        }
    }
}
