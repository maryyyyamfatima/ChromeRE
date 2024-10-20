package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FN0 implements Iterator, j$.util.Iterator {
    public final Iterator a;
    public int g = -1;
    public Object h;
    public final /* synthetic */ GN0 i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public FN0(GN0 gn0) {
        this.i = gn0;
        this.a = gn0.a.iterator();
    }

    public final void a() {
        Object next;
        GN0 gn0;
        do {
            java.util.Iterator it = this.a;
            if (it.hasNext()) {
                next = it.next();
                gn0 = this.i;
            } else {
                this.g = 0;
                return;
            }
        } while (((Boolean) gn0.c.b(next)).booleanValue() != gn0.b);
        this.h = next;
        this.g = 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.g == -1) {
            a();
        }
        if (this.g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.h;
        this.h = null;
        this.g = -1;
        return obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.g == -1) {
            a();
        }
        return this.g == 1;
    }
}
