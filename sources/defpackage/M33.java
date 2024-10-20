package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M33 implements Iterator, InterfaceC8927q80, j$.util.Iterator {
    public int a;
    public Object g;
    public Iterator h;
    public InterfaceC8927q80 i;

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

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                java.util.Iterator it = this.h;
                AbstractC0087Ar1.b(it);
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.h = null;
            }
            this.a = 5;
            InterfaceC8927q80 interfaceC8927q80 = this.i;
            AbstractC0087Ar1.b(interfaceC8927q80);
            this.i = null;
            interfaceC8927q80.d(C8546p14.a);
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            java.util.Iterator it = this.h;
            AbstractC0087Ar1.b(it);
            return it.next();
        }
        if (i == 3) {
            this.a = 0;
            Object obj = this.g;
            this.g = null;
            return obj;
        }
        throw a();
    }

    public final RuntimeException a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    @Override // defpackage.InterfaceC8927q80
    public final void d(Object obj) {
        SP2.b(obj);
        this.a = 4;
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        return C7221lA0.a;
    }
}
