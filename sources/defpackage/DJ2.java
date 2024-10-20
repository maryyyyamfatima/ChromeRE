package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DJ2 implements Iterator, j$.util.Iterator {
    public final boolean a;
    public final ArrayList g;
    public int h;
    public int i;

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
    }

    public DJ2(List list, int i, int i2, boolean z) {
        this.g = new ArrayList(list);
        this.h = z ? i - 1 : i + 1;
        this.i = i2;
        this.a = z;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        boolean z;
        while (this.i > 0) {
            int i = this.h;
            ArrayList arrayList = this.g;
            if (!(i >= 0 && i < arrayList.size())) {
                break;
            }
            O00 o00 = (O00) arrayList.get(this.h);
            if (o00.f().b()) {
                synchronized (o00) {
                    z = o00.n;
                }
                if (!z) {
                    return true;
                }
            }
            if (this.a) {
                this.h--;
            } else {
                this.h++;
            }
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized O00 next() {
        if (!hasNext()) {
            return null;
        }
        O00 o00 = (O00) this.g.get(this.h);
        if (this.a) {
            this.h--;
        } else {
            this.h++;
        }
        this.i--;
        return o00;
    }
}
