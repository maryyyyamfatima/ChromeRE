package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3487aJ1 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public C3487aJ1(int i) {
        if (i != 0) {
            int i2 = i * 8;
            int i3 = 4;
            while (true) {
                if (i3 >= 32) {
                    break;
                }
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            int i5 = i2 / 8;
            this.g = new long[i5];
            this.h = new Object[i5];
            return;
        }
        this.g = X40.b;
        this.h = X40.c;
    }

    public C3487aJ1() {
        this(10);
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C3487aJ1 clone() {
        Object clone = super.clone();
        AbstractC0087Ar1.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C3487aJ1 c3487aJ1 = (C3487aJ1) clone;
        c3487aJ1.g = (long[]) this.g.clone();
        c3487aJ1.h = (Object[]) this.h.clone();
        return c3487aJ1;
    }

    public final Object d(long j) {
        Object obj;
        int b = X40.b(this.g, this.i, j);
        if (b < 0 || (obj = this.h[b]) == AbstractC3831bJ1.a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j, Number number) {
        Object obj;
        int b = X40.b(this.g, this.i, j);
        return (b < 0 || (obj = this.h[b]) == AbstractC3831bJ1.a) ? number : obj;
    }

    public final void j(long j) {
        int b = X40.b(this.g, this.i, j);
        if (b >= 0) {
            Object[] objArr = this.h;
            Object obj = objArr[b];
            Object obj2 = AbstractC3831bJ1.a;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.a = true;
            }
        }
    }

    public final void i(long j, Object obj) {
        int b = X40.b(this.g, this.i, j);
        if (b >= 0) {
            this.h[b] = obj;
            return;
        }
        int i = ~b;
        int i2 = this.i;
        if (i < i2) {
            Object[] objArr = this.h;
            if (objArr[i] == AbstractC3831bJ1.a) {
                this.g[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.g;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr2[i4];
                    if (obj2 != AbstractC3831bJ1.a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj2;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.i = i3;
                i = ~X40.b(this.g, i3, j);
            }
        }
        int i5 = this.i;
        if (i5 >= this.g.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] copyOf = Arrays.copyOf(this.g, i9);
            AbstractC0087Ar1.d(copyOf, "copyOf(this, newSize)");
            this.g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i9);
            AbstractC0087Ar1.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
        }
        int i10 = this.i - i;
        if (i10 != 0) {
            long[] jArr2 = this.g;
            int i11 = i + 1;
            AbstractC0087Ar1.e(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.h;
            AbstractC6036hk.c(i11, i, this.i, objArr3, objArr3);
        }
        this.g[i] = j;
        this.h[i] = obj;
        this.i++;
    }

    public final int k() {
        if (this.a) {
            int i = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3831bJ1.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.i = i2;
        }
        return this.i;
    }

    public final long h(int i) {
        if (!(i >= 0 && i < this.i)) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.a) {
            int i2 = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3831bJ1.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.i = i3;
        }
        return this.g[i];
    }

    public final Object l(int i) {
        if (!(i >= 0 && i < this.i)) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        if (this.a) {
            int i2 = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC3831bJ1.a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.i = i3;
        }
        return this.h[i];
    }

    public final int f(long j) {
        if (this.a) {
            int i = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != AbstractC3831bJ1.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.i = i2;
        }
        return X40.b(this.g, this.i, j);
    }

    public final int g(Object obj) {
        if (this.a) {
            int i = this.i;
            long[] jArr = this.g;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = objArr[i3];
                if (obj2 != AbstractC3831bJ1.a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj2;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.i = i2;
        }
        int i4 = this.i;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.h[i5] == obj) {
                return i5;
            }
        }
        return -1;
    }

    public final void b() {
        int i = this.i;
        Object[] objArr = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.i = 0;
        this.a = false;
    }

    public final void a(long j, Long l) {
        int i = this.i;
        if (i != 0 && j <= this.g[i - 1]) {
            i(j, l);
            return;
        }
        if (this.a) {
            long[] jArr = this.g;
            if (i >= jArr.length) {
                Object[] objArr = this.h;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != AbstractC3831bJ1.a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.i = i2;
            }
        }
        int i4 = this.i;
        if (i4 >= this.g.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] copyOf = Arrays.copyOf(this.g, i8);
            AbstractC0087Ar1.d(copyOf, "copyOf(this, newSize)");
            this.g = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.h, i8);
            AbstractC0087Ar1.d(copyOf2, "copyOf(this, newSize)");
            this.h = copyOf2;
        }
        this.g[i4] = j;
        this.h[i4] = l;
        this.i = i4 + 1;
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object l = l(i2);
            if (l != sb) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0087Ar1.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
