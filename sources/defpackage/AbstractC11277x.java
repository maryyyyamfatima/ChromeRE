package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11277x extends C14 implements ListIterator {
    public final int a;
    public int g;

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        a(obj);
        throw null;
    }

    public abstract Object b(int i);

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        c(obj);
        throw null;
    }

    public AbstractC11277x(int i, int i2) {
        this.a = i;
        this.g = i2;
    }

    public final void a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void c(Object obj) {
        throw new UnsupportedOperationException();
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
        int i = this.g;
        this.g = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.g;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.g > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.g - 1;
        this.g = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.g - 1;
    }
}
