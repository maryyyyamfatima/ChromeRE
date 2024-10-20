package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ce3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284Ce3 extends AbstractMap {
    public static final /* synthetic */ int l = 0;
    public final int a;
    public boolean i;
    public volatile C1064Ie3 j;
    public List g = Collections.emptyList();
    public Map h = Collections.emptyMap();
    public Map k = Collections.emptyMap();

    public C0284Ce3(int i) {
        this.a = i;
    }

    public final int i() {
        return this.g.size();
    }

    public final Map.Entry h(int i) {
        return (Map.Entry) this.g.get(i);
    }

    public final Iterable j() {
        if (this.h.isEmpty()) {
            return AbstractC0674Fe3.b;
        }
        return this.h.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.h.size() + this.g.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.h.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a < 0) {
            return this.h.get(comparable);
        }
        return ((C0804Ge3) this.g.get(a)).g;
    }

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((C0804Ge3) this.g.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.g.isEmpty();
        int i = this.a;
        if (isEmpty && !(this.g instanceof ArrayList)) {
            this.g = new ArrayList(i);
        }
        int i2 = -(a + 1);
        if (i2 >= i) {
            return k().put(comparable, obj);
        }
        if (this.g.size() == i) {
            C0804Ge3 c0804Ge3 = (C0804Ge3) this.g.remove(i - 1);
            k().put(c0804Ge3.a, c0804Ge3.g);
        }
        this.g.add(i2, new C0804Ge3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.g.isEmpty()) {
            this.g.clear();
        }
        if (this.h.isEmpty()) {
            return;
        }
        this.h.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return p(a);
        }
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.remove(comparable);
    }

    public final Object p(int i) {
        b();
        Object obj = ((C0804Ge3) this.g.remove(i)).g;
        if (!this.h.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            List list = this.g;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C0804Ge3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final int a(Comparable comparable) {
        int size = this.g.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C0804Ge3) this.g.get(size)).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C0804Ge3) this.g.get(i2)).a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.j == null) {
            this.j = new C1064Ie3(this);
        }
        return this.j;
    }

    public final void b() {
        if (this.i) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap k() {
        b();
        if (this.h.isEmpty() && !(this.h instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.h = treeMap;
            this.k = treeMap.descendingMap();
        }
        return (SortedMap) this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0284Ce3)) {
            return super.equals(obj);
        }
        C0284Ce3 c0284Ce3 = (C0284Ce3) obj;
        int size = size();
        if (size != c0284Ce3.size()) {
            return false;
        }
        int i = i();
        if (i != c0284Ce3.i()) {
            return entrySet().equals(c0284Ce3.entrySet());
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!h(i2).equals(c0284Ce3.h(i2))) {
                return false;
            }
        }
        if (i != size) {
            return this.h.equals(c0284Ce3.h);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i = i();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += ((C0804Ge3) this.g.get(i3)).hashCode();
        }
        return this.h.size() > 0 ? i2 + this.h.hashCode() : i2;
    }
}
