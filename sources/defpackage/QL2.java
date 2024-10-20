package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QL2 extends AbstractC1472Li1 {
    public final transient AbstractC0952Hi1 i;
    public final transient Object[] j;
    public final transient int k = 0;
    public final transient int l;

    @Override // defpackage.AbstractC11861yi1
    public final boolean k() {
        return true;
    }

    public QL2(AbstractC0952Hi1 abstractC0952Hi1, Object[] objArr, int i) {
        this.i = abstractC0952Hi1;
        this.j = objArr;
        this.l = i;
    }

    @Override // defpackage.AbstractC11861yi1
    /* renamed from: l */
    public final C14 iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.AbstractC11861yi1
    public final int b(int i, Object[] objArr) {
        return a().b(i, objArr);
    }

    @Override // defpackage.AbstractC1472Li1
    public final AbstractC0562Ei1 q() {
        return new PL2(this);
    }

    @Override // defpackage.AbstractC11861yi1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.i.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.l;
    }
}
