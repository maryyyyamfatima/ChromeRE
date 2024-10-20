package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4208cQ0 extends AbstractC7504m0 implements RandomAccess, InterfaceC2337Rz2 {
    public static final /* synthetic */ int i = 0;
    public float[] g;
    public int h;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
        float[] fArr = this.g;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.g, i2, fArr2, i2 + 1, this.h - i2);
            this.g = fArr2;
        }
        this.g[i2] = floatValue;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        f(i2);
        float[] fArr = this.g;
        float f = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f);
    }

    static {
        new C4208cQ0(0, new float[0]).a = false;
    }

    public C4208cQ0(int i2, float[] fArr) {
        this.g = fArr;
        this.h = i2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.g;
        System.arraycopy(fArr, i3, fArr, i2, this.h - i3);
        this.h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4208cQ0)) {
            return super.equals(obj);
        }
        C4208cQ0 c4208cQ0 = (C4208cQ0) obj;
        if (this.h != c4208cQ0.h) {
            return false;
        }
        float[] fArr = c4208cQ0.g;
        for (int i2 = 0; i2 < this.h; i2++) {
            if (Float.floatToIntBits(this.g[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.h; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.g[i3]);
        }
        return i2;
    }

    @Override // defpackage.InterfaceC1377Kp1
    public final InterfaceC1377Kp1 c(int i2) {
        if (i2 < this.h) {
            throw new IllegalArgumentException();
        }
        return new C4208cQ0(this.h, Arrays.copyOf(this.g, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        f(i2);
        return Float.valueOf(this.g[i2]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.g[i3] == floatValue) {
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

    public final void d(float f) {
        a();
        int i2 = this.h;
        float[] fArr = this.g;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.g = fArr2;
        }
        float[] fArr3 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        fArr3[i3] = f;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC1507Lp1.a;
        collection.getClass();
        if (!(collection instanceof C4208cQ0)) {
            return super.addAll(collection);
        }
        C4208cQ0 c4208cQ0 = (C4208cQ0) collection;
        int i2 = c4208cQ0.h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.g;
        if (i4 > fArr.length) {
            this.g = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(c4208cQ0.g, 0, this.g, this.h, c4208cQ0.h);
        this.h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        f(i2);
        float[] fArr = this.g;
        float f = fArr[i2];
        if (i2 < this.h - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    public final void f(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
    }
}
