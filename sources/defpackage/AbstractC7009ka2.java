package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ka2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7009ka2 {
    public static boolean a(InterfaceC7353la2 interfaceC7353la2, InterfaceC11128wa2 interfaceC11128wa2, DV0 dv0) {
        InterfaceC6416iq0 interfaceC6416iq0 = EnumC7565mA0.INSTANCE;
        if (!(interfaceC7353la2 instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) interfaceC7353la2).call();
            if (call == null) {
                interfaceC11128wa2.c(interfaceC6416iq0);
                interfaceC11128wa2.b();
                return true;
            }
            try {
                InterfaceC7353la2 interfaceC7353la22 = (InterfaceC7353la2) dv0.apply(call);
                Q82.a(interfaceC7353la22, "The mapper returned a null ObservableSource");
                if (interfaceC7353la22 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) interfaceC7353la22).call();
                        if (call2 == null) {
                            interfaceC11128wa2.c(interfaceC6416iq0);
                            interfaceC11128wa2.b();
                            return true;
                        }
                        RunnableC6323ia2 runnableC6323ia2 = new RunnableC6323ia2(interfaceC11128wa2, call2);
                        interfaceC11128wa2.c(runnableC6323ia2);
                        runnableC6323ia2.run();
                    } catch (Throwable th) {
                        AbstractC4148cE0.a(th);
                        interfaceC11128wa2.c(interfaceC6416iq0);
                        interfaceC11128wa2.onError(th);
                        return true;
                    }
                } else {
                    interfaceC7353la22.a(interfaceC11128wa2);
                }
                return true;
            } catch (Throwable th2) {
                AbstractC4148cE0.a(th2);
                interfaceC11128wa2.c(interfaceC6416iq0);
                interfaceC11128wa2.onError(th2);
                return true;
            }
        } catch (Throwable th3) {
            AbstractC4148cE0.a(th3);
            interfaceC11128wa2.c(interfaceC6416iq0);
            interfaceC11128wa2.onError(th3);
            return true;
        }
    }
}
