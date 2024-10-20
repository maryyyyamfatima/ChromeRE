package defpackage;

import J.N;
import org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Fo4 extends Jo4 {
    public final /* synthetic */ Oo4 a;

    @Override // defpackage.Jo4
    public final void b(Ko4 ko4) {
        Oo4 oo4 = this.a;
        WebsitePreferenceBridge websitePreferenceBridge = oo4.b;
        BrowserContextHandle browserContextHandle = oo4.a;
        Eo4 eo4 = new Eo4(this, ko4);
        boolean z = oo4.d;
        websitePreferenceBridge.getClass();
        N.MvKW9dxN(browserContextHandle, eo4, z);
    }

    public Fo4(Oo4 oo4) {
        this.a = oo4;
    }
}
