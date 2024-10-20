package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class J extends XL1 {
    public final /* synthetic */ X g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(X x, Map map) {
        super(map);
        this.g = x;
    }

    @Override // defpackage.XL1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new I(this, this.a.entrySet().iterator());
    }

    @Override // defpackage.XL1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.g.i -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // defpackage.XL1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            I i = (I) it;
            if (!i.hasNext()) {
                return;
            }
            i.next();
            i.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.keySet().hashCode();
    }
}
