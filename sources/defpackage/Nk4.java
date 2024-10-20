package defpackage;

import org.chromium.chrome.browser.metrics.UmaUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nk4 implements InterfaceC6365ih3 {
    public final long a;
    public final long b;

    @Override // defpackage.InterfaceC6365ih3
    public final void a() {
    }

    public Nk4(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.InterfaceC6365ih3
    public final void b(long j, long j2) {
        if (!UmaUtils.c() || UmaUtils.b()) {
            return;
        }
        long j3 = this.a;
        if (j3 == -1) {
            return;
        }
        EI2.k(j - j3, "WebApk.Startup.Cold.ShellLaunchToSplashscreenVisible");
        EI2.k(j2 - j3, "WebApk.Startup.Cold.ShellLaunchToSplashscreenHidden");
        long j4 = this.b;
        if (j4 != -1) {
            EI2.k(j4 - j3, "WebApk.Startup.Cold.NewStyle.ShellLaunchToSplashscreenVisible");
        }
    }
}
