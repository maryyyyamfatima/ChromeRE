package defpackage;

import J.N;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ZK3 implements Runnable {
    public final /* synthetic */ C5561gL3 a;

    @Override // java.lang.Runnable
    public final void run() {
        C5561gL3 c5561gL3 = this.a;
        ImeAdapterImpl imeAdapterImpl = c5561gL3.e;
        if ((imeAdapterImpl.f() && imeAdapterImpl.h != null) ? N.M7o5Xhhi(imeAdapterImpl.a, imeAdapterImpl) : false) {
            return;
        }
        AbstractC9118qi1.a();
        XK3 xk3 = C5561gL3.m;
        AbstractC9118qi1.a();
        try {
            c5561gL3.h.put(xk3);
        } catch (InterruptedException e) {
            AbstractC4851eH1.a("Ime", "addToQueueOnUiThread interrupted", e);
        }
        c5561gL3.f.post(c5561gL3.a);
    }

    public ZK3(C5561gL3 c5561gL3) {
        this.a = c5561gL3;
    }
}
