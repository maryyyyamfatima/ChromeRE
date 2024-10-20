package defpackage;

import J.N;
import org.chromium.chrome.browser.feed.FeedStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eL2 */
/* loaded from: classes.dex */
public final class C4872eL2 implements InterfaceC6999kY2 {
    public final InterfaceC4173cJ0 a;
    public final FY2 g;
    public final Runnable h;

    @Override // defpackage.InterfaceC6999kY2
    public final void b(int i) {
    }

    public C4872eL2(C12075zK0 c12075zK0, FY2 fy2, RunnableC9674sK0 runnableC9674sK0) {
        this.a = c12075zK0;
        this.g = fy2;
        this.h = runnableC9674sK0;
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void a(int i) {
        if (i == 0) {
            return;
        }
        d();
    }

    @Override // defpackage.InterfaceC6999kY2
    public final void c(int i) {
        d();
    }

    public final void d() {
        long Mo7yKNFf;
        C12075zK0 c12075zK0 = (C12075zK0) this.a;
        if (LU3.a(c12075zK0.s).getTriggerState("IPH_FeedSwipeRefresh") == 0) {
            this.g.c(this);
            return;
        }
        ZK0 zk0 = c12075zK0.K;
        if (zk0 == null ? true : zk0.canScrollVertically(-1)) {
            return;
        }
        if (c12075zK0.v.j(AbstractC4077c13.a)) {
            InterfaceC1623Mm3 interfaceC1623Mm3 = c12075zK0.f.G;
            if (interfaceC1623Mm3 == null) {
                Mo7yKNFf = 0;
            } else {
                FeedStream feedStream = (FeedStream) interfaceC1623Mm3;
                Mo7yKNFf = N.Mo7yKNFf(feedStream.d, feedStream);
            }
            if (Mo7yKNFf == 0) {
                return;
            }
            c12075zK0.getClass();
            if (System.currentTimeMillis() - Mo7yKNFf < 300000) {
                return;
            }
            this.h.run();
        }
    }
}
