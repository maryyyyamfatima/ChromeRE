package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4341co {
    public final long a;
    public final long b;

    public C4341co(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final String toString() {
        return "GlideModuleConfig{memoryCacheSizePercentage=" + this.a + ", bitmapPoolSizePercentage=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4341co)) {
            return false;
        }
        C4341co c4341co = (C4341co) obj;
        return this.a == c4341co.a && this.b == c4341co.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return i ^ ((int) ((j2 >>> 32) ^ j2));
    }
}
