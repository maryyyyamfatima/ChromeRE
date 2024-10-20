package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2144Qn {
    public final int a;
    public final long b;

    public C2144Qn(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final String toString() {
        return "BackendResponse{status=" + AbstractC0480Ds.a(this.a) + ", nextRequestWaitMillis=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2144Qn)) {
            return false;
        }
        C2144Qn c2144Qn = (C2144Qn) obj;
        return AbstractC2373Sg3.a(this.a, c2144Qn.a) && this.b == c2144Qn.b;
    }

    public final int hashCode() {
        int b = (AbstractC2373Sg3.b(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return b ^ ((int) (j ^ (j >>> 32)));
    }
}
