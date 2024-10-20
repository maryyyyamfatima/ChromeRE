package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: He3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0934He3 implements Iterator, j$.util.Iterator {
    public int a = -1;
    public boolean g;
    public Iterator h;
    public final /* synthetic */ C0284Ce3 i;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public C0934He3(C0284Ce3 c0284Ce3) {
        this.i = c0284Ce3;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        C0284Ce3 c0284Ce3 = this.i;
        if (i >= c0284Ce3.g.size()) {
            return !c0284Ce3.h.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        this.g = true;
        int i = this.a + 1;
        this.a = i;
        C0284Ce3 c0284Ce3 = this.i;
        if (i < c0284Ce3.g.size()) {
            return (Map.Entry) c0284Ce3.g.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.g = false;
        int i = C0284Ce3.l;
        C0284Ce3 c0284Ce3 = this.i;
        c0284Ce3.b();
        if (this.a < c0284Ce3.g.size()) {
            int i2 = this.a;
            this.a = i2 - 1;
            c0284Ce3.p(i2);
            return;
        }
        a().remove();
    }

    public final java.util.Iterator a() {
        if (this.h == null) {
            this.h = this.i.h.entrySet().iterator();
        }
        return this.h;
    }
}
