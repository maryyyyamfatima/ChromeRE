package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ES0 extends CS0 implements Set, Collection {
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return obj == this || ((C7538m53) this).g.equals(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        return ((C7538m53) this).g.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return ((C7538m53) this).g.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return ((C7538m53) this).g.size();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        return ((C7538m53) this).g.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return ((C7538m53) this).g.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        return ((C7538m53) this).g.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        return ((C7538m53) this).g.add(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return ((C7538m53) this).g.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        return ((C7538m53) this).g.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        return ((C7538m53) this).g.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        return ((C7538m53) this).g.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        ((C7538m53) this).g.clear();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        return ((C7538m53) this).g.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        return ((C7538m53) this).g.toArray(objArr);
    }
}
