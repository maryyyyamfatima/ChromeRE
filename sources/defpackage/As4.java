package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class As4 {
    public final float a;
    public final int b;

    public As4(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof As4) {
            As4 as4 = (As4) obj;
            int i = as4.b;
            int i2 = this.b;
            if (i2 == i && (i2 == 1 || i2 == 4 || Float.compare(this.a, as4.a) == 0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2373Sg3.b(this.b) + Float.floatToIntBits(this.a);
    }

    public final String toString() {
        int b = AbstractC2373Sg3.b(this.b);
        if (b == 0) {
            return "undefined";
        }
        float f = this.a;
        if (b == 1) {
            return Float.toString(f);
        }
        if (b != 2) {
            if (b == 3) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return f + "%";
    }
}
