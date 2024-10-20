package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ao1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072Ao1 extends AbstractC7504m0 implements InterfaceC0857Gp1, RandomAccess, InterfaceC2337Rz2 {
    public static final C0072Ao1 i;
    public int[] g;
    public int h;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
        int[] iArr = this.g;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.g, i2, iArr2, i2 + 1, this.h - i2);
            this.g = iArr2;
        }
        this.g[i2] = intValue;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i2);
        int[] iArr = this.g;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    static {
        C0072Ao1 c0072Ao1 = new C0072Ao1(new int[0], 0);
        i = c0072Ao1;
        c0072Ao1.a = false;
    }

    public C0072Ao1(int[] iArr, int i2) {
        this.g = iArr;
        this.h = i2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.g;
        System.arraycopy(iArr, i3, iArr, i2, this.h - i3);
        this.h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0072Ao1)) {
            return super.equals(obj);
        }
        C0072Ao1 c0072Ao1 = (C0072Ao1) obj;
        if (this.h != c0072Ao1.h) {
            return false;
        }
        int[] iArr = c0072Ao1.g;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 = (i2 * 31) + this.g[i3];
        }
        return i2;
    }

    @Override // defpackage.InterfaceC1377Kp1
    public final InterfaceC1377Kp1 c(int i2) {
        if (i2 < this.h) {
            throw new IllegalArgumentException();
        }
        return new C0072Ao1(Arrays.copyOf(this.g, i2), this.h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f(i2);
        return Integer.valueOf(this.g[i2]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.g[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    public final void d(int i2) {
        a();
        int i3 = this.h;
        int[] iArr = this.g;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.g = iArr2;
        }
        int[] iArr3 = this.g;
        int i4 = this.h;
        this.h = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1507Lp1.a;
        collection.getClass();
        if (!(collection instanceof C0072Ao1)) {
            return super.addAll(collection);
        }
        C0072Ao1 c0072Ao1 = (C0072Ao1) collection;
        int i2 = c0072Ao1.h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.g;
        if (i4 > iArr.length) {
            this.g = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(c0072Ao1.g, 0, this.g, this.h, c0072Ao1.h);
        this.h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        f(i2);
        int[] iArr = this.g;
        int i3 = iArr[i2];
        if (i2 < this.h - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    public final void f(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
    }
}
