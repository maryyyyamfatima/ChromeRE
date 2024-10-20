package defpackage;

import org.chromium.chrome.browser.logo.LogoBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vI1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10694vI1 implements LogoBridge.LogoObserver {
    public final /* synthetic */ long a;
    public final /* synthetic */ LogoBridge.LogoObserver b;
    public final /* synthetic */ C11037wI1 c;

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onLogoAvailable(LogoBridge.Logo logo, boolean z) {
        C11037wI1 c11037wI1 = this.c;
        if (c11037wI1.h) {
            return;
        }
        if (logo != null) {
            int i = logo.d == null ? 0 : 1;
            EI2.h(i, 2, "NewTabPage.LogoShown");
            if (z) {
                EI2.h(i, 2, "NewTabPage.LogoShown.FromCache");
            } else {
                EI2.h(i, 2, "NewTabPage.LogoShown.Fresh");
            }
            if (c11037wI1.g) {
                EI2.k(System.currentTimeMillis() - this.a, "NewTabPage.LogoShownTime2");
                c11037wI1.g = false;
            }
        } else if (!z) {
            c11037wI1.g = false;
        }
        String str = null;
        c11037wI1.e = logo != null ? logo.b : null;
        if (logo != null && c11037wI1.b != null) {
            str = logo.d;
        }
        c11037wI1.f = str;
        this.b.onLogoAvailable(logo, z);
    }

    public C10694vI1(C11037wI1 c11037wI1, long j, LogoBridge.LogoObserver logoObserver) {
        this.c = c11037wI1;
        this.a = j;
        this.b = logoObserver;
    }

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onCachedLogoRevalidated() {
        this.b.onCachedLogoRevalidated();
    }
}
