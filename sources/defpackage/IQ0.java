package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IQ0 extends BQ0 {
    public final Iterable b;

    public IQ0(InterfaceC1377Kp1 interfaceC1377Kp1) {
        this.b = interfaceC1377Kp1;
    }

    @Override // defpackage.BQ0
    public final void c(InterfaceC0334Co3 interfaceC0334Co3) {
        EnumC10996wA0 enumC10996wA0 = EnumC10996wA0.a;
        try {
            Iterator it = this.b.iterator();
            try {
                if (it.hasNext()) {
                    if (interfaceC0334Co3 instanceof AbstractC3359Zw) {
                        interfaceC0334Co3.c(new GQ0((AbstractC3359Zw) interfaceC0334Co3, it));
                        return;
                    } else {
                        interfaceC0334Co3.c(new HQ0(interfaceC0334Co3, it));
                        return;
                    }
                }
                interfaceC0334Co3.c(enumC10996wA0);
                interfaceC0334Co3.b();
            } catch (Throwable th) {
                AbstractC4148cE0.a(th);
                interfaceC0334Co3.c(enumC10996wA0);
                interfaceC0334Co3.onError(th);
            }
        } catch (Throwable th2) {
            AbstractC4148cE0.a(th2);
            interfaceC0334Co3.c(enumC10996wA0);
            interfaceC0334Co3.onError(th2);
        }
    }
}
