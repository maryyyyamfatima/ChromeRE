package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593Mg3 implements Cloneable {
    public static final Object j = new Object();
    public boolean a;
    public int[] g;
    public Object[] h;
    public int i;

    public C1593Mg3() {
        this(10);
    }

    public C1593Mg3(int i) {
        if (i != 0) {
            int i2 = i * 4;
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
            int i5 = i2 / 4;
            this.g = new int[i5];
            this.h = new Object[i5];
            return;
        }
        this.g = X40.a;
        this.h = X40.c;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1593Mg3 clone() {
        Object clone = super.clone();
        AbstractC0087Ar1.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1593Mg3 c1593Mg3 = (C1593Mg3) clone;
        c1593Mg3.g = (int[]) this.g.clone();
        c1593Mg3.h = (Object[]) this.h.clone();
        return c1593Mg3;
    }

    public final void h(int i) {
        int a = X40.a(this.i, i, this.g);
        if (a >= 0) {
            Object[] objArr = this.h;
            Object obj = objArr[a];
            Object obj2 = j;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.a = true;
            }
        }
    }

    public final void c() {
        int i = this.i;
        int[] iArr = this.g;
        Object[] objArr = this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.i = i2;
    }

    public final void g(int i, Object obj) {
        int a = X40.a(this.i, i, this.g);
        if (a >= 0) {
            this.h[a] = obj;
            return;
        }
        int i2 = ~a;
        int i3 = this.i;
        if (i2 < i3) {
            Object[] objArr = this.h;
            if (objArr[i2] == j) {
                this.g[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.g.length) {
            c();
            i2 = ~X40.a(this.i, i, this.g);
        }
        int i4 = this.i;
        if (i4 >= this.g.length) {
            int i5 = (i4 + 1) * 4;
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
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.g = iArr;
            this.h = objArr2;
        }
        int i9 = this.i - i2;
        if (i9 != 0) {
            int[] iArr3 = this.g;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.h;
            System.arraycopy(objArr4, i2, objArr4, i10, this.i - i2);
        }
        this.g[i2] = i;
        this.h[i2] = obj;
        this.i++;
    }

    public final int i() {
        if (this.a) {
            c();
        }
        return this.i;
    }

    public final int f(int i) {
        if (this.a) {
            c();
        }
        return this.g[i];
    }

    public final Object j(int i) {
        if (this.a) {
            c();
        }
        return this.h[i];
    }

    public final int e(Object obj) {
        if (this.a) {
            c();
        }
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.h[i2] == obj) {
                return i2;
            }
        }
        return -1;
    }

    public final void a(int i, Object obj) {
        int i2 = this.i;
        if (i2 != 0 && i <= this.g[i2 - 1]) {
            g(i, obj);
            return;
        }
        if (this.a && i2 >= this.g.length) {
            c();
        }
        int i3 = this.i;
        if (i3 >= this.g.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.g = iArr;
            this.h = objArr;
        }
        this.g[i3] = i;
        this.h[i3] = obj;
        this.i = i3 + 1;
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 28);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            Object j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0087Ar1.d(sb2, "buffer.toString()");
        return sb2;
    }

    public final Object d(int i) {
        Object obj;
        int a = X40.a(this.i, i, this.g);
        if (a < 0 || (obj = this.h[a]) == j) {
            return null;
        }
        return obj;
    }
}
