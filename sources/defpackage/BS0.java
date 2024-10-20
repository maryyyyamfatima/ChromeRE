package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BS0 extends CS0 implements Map {
    @Override // java.util.Map
    public final int size() {
        return ((BT2) this).a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((BT2) this).a.isEmpty();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return ((BT2) this).a.remove(obj);
    }

    @Override // java.util.Map
    public final void clear() {
        ((BT2) this).a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((BT2) this).a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((BT2) this).a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return ((BT2) this).a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return ((BT2) this).a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ((BT2) this).a.putAll(map);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return ((BT2) this).a.keySet();
    }

    @Override // java.util.Map
    public final Collection values() {
        return ((BT2) this).a.values();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((BT2) this).a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || ((BT2) this).a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ((BT2) this).a.hashCode();
    }
}
