package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NW1 implements Iterator, j$.util.Iterator {
    public int a = 0;
    public final /* synthetic */ OW1 g;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public NW1(OW1 ow1) {
        this.g = ow1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.g.a.e;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        QW1 qw1 = this.g.a;
        int[] iArr = qw1.d;
        int i = this.a;
        this.a = i + 1;
        return qw1.d(iArr[i] & 31);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
