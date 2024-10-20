package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1439Lb3 {
    public int[] a;
    public Object[] g;
    public int h;

    public C1439Lb3() {
        this(0);
    }

    public C1439Lb3(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = X40.a;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
        if (i == 0) {
            objArr = X40.c;
        } else {
            objArr = new Object[i << 1];
        }
        this.g = objArr;
    }

    public final int c(int i, Object obj) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int a = X40.a(i2, i, this.a);
        if (a < 0 || AbstractC0087Ar1.a(obj, this.g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (AbstractC0087Ar1.a(obj, this.g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (AbstractC0087Ar1.a(obj, this.g[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int e() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int a = X40.a(i, 0, this.a);
        if (a < 0 || this.g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.g[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.h > 0) {
            this.a = X40.a;
            this.g = X40.c;
            this.h = 0;
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b(int i) {
        int i2 = this.h;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            AbstractC0087Ar1.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.g, i * 2);
            AbstractC0087Ar1.d(copyOf2, "copyOf(this, newSize)");
            this.g = copyOf2;
        }
        if (this.h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int a(Object obj) {
        int i = this.h * 2;
        Object[] objArr = this.g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (AbstractC0087Ar1.a(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final Object f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.g[i << 1];
    }

    public final Object j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.g[(i << 1) + 1];
    }

    public Object i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.h;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c = obj != null ? c(hashCode, obj) : e();
        if (c >= 0) {
            int i2 = (c << 1) + 1;
            Object[] objArr = this.g;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            AbstractC0087Ar1.d(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.g, i4 << 1);
            AbstractC0087Ar1.d(copyOf2, "copyOf(this, newSize)");
            this.g = copyOf2;
            if (i != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            AbstractC6036hk.b(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.g;
            AbstractC6036hk.c(i5 << 1, i3 << 1, this.h << 1, objArr2, objArr2);
        }
        int i6 = this.h;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.g;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.h = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void g(C4317ck c4317ck) {
        AbstractC0087Ar1.e(c4317ck, "map");
        int i = c4317ck.h;
        b(this.h + i);
        if (this.h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c4317ck.f(i2), c4317ck.j(i2));
            }
        } else if (i > 0) {
            AbstractC6036hk.b(0, 0, i, c4317ck.a, this.a);
            AbstractC6036hk.c(0, 0, i << 1, c4317ck.g, this.g);
            this.h = i;
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return h(d);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !AbstractC0087Ar1.a(obj2, j(d))) {
            return false;
        }
        h(d);
        return true;
    }

    public Object h(int i) {
        if (!(i >= 0 && i < this.h)) {
            throw new IllegalArgumentException(AbstractC9076qb1.a("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.g;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.h;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.a;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                int i5 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] copyOf = Arrays.copyOf(iArr, i5);
                AbstractC0087Ar1.d(copyOf, "copyOf(this, newSize)");
                this.a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.g, i5 << 1);
                AbstractC0087Ar1.d(copyOf2, "copyOf(this, newSize)");
                this.g = copyOf2;
                if (i3 != this.h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    AbstractC6036hk.b(0, 0, i, iArr, this.a);
                    AbstractC6036hk.c(0, 0, i2, objArr, this.g);
                }
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    AbstractC6036hk.b(i, i6, i7, iArr, this.a);
                    AbstractC6036hk.c(i2, i6 << 1, i7 << 1, objArr, this.g);
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 + 1;
                    AbstractC6036hk.b(i, i8, i9, iArr, iArr);
                    Object[] objArr2 = this.g;
                    AbstractC6036hk.c(i2, i8 << 1, i9 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.g;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i3 != this.h) {
                throw new ConcurrentModificationException();
            }
            this.h = i4;
        }
        return obj;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return i(d, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !AbstractC0087Ar1.a(obj2, j(d))) {
            return false;
        }
        i(d, obj3);
        return true;
    }

    public final int size() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1439Lb3) {
                int i = this.h;
                if (i != ((C1439Lb3) obj).h) {
                    return false;
                }
                C1439Lb3 c1439Lb3 = (C1439Lb3) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object j = j(i2);
                    Object obj2 = c1439Lb3.get(f);
                    if (j == null) {
                        if (obj2 != null || !c1439Lb3.containsKey(f)) {
                            return false;
                        }
                    } else if (!AbstractC0087Ar1.a(j, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Object f2 = f(i4);
                Object j2 = j(i4);
                Object obj3 = ((Map) obj).get(f2);
                if (j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f2)) {
                        return false;
                    }
                } else if (!AbstractC0087Ar1.a(j2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.g;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0087Ar1.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.g[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.g[(d << 1) + 1] : obj2;
    }
}
