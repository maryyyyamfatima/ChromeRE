package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kZ */
/* loaded from: classes.dex */
public final class C7001kZ extends VY {
    public final Callable a;

    public C7001kZ(CallableC5073ev2 callableC5073ev2) {
        this.a = callableC5073ev2;
    }

    @Override // defpackage.VY
    public final void d(InterfaceC10434uZ interfaceC10434uZ) {
        FR2 fr2 = new FR2(TV0.b);
        interfaceC10434uZ.c(fr2);
        try {
            this.a.call();
            if (fr2.a()) {
                return;
            }
            interfaceC10434uZ.b();
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            if (!fr2.a()) {
                interfaceC10434uZ.onError(th);
            } else {
                MR2.b(th);
            }
        }
    }
}
