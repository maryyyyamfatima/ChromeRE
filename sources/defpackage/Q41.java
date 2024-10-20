package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q41 {
    public final int a;
    public final int b;

    public Q41(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q41.class != obj.getClass()) {
            return false;
        }
        Q41 q41 = (Q41) obj;
        return this.b == q41.b && this.a == q41.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(", ");
        return AbstractC8207o22.a(sb, this.b, "]");
    }
}
