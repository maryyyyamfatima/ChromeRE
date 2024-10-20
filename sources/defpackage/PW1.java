package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PW1 implements Iterator, j$.util.Iterator {
    public final GW1 a;
    public int g;
    public int h;
    public final /* synthetic */ QW1 i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public PW1(QW1 qw1, GW1 gw1, int i) {
        this.i = qw1;
        this.a = gw1;
        int i2 = i & 31;
        this.g = i2;
        this.h = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.g >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        int i = this.g;
        QW1 qw1 = this.i;
        AbstractC10078tW1 abstractC10078tW1 = qw1.b;
        int d = abstractC10078tW1.d();
        if (i >= d) {
            i -= d;
            abstractC10078tW1 = qw1.c;
        }
        Object cast = this.a.b.cast(abstractC10078tW1.c(i));
        int i2 = this.h;
        if (i2 != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
            this.h >>>= numberOfTrailingZeros;
            this.g += numberOfTrailingZeros;
        } else {
            this.g = -1;
        }
        return cast;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
