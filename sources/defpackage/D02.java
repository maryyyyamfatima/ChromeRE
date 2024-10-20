package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D02 implements Iterator, j$.util.Iterator {
    public final B02 a;
    public final Iterator g;
    public C02 h;
    public int i;
    public int j;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public D02(B02 b02, java.util.Iterator it) {
        this.a = b02;
        this.g = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.i > 0 || this.g.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.i == 0) {
            C02 c02 = (C02) this.g.next();
            this.h = c02;
            int a = c02.a();
            this.i = a;
            this.j = a;
        }
        this.i--;
        C02 c022 = this.h;
        Objects.requireNonNull(c022);
        return ((M82) c022).a;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (this.j == 1) {
            this.g.remove();
        } else {
            C02 c02 = this.h;
            Objects.requireNonNull(c02);
            ((AbstractC6130i0) this.a).remove(((M82) c02).a);
        }
        this.j--;
    }
}
