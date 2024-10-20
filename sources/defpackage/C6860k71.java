package defpackage;

import J.N;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k71 */
/* loaded from: classes.dex */
public final class C6860k71 implements InterfaceC6999kY2 {
    public final InterfaceC4173cJ0 a;
    public final FY2 g;
    public final Runnable h;

    @Override // defpackage.InterfaceC6999kY2
    public final void a(int i) {
    }

    public C6860k71(C12075zK0 c12075zK0, FY2 fy2, RunnableC10703vK0 runnableC10703vK0) {
        this.a = c12075zK0;
        this.g = fy2;
        this.h = runnableC10703vK0;
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void b(int i) {
        if (i != 0) {
            return;
        }
        d(this.g.b());
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void c(int i) {
        if (i == 0) {
            return;
        }
        d(-i);
    }

    public final void d(int i) {
        C12075zK0 c12075zK0 = (C12075zK0) this.a;
        int triggerState = LU3.a(c12075zK0.s).getTriggerState("IPH_FeedHeaderMenu");
        FY2 fy2 = this.g;
        if (triggerState == 0) {
            fy2.c(this);
            return;
        }
        if (c12075zK0.v.j(AbstractC4077c13.a)) {
            c12075zK0.getClass();
            if (N.Moqc7YrQ() && i >= fy2.d() * 0.1f) {
                int a = c12075zK0.E.a(c12075zK0.w);
                if (a >= 0 && ((float) a) <= ((float) c12075zK0.E.d()) * 0.35f) {
                    this.h.run();
                }
            }
        }
    }
}
