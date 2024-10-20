package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2763Vg3 implements PH1 {
    public final PH1 a;
    public final Object b;

    public C2763Vg3(PH1 ph1, Object obj) {
        this.a = ph1;
        AbstractC5203fJ.a(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2763Vg3)) {
            return false;
        }
        C2763Vg3 c2763Vg3 = (C2763Vg3) obj;
        return this.a.equals(c2763Vg3.a) && this.b.equals(c2763Vg3.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return "SpecializedLogSiteKey{ delegate='" + this.a + "', qualifier='" + this.b + "' }";
    }
}
