package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dM0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4532dM0 implements Cloneable {
    public static final C4875eM0 i = new C4875eM0();
    public int[] a;
    public C4875eM0[] g;
    public int h;

    public C4532dM0(int i2) {
        int i3 = i2 * 4;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.a = new int[i6];
        this.g = new C4875eM0[i6];
        this.h = 0;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4532dM0 clone() {
        int i2 = this.h;
        C4532dM0 c4532dM0 = new C4532dM0(i2);
        System.arraycopy(this.a, 0, c4532dM0.a, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C4875eM0 c4875eM0 = this.g[i3];
            if (c4875eM0 != null) {
                c4532dM0.g[i3] = c4875eM0.clone();
            }
        }
        c4532dM0.h = i2;
        return c4532dM0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4532dM0)) {
            return false;
        }
        C4532dM0 c4532dM0 = (C4532dM0) obj;
        int i2 = this.h;
        if (i2 != c4532dM0.h) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = c4532dM0.a;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z = true;
                break;
            }
            if (iArr[i3] != iArr2[i3]) {
                z = false;
                break;
            }
            i3++;
        }
        if (z) {
            C4875eM0[] c4875eM0Arr = this.g;
            C4875eM0[] c4875eM0Arr2 = c4532dM0.g;
            int i4 = this.h;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                }
                if (!c4875eM0Arr[i5].equals(c4875eM0Arr2[i5])) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 17;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 = (((i2 * 31) + this.a[i3]) * 31) + this.g[i3].hashCode();
        }
        return i2;
    }

    public final int a(int i2) {
        int i3 = this.h - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = this.a[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
