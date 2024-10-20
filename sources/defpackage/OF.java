package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OF extends AtomicReference implements InterfaceC6416iq0 {
    public OF(KF kf) {
        super(kf);
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        KF kf;
        if (get() == null || (kf = (KF) getAndSet(null)) == null) {
            return;
        }
        try {
            kf.cancel();
        } catch (Exception e) {
            AbstractC4148cE0.a(e);
            MR2.b(e);
        }
    }
}
