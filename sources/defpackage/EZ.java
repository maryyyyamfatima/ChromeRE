package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EZ extends VY {
    public final long a;
    public final TimeUnit b;
    public final AbstractC10422uW2 c;

    public EZ(long j, TimeUnit timeUnit, AbstractC10422uW2 abstractC10422uW2) {
        this.a = j;
        this.b = timeUnit;
        this.c = abstractC10422uW2;
    }

    @Override // defpackage.VY
    public final void d(InterfaceC10434uZ interfaceC10434uZ) {
        DZ dz = new DZ(interfaceC10434uZ);
        interfaceC10434uZ.c(dz);
        EnumC7791mq0.c(dz, this.c.d(dz, this.a, this.b));
    }
}
