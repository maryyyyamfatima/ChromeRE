package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ss1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2431Ss1 implements Iterator, j$.util.Iterator {
    public Iterator a;
    public Iterator g = C2301Rs1.i;
    public Iterator h;
    public ArrayDeque i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public C2431Ss1(SQ0 sq0) {
        this.h = sq0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        while (!this.g.hasNext()) {
            while (true) {
                java.util.Iterator it2 = this.h;
                if (it2 == null || !it2.hasNext()) {
                    ArrayDeque arrayDeque = this.i;
                    if (arrayDeque == null || arrayDeque.isEmpty()) {
                        break;
                    }
                    this.h = (java.util.Iterator) this.i.removeFirst();
                } else {
                    it = this.h;
                    break;
                }
            }
            it = null;
            this.h = it;
            if (it == null) {
                return false;
            }
            java.util.Iterator it3 = (java.util.Iterator) it.next();
            this.g = it3;
            if (it3 instanceof C2431Ss1) {
                C2431Ss1 c2431Ss1 = (C2431Ss1) it3;
                this.g = c2431Ss1.g;
                if (this.i == null) {
                    this.i = new ArrayDeque();
                }
                this.i.addFirst(this.h);
                if (c2431Ss1.i != null) {
                    while (!c2431Ss1.i.isEmpty()) {
                        this.i.addFirst((java.util.Iterator) c2431Ss1.i.removeLast());
                    }
                }
                this.h = c2431Ss1.h;
            }
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            java.util.Iterator it = this.g;
            this.a = it;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        java.util.Iterator it = this.a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
