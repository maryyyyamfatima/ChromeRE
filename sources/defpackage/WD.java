package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WD implements Iterator, java.util.Iterator {
    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // j$.util.Iterator
    public final Object next() {
        VD vd = (VD) this;
        int i = vd.a;
        if (i >= vd.g) {
            throw new NoSuchElementException();
        }
        vd.a = i + 1;
        return Byte.valueOf(vd.h.k(i));
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
