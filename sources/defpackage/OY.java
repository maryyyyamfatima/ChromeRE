package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OY extends AbstractMap implements Serializable {
    public static final Object o = new Object();
    public transient Object a;
    public transient int[] g;
    public transient Object[] h;
    public transient Object[] i;
    public transient int j;
    public transient int k;
    public transient LY l;
    public transient JY m;
    public transient NY n;

    public OY() {
        this.j = Math.min(Math.max(3, 1), 1073741823);
    }

    public OY(int i) {
        this.j = Math.min(Math.max(i, 1), 1073741823);
    }

    public final int b(Object obj) {
        if (this.a == null) {
            return -1;
        }
        int b = AbstractC7198l61.b(obj);
        int i = (1 << (this.j & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int c = RY.c(b & i, obj2);
        if (c == 0) {
            return -1;
        }
        int i2 = ~i;
        int i3 = b & i2;
        do {
            int i4 = c - 1;
            int i5 = f()[i4];
            if ((i5 & i2) == i3 && V82.a(obj, c(i4))) {
                return i4;
            }
            c = i5 & i;
        } while (c != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.a == null) {
            return;
        }
        this.j += 32;
        Map a = a();
        if (a != null) {
            this.j = Math.min(Math.max(size(), 3), 1073741823);
            a.clear();
            this.a = null;
            this.k = 0;
            return;
        }
        Arrays.fill(g(), 0, this.k, (Object) null);
        Arrays.fill(h(), 0, this.k, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(f(), 0, this.k, 0);
        this.k = 0;
    }

    public final Object e(Object obj) {
        Object obj2 = this.a;
        boolean z = obj2 == null;
        Object obj3 = o;
        if (z) {
            return obj3;
        }
        int i = (1 << (this.j & 31)) - 1;
        Objects.requireNonNull(obj2);
        int b = RY.b(obj, null, i, obj2, f(), g(), null);
        if (b == -1) {
            return obj3;
        }
        Object j = j(b);
        d(b, i);
        this.k--;
        this.j += 32;
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (this.a == null) {
            int i = this.j;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) (highestOneBit * 1.0d))) {
                int i2 = highestOneBit << 1;
                if (i2 <= 0) {
                    i2 = 1073741824;
                }
                highestOneBit = i2;
            }
            int max2 = Math.max(4, highestOneBit);
            this.a = RY.a(max2);
            this.j = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.j & (-32));
            this.g = new int[i];
            this.h = new Object[i];
            this.i = new Object[i];
        }
        Map a = a();
        if (a != null) {
            return a.put(obj, obj2);
        }
        int[] f = f();
        Object[] g = g();
        Object[] h = h();
        int i3 = this.k;
        int i4 = i3 + 1;
        int b = AbstractC7198l61.b(obj);
        int i5 = (1 << (this.j & 31)) - 1;
        int i6 = b & i5;
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int c = RY.c(i6, obj3);
        if (c != 0) {
            int i7 = ~i5;
            int i8 = b & i7;
            int i9 = 0;
            while (true) {
                int i10 = c - 1;
                int i11 = f[i10];
                int i12 = i11 & i7;
                if (i12 == i8 && V82.a(obj, g[i10])) {
                    Object obj4 = h[i10];
                    h[i10] = obj2;
                    return obj4;
                }
                int i13 = i11 & i5;
                int i14 = i8;
                int i15 = i9 + 1;
                if (i13 != 0) {
                    i9 = i15;
                    c = i13;
                    i8 = i14;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(((1 << (this.j & 31)) - 1) + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            linkedHashMap.put(c(i16), j(i16));
                            i16++;
                            if (i16 >= this.k) {
                                i16 = -1;
                            }
                        }
                        this.a = linkedHashMap;
                        this.g = null;
                        this.h = null;
                        this.i = null;
                        this.j += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > i5) {
                        i5 = i(i5, (i5 + 1) * (i5 < 32 ? 4 : 2), b, i3);
                    } else {
                        f[i10] = (i4 & i5) | i12;
                    }
                }
            }
        } else if (i4 > i5) {
            i5 = i(i5, (i5 + 1) * (i5 < 32 ? 4 : 2), b, i3);
        } else {
            Object obj5 = this.a;
            Objects.requireNonNull(obj5);
            RY.d(obj5, i6, i4);
        }
        int length = f().length;
        if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.g = Arrays.copyOf(f(), min);
            this.h = Arrays.copyOf(g(), min);
            this.i = Arrays.copyOf(h(), min);
        }
        f()[i3] = ((~i5) & b) | (i5 & 0);
        g()[i3] = obj;
        h()[i3] = obj2;
        this.k = i4;
        this.j += 32;
        return null;
    }

    public final Map a() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int i(int i, int i2, int i3, int i4) {
        Object a = RY.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            RY.d(a, i3 & i5, i4 + 1);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] f = f();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = RY.c(i6, obj);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = f[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = RY.c(i10, a);
                RY.d(a, i10, c);
                f[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.a = a;
        this.j = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.j & (-32));
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsKey(obj);
        }
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a = a();
        if (a != null) {
            return a.get(obj);
        }
        int b = b(obj);
        if (b == -1) {
            return null;
        }
        return j(b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a = a();
        if (a != null) {
            return a.remove(obj);
        }
        Object e = e(obj);
        if (e == o) {
            return null;
        }
        return e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        LY ly = this.l;
        if (ly != null) {
            return ly;
        }
        LY ly2 = new LY(this);
        this.l = ly2;
        return ly2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        JY jy = this.m;
        if (jy != null) {
            return jy;
        }
        JY jy2 = new JY(this);
        this.m = jy2;
        return jy2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a = a();
        return a != null ? a.size() : this.k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a = a();
        if (a != null) {
            return a.containsValue(obj);
        }
        for (int i = 0; i < this.k; i++) {
            if (V82.a(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        NY ny = this.n;
        if (ny != null) {
            return ny;
        }
        NY ny2 = new NY(this);
        this.n = ny2;
        return ny2;
    }

    public final void d(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] f = f();
        Object[] g = g();
        Object[] h = h();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = g[size];
            g[i] = obj2;
            h[i] = h[size];
            g[size] = null;
            h[size] = null;
            f[i] = f[size];
            f[size] = 0;
            int b = AbstractC7198l61.b(obj2) & i2;
            int c = RY.c(b, obj);
            int i3 = size + 1;
            if (c == i3) {
                RY.d(obj, b, i + 1);
                return;
            }
            while (true) {
                int i4 = c - 1;
                int i5 = f[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    f[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
                c = i6;
            }
        } else {
            g[i] = null;
            h[i] = null;
            f[i] = 0;
        }
    }

    public final int[] f() {
        int[] iArr = this.g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] g() {
        Object[] objArr = this.h;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] h() {
        Object[] objArr = this.i;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object c(int i) {
        return g()[i];
    }

    public final Object j(int i) {
        return h()[i];
    }
}
