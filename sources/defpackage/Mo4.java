package defpackage;

import J.N;
import org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Mo4 extends Jo4 {
    public final /* synthetic */ Oo4 a;

    @Override // defpackage.Jo4
    public final void b(Ko4 ko4) {
        Oo4 oo4 = this.a;
        WebsitePreferenceBridge websitePreferenceBridge = oo4.b;
        BrowserContextHandle browserContextHandle = oo4.a;
        Lo4 lo4 = new Lo4(this, ko4);
        websitePreferenceBridge.getClass();
        N.MlZM1XeP(browserContextHandle, lo4);
    }

    public Mo4(Oo4 oo4) {
        this.a = oo4;
    }
}
