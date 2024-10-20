package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LY extends AbstractSet {
    public final /* synthetic */ OY a;

    public LY(OY oy) {
        this.a = oy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.keySet().remove(obj);
        }
        return oy.e(obj) != OY.o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.keySet().iterator();
        }
        return new GY(oy);
    }
}
