package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
final class f extends a {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.common.util.concurrent.a
    public final void g(m mVar, Thread thread) {
        this.a.lazySet(mVar, thread);
    }

    @Override // com.google.common.util.concurrent.a
    public final void f(m mVar, m mVar2) {
        this.b.lazySet(mVar, mVar2);
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean c(n nVar, m mVar, m mVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.c;
        while (!atomicReferenceFieldUpdater.compareAndSet(nVar, mVar, mVar2)) {
            if (atomicReferenceFieldUpdater.get(nVar) != mVar) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean a(n nVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(nVar, eVar, eVar2)) {
            if (atomicReferenceFieldUpdater.get(nVar) != eVar) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.util.concurrent.a
    public final e d(n nVar, e eVar) {
        return (e) this.d.getAndSet(nVar, eVar);
    }

    @Override // com.google.common.util.concurrent.a
    public final m e(n nVar, m mVar) {
        return (m) this.c.getAndSet(nVar, mVar);
    }

    @Override // com.google.common.util.concurrent.a
    public final boolean b(n nVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(nVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(nVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
