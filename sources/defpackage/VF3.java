package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VF3 {
    public static final long a = AbstractC1014Hu3.a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
    public static final int b;
    public static final int c;
    public static final long d;
    public static final L02 e;
    public static final C7249lF3 f;
    public static final C7249lF3 g;

    static {
        int i = AbstractC1144Iu3.a;
        if (i < 2) {
            i = 2;
        }
        b = AbstractC1014Hu3.b("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
        c = AbstractC1014Hu3.b("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        d = TimeUnit.SECONDS.toNanos(AbstractC1014Hu3.a("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        e = L02.a;
        f = new C7249lF3(0);
        g = new C7249lF3(1);
    }
}
