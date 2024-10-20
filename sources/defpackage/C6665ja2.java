package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ja2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6665ja2 extends X82 {
    public final Object a;
    public final DV0 g;

    public C6665ja2(DV0 dv0, Object obj) {
        this.a = obj;
        this.g = dv0;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        InterfaceC6416iq0 interfaceC6416iq0 = EnumC7565mA0.INSTANCE;
        try {
            InterfaceC7353la2 interfaceC7353la2 = (InterfaceC7353la2) this.g.apply(this.a);
            Q82.a(interfaceC7353la2, "The mapper returned a null ObservableSource");
            if (interfaceC7353la2 instanceof Callable) {
                try {
                    Object call = ((Callable) interfaceC7353la2).call();
                    if (call == null) {
                        interfaceC11128wa2.c(interfaceC6416iq0);
                        interfaceC11128wa2.b();
                        return;
                    } else {
                        RunnableC6323ia2 runnableC6323ia2 = new RunnableC6323ia2(interfaceC11128wa2, call);
                        interfaceC11128wa2.c(runnableC6323ia2);
                        runnableC6323ia2.run();
                        return;
                    }
                } catch (Throwable th) {
                    AbstractC4148cE0.a(th);
                    interfaceC11128wa2.c(interfaceC6416iq0);
                    interfaceC11128wa2.onError(th);
                    return;
                }
            }
            interfaceC7353la2.a(interfaceC11128wa2);
        } catch (Throwable th2) {
            interfaceC11128wa2.c(interfaceC6416iq0);
            interfaceC11128wa2.onError(th2);
        }
    }
}
