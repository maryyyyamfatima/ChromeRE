package defpackage;

import android.content.Intent;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dY3 */
/* loaded from: classes.dex */
public final class C4595dY3 {
    public final C8587p83 a;
    public final C9766sc0 b;
    public final C11891yn1 c;
    public final FU d;

    public C4595dY3(C8587p83 c8587p83, C9766sc0 c9766sc0, InterfaceC3241Yy1 interfaceC3241Yy1, PC pc, C10776vY3 c10776vY3, I5 i5, C11891yn1 c11891yn1, FU fu, CustomTabsConnection customTabsConnection) {
        this.a = c8587p83;
        this.b = c9766sc0;
        this.c = c11891yn1;
        this.d = fu;
        Intent p = pc.p();
        final boolean z = false;
        boolean j = AbstractC2281Ro1.j(p, "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", false);
        boolean z2 = AbstractC2281Ro1.s(p, "androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS") != null;
        if (j && z2) {
            z = true;
        }
        if (z) {
            interfaceC3241Yy1.get();
        }
        c10776vY3.getClass();
        ((C8998qM) c10776vY3.a).a(new Runnable() { // from class: sY3
            @Override // java.lang.Runnable
            public final void run() {
                QF3 qf3 = QF3.g;
                final boolean z3 = z;
                PostTask.c(qf3, new Runnable() { // from class: tY3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EI2.b("TrustedWebActivity.SplashScreenShown", z3);
                    }
                });
            }
        });
        c9766sc0.j.a(new Runnable() { // from class: bY3
            @Override // java.lang.Runnable
            public final void run() {
                C4595dY3 c4595dY3 = C4595dY3.this;
                C9423rc0 c9423rc0 = c4595dY3.b.i;
                if (c9423rc0 == null || c9423rc0.b != 1) {
                    return;
                }
                c4595dY3.c.a(c4595dY3.d.a, C1193Je2.b(c9423rc0.a));
            }
        });
        i5.b(new C4251cY3(pc, customTabsConnection));
    }
}
