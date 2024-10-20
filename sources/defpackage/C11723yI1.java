package defpackage;

import org.chromium.chrome.browser.logo.LogoBridge;
import org.chromium.chrome.browser.logo.LogoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yI1 */
/* loaded from: classes.dex */
public final class C11723yI1 implements LogoBridge.LogoObserver {
    public final /* synthetic */ C12066zI1 a;

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onCachedLogoRevalidated() {
    }

    @Override // org.chromium.chrome.browser.logo.LogoBridge.LogoObserver
    public final void onLogoAvailable(LogoBridge.Logo logo, boolean z) {
        if (logo == null && z) {
            return;
        }
        C12066zI1 c12066zI1 = this.a;
        LogoView logoView = c12066zI1.c;
        logoView.s = c12066zI1.e;
        logoView.d(logo);
    }

    public C11723yI1(C12066zI1 c12066zI1) {
        this.a = c12066zI1;
    }
}
