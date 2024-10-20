package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ta2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10099ta2 extends X82 {
    public final AbstractC10422uW2 a;
    public final long g;
    public final TimeUnit h;

    public C10099ta2(long j, TimeUnit timeUnit, AbstractC10422uW2 abstractC10422uW2) {
        this.g = j;
        this.h = timeUnit;
        this.a = abstractC10422uW2;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        boolean z;
        RunnableC9756sa2 runnableC9756sa2 = new RunnableC9756sa2(interfaceC11128wa2);
        interfaceC11128wa2.c(runnableC9756sa2);
        InterfaceC6416iq0 d = this.a.d(runnableC9756sa2, this.g, this.h);
        while (true) {
            if (runnableC9756sa2.compareAndSet(null, d)) {
                z = true;
                break;
            } else if (runnableC9756sa2.get() != null) {
                z = false;
                break;
            }
        }
        if (z || runnableC9756sa2.get() != EnumC7791mq0.a) {
            return;
        }
        d.dispose();
    }
}
