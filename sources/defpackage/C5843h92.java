package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h92, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5843h92 extends X82 {
    public final Callable a;

    public C5843h92(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        try {
            InterfaceC7353la2 interfaceC7353la2 = (InterfaceC7353la2) this.a.call();
            Q82.a(interfaceC7353la2, "null ObservableSource supplied");
            interfaceC7353la2.a(interfaceC11128wa2);
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            interfaceC11128wa2.c(EnumC7565mA0.INSTANCE);
            interfaceC11128wa2.onError(th);
        }
    }
}
