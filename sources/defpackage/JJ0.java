package defpackage;

import java.io.IOException;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JJ0 implements Callback {
    public final /* synthetic */ C0353Cs2 a;

    public JJ0(C0353Cs2 c0353Cs2) {
        this.a = c0353Cs2;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C1263Js2 c1263Js2;
        byte[] bArr = (byte[]) obj;
        C0353Cs2 c0353Cs2 = this.a;
        c0353Cs2.getClass();
        if (bArr != null) {
            try {
                XF0 d = XF0.d();
                C1263Js2 c1263Js22 = C1263Js2.l;
                int length = bArr.length;
                C1263Js2 c1263Js23 = C1263Js2.l;
                c1263Js2 = new C1263Js2();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c1263Js2.getClass());
                        b.f(c1263Js2, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(c1263Js2);
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 unused2) {
            }
            if (c1263Js2.a != 0) {
                throw new RuntimeException();
            }
            QX0.i(c1263Js2);
            c0353Cs2.a.t(AbstractC9095qe2.a(c1263Js2));
        }
        c1263Js2 = null;
        c0353Cs2.a.t(AbstractC9095qe2.a(c1263Js2));
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
