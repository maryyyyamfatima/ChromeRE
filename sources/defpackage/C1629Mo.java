package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629Mo {
    public final float a;
    public final float b;

    public C1629Mo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        return "TouchLocation{x=" + this.a + ", y=" + this.b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1629Mo)) {
            return false;
        }
        C1629Mo c1629Mo = (C1629Mo) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(c1629Mo.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(c1629Mo.b);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }
}
