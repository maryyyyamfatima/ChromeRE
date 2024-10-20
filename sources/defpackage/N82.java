package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N82 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    public transient long[] f;
    public transient float g;
    public transient int h;

    public N82() {
        int max = Math.max(3, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (1.0f * highestOneBit))) {
            int i = highestOneBit << 1;
            highestOneBit = i <= 0 ? 1073741824 : i;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.e = iArr;
        this.g = 1.0f;
        this.a = new Object[3];
        this.b = new int[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, (int) (highestOneBit * 1.0f));
    }

    public final int b(int i, Object obj) {
        int i2;
        long[] jArr;
        long j;
        int length = (r2.length - 1) & i;
        int i3 = this.e[length];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (((int) (this.f[i3] >>> 32)) == i && V82.a(obj, this.a[i3])) {
                int[] iArr = this.b;
                int i5 = iArr[i3];
                if (i4 == -1) {
                    this.e[length] = (int) this.f[i3];
                    i2 = i5;
                } else {
                    long[] jArr2 = this.f;
                    i2 = i5;
                    jArr2[i4] = (((int) jArr2[i3]) & 4294967295L) | (jArr2[i4] & (-4294967296L));
                }
                int i6 = this.c - 1;
                if (i3 < i6) {
                    Object[] objArr = this.a;
                    objArr[i3] = objArr[i6];
                    iArr[i3] = iArr[i6];
                    objArr[i6] = null;
                    iArr[i6] = 0;
                    long[] jArr3 = this.f;
                    long j2 = jArr3[i6];
                    jArr3[i3] = j2;
                    jArr3[i6] = -1;
                    int[] iArr2 = this.e;
                    int length2 = ((int) (j2 >>> 32)) & (iArr2.length - 1);
                    int i7 = iArr2[length2];
                    if (i7 == i6) {
                        iArr2[length2] = i3;
                    } else {
                        while (true) {
                            jArr = this.f;
                            j = jArr[i7];
                            int i8 = (int) j;
                            if (i8 == i6) {
                                break;
                            }
                            i7 = i8;
                        }
                        jArr[i7] = (i3 & 4294967295L) | (j & (-4294967296L));
                    }
                } else {
                    this.a[i3] = null;
                    iArr[i3] = 0;
                    this.f[i3] = -1;
                }
                this.c--;
                this.d++;
                return i2;
            }
            int i9 = (int) this.f[i3];
            if (i9 == -1) {
                return 0;
            }
            i4 = i3;
            i3 = i9;
        }
    }

    public final int a(Object obj) {
        int b = AbstractC7198l61.b(obj);
        int i = this.e[(r1.length - 1) & b];
        while (i != -1) {
            long j = this.f[i];
            if (((int) (j >>> 32)) == b && V82.a(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int c(int i) {
        return b((int) (this.f[i] >>> 32), this.a[i]);
    }
}
