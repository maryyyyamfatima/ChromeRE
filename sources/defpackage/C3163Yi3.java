package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3163Yi3 extends AbstractMap {
    public final Object a;
    public Map g;
    public final /* synthetic */ C6168i61 h;

    public C3163Yi3(C6168i61 c6168i61, Object obj) {
        this.h = c6168i61;
        this.a = obj;
    }

    public final void b() {
        Map map = this.g;
        Object obj = this.a;
        C6168i61 c6168i61 = this.h;
        if (map == null || (map.isEmpty() && c6168i61.g.containsKey(obj))) {
            this.g = (Map) c6168i61.g.get(obj);
        }
    }

    public final void a() {
        b();
        Map map = this.g;
        if (map == null || !map.isEmpty()) {
            return;
        }
        this.h.g.remove(this.a);
        this.g = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map;
        boolean z;
        b();
        if (obj == null || (map = this.g) == null) {
            return false;
        }
        try {
            z = map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map;
        b();
        if (obj == null || (map = this.g) == null) {
            return null;
        }
        return AbstractC3502aM1.b(map, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Map map = this.g;
        if (map != null && !map.isEmpty()) {
            return this.g.put(obj, obj2);
        }
        return this.h.b(this.a, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Map map = this.g;
        Object obj2 = null;
        if (map == null) {
            return null;
        }
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
        }
        a();
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        Map map = this.g;
        if (map != null) {
            map.clear();
        }
        a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        b();
        Map map = this.g;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new WL1(this);
    }
}
