package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7434lo {
    public final String a;
    public final String b;

    public C7434lo(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null value");
        }
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag{tag=");
        sb.append(this.a);
        sb.append(", value=");
        return Y5.a(sb, this.b, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7434lo)) {
            return false;
        }
        C7434lo c7434lo = (C7434lo) obj;
        return this.a.equals(c7434lo.a) && this.b.equals(c7434lo.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
