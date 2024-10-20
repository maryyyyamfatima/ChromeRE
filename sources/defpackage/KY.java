package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class KY implements Iterator, j$.util.Iterator {
    public int a;
    public int g;
    public int h;
    public final /* synthetic */ OY i;

    public abstract Object a(int i);

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        OY oy = this.i;
        if (oy.j == this.a) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.g;
            this.h = i;
            Object a = a(i);
            int i2 = this.g + 1;
            if (i2 >= oy.k) {
                i2 = -1;
            }
            this.g = i2;
            return a;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        OY oy = this.i;
        int i = oy.j;
        int i2 = this.a;
        if (i == i2) {
            int i3 = this.h;
            this.a = i2 + 32;
            oy.remove(oy.c(i3));
            this.g--;
            this.h = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }

    public KY(OY oy) {
        this.i = oy;
        this.a = oy.j;
        this.g = oy.isEmpty() ? -1 : 0;
        this.h = -1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.g >= 0;
    }
}
