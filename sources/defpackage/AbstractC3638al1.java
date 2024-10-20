package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: al1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3638al1 implements Iterator, j$.util.Iterator {
    public int a;
    public int g;
    public boolean h;

    public abstract Object a(int i);

    public abstract void b(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public AbstractC3638al1(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.g < this.a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a = a(this.g);
        this.g++;
        this.h = true;
        return a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i = this.g - 1;
        this.g = i;
        b(i);
        this.a--;
        this.h = false;
    }
}
