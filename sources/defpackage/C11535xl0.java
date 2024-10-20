package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11535xl0 {
    public final Class a;
    public final int b;
    public final int c;

    public C11535xl0(int i, int i2, Class cls) {
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11535xl0)) {
            return false;
        }
        C11535xl0 c11535xl0 = (C11535xl0) obj;
        return this.a == c11535xl0.a && this.b == c11535xl0.b && this.c == c11535xl0.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(AbstractC9076qb1.a("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return Y5.a(sb, str, "}");
    }
}
