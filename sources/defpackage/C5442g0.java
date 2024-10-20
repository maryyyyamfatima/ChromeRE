package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5442g0 extends AbstractC6850k53 {
    public final /* synthetic */ AbstractC6130i0 a;

    public C5442g0(AbstractC6130i0 abstractC6130i0) {
        this.a = abstractC6130i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6854k61 c6854k61 = (C6854k61) this.a;
        c6854k61.getClass();
        return new Y(c6854k61);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        ((C6854k61) this.a).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return ((C6854k61) this.a).f(Integer.MAX_VALUE, obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.a.d().size();
    }
}
