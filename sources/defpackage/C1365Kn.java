package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365Kn {
    public final int a;
    public final String b;

    public C1365Kn(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final String toString() {
        return "AppFlowEventMetadata{id=" + this.a + ", name=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1365Kn)) {
            return false;
        }
        C1365Kn c1365Kn = (C1365Kn) obj;
        return this.a == c1365Kn.a && this.b.equals(c1365Kn.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
