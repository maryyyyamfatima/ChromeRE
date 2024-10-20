package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class P implements Iterator, j$.util.Iterator {
    public final Iterator a;
    public final Collection g;
    public final /* synthetic */ Q h;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public P(Q q) {
        java.util.Iterator it;
        this.h = q;
        Collection collection = q.g;
        this.g = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    public P(Q q, java.util.Iterator it) {
        this.h = q;
        this.g = q.g;
        this.a = it;
    }

    public final void a() {
        Q q = this.h;
        q.b();
        if (q.g != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.a.remove();
        Q q = this.h;
        X x = q.j;
        x.i--;
        q.d();
    }
}
