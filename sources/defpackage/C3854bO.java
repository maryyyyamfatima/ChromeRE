package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3854bO implements InterfaceC6377ij3, InterfaceC3657ao2, InterfaceC0186Bl0 {
    public I5 a;

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        Q83 q83 = O83.a;
        long g = q83.g(-1L, "ChromeTabbedActivity.BackgroundTimeMs");
        q83.s(-1L, "ChromeTabbedActivity.BackgroundTimeMs");
        if (g != -1) {
            EI2.g("Startup.Android.DurationSinceLastBackgroundTime", System.currentTimeMillis() - g, 1L, 3600000L, 100);
        }
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        O83.a.s(System.currentTimeMillis(), "ChromeTabbedActivity.BackgroundTimeMs");
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.a.c(this);
    }
}
