package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3630ak implements Collection {
    public final /* synthetic */ C4317ck a;

    public C3630ak(C4317ck c4317ck) {
        this.a = c4317ck;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3974bk(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C4317ck c4317ck = this.a;
        int a = c4317ck.a(obj);
        if (a < 0) {
            return false;
        }
        c4317ck.h(a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C4317ck c4317ck = this.a;
        int i = c4317ck.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c4317ck.j(i2))) {
                c4317ck.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C4317ck c4317ck = this.a;
        int i = c4317ck.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c4317ck.j(i2))) {
                c4317ck.h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C4317ck c4317ck = this.a;
        int i = c4317ck.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4317ck.j(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C4317ck c4317ck = this.a;
        int i = c4317ck.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c4317ck.j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
