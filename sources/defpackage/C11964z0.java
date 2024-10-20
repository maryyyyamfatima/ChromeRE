package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11964z0 extends AbstractSet {
    public final /* synthetic */ A0 a;

    public C11964z0(A0 a0) {
        this.a = a0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        if (!(obj instanceof AbstractC12048zE3)) {
            return false;
        }
        AE3 ae3 = (AE3) ((AbstractC12048zE3) obj);
        Map map = (Map) AbstractC3502aM1.b(this.a.d(), ae3.a);
        if (map == null) {
            return false;
        }
        try {
            z = map.entrySet().contains(new C12204zi1(ae3.g, ae3.h));
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean z;
        if (!(obj instanceof AbstractC12048zE3)) {
            return false;
        }
        AE3 ae3 = (AE3) ((AbstractC12048zE3) obj);
        Map map = (Map) AbstractC3502aM1.b(this.a.d(), ae3.a);
        if (map == null) {
            return false;
        }
        try {
            z = map.entrySet().remove(new C12204zi1(ae3.g, ae3.h));
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        ((C6168i61) this.a).g.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6168i61 c6168i61 = (C6168i61) this.a;
        c6168i61.getClass();
        return new C2773Vi3(c6168i61);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = ((C6168i61) this.a).g.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map) it.next()).size();
        }
        return i;
    }
}
