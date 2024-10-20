package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class J92 extends X82 {
    public final Iterable a;

    public J92(Iterable iterable) {
        this.a = iterable;
    }

    @Override // defpackage.X82
    public final void i(InterfaceC11128wa2 interfaceC11128wa2) {
        InterfaceC6416iq0 interfaceC6416iq0 = EnumC7565mA0.INSTANCE;
        try {
            Iterator it = this.a.iterator();
            try {
                if (!it.hasNext()) {
                    interfaceC11128wa2.c(interfaceC6416iq0);
                    interfaceC11128wa2.b();
                    return;
                }
                I92 i92 = new I92(interfaceC11128wa2, it);
                interfaceC11128wa2.c(i92);
                if (i92.i) {
                    return;
                }
                while (!i92.h) {
                    try {
                        Object next = i92.g.next();
                        Q82.a(next, "The iterator returned a null value");
                        i92.a.d(next);
                        if (i92.h) {
                            return;
                        }
                        try {
                            if (!i92.g.hasNext()) {
                                if (i92.h) {
                                    return;
                                }
                                i92.a.b();
                                return;
                            }
                        } catch (Throwable th) {
                            AbstractC4148cE0.a(th);
                            i92.a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC4148cE0.a(th2);
                        i92.a.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                AbstractC4148cE0.a(th3);
                interfaceC11128wa2.c(interfaceC6416iq0);
                interfaceC11128wa2.onError(th3);
            }
        } catch (Throwable th4) {
            AbstractC4148cE0.a(th4);
            interfaceC11128wa2.c(interfaceC6416iq0);
            interfaceC11128wa2.onError(th4);
        }
    }
}
