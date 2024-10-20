package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JY extends AbstractSet {
    public final /* synthetic */ OY a;

    public JY(OY oy) {
        this.a = oy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int b = oy.b(entry.getKey());
        return b != -1 && V82.a(oy.j(b), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (oy.a == null) {
            return false;
        }
        int i = (1 << (oy.j & 31)) - 1;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = oy.a;
        Objects.requireNonNull(obj2);
        int b = RY.b(key, value, i, obj2, oy.f(), oy.g(), oy.h());
        if (b == -1) {
            return false;
        }
        oy.d(b, i);
        oy.k--;
        oy.j += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.entrySet().iterator();
        }
        return new HY(oy);
    }
}
