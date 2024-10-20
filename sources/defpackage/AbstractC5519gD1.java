package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gD1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5519gD1 extends AbstractC8269oD1 implements InterfaceC2608Ub3 {
    public final ArrayList g = new ArrayList();

    @Override // defpackage.InterfaceC2608Ub3
    public final Object get(int i) {
        return this.g.get(i);
    }

    @Override // defpackage.InterfaceC2608Ub3
    public final int size() {
        return this.g.size();
    }

    @Override // defpackage.InterfaceC2608Ub3, java.lang.Iterable
    public final Iterator iterator() {
        return this.g.iterator();
    }

    public final void s(Object obj) {
        this.g.add(obj);
        q(r0.size() - 1, 1);
    }

    public void t(int i, C7272lK1 c7272lK1) {
        this.g.add(i, c7272lK1);
        q(i, 1);
    }

    public void u(int i, Collection collection) {
        this.g.addAll(i, collection);
        q(i, collection.size());
    }

    public void v(InterfaceC2608Ub3 interfaceC2608Ub3, int i) {
        Iterator it = interfaceC2608Ub3.iterator();
        int i2 = i;
        while (it.hasNext()) {
            this.g.add(i2, it.next());
            i2++;
        }
        q(i, interfaceC2608Ub3.size());
    }

    public final void x(C7272lK1 c7272lK1) {
        y(this.g.indexOf(c7272lK1));
    }

    public Object y(int i) {
        Object remove = this.g.remove(i);
        r(i, 1);
        return remove;
    }

    public void z(int i, int i2) {
        this.g.subList(i, i + i2).clear();
        r(i, i2);
    }

    public void A(List list) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int size2 = list.size();
        arrayList.clear();
        arrayList.addAll(list);
        int min = Math.min(size, size2);
        if (min > 0) {
            o(null, 0, min);
        }
        if (size2 > size) {
            q(min, size2 - size);
        } else if (size2 < size) {
            r(min, size - size2);
        }
    }

    public final void B(int i, Object obj) {
        this.g.set(i, obj);
        o(null, i, 1);
    }

    public final int indexOf(Object obj) {
        return this.g.indexOf(obj);
    }

    public final void w(int i, int i2) {
        ArrayList arrayList = this.g;
        Object remove = arrayList.remove(i);
        if (i2 == arrayList.size()) {
            arrayList.add(remove);
        } else {
            arrayList.add(i2, remove);
        }
        n(i, i2);
    }

    public final void clear() {
        if (size() > 0) {
            z(0, size());
        }
    }
}
