package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6130i0 extends AbstractCollection implements B02 {
    public transient C5442g0 a;
    public transient C5786h0 g;

    public abstract int a(int i, Object obj);

    public abstract int f(int i, Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((C6854k61) this).k(obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a(1, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return f(1, obj) > 0;
    }

    public final Set b() {
        C5442g0 c5442g0 = this.a;
        if (c5442g0 != null) {
            return c5442g0;
        }
        C5442g0 c5442g02 = new C5442g0(this);
        this.a = c5442g02;
        return c5442g02;
    }

    public final Set d() {
        C5786h0 c5786h0 = this.g;
        if (c5786h0 != null) {
            return c5786h0;
        }
        C5786h0 c5786h02 = new C5786h0(this);
        this.g = c5786h02;
        return c5786h02;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d().toString();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B02) {
            B02 b02 = (B02) obj;
            C6854k61 c6854k61 = (C6854k61) this;
            if (c6854k61.size() == ((C6854k61) b02).size()) {
                AbstractC6130i0 abstractC6130i0 = (AbstractC6130i0) b02;
                if (d().size() == abstractC6130i0.d().size()) {
                    for (C02 c02 : abstractC6130i0.d()) {
                        if (c6854k61.k(((M82) c02).a) != c02.a()) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        if (!(collection instanceof B02)) {
            if (collection.isEmpty()) {
                return false;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
                z |= true;
            }
            return z;
        }
        B02 b02 = (B02) collection;
        if (b02 instanceof C6854k61) {
            C6854k61 c6854k61 = (C6854k61) b02;
            if (c6854k61.isEmpty()) {
                return false;
            }
            N82 n82 = c6854k61.h;
            int i = n82.c == 0 ? -1 : 0;
            while (i >= 0) {
                ((C6854k61) this).a(n82.b[i], n82.a[i]);
                i++;
                if (i >= n82.c) {
                    i = -1;
                }
            }
        } else {
            AbstractC6130i0 abstractC6130i0 = (AbstractC6130i0) b02;
            if (abstractC6130i0.isEmpty()) {
                return false;
            }
            Iterator it2 = ((C5786h0) abstractC6130i0.d()).iterator();
            while (it2.hasNext()) {
                C02 c02 = (C02) it2.next();
                ((C6854k61) this).a(c02.a(), ((M82) c02).a);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof B02) {
            collection = ((AbstractC6130i0) ((B02) collection)).b();
        }
        return b().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        if (collection instanceof B02) {
            collection = ((AbstractC6130i0) ((B02) collection)).b();
        }
        return b().retainAll(collection);
    }
}
