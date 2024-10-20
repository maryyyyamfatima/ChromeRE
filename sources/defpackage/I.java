package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I implements Iterator, j$.util.Iterator {
    public Map.Entry a;
    public final /* synthetic */ Iterator g;
    public final /* synthetic */ J h;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public I(J j, java.util.Iterator it) {
        this.h = j;
        this.g = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.g.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.g.next();
        this.a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        Collection collection = (Collection) this.a.getValue();
        this.g.remove();
        this.h.g.i -= collection.size();
        collection.clear();
        this.a = null;
    }
}
