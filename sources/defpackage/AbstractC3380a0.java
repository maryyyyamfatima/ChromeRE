package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3380a0 implements Iterator, j$.util.Iterator {
    public int a;
    public int g;
    public int h;
    public final /* synthetic */ C6854k61 i;

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public AbstractC3380a0(C6854k61 c6854k61) {
        this.i = c6854k61;
        N82 n82 = c6854k61.h;
        this.a = n82.c == 0 ? -1 : 0;
        this.g = -1;
        this.h = n82.d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.i.h.d == this.h) {
            return this.a >= 0;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        C6854k61 c6854k61 = this.i;
        if (c6854k61.h.d != this.h) {
            throw new ConcurrentModificationException();
        }
        c6854k61.i -= r1.c(this.g);
        int i = this.a;
        N82 n82 = c6854k61.h;
        n82.getClass();
        this.a = i - 1;
        this.g = -1;
        this.h = n82.d;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.a);
        int i = this.a;
        this.g = i;
        int i2 = i + 1;
        if (i2 >= this.i.h.c) {
            i2 = -1;
        }
        this.a = i2;
        return a;
    }
}
