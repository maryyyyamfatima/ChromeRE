package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: So */
/* loaded from: classes.dex */
public final class C2409So {
    public final long a;
    public final C8908q5 b;
    public final CS c;

    public C2409So(long j, C8908q5 c8908q5, CS cs) {
        this.a = j;
        this.b = c8908q5;
        this.c = cs;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("ViewActionData{durationMs=");
        sb.append(this.a);
        sb.append(", payload=");
        sb.append(valueOf);
        return AbstractC10204ts.a(sb, ", loggingParameters=", valueOf2, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2409So)) {
            return false;
        }
        C2409So c2409So = (C2409So) obj;
        return this.a == c2409So.a && this.b.equals(c2409So.b) && this.c.equals(c2409So.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003;
        C8908q5 c8908q5 = this.b;
        int i2 = c8908q5.a;
        if (i2 == 0) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            i2 = c7931nE2.b(C8908q5.class).j(c8908q5);
            c8908q5.a = i2;
        }
        return ((i ^ i2) * 1000003) ^ this.c.hashCode();
    }
}
