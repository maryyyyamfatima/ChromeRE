package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class T extends Q implements List {
    public final /* synthetic */ X k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(X x, Object obj, List list, Q q) {
        super(x, obj, list, q);
        this.k = x;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.g).addAll(i, collection);
        if (addAll) {
            this.k.i += this.g.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.g).get(i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.g).set(i, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.g.isEmpty();
        ((List) this.g).add(i, obj);
        this.k.i++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = ((List) this.g).remove(i);
        X x = this.k;
        x.i--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.g).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.g).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new S(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new S(this, i);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = ((List) this.g).subList(i, i2);
        Q q = this.h;
        if (q == null) {
            q = this;
        }
        X x = this.k;
        x.getClass();
        boolean z = subList instanceof RandomAccess;
        Object obj = this.a;
        if (z) {
            return new M(x, obj, subList, q);
        }
        return new T(x, obj, subList, q);
    }
}
