package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oE2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8275oE2 extends AbstractC7504m0 implements RandomAccess {
    public static final C8275oE2 i;
    public Object[] g;
    public int h;

    static {
        C8275oE2 c8275oE2 = new C8275oE2(0, new Object[0]);
        i = c8275oE2;
        c8275oE2.a = false;
    }

    public C8275oE2(int i2, Object[] objArr) {
        this.g = objArr;
        this.h = i2;
    }

    @Override // defpackage.InterfaceC1377Kp1
    public final InterfaceC1377Kp1 c(int i2) {
        if (i2 < this.h) {
            throw new IllegalArgumentException();
        }
        return new C8275oE2(this.h, Arrays.copyOf(this.g, i2));
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.h;
        Object[] objArr = this.g;
        if (i2 == objArr.length) {
            this.g = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.g;
        int i3 = this.h;
        this.h = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.h)) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
        Object[] objArr = this.g;
        if (i3 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
        } else {
            Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.g, i2, objArr2, i2 + 1, this.h - i2);
            this.g = objArr2;
        }
        this.g[i2] = obj;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        d(i2);
        return this.g[i2];
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        d(i2);
        Object[] objArr = this.g;
        Object obj = objArr[i2];
        if (i2 < this.h - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        d(i2);
        Object[] objArr = this.g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }

    public final void d(int i2) {
        if (i2 < 0 || i2 >= this.h) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("Index:", i2, ", Size:", this.h));
        }
    }
}
