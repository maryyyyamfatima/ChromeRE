package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ms0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1650Ms0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final int hashCode() {
        return (((((((this.a * 31 * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1650Ms0)) {
            return false;
        }
        C1650Ms0 c1650Ms0 = (C1650Ms0) obj;
        return this.a == c1650Ms0.a && this.b == c1650Ms0.b && this.c == c1650Ms0.c && this.d == c1650Ms0.d && this.e == c1650Ms0.e;
    }
}
