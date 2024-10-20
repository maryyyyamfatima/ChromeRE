package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U extends W implements NavigableSet {
    public final /* synthetic */ X l;

    @Override // defpackage.W
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet f() {
        return (NavigableSet) ((SortedSet) this.g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x, Object obj, NavigableSet navigableSet, Q q) {
        super(x, obj, navigableSet, q);
        this.l = x;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floor(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC2691Us1.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC2691Us1.a(descendingIterator());
    }

    public final U k(NavigableSet navigableSet) {
        Q q = this.h;
        if (q == null) {
            q = this;
        }
        return new U(this.l, this.a, navigableSet, q);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return k(f().descendingSet());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new P(this, f().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return k(f().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return k(f().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return k(f().tailSet(obj, z));
    }
}
