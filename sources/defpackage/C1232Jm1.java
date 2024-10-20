package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232Jm1 {
    public static final C1232Jm1 c;
    public final UUID a;
    public final AtomicLong b;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            c = new C1232Jm1(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public C1232Jm1(UUID uuid, long j) {
        this.a = uuid;
        this.b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            j2 = (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
        } while (!atomicLong.compareAndSet(j, (((((j * 25214903917L) + 11) & 281474976710655L) * 25214903917L) + 11) & 281474976710655L));
        return j2;
    }

    public final UUID b() {
        long a = a() & (-61441);
        long a2 = a() >>> 2;
        UUID uuid = this.a;
        return new UUID(a ^ uuid.getMostSignificantBits(), a2 ^ uuid.getLeastSignificantBits());
    }
}
