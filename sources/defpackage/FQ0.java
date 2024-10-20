package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FQ0 extends AtomicLong implements CG2 {
    public Iterator a;
    public volatile boolean g;
    public boolean h;

    public abstract void b();

    public abstract void c(long j);

    @Override // defpackage.BG2
    public final int e(int i) {
        return i & 1;
    }

    public FQ0(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.InterfaceC3586ac3
    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.h) {
            this.h = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        Q82.a(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // defpackage.InterfaceC3586ac3
    public final boolean isEmpty() {
        Iterator it = this.a;
        return it == null || !it.hasNext();
    }

    @Override // defpackage.InterfaceC3586ac3
    public final void clear() {
        this.a = null;
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        if (EnumC0854Go3.d(j) && AbstractC0355Ct.a(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                b();
            } else {
                c(j);
            }
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        this.g = true;
    }
}
