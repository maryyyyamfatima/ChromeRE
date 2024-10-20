package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ct, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0355Ct {
    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 + j;
        } while (!atomicLong.compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
        return j2;
    }
}
