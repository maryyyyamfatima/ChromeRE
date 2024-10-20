package defpackage;

import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.q;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T7 extends S7 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicIntegerFieldUpdater b;

    public T7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.S7
    public final void a(p pVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.a;
            if (atomicReferenceFieldUpdater.compareAndSet(pVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(pVar) == null);
    }

    @Override // defpackage.S7
    public final int b(q qVar) {
        return this.b.decrementAndGet(qVar);
    }
}
