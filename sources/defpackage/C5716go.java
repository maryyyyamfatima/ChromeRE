package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5716go {
    public static final C5716go f;
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C5716go(long j, int i, int i2, long j2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.a + ", loadBatchSize=" + this.b + ", criticalSectionEnterTimeoutMs=" + this.c + ", eventCleanUpAge=" + this.d + ", maxBlobByteSizePerRow=" + this.e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5716go)) {
            return false;
        }
        C5716go c5716go = (C5716go) obj;
        return this.a == c5716go.a && this.b == c5716go.b && this.c == c5716go.c && this.d == c5716go.d && this.e == c5716go.e;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    static {
        byte b = (byte) (((byte) (((byte) (((byte) (((byte) 1) | 2)) | 4)) | 8)) | 16);
        if (b == 31) {
            f = new C5716go(10485760L, 200, 10000, 604800000L, 81920);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" maxStorageSizeInBytes");
        }
        if ((b & 2) == 0) {
            sb.append(" loadBatchSize");
        }
        if ((b & 4) == 0) {
            sb.append(" criticalSectionEnterTimeoutMs");
        }
        if ((b & 8) == 0) {
            sb.append(" eventCleanUpAge");
        }
        if ((b & 16) == 0) {
            sb.append(" maxBlobByteSizePerRow");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
