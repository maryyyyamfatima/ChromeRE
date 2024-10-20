package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class L92 extends X82 {
    public final AbstractC10422uW2 a;
    public final long g;
    public final long h;
    public final TimeUnit i;

    public L92(long j, long j2, TimeUnit timeUnit, AbstractC10422uW2 abstractC10422uW2) {
        this.g = j;
        this.h = j2;
        this.i = timeUnit;
        this.a = abstractC10422uW2;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        K92 k92 = new K92(interfaceC11128wa2);
        interfaceC11128wa2.c(k92);
        AbstractC10422uW2 abstractC10422uW2 = this.a;
        if (abstractC10422uW2 instanceof RU3) {
            AbstractC10079tW2 b = abstractC10422uW2.b();
            EnumC7791mq0.f(k92, b);
            b.d(k92, this.g, this.h, this.i);
            return;
        }
        EnumC7791mq0.f(k92, abstractC10422uW2.e(k92, this.g, this.h, this.i));
    }
}
