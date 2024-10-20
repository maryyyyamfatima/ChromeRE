package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2514Tj implements Iterator, j$.util.Iterator {
    public final Object[] a;
    public int g;

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

    public C2514Tj(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.g < this.a.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.a;
            int i = this.g;
            this.g = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.g--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
