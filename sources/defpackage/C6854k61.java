package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6854k61 extends AbstractC6130i0 implements Serializable {
    public final transient N82 h = new N82();
    public transient long i;

    @Override // defpackage.AbstractC6130i0
    public final int a(int i, Object obj) {
        if (i == 0) {
            return k(obj);
        }
        N82 n82 = this.h;
        int a = n82.a(obj);
        if (a != -1) {
            int[] iArr = n82.b;
            int i2 = iArr[a];
            long j = i;
            iArr[a] = (int) (i2 + j);
            this.i += j;
            return i2;
        }
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("count must be positive but was: ", i));
        }
        long[] jArr = n82.f;
        Object[] objArr = n82.a;
        int[] iArr2 = n82.b;
        int b = AbstractC7198l61.b(obj);
        int[] iArr3 = n82.e;
        int length = (iArr3.length - 1) & b;
        int i3 = n82.c;
        int i4 = iArr3[length];
        if (i4 != -1) {
            while (true) {
                long j2 = jArr[i4];
                if (((int) (j2 >>> 32)) == b && V82.a(obj, objArr[i4])) {
                    int i5 = iArr2[i4];
                    iArr2[i4] = i;
                    break;
                }
                int i6 = (int) j2;
                if (i6 == -1) {
                    jArr[i4] = ((-4294967296L) & j2) | (i3 & 4294967295L);
                    break;
                }
                i4 = i6;
            }
        } else {
            iArr3[length] = i3;
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i3 + 1;
        int length2 = n82.f.length;
        if (i7 > length2) {
            int max = Math.max(1, length2 >>> 1) + length2;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length2) {
                n82.a = Arrays.copyOf(n82.a, max);
                n82.b = Arrays.copyOf(n82.b, max);
                long[] jArr2 = n82.f;
                int length3 = jArr2.length;
                long[] copyOf = Arrays.copyOf(jArr2, max);
                if (max > length3) {
                    Arrays.fill(copyOf, length3, max, -1L);
                }
                n82.f = copyOf;
            }
        }
        n82.f[i3] = (b << 32) | 4294967295L;
        n82.a[i3] = obj;
        n82.b[i3] = i;
        n82.c = i7;
        if (i3 >= n82.h) {
            int[] iArr4 = n82.e;
            int length4 = iArr4.length * 2;
            if (iArr4.length >= 1073741824) {
                n82.h = Integer.MAX_VALUE;
            } else {
                int i8 = ((int) (length4 * n82.g)) + 1;
                int[] iArr5 = new int[length4];
                Arrays.fill(iArr5, -1);
                long[] jArr3 = n82.f;
                int i9 = length4 - 1;
                for (int i10 = 0; i10 < n82.c; i10++) {
                    int i11 = (int) (jArr3[i10] >>> 32);
                    int i12 = i11 & i9;
                    int i13 = iArr5[i12];
                    iArr5[i12] = i10;
                    jArr3[i10] = (i13 & 4294967295L) | (i11 << 32);
                }
                n82.h = i8;
                n82.e = iArr5;
            }
        }
        n82.d++;
        this.i += i;
        return 0;
    }

    @Override // defpackage.AbstractC6130i0
    public final int f(int i, Object obj) {
        if (i == 0) {
            return k(obj);
        }
        N82 n82 = this.h;
        int a = n82.a(obj);
        if (a == -1) {
            return 0;
        }
        int[] iArr = n82.b;
        int i2 = iArr[a];
        if (i2 <= i) {
            n82.c(a);
            i = i2;
        } else {
            iArr[a] = i2 - i;
        }
        this.i -= i;
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int size() {
        long j = this.i;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public final int k(Object obj) {
        N82 n82 = this.h;
        int a = n82.a(obj);
        if (a == -1) {
            return 0;
        }
        return n82.b[a];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        N82 n82 = this.h;
        n82.d++;
        Arrays.fill(n82.a, 0, n82.c, (Object) null);
        Arrays.fill(n82.b, 0, n82.c, 0);
        Arrays.fill(n82.e, -1);
        Arrays.fill(n82.f, -1L);
        n82.c = 0;
        this.i = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        return new D02(this, d().iterator());
    }
}
