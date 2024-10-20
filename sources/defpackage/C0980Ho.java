package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ho, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980Ho {
    public final String a;
    public final int b;

    public C0980Ho(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        return "LegacyFontKey{fontName=" + this.a + ", weightAdjustment=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0980Ho)) {
            return false;
        }
        C0980Ho c0980Ho = (C0980Ho) obj;
        return this.a.equals(c0980Ho.a) && this.b == c0980Ho.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
