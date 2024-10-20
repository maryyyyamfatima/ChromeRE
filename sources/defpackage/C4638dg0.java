package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4638dg0 {
    public final int a;
    public final int b;

    public C4638dg0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int hashCode() {
        return ((this.b + 31) * 31) + this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || C4638dg0.class != obj.getClass()) {
            return false;
        }
        C4638dg0 c4638dg0 = (C4638dg0) obj;
        return this.b == c4638dg0.b && this.a == c4638dg0.a;
    }
}
