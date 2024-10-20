package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xD2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11356xD2 {
    public final YV3 a;
    public final InterfaceC1045Ib b;

    public C11356xD2(YV3 yv3, InterfaceC1045Ib interfaceC1045Ib) {
        this.a = yv3;
        this.b = interfaceC1045Ib;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11356xD2.class != obj.getClass()) {
            return false;
        }
        C11356xD2 c11356xD2 = (C11356xD2) obj;
        return this.a.equals(c11356xD2.a) && this.b.equals(c11356xD2.b);
    }

    public final String toString() {
        return KR0.a("PropertyHandle{ mTransitionId='", String.valueOf(this.a), "', mProperty=", String.valueOf(this.b), "}");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.d * 31);
    }
}
