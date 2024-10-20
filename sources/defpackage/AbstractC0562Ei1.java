package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ei1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0562Ei1 extends AbstractC11861yi1 implements List, RandomAccess {
    public static final C0172Bi1 g = new C0172Bi1(OL2.j, 0);

    @Override // defpackage.AbstractC11861yi1
    public final AbstractC0562Ei1 a() {
        return this;
    }

    public static OL2 m(int i, Object[] objArr) {
        if (i == 0) {
            return OL2.j;
        }
        return new OL2(i, objArr);
    }

    public static OL2 s(Object... objArr) {
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = "ANDROID_GSA";
        objArr2[1] = "ANDROID_GSA_ANDROID_PRIMES";
        objArr2[2] = "ANDROID_GSA_COUNTERS";
        objArr2[3] = "ANDROID_GSA_HIGH_PRIORITY_EVENTS";
        objArr2[4] = "CLIENT_LOGGING_PROD";
        objArr2[5] = "CRONET_ANDROID_GSA";
        objArr2[6] = "SEARCHLITE";
        objArr2[7] = "SEARCHLITE_ANDROID_PRIMES";
        objArr2[8] = "SILK_NATIVE";
        objArr2[9] = "XUIKIT";
        objArr2[10] = "XUIKIT_COUNTERS";
        objArr2[11] = "STREAMZ_XUIKIT_CLIENT_ERRORS";
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        L82.a(length, objArr2);
        return m(length, objArr2);
    }

    public static OL2 q(Serializable serializable, Serializable serializable2) {
        Object[] objArr = {serializable, serializable2};
        L82.a(2, objArr);
        return m(2, objArr);
    }

    public static OL2 r(Object obj) {
        Object[] objArr = {obj};
        L82.a(1, objArr);
        return m(1, objArr);
    }

    public static AbstractC0562Ei1 n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return OL2.j;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        C0042Ai1 c0042Ai1 = new C0042Ai1();
        c0042Ai1.c(next);
        while (it.hasNext()) {
            c0042Ai1.c(it.next());
        }
        return c0042Ai1.f();
    }

    public static AbstractC0562Ei1 o(Collection collection) {
        if (collection instanceof AbstractC11861yi1) {
            AbstractC0562Ei1 a = ((AbstractC11861yi1) collection).a();
            if (!a.k()) {
                return a;
            }
            Object[] array = a.toArray();
            return m(array.length, array);
        }
        Object[] array2 = collection.toArray();
        L82.a(array2.length, array2);
        return m(array2.length, array2);
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC11861yi1
    /* renamed from: l */
    public final C14 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final C0172Bi1 listIterator(int i) {
        size();
        if (isEmpty()) {
            return g;
        }
        return new C0172Bi1(this, i);
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC0562Ei1 subList(int i, int i2) {
        size();
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return OL2.j;
        }
        return new C0432Di1(this, i, i3);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC11861yi1
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public AbstractC0562Ei1 t() {
        return size() <= 1 ? this : new C0302Ci1(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (V82.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                C0172Bi1 listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (listIterator.hasNext()) {
                    if (it.hasNext() && V82.a(listIterator.next(), it.next())) {
                    }
                }
                return true ^ it.hasNext();
            }
        }
        return false;
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }
}
