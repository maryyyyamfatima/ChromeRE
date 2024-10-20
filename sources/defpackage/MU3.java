package defpackage;

import android.util.Base64;
import java.io.IOException;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class MU3 implements Runnable {
    public final /* synthetic */ MC2 a;

    public /* synthetic */ MU3(MC2 mc2) {
        this.a = mc2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C7177l24 c7177l24 = null;
        String string = AbstractC2737Vb2.g().getString("UpdateProtos_Tracking", null);
        if (string != null) {
            try {
                byte[] decode = Base64.decode(string, 0);
                C7177l24 c7177l242 = C7177l24.p;
                int length = decode.length;
                XF0 c = XF0.c();
                C7177l24 c7177l243 = new C7177l24();
                try {
                    try {
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(c7177l243.getClass());
                            b.f(c7177l243, decode, 0, length + 0, new C2254Rj(c));
                            b.b(c7177l243);
                            if (c7177l243.a != 0) {
                                throw new RuntimeException();
                            }
                            QX0.i(c7177l243);
                            c7177l24 = c7177l243;
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
                    }
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 unused2) {
            }
        }
        QF3 qf3 = AbstractC5103f04.a;
        final MC2 mc2 = this.a;
        PostTask.c(qf3, new Runnable() { // from class: PU3
            @Override // java.lang.Runnable
            public final void run() {
                MC2.this.b(c7177l24);
            }
        });
    }
}
