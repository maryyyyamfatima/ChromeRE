package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5786h0 extends AbstractC6850k53 {
    public final /* synthetic */ AbstractC6130i0 a;

    public C5786h0(AbstractC6130i0 abstractC6130i0) {
        this.a = abstractC6130i0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6854k61 c6854k61 = (C6854k61) this.a;
        c6854k61.getClass();
        return new Z(c6854k61);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((C6854k61) this.a).h.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        if (!(obj instanceof C02)) {
            return false;
        }
        C02 c02 = (C02) obj;
        return c02.a() > 0 && ((C6854k61) this.a).k(((M82) c02).a) == c02.a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        if (!(obj instanceof C02)) {
            return false;
        }
        C02 c02 = (C02) obj;
        Object obj2 = ((M82) c02).a;
        int a = c02.a();
        if (a == 0) {
            return false;
        }
        C6854k61 c6854k61 = (C6854k61) this.a;
        c6854k61.getClass();
        RV.b(a, "oldCount");
        RV.b(0, "newCount");
        N82 n82 = c6854k61.h;
        int a2 = n82.a(obj2);
        if (a2 == -1) {
            if (a != 0) {
                return false;
            }
        } else {
            if (n82.b[a2] != a) {
                return false;
            }
            n82.c(a2);
            c6854k61.i -= a;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        ((C6854k61) this.a).clear();
    }
}
