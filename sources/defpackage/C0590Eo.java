package defpackage;

import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590Eo {
    public final long a;
    public final long b;
    public final Set c;

    public C0590Eo(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + String.valueOf(this.c) + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0590Eo)) {
            return false;
        }
        C0590Eo c0590Eo = (C0590Eo) obj;
        return this.a == c0590Eo.a && this.b == c0590Eo.b && this.c.equals(c0590Eo.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }
}
