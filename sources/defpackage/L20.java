package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L20 extends AbstractC10079tW2 {
    public final C10664vC1 a;
    public final H10 g;
    public final C10664vC1 h;
    public final N20 i;
    public volatile boolean j;

    public L20(N20 n20) {
        this.i = n20;
        C10664vC1 c10664vC1 = new C10664vC1();
        this.a = c10664vC1;
        H10 h10 = new H10();
        this.g = h10;
        C10664vC1 c10664vC12 = new C10664vC1();
        this.h = c10664vC12;
        c10664vC12.a(c10664vC1);
        c10664vC12.a(h10);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.h.dispose();
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 b(Runnable runnable) {
        if (this.j) {
            return EnumC7565mA0.INSTANCE;
        }
        return this.i.e(runnable, 0L, TimeUnit.MILLISECONDS, this.a);
    }

    @Override // defpackage.AbstractC10079tW2
    public final InterfaceC6416iq0 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.j) {
            return EnumC7565mA0.INSTANCE;
        }
        return this.i.e(runnable, j, timeUnit, this.g);
    }
}
