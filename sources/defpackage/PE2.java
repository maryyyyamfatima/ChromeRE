package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PE2 extends AtomicBoolean implements InterfaceC6416iq0 {
    public final InterfaceC11128wa2 a;
    public final QE2 g;

    public PE2(InterfaceC11128wa2 interfaceC11128wa2, QE2 qe2) {
        this.a = interfaceC11128wa2;
        this.g = qe2;
    }

    @Override // defpackage.InterfaceC6416iq0
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.g.j(this);
        }
    }
}
