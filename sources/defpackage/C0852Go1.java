package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Go1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852Go1 extends AbstractC0592Eo1 {
    public C0852Go1(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean isEmpty() {
        return this.a > this.g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0852Go1) {
            if (!isEmpty() || !((C0852Go1) obj).isEmpty()) {
                C0852Go1 c0852Go1 = (C0852Go1) obj;
                if (this.a == c0852Go1.a) {
                    if (this.g == c0852Go1.g) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.g;
    }

    public final String toString() {
        return this.a + ".." + this.g;
    }

    static {
        new C0852Go1(1, 0);
    }
}
