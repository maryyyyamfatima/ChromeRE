package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722Fo1 implements Iterator, j$.util.Iterator {
    public final int a;
    public final int g;
    public boolean h;
    public int i;

    public final void b() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    /* renamed from: forEachRemaining$kotlin$collections$IntIterator, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        b();
        throw null;
    }

    public C0722Fo1(int i, int i2, int i3) {
        this.a = i3;
        this.g = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.h = z;
        this.i = z ? i : i2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        int i = this.i;
        if (i == this.g) {
            if (!this.h) {
                throw new NoSuchElementException();
            }
            this.h = false;
        } else {
            this.i = this.a + i;
        }
        return Integer.valueOf(i);
    }
}
