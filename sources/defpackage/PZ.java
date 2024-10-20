package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PZ {
    public final Object a;
    public final InterfaceC7670mV0 b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PZ)) {
            return false;
        }
        PZ pz = (PZ) obj;
        return AbstractC0087Ar1.a(this.a, pz.a) && AbstractC0087Ar1.a(this.b, pz.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }

    public PZ(Object obj, InterfaceC7670mV0 interfaceC7670mV0) {
        this.a = obj;
        this.b = interfaceC7670mV0;
    }
}
