package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WD1 {
    public static final InterfaceC2910Wk0 a(SettableFuture settableFuture) {
        Throwable a = settableFuture.a();
        if (a != null) {
            C5283fZ c5283fZ = new C5283fZ(null);
            c5283fZ.C(new OZ(false, a));
            return c5283fZ;
        }
        if (!settableFuture.isDone()) {
            C5283fZ c5283fZ2 = new C5283fZ(null);
            SD1 sd1 = new SD1(c5283fZ2);
            settableFuture.f(new RunnableC5269fW0(settableFuture, sd1), EnumC6747jo0.a);
            c5283fZ2.s(new TD1(settableFuture));
            return new UD1(c5283fZ2);
        }
        try {
            Object a2 = AbstractC7515m14.a(settableFuture);
            C5283fZ c5283fZ3 = new C5283fZ(null);
            c5283fZ3.C(a2);
            return c5283fZ3;
        } catch (CancellationException e) {
            C5283fZ c5283fZ4 = new C5283fZ(null);
            c5283fZ4.u(e);
            return c5283fZ4;
        } catch (ExecutionException e2) {
            C5283fZ c5283fZ5 = new C5283fZ(null);
            Throwable cause = e2.getCause();
            AbstractC0087Ar1.b(cause);
            c5283fZ5.C(new OZ(false, cause));
            return c5283fZ5;
        }
    }
}
