package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jU2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6635jU2 implements Runnable {
    public final /* synthetic */ C10069tU2 a;
    public final /* synthetic */ Exception g;

    public /* synthetic */ RunnableC6635jU2(C10069tU2 c10069tU2, Exception exc) {
        this.a = c10069tU2;
        this.g = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10069tU2 c10069tU2 = this.a;
        if (c10069tU2.a == null) {
            return;
        }
        EI2.h(AbstractC10412uU2.a(8), 10, "Settings.SafetyCheck.PasswordsResult");
        Exception exc = this.g;
        boolean z = exc instanceof C11194wl2;
        ND2 nd2 = AbstractC10412uU2.a;
        if (z && ((C11194wl2) exc).a == 4) {
            c10069tU2.a.m(nd2, 9);
        } else {
            c10069tU2.a.m(nd2, 8);
        }
        c10069tU2.k();
    }
}
