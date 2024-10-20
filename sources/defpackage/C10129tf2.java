package defpackage;

import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tf2 */
/* loaded from: classes.dex */
public final class C10129tf2 extends HF {
    public final /* synthetic */ AbstractC10472uf2 g;

    public C10129tf2(AbstractC10472uf2 abstractC10472uf2) {
        this.g = abstractC10472uf2;
    }

    @Override // defpackage.HF
    public final void b() {
        N70 n70 = (N70) this.g;
        Integer num = n70.Q;
        if (num != null && num.intValue() != 0) {
            n70.X0(n70.Q.intValue(), n70.R);
        }
        n70.Q = 0;
        n70.R = 0;
        int i = n70.o;
        if (i == 2 || i == 1) {
            n70.Q0(true);
        } else {
            n70.Q0(false);
        }
        OverlayPanelContent overlayPanelContent = n70.e0;
        if (overlayPanelContent != null) {
            overlayPanelContent.w = (int) ((n70.j0 - n70.x) / n70.a);
        }
        if (n70.r0 && n70.o == 4) {
            n70.r0 = false;
            ((ContextualSearchManager) n70.s0).o();
        }
    }
}
