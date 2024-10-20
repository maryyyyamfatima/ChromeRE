package defpackage;

import java.util.ListIterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0720Fo {
    public final ListIterator a;
    public final int b;
    public final AbstractC9095qe2 c;

    public C0720Fo(ListIterator listIterator, int i, AbstractC9095qe2 abstractC9095qe2) {
        this.a = listIterator;
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.b = i;
        this.c = abstractC9095qe2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String a = AbstractC0324Cm3.a(this.b);
        return Y5.a(AbstractC10975w63.a("StoreInsertionStatus{iterator=", valueOf, ", status=", a, ", endEvent="), String.valueOf(this.c), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0720Fo)) {
            return false;
        }
        C0720Fo c0720Fo = (C0720Fo) obj;
        return this.a.equals(c0720Fo.a) && AbstractC2373Sg3.a(this.b, c0720Fo.b) && this.c.equals(c0720Fo.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ AbstractC2373Sg3.b(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
