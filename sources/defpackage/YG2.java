package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YG2 {
    public int a;
    public int b;

    public YG2(int i, int i2) {
        this.a = Math.min(i, i2);
        this.b = Math.max(i, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YG2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        YG2 yg2 = (YG2) obj;
        return this.a == yg2.a && this.b == yg2.b;
    }

    public final int hashCode() {
        return (this.b * 31) + (this.a * 11);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.a);
        sb.append(", ");
        return AbstractC8207o22.a(sb, this.b, " ]");
    }
}
