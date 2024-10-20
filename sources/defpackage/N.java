package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class N extends H implements SortedMap {
    public SortedSet k;
    public final /* synthetic */ X l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(X x, SortedMap sortedMap) {
        super(x, sortedMap);
        this.l = x;
    }

    public SortedMap f() {
        return (SortedMap) this.i;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap headMap(Object obj) {
        return new N(this.l, f().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new N(this.l, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new N(this.l, f().tailMap(obj));
    }

    @Override // defpackage.H, defpackage.ZL1, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.k;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b = b();
        this.k = b;
        return b;
    }

    @Override // defpackage.ZL1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet b() {
        return new O(this.l, f());
    }
}
