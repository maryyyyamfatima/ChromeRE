package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3839bL implements ZK {
    public static C3839bL c = new C3839bL();
    public final Handler a;
    public Choreographer b;

    public static ZK a() {
        if (c == null) {
            c = new C3839bL();
        }
        return c;
    }

    public C3839bL() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.b = Choreographer.getInstance();
            this.a = null;
        } else {
            Handler handler = new Handler(Looper.getMainLooper());
            this.a = handler;
            handler.post(new RunnableC3495aL(this));
        }
    }

    public final void b(YK yk) {
        yk.c.set(null);
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            if (yk.b == null) {
                yk.b = new WK(yk);
            }
            choreographer.postFrameCallback(yk.b);
        } else {
            Handler handler = this.a;
            if (yk.a == null) {
                yk.a = new XK(yk);
            }
            handler.postDelayed(yk.a, 0L);
        }
    }
}
