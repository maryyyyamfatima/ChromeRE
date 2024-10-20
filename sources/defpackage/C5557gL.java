package defpackage;

import android.os.Handler;
import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5557gL implements CN3 {
    public C4294cg0 c;
    public boolean d = false;
    public boolean e = false;
    public long f = Long.MIN_VALUE;
    public final ZK a = C3839bL.a();
    public final C5213fL b = new C5213fL(this);

    public final void a() {
        if (!this.d) {
            throw new RuntimeException("Tried to stop but wasn't running.");
        }
        this.d = false;
        C3839bL c3839bL = (C3839bL) this.a;
        c3839bL.getClass();
        C5213fL c5213fL = this.b;
        c5213fL.c.set(null);
        Choreographer choreographer = c3839bL.b;
        if (choreographer != null) {
            if (c5213fL.b == null) {
                c5213fL.b = new WK(c5213fL);
            }
            choreographer.removeFrameCallback(c5213fL.b);
        } else {
            Handler handler = c3839bL.a;
            if (c5213fL.a == null) {
                c5213fL.a = new XK(c5213fL);
            }
            handler.removeCallbacks(c5213fL.a);
        }
        this.e = false;
    }
}
