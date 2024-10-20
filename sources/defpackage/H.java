package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class H extends ZL1 {
    public final transient Map i;
    public final /* synthetic */ X j;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        X x = this.j;
        Map map = x.h;
        if (this.i == map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).clear();
            }
            map.clear();
            x.i = 0;
            return;
        }
        G g = new G(this);
        while (g.hasNext()) {
            g.next();
            g.remove();
        }
    }

    @Override // defpackage.ZL1, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        X x = this.j;
        Set set = x.a;
        if (set != null) {
            return set;
        }
        Set d = x.d();
        x.a = d;
        return d;
    }

    public H(X x, Map map) {
        this.j = x;
        this.i = map;
    }

    @Override // defpackage.ZL1
    public final Set a() {
        return new F(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        try {
            return this.i.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Collection collection = (Collection) AbstractC3502aM1.b(this.i, obj);
        if (collection == null) {
            return null;
        }
        return this.j.g(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.i.remove(obj);
        if (collection == null) {
            return null;
        }
        X x = this.j;
        Collection c = x.c();
        c.addAll(collection);
        x.i -= collection.size();
        collection.clear();
        return c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.i.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.i.toString();
    }

    public final C12204zi1 c(Map.Entry entry) {
        Object key = entry.getKey();
        return new C12204zi1(key, this.j.g(key, (Collection) entry.getValue()));
    }
}
