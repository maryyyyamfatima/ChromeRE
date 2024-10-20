package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XB extends BA0 {
    public final /* synthetic */ m a;
    public final /* synthetic */ C4137cC g;

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        C4137cC c4137cC = this.g;
        if (c4137cC.x != tab) {
            return;
        }
        c4137cC.x = null;
        this.a.b();
    }

    public XB(C4137cC c4137cC, m mVar) {
        this.g = c4137cC;
        this.a = mVar;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.a.b();
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.a.b();
    }
}
