package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RJ1 {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public final LinkedHashSet a = new LinkedHashSet(1);
    public final LinkedHashSet b = new LinkedHashSet(1);
    public final Handler c = new Handler(Looper.getMainLooper());
    public volatile OJ1 d = null;

    public RJ1(Callable callable, boolean z) {
        if (z) {
            try {
                a((OJ1) callable.call());
                return;
            } catch (Throwable th) {
                a(new OJ1(th));
                return;
            }
        }
        e.execute(new QJ1(this, callable));
    }

    public final void a(OJ1 oj1) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = oj1;
        this.c.post(new PJ1(this));
    }
}
