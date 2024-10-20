package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LI {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public LI(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public LI() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    public final String toString() {
        return "ChangeSetStats{mEffectiveChangesCount=" + this.a + ", mInsertSingleCount=" + this.b + ", mInsertRangeCount=" + this.c + ", mDeleteSingleCount=" + this.d + ", mDeleteRangeCount=" + this.e + ", mUpdateSingleCount=" + this.f + ", mUpdateRangeCount=" + this.g + ", mMoveCount=" + this.h + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LI.class != obj.getClass()) {
            return false;
        }
        LI li = (LI) obj;
        return this.a == li.a && this.b == li.b && this.c == li.c && this.d == li.d && this.e == li.e && this.f == li.f && this.g == li.g && this.h == li.h;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }
}
