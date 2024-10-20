package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J13 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public J13(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J13)) {
            return false;
        }
        J13 j13 = (J13) obj;
        return j13.a == this.a && j13.b.equals(this.b) && j13.c == this.c;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return String.format("State(%b, %s, %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }
}
