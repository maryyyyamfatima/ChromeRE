package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O70 extends AbstractC4472dA0 {
    public final /* synthetic */ P70 a;

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i == 0) {
            P70 p70 = this.a;
            p70.u = false;
            p70.n = null;
            WebContents webContents = p70.q;
            if (webContents != null) {
                webContents.destroy();
                p70.q = null;
                p70.r = null;
            }
            ((m) p70.h).o(p70.s);
        }
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void j() {
        ContextualSearchManager contextualSearchManager = (ContextualSearchManager) this.a.t;
        contextualSearchManager.getClass();
        new G70(contextualSearchManager).a();
    }

    public O70(P70 p70) {
        this.a = p70;
    }
}
