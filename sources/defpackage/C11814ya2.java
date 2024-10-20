package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ya2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11814ya2 implements Iterator, java.util.Iterator {
    public int a;
    public int g;
    public boolean h;
    public final /* synthetic */ C12157za2 i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final void b() {
        C12157za2 c12157za2 = this.i;
        if (c12157za2.k) {
            c12157za2.g.getClass();
        }
        a();
        c12157za2.h++;
        this.a = c12157za2.a.size();
        this.h = false;
        this.g = 0;
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        C12157za2 c12157za2 = this.i;
        if (c12157za2.k) {
            c12157za2.g.getClass();
        }
        int i = this.g;
        while (i < this.a && c12157za2.a.get(i) == null) {
            i++;
        }
        if (i < this.a) {
            return true;
        }
        a();
        return false;
    }

    @Override // j$.util.Iterator
    public final Object next() {
        ArrayList arrayList;
        C12157za2 c12157za2 = this.i;
        if (c12157za2.k) {
            c12157za2.g.getClass();
        }
        while (true) {
            int i = this.g;
            int i2 = this.a;
            arrayList = c12157za2.a;
            if (i >= i2 || arrayList.get(i) != null) {
                break;
            }
            this.g++;
        }
        int i3 = this.g;
        if (i3 < this.a) {
            this.g = i3 + 1;
            return arrayList.get(i3);
        }
        a();
        throw new NoSuchElementException();
    }

    public C11814ya2(C12157za2 c12157za2) {
        this.i = c12157za2;
        c12157za2.h++;
        this.a = c12157za2.a.size();
    }

    @Override // j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        C12157za2 c12157za2 = this.i;
        int i = c12157za2.h - 1;
        c12157za2.h = i;
        if (i > 0 || !c12157za2.j) {
            return;
        }
        c12157za2.j = false;
        ArrayList arrayList = c12157za2.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
