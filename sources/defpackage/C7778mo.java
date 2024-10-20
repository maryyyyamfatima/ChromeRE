package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7778mo {
    public final int a;
    public final int b;

    public C7778mo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return "HapticFeedback{hapticFeedbackConstant=" + this.a + ", versionCode=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7778mo)) {
            return false;
        }
        C7778mo c7778mo = (C7778mo) obj;
        return this.a == c7778mo.a && this.b == c7778mo.b;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
