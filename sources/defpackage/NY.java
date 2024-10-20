package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NY extends AbstractCollection {
    public final /* synthetic */ OY a;

    public NY(OY oy) {
        this.a = oy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        OY oy = this.a;
        Map a = oy.a();
        if (a != null) {
            return a.values().iterator();
        }
        return new IY(oy);
    }
}
