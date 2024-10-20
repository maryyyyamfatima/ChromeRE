package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850Go {
    public final String a;
    public final int b;
    public final boolean c;

    public C0850Go(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final String toString() {
        return "FontKey{fontName=" + this.a + ", weight=" + this.b + ", italic=" + this.c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0850Go)) {
            return false;
        }
        C0850Go c0850Go = (C0850Go) obj;
        return this.a.equals(c0850Go.a) && this.b == c0850Go.b && this.c == c0850Go.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237);
    }
}
