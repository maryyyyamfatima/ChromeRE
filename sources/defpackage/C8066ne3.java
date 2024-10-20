package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ne3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8066ne3 {
    public final int a;
    public final int b;

    public C8066ne3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8066ne3)) {
            return false;
        }
        C8066ne3 c8066ne3 = (C8066ne3) obj;
        return this.a == c8066ne3.a && this.b == c8066ne3.b;
    }

    public final int hashCode() {
        return ((this.a & 65535) << 16) | (65535 & this.b);
    }
}
