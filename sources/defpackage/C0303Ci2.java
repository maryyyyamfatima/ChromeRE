package defpackage;

import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ci2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303Ci2 implements InterfaceC0724Fo3 {
    public final int a;
    public final int g;
    public final /* synthetic */ C0433Di2 h;

    public C0303Ci2(C0433Di2 c0433Di2, int i, int i2) {
        this.h = c0433Di2;
        this.a = i;
        this.g = i2;
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void a(long j) {
        long j2;
        long j3;
        if (EnumC0854Go3.d(j)) {
            C0433Di2 c0433Di2 = this.h;
            AtomicLongArray atomicLongArray = c0433Di2.g;
            do {
                j2 = atomicLongArray.get(this.a);
                if (j2 == Long.MAX_VALUE) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!atomicLongArray.compareAndSet(this.a, j2, j3));
            if (c0433Di2.q.get() == this.g) {
                c0433Di2.a();
            }
        }
    }

    @Override // defpackage.InterfaceC0724Fo3
    public final void cancel() {
        if (this.h.g.compareAndSet(this.a + this.g, 0L, 1L)) {
            C0433Di2 c0433Di2 = this.h;
            int i = this.g;
            if (c0433Di2.g.decrementAndGet(i + i) == 0) {
                c0433Di2.p = true;
                c0433Di2.k.cancel();
                if (c0433Di2.getAndIncrement() == 0) {
                    c0433Di2.l.clear();
                }
            }
        }
    }
}
