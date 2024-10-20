package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H74 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final VT e;
    public final int f;

    public H74(int i, int i2, int i3, int i4, VT vt, int i5) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = -1;
        this.a = i;
        this.b = i2;
        this.c = i4;
        this.d = i3;
        this.e = vt;
        this.f = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !H74.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        H74 h74 = (H74) obj;
        return this.c == h74.c && this.d == h74.d && this.a == h74.a && this.b == h74.b && this.f == h74.f && Objects.equals(this.e, h74.e);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((((((((((527 + this.c) * 31) + this.d) * 31) + this.a) * 31) + this.b) * 31) + this.f) * 31);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(this.f);
        VT vt = this.e;
        objArr[1] = vt != null ? vt.toString() : null;
        objArr[2] = Integer.valueOf(this.c);
        objArr[3] = Integer.valueOf(this.d);
        objArr[4] = Integer.valueOf(this.a);
        objArr[5] = Integer.valueOf(this.b);
        return String.format("<%d, %s> (%d,%d) %dx%d", objArr);
    }
}
