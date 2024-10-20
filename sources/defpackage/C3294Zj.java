package defpackage;

import j$.util.Iterator;
import j$.util.Map;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3294Zj implements Iterator, Map.Entry, j$.util.Iterator, Map.Entry {
    public int a;
    public int g = -1;
    public boolean h;
    public final /* synthetic */ C4317ck i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public C3294Zj(C4317ck c4317ck) {
        this.i = c4317ck;
        this.a = c4317ck.h - 1;
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
        this.g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.i.h(this.g);
        this.g--;
        this.a--;
        this.h = false;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getKey() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.i.f(this.g);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.i.j(this.g);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.i.i(this.g, obj);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.g;
        C4317ck c4317ck = this.i;
        return AbstractC0087Ar1.a(key, c4317ck.f(i)) && AbstractC0087Ar1.a(entry.getValue(), c4317ck.j(this.g));
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.g;
        C4317ck c4317ck = this.i;
        Object f = c4317ck.f(i);
        Object j = c4317ck.j(this.g);
        return (f == null ? 0 : f.hashCode()) ^ (j != null ? j.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
