package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z82 extends AbstractC6816k0 {
    public final Callable g;
    public final RV0 h;

    public Z82(InterfaceC7353la2 interfaceC7353la2, Callable callable, RV0 rv0) {
        super(interfaceC7353la2);
        this.g = callable;
        this.h = rv0;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        try {
            Object call = this.g.call();
            Q82.a(call, "The initialSupplier returned a null value");
            this.a.a(new Y82(interfaceC11128wa2, call, this.h));
        } catch (Throwable th) {
            interfaceC11128wa2.c(EnumC7565mA0.INSTANCE);
            interfaceC11128wa2.onError(th);
        }
    }
}
