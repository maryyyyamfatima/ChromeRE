package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F14 extends AbstractList implements InterfaceC6812jz1, RandomAccess {
    public final InterfaceC6812jz1 a;

    @Override // defpackage.InterfaceC6812jz1
    public final InterfaceC6812jz1 i() {
        return this;
    }

    public F14(InterfaceC6812jz1 interfaceC6812jz1) {
        this.a = interfaceC6812jz1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.InterfaceC6812jz1
    public final Object j(int i) {
        return this.a.j(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.InterfaceC6812jz1
    public final void h(AbstractC4147cE abstractC4147cE) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new D14(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new E14(this);
    }

    @Override // defpackage.InterfaceC6812jz1
    public final List e() {
        return this.a.e();
    }
}
