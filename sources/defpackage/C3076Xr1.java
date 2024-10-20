package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3076Xr1 extends AbstractC11241wt1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(C3076Xr1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    public final InterfaceC7670mV0 j;

    @Override // defpackage.InterfaceC7670mV0
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        m((Throwable) obj);
        return C8546p14.a;
    }

    public C3076Xr1(InterfaceC7670mV0 interfaceC7670mV0) {
        this.j = interfaceC7670mV0;
    }

    @Override // defpackage.AbstractC0097At1
    public final void m(Throwable th) {
        if (k.compareAndSet(this, 0, 1)) {
            this.j.b(th);
        }
    }
}
