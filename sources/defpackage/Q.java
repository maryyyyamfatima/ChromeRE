package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Q extends AbstractCollection {
    public final Object a;
    public Collection g;
    public final Q h;
    public final Collection i;
    public final /* synthetic */ X j;

    public Q(X x, Object obj, Collection collection, Q q) {
        this.j = x;
        this.a = obj;
        this.g = collection;
        this.h = q;
        this.i = q == null ? null : q.g;
    }

    public final void b() {
        Collection collection;
        Q q = this.h;
        if (q != null) {
            q.b();
            if (q.g != this.i) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.g.isEmpty() || (collection = (Collection) this.j.h.get(this.a)) == null) {
                return;
            }
            this.g = collection;
        }
    }

    public final void d() {
        Q q = this.h;
        if (q != null) {
            q.d();
        } else if (this.g.isEmpty()) {
            this.j.h.remove(this.a);
        }
    }

    public final void a() {
        Q q = this.h;
        if (q != null) {
            q.a();
        } else {
            this.j.h.put(this.a, this.g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.g.size();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.g.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.g.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.g.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new P(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean isEmpty = this.g.isEmpty();
        boolean add = this.g.add(obj);
        if (add) {
            this.j.i++;
            if (isEmpty) {
                a();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.g.addAll(collection);
        if (addAll) {
            this.j.i += this.g.size() - size;
            if (size == 0) {
                a();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.g.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.g.clear();
        this.j.i -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean remove = this.g.remove(obj);
        if (remove) {
            X x = this.j;
            x.i--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.g.removeAll(collection);
        if (removeAll) {
            this.j.i += this.g.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int size = size();
        boolean retainAll = this.g.retainAll(collection);
        if (retainAll) {
            this.j.i += this.g.size() - size;
            d();
        }
        return retainAll;
    }
}
