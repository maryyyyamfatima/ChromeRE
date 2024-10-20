package defpackage;

import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class M32 implements LogoBridge.LogoObserver {
    public final /* synthetic */ NewTabPageLayout a;

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onLogoAvailable(LogoBridge.Logo logo, boolean z) {
        if (logo == null && z) {
            return;
        }
        NewTabPageLayout newTabPageLayout = this.a;
        LogoView logoView = newTabPageLayout.i;
        logoView.s = newTabPageLayout.s;
        logoView.d(logo);
        newTabPageLayout.E = true;
        newTabPageLayout.z = logo != null;
        NewTabPageLayout.c(newTabPageLayout);
    }

    public M32(NewTabPageLayout newTabPageLayout) {
        this.a = newTabPageLayout;
    }

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onCachedLogoRevalidated() {
        NewTabPageLayout.c(this.a);
    }
}
