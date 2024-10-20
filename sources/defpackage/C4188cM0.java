package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4188cM0 {
    public final String a;
    public final Class b;

    public static C4188cM0 a(String str) {
        return new C4188cM0(Integer.class, str);
    }

    public C4188cM0(Class cls, String str) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4188cM0)) {
            return false;
        }
        C4188cM0 c4188cM0 = (C4188cM0) obj;
        return this.b == c4188cM0.b && this.a.equals(c4188cM0.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
