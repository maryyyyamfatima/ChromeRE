package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11628y10 {
    public final R00 a;
    public final UF0 b;

    public C11628y10(R00 r00, UF0 uf0) {
        this.a = r00;
        this.b = uf0;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11628y10)) {
            return false;
        }
        C11628y10 c11628y10 = (C11628y10) obj;
        if (RP0.l(this.a, c11628y10.a)) {
            UF0 uf0 = this.b;
            UF0 uf02 = c11628y10.b;
            if (uf0 == null && uf02 == null) {
                l = true;
            } else {
                l = (uf0 == null || uf02 == null) ? false : RP0.l(a(uf0), a(uf02));
            }
            if (l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        R00 r00 = this.a;
        int hashCode = r00 == null ? 0 : r00.hashCode();
        UF0 uf0 = this.b;
        return (uf0 != null ? uf0.hashCode() : 0) ^ hashCode;
    }

    public static TF0 a(UF0 uf0) {
        TF0 tf0 = new TF0();
        for (int i = 0; i < uf0.i(); i++) {
            uf0.h(tf0, i);
            if (tf0.j() == 224886694) {
                return tf0;
            }
        }
        return null;
    }
}
