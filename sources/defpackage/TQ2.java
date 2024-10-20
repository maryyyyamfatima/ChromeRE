package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TQ2 extends AbstractC4472dA0 {
    public boolean a;
    public final /* synthetic */ C4559dR2 g;

    public TQ2(C4559dR2 c4559dR2) {
        this.g = c4559dR2;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        C4559dR2 c4559dR2 = this.g;
        if (i != 0) {
            if ((i == 1 || i == 2 || i == 3) && !this.a) {
                this.a = true;
                ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c4559dR2.R.get();
                if (contextualSearchManager != null) {
                    contextualSearchManager.R = true;
                    contextualSearchManager.i(1);
                    return;
                }
                return;
            }
            return;
        }
        this.a = false;
        ContextualSearchManager contextualSearchManager2 = (ContextualSearchManager) c4559dR2.R.get();
        if (contextualSearchManager2 != null) {
            contextualSearchManager2.R = false;
        }
    }
}
