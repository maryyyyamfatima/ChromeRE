package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class PZ3 {
    public final int a;
    public final int b;

    public PZ3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PZ3.class != obj.getClass()) {
            return false;
        }
        PZ3 pz3 = (PZ3) obj;
        return this.a == pz3.a && this.b == pz3.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
