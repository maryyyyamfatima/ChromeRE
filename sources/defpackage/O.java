package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class O extends J implements SortedSet {
    public final /* synthetic */ X h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(X x, SortedMap sortedMap) {
        super(x, sortedMap);
        this.h = x;
    }

    public SortedMap a() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new O(this.h, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new O(this.h, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new O(this.h, a().tailMap(obj));
    }
}
