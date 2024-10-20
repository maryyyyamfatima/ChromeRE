package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6746jo {
    public final AbstractC0562Ei1 a;
    public final int b;

    public C6746jo(AbstractC0562Ei1 abstractC0562Ei1, int i) {
        this.a = abstractC0562Ei1;
        this.b = i;
    }

    public final String toString() {
        return KR0.a("FlowRecordsData{records=", String.valueOf(this.a), ", status=", AbstractC3956bh.a(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6746jo)) {
            return false;
        }
        C6746jo c6746jo = (C6746jo) obj;
        return this.a.equals(c6746jo.a) && AbstractC2373Sg3.a(this.b, c6746jo.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ AbstractC2373Sg3.b(this.b);
    }
}
