package defpackage;

import java.util.HashMap;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2390Sk0 implements InterfaceC8967qF3 {
    public final HashMap a = new HashMap();

    @Override // defpackage.InterfaceC8967qF3
    public final boolean d(QF3 qf3) {
        return false;
    }

    @Override // defpackage.InterfaceC8967qF3
    public final MF3 a(QF3 qf3) {
        C4869eL c4869eL;
        if (qf3.f) {
            synchronized (this) {
                c4869eL = (C4869eL) ThreadUtils.g(new CallableC2130Qk0());
            }
            return c4869eL;
        }
        PF3 pf3 = new PF3(qf3, "TaskRunnerImpl", 0);
        PF3.d();
        return pf3;
    }

    @Override // defpackage.InterfaceC8967qF3
    public final N33 b(QF3 qf3) {
        C4869eL c4869eL;
        if (!qf3.f) {
            return new O33(qf3);
        }
        synchronized (this) {
            c4869eL = (C4869eL) ThreadUtils.g(new CallableC2130Qk0());
        }
        return c4869eL;
    }

    @Override // defpackage.InterfaceC8967qF3
    public final synchronized void c(QF3 qf3, Runnable runnable, long j) {
        if (qf3.d != 0) {
            a(qf3).a(runnable, j);
        } else {
            MF3 mf3 = (MF3) this.a.get(qf3);
            if (mf3 == null) {
                mf3 = a(qf3);
                this.a.put(qf3, mf3);
            }
            mf3.a(runnable, j);
        }
    }
}
