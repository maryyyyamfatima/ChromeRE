package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6971kT {
    public final InterfaceC3241Yy1 a;
    public final C10776vY3 b;

    public C6971kT(InterfaceC3241Yy1 interfaceC3241Yy1, C7629mN c7629mN, C10776vY3 c10776vY3) {
        this.a = interfaceC3241Yy1;
        this.b = c10776vY3;
    }

    public final void a(String str, boolean z) {
        InterfaceC3241Yy1 interfaceC3241Yy1 = this.a;
        int f = ((Q83) interfaceC3241Yy1.get()).f(0, str);
        for (int i = 0; i < f; i++) {
            this.b.getClass();
            EI2.b(z ? "TrustedWebActivity.ClearDataDialogOnUninstallAccepted" : "TrustedWebActivity.ClearDataDialogOnClearAppDataAccepted", false);
        }
        ((Q83) interfaceC3241Yy1.get()).m(str);
    }
}
