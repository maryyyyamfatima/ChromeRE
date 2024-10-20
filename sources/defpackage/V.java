package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V extends Q implements Set {
    public final /* synthetic */ X k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x, Object obj, Set set) {
        super(x, obj, set, null);
        this.k = x;
    }

    @Override // defpackage.Q, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean b = AbstractC7882n53.b((Set) this.g, collection);
        if (b) {
            this.k.i += this.g.size() - size;
            d();
        }
        return b;
    }
}
