package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b92 */
/* loaded from: classes.dex */
public final class C3781b92 extends AbstractC6336ic3 implements UV0 {
    public final InterfaceC7353la2 a;
    public final Callable b;
    public final RV0 c;

    public C3781b92(E92 e92, RV0 rv0) {
        EnumC6510j61 enumC6510j61 = EnumC6510j61.a;
        this.a = e92;
        this.b = enumC6510j61;
        this.c = rv0;
    }

    @Override // defpackage.AbstractC6336ic3
    public final void c(InterfaceC1314Kc3 interfaceC1314Kc3) {
        try {
            Object call = this.b.call();
            Q82.a(call, "The initialSupplier returned a null value");
            this.a.a(new C3437a92(interfaceC1314Kc3, call, this.c));
        } catch (Throwable th) {
            interfaceC1314Kc3.c(EnumC7565mA0.INSTANCE);
            interfaceC1314Kc3.onError(th);
        }
    }

    @Override // defpackage.UV0
    public final X82 a() {
        return new Z82(this.a, this.b, this.c);
    }
}
