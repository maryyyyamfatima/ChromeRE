package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: as1 */
/* loaded from: classes.dex */
public final class C3680as1 extends AbstractC10079tW2 {
    public final RunnableC3336Zr1 g;
    public final C4024bs1 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final H10 a = new H10();

    public C3680as1(RunnableC3336Zr1 runnableC3336Zr1) {
        C4024bs1 c4024bs1;
        C4024bs1 c4024bs12;
        this.g = runnableC3336Zr1;
        if (runnableC3336Zr1.h.g) {
            c4024bs12 = C4367cs1.g;
            this.h = c4024bs12;
        }
        while (true) {
            if (!runnableC3336Zr1.g.isEmpty()) {
                c4024bs1 = (C4024bs1) runnableC3336Zr1.g.poll();
                if (c4024bs1 != null) {
                    break;
                }
            } else {
                c4024bs1 = new C4024bs1(runnableC3336Zr1.k);
                runnableC3336Zr1.h.a(c4024bs1);
                break;
            }
        }
        c4024bs12 = c4024bs1;
        this.h = c4024bs12;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.i.compareAndSet(false, true)) {
            this.a.dispose();
            RunnableC3336Zr1 runnableC3336Zr1 = this.g;
            runnableC3336Zr1.getClass();
            long nanoTime = System.nanoTime() + runnableC3336Zr1.a;
            C4024bs1 c4024bs1 = this.h;
            c4024bs1.h = nanoTime;
            runnableC3336Zr1.g.offer(c4024bs1);
        }
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a.g) {
            return EnumC7565mA0.INSTANCE;
        }
        return this.h.e(runnable, j, timeUnit, this.a);
    }
}
