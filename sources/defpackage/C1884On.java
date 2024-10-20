package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: On, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884On {
    public final int a;
    public final String b;

    public C1884On(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        return "AppFlowMetadata{id=" + this.a + ", name=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1884On)) {
            return false;
        }
        C1884On c1884On = (C1884On) obj;
        return this.a == c1884On.a && this.b.equals(c1884On.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
