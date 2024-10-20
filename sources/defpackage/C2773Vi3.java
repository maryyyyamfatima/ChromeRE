package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2773Vi3 implements Iterator, j$.util.Iterator {
    public final Iterator a;
    public Map.Entry g;
    public Iterator h = EnumC2561Ts1.a;

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public C2773Vi3(C6168i61 c6168i61) {
        this.a = c6168i61.g.entrySet().iterator();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.h.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!this.h.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.g = entry;
            this.h = ((Map) entry.getValue()).entrySet().iterator();
        }
        Objects.requireNonNull(this.g);
        Map.Entry entry2 = (Map.Entry) this.h.next();
        return new AE3(this.g.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        this.h.remove();
        Map.Entry entry = this.g;
        Objects.requireNonNull(entry);
        if (((Map) entry.getValue()).isEmpty()) {
            this.a.remove();
            this.g = null;
        }
    }
}
