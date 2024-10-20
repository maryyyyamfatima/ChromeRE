package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PL2 extends AbstractC0562Ei1 {
    public final /* synthetic */ QL2 h;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        QL2 ql2 = this.h;
        int i2 = ql2.l;
        int i3 = i * 2;
        int i4 = ql2.k;
        Object[] objArr = ql2.j;
        Object obj = objArr[i4 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + (i4 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.l;
    }

    public PL2(QL2 ql2) {
        this.h = ql2;
    }
}
