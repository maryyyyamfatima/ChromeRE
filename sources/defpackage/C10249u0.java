package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10249u0 extends AbstractC8535p0 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public C10249u0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC8535p0
    public final void e(C10935w0 c10935w0, Thread thread) {
        this.a.lazySet(c10935w0, thread);
    }

    @Override // defpackage.AbstractC8535p0
    public final void d(C10935w0 c10935w0, C10935w0 c10935w02) {
        this.b.lazySet(c10935w0, c10935w02);
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean c(AbstractC11278x0 abstractC11278x0, C10935w0 c10935w0, C10935w0 c10935w02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11278x0, c10935w0, c10935w02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11278x0) == c10935w0);
        return false;
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean a(AbstractC11278x0 abstractC11278x0, C9906t0 c9906t0, C9906t0 c9906t02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11278x0, c9906t0, c9906t02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11278x0) == c9906t0);
        return false;
    }

    @Override // defpackage.AbstractC8535p0
    public final boolean b(AbstractC11278x0 abstractC11278x0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC11278x0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC11278x0) == obj);
        return false;
    }
}
