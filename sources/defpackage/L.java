package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L extends O implements NavigableSet {
    public final /* synthetic */ X i;

    @Override // defpackage.O
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(X x, NavigableMap navigableMap) {
        super(x, navigableMap);
        this.i = x;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return AbstractC2691Us1.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return AbstractC2691Us1.a(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new L(this.i, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((J) descendingSet()).iterator();
    }

    @Override // defpackage.O, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new L(this.i, a().headMap(obj, z));
    }

    @Override // defpackage.O, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new L(this.i, a().subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.O, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new L(this.i, a().tailMap(obj, z));
    }
}
