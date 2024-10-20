package defpackage;

import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class N30 extends AbstractC0185Bl {
    public final /* synthetic */ P30 h;

    public N30(P30 p30) {
        this.h = p30;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        P30 p30 = this.h;
        try {
            return p30.a.run();
        } catch (C10854vm e) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder(e.toString());
            for (Throwable cause = e.getCause(); cause != null; cause = cause.getCause()) {
                sb.append("\nCaused by: ");
                sb.append(cause.toString());
            }
            objArr[0] = sb.toString();
            AbstractC4851eH1.f("AuthTaskRetry", "Failed to perform auth task: %s", objArr);
            p30.h.set(e.a);
            return null;
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        P30 p30 = this.h;
        if (obj != null) {
            p30.a.a(obj);
            return;
        }
        if (p30.h.get() && p30.g.incrementAndGet() < 3) {
            if (NetworkChangeNotifier.f != null) {
                NetworkChangeNotifier.a(p30);
                return;
            }
        }
        p30.a.b(p30.h.get());
    }
}
