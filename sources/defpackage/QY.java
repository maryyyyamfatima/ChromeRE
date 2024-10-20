package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QY extends AbstractSet implements Serializable {
    public transient Object a;
    public transient int[] g;
    public transient Object[] h;
    public transient int i;
    public transient int j;

    public QY() {
        this.i = Math.min(Math.max(3, 1), 1073741823);
    }

    public QY(int i) {
        this.i = Math.min(Math.max(i, 1), 1073741823);
    }

    public final boolean b() {
        return this.a == null;
    }

    public final Set a() {
        Object obj = this.a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00dc -> B:41:0x00ca). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean add(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QY.add(java.lang.Object):boolean");
    }

    public final int g(int i, int i2, int i3, int i4) {
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
        this.i = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.i & (-32));
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (b()) {
            return false;
        }
        Set a = a();
        if (a != null) {
            return a.contains(obj);
        }
        int b = AbstractC7198l61.b(obj);
        int i = (1 << (this.i & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int c = RY.c(b & i, obj2);
        if (c == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = b & i2;
        do {
            int i4 = c - 1;
            int i5 = f()[i4];
            if ((i5 & i2) == i3 && V82.a(obj, d()[i4])) {
                return true;
            }
            c = i5 & i;
        } while (c != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (b()) {
            return false;
        }
        Set a = a();
        if (a == null) {
            int i3 = (1 << (this.i & 31)) - 1;
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int b = RY.b(obj, null, i3, obj2, f(), d(), null);
            if (b == -1) {
                return false;
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            int[] f = f();
            Object[] d = d();
            int size = size() - 1;
            if (b < size) {
                Object obj4 = d[size];
                d[b] = obj4;
                d[size] = null;
                f[b] = f[size];
                f[size] = 0;
                int b2 = AbstractC7198l61.b(obj4) & i3;
                int c = RY.c(b2, obj3);
                int i4 = size + 1;
                if (c == i4) {
                    RY.d(obj3, b2, b + 1);
                } else {
                    while (true) {
                        i = c - 1;
                        i2 = f[i];
                        int i5 = i2 & i3;
                        if (i5 == i4) {
                            break;
                        }
                        c = i5;
                    }
                    f[i] = ((b + 1) & i3) | (i2 & (~i3));
                }
            } else {
                d[b] = null;
                f[b] = 0;
            }
            this.j--;
            this.i += 32;
            return true;
        }
        return a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set a = a();
        if (a != null) {
            return a.iterator();
        }
        return new PY(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set a = a();
        return a != null ? a.size() : this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (b()) {
            return new Object[0];
        }
        Set a = a();
        return a != null ? a.toArray() : Arrays.copyOf(d(), this.j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (b()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set a = a();
        if (a != null) {
            return a.toArray(objArr);
        }
        Object[] d = d();
        int i = this.j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(d, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (b()) {
            return;
        }
        this.i += 32;
        Set a = a();
        if (a != null) {
            this.i = Math.min(Math.max(size(), 3), 1073741823);
            a.clear();
            this.a = null;
            this.j = 0;
            return;
        }
        Arrays.fill(d(), 0, this.j, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(f(), 0, this.j, 0);
        this.j = 0;
    }

    public final int[] f() {
        int[] iArr = this.g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] d() {
        Object[] objArr = this.h;
        Objects.requireNonNull(objArr);
        return objArr;
    }
}
