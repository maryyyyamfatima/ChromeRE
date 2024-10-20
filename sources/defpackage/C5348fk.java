package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5348fk extends AbstractC6472j0 implements Set {
    public int[] a;
    public Object[] g;
    public int h;

    public C5348fk(int i) {
        this.a = X40.a;
        this.g = X40.c;
        if (i > 0) {
            this.a = new int[i];
            this.g = new Object[i];
        }
    }

    public final int a(int i, Object obj) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = X40.a(i2, i, this.a);
            if (a < 0 || AbstractC0087Ar1.a(obj, this.g[a])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.a[i3] == i) {
                if (AbstractC0087Ar1.a(obj, this.g[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
                if (AbstractC0087Ar1.a(obj, this.g[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int a;
        if (obj == null) {
            a = a(0, null);
        } else {
            a = a(obj.hashCode(), obj);
        }
        return a >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a;
        if (obj == null) {
            a = a(0, null);
        } else {
            a = a(obj.hashCode(), obj);
        }
        if (a < 0) {
            return false;
        }
        b(a);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.h != 0) {
            this.a = X40.a;
            this.g = X40.c;
            this.h = 0;
        }
        if (this.h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.h <= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int a;
        int i2 = this.h;
        if (obj == null) {
            a = a(0, null);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            a = a(hashCode, obj);
        }
        if (a >= 0) {
            return false;
        }
        int i3 = ~a;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.g;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.g = new Object[i4];
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (!(iArr2.length == 0)) {
                AbstractC6036hk.b(0, 0, iArr.length, iArr, iArr2);
                AbstractC6036hk.d(objArr, this.g, 0, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            AbstractC6036hk.b(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.g;
            AbstractC6036hk.c(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.h;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.g[i3] = obj;
                this.h = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void b(int i) {
        int i2 = this.h;
        Object[] objArr = this.g;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            int i4 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.g = new Object[i4];
            if (i > 0) {
                AbstractC6036hk.b(0, 0, i, iArr, iArr2);
                AbstractC6036hk.d(objArr, this.g, 0, 0, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                AbstractC6036hk.b(i, i5, i6, iArr, this.a);
                AbstractC6036hk.c(i, i5, i6, objArr, this.g);
            }
        } else {
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 + 1;
                AbstractC6036hk.b(i, i7, i8, iArr, iArr);
                Object[] objArr2 = this.g;
                AbstractC6036hk.c(i, i7, i8, objArr2, objArr2);
            }
            this.g[i3] = null;
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.g[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.g[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC0087Ar1.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5004ek(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC0087Ar1.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC0087Ar1.e(collection, "elements");
        int size = collection.size() + this.h;
        int i = this.h;
        int[] iArr = this.a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.g;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.g = new Object[size];
            if (i > 0) {
                AbstractC6036hk.b(0, 0, i, iArr, iArr2);
                AbstractC6036hk.d(objArr, this.g, 0, 0, this.h, 6);
            }
        }
        if (this.h != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC0087Ar1.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC0087Ar1.e(collection, "elements");
        boolean z = false;
        for (int i = this.h - 1; -1 < i; i--) {
            if (!AbstractC11791yW.a(collection, this.g[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }
}
