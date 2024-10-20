package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S extends P implements ListIterator {
    public final /* synthetic */ T i;

    public final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t) {
        super(t);
        this.i = t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t, int i) {
        super(t, ((List) t.g).listIterator(i));
        this.i = t;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        T t = this.i;
        boolean isEmpty = t.isEmpty();
        b().add(obj);
        t.k.i++;
        if (isEmpty) {
            t.a();
        }
    }
}
