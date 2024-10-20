package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9281rA0 implements Map, Serializable {
    public static final C9281rA0 a = new C9281rA0();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        AbstractC0087Ar1.e((Void) obj, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C10310uA0.a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C10310uA0.a;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C8939qA0.a;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }
}
