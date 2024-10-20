package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11209wo {
    public final long a;
    public final C2149Qo b;
    public final C5372fo c;

    public C11209wo(long j, C2149Qo c2149Qo, C5372fo c5372fo) {
        this.a = j;
        if (c2149Qo == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = c2149Qo;
        this.c = c5372fo;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.a);
        sb.append(", transportContext=");
        sb.append(valueOf);
        return AbstractC10204ts.a(sb, ", event=", valueOf2, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11209wo)) {
            return false;
        }
        C11209wo c11209wo = (C11209wo) obj;
        return this.a == c11209wo.a && this.b.equals(c11209wo.b) && this.c.equals(c11209wo.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
