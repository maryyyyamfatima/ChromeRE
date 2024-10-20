package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: At1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0097At1 extends a implements InterfaceC7447lq0, InterfaceC1871Ok1, InterfaceC7670mV0 {
    public C0617Et1 i;

    @Override // defpackage.InterfaceC1871Ok1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC1871Ok1
    public final E52 d() {
        return null;
    }

    public abstract void m(Throwable th);

    public final C0617Et1 l() {
        C0617Et1 c0617Et1 = this.i;
        if (c0617Et1 != null) {
            return c0617Et1;
        }
        C7171l14 c7171l14 = new C7171l14("lateinit property job has not been initialized");
        AbstractC0087Ar1.f(AbstractC0087Ar1.class.getName(), c7171l14);
        throw c7171l14;
    }

    @Override // defpackage.InterfaceC7447lq0
    public final void dispose() {
        boolean z;
        C0617Et1 l = l();
        do {
            Object y = l.y();
            if (!(y instanceof AbstractC0097At1)) {
                if (!(y instanceof InterfaceC1871Ok1) || ((InterfaceC1871Ok1) y).d() == null) {
                    return;
                }
                k();
                return;
            }
            if (y != this) {
                return;
            }
            C2595Tz0 c2595Tz0 = AbstractC0747Ft1.g;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0617Et1.a;
                if (atomicReferenceFieldUpdater.compareAndSet(l, y, c2595Tz0)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(l) != y) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    @Override // kotlinx.coroutines.internal.a
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC6711ji0.a(this) + "[job@" + AbstractC6711ji0.a(l()) + ']';
    }
}
