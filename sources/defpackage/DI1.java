package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DI1 extends AbstractC7504m0 implements InterfaceC1247Jp1, RandomAccess, InterfaceC2337Rz2 {
    public static final DI1 i;
    public long[] g;
    public int h;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
        long[] jArr = this.g;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.g, i2, jArr2, i2 + 1, this.h - i2);
            this.g = jArr2;
        }
        this.g[i2] = longValue;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i2);
        long[] jArr = this.g;
        long j = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j);
    }

    static {
        DI1 di1 = new DI1(0, new long[0]);
        i = di1;
        di1.a = false;
    }

    public DI1(int i2, long[] jArr) {
        this.g = jArr;
        this.h = i2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.g;
        System.arraycopy(jArr, i3, jArr, i2, this.h - i3);
        this.h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DI1)) {
            return super.equals(obj);
        }
        DI1 di1 = (DI1) obj;
        if (this.h != di1.h) {
            return false;
        }
        long[] jArr = di1.g;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (this.g[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 = (i2 * 31) + AbstractC1507Lp1.a(this.g[i3]);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC1377Kp1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final DI1 c(int i2) {
        if (i2 < this.h) {
            throw new IllegalArgumentException();
        }
        return new DI1(this.h, Arrays.copyOf(this.g, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f(i2);
        return Long.valueOf(this.g[i2]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.g[i3] == longValue) {
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

    public final void d(long j) {
        a();
        int i2 = this.h;
        long[] jArr = this.g;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.g = jArr2;
        }
        long[] jArr3 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        jArr3[i3] = j;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1507Lp1.a;
        collection.getClass();
        if (!(collection instanceof DI1)) {
            return super.addAll(collection);
        }
        DI1 di1 = (DI1) collection;
        int i2 = di1.h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.g;
        if (i4 > jArr.length) {
            this.g = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(di1.g, 0, this.g, this.h, di1.h);
        this.h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        f(i2);
        long[] jArr = this.g;
        long j = jArr[i2];
        if (i2 < this.h - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    public final void f(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
    }
}
