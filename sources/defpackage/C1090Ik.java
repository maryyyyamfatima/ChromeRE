package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ik */
/* loaded from: classes.dex */
public final class C1090Ik extends AbstractC4472dA0 {
    public final /* synthetic */ C1220Jk a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void d(int i) {
        C1220Jk c1220Jk = this.a;
        InterfaceC2129Qk interfaceC2129Qk = c1220Jk.h;
        if (interfaceC2129Qk == null) {
            return;
        }
        if (i != 3 && i != 2) {
            EI2.h(10, 11, "Assistant.VoiceSearch.ConsentOutcome");
            ((C1609Mk) interfaceC2129Qk).g(false);
        } else {
            ((C1609Mk) interfaceC2129Qk).e();
        }
        c1220Jk.h = null;
    }

    public C1090Ik(C1220Jk c1220Jk) {
        this.a = c1220Jk;
    }
}
