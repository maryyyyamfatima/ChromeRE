package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vD2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10670vD2 {
    public final C11356xD2 a;
    public final float b;

    public C10670vD2(C11356xD2 c11356xD2, float f) {
        this.a = c11356xD2;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10670vD2.class != obj.getClass()) {
            return false;
        }
        C10670vD2 c10670vD2 = (C10670vD2) obj;
        return Float.compare(c10670vD2.b, this.b) == 0 && this.a.equals(c10670vD2.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        return "PropertyAnimation{ PropertyHandle=" + String.valueOf(this.a) + ", TargetValue=" + this.b + "}";
    }
}
