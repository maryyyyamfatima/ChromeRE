package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6468iz1 extends AbstractC7504m0 implements InterfaceC6812jz1, RandomAccess {
    public final ArrayList g;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.g.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.g.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC4147cE)) {
            return new String((byte[]) obj2, AbstractC1507Lp1.a);
        }
        AbstractC4147cE abstractC4147cE = (AbstractC4147cE) obj2;
        abstractC4147cE.getClass();
        return abstractC4147cE.size() == 0 ? "" : abstractC4147cE.q(AbstractC1507Lp1.a);
    }

    static {
        new C6468iz1(10).a = false;
    }

    public C6468iz1(int i) {
        this(new ArrayList(i));
    }

    public C6468iz1(ArrayList arrayList) {
        this.g = arrayList;
    }

    @Override // defpackage.InterfaceC1377Kp1
    public final InterfaceC1377Kp1 c(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.g);
        return new C6468iz1(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.g;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC4147cE) {
            AbstractC4147cE abstractC4147cE = (AbstractC4147cE) obj;
            abstractC4147cE.getClass();
            str = abstractC4147cE.size() == 0 ? "" : abstractC4147cE.q(AbstractC1507Lp1.a);
            if (abstractC4147cE.l()) {
                arrayList.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC1507Lp1.a);
            if (AbstractC7551m74.a.c(0, bArr.length, bArr) == 0) {
                arrayList.set(i, str);
            }
        }
        return str;
    }

    @Override // defpackage.InterfaceC6812jz1
    public final InterfaceC6812jz1 i() {
        return this.a ? new F14(this) : this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g.size();
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof InterfaceC6812jz1) {
            collection = ((InterfaceC6812jz1) collection).e();
        }
        boolean addAll = this.g.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.g.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof AbstractC4147cE)) {
            return new String((byte[]) remove, AbstractC1507Lp1.a);
        }
        AbstractC4147cE abstractC4147cE = (AbstractC4147cE) remove;
        abstractC4147cE.getClass();
        return abstractC4147cE.size() == 0 ? "" : abstractC4147cE.q(AbstractC1507Lp1.a);
    }

    @Override // defpackage.AbstractC7504m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC6812jz1
    public final void h(AbstractC4147cE abstractC4147cE) {
        a();
        this.g.add(abstractC4147cE);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC6812jz1
    public final Object j(int i) {
        return this.g.get(i);
    }

    @Override // defpackage.InterfaceC6812jz1
    public final List e() {
        return Collections.unmodifiableList(this.g);
    }
}
