package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A extends C11963z implements ListIterator {
    public final /* synthetic */ C h;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C c, int i) {
        super(c);
        this.h = c;
        int a = c.a();
        if (i >= 0 && i <= a) {
            this.a = i;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0800Ge.a("index: ", i, ", size: ", a));
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.a - 1;
            this.a = i;
            return this.h.get(i);
        }
        throw new NoSuchElementException();
    }
}
