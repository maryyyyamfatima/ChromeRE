package defpackage;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KX0 implements InterfaceC7751mj2 {
    public final QX0 a;

    public static void a(MessageLite messageLite) {
        C6827k14 c6827k14;
        if (messageLite.isInitialized()) {
            return;
        }
        if (messageLite instanceof AbstractC4754e0) {
            c6827k14 = new C6827k14();
        } else {
            c6827k14 = new C6827k14();
        }
        C1127Ir1 a = c6827k14.a();
        a.a = messageLite;
        throw a;
    }

    static {
        XF0.c();
    }

    public final MessageLite b(InputStream inputStream, XF0 xf0) {
        DV g = DV.g(inputStream);
        QX0 c = c(g, xf0);
        try {
            g.a(0);
            a(c);
            return c;
        } catch (C1127Ir1 e) {
            e.a = c;
            throw e;
        }
    }

    public KX0(QX0 qx0) {
        this.a = qx0;
    }

    public final QX0 c(DV dv, XF0 xf0) {
        QX0 qx0 = (QX0) this.a.l(PX0.NEW_MUTABLE_INSTANCE);
        try {
            QW2 a = C7931nE2.c.a(qx0);
            EV ev = dv.d;
            if (ev == null) {
                ev = new EV(dv);
            }
            a.e(qx0, ev, xf0);
            a.b(qx0);
            return qx0;
        } catch (C1127Ir1 e) {
            if (e.g) {
                throw new C1127Ir1(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C1127Ir1) {
                throw ((C1127Ir1) e2.getCause());
            }
            throw new C1127Ir1(e2);
        } catch (C6827k14 e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C1127Ir1) {
                throw ((C1127Ir1) e4.getCause());
            }
            throw e4;
        }
    }
}
