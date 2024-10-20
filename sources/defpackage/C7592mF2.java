package defpackage;

import J.N;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.webapps.bottomsheet.PwaBottomSheetController;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mF2 */
/* loaded from: classes2.dex */
public final class C7592mF2 extends AbstractC4472dA0 {
    public final /* synthetic */ PwaBottomSheetController a;

    public C7592mF2(PwaBottomSheetController pwaBottomSheetController) {
        this.a = pwaBottomSheetController;
    }

    @Override // defpackage.AbstractC4472dA0, defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        PwaBottomSheetController pwaBottomSheetController = this.a;
        if (i != 0) {
            if (!pwaBottomSheetController.d() || i != 3) {
                pwaBottomSheetController.j.h = 1;
                return;
            } else {
                pwaBottomSheetController.j.h = 0;
                N.M55fWa5U(pwaBottomSheetController.g);
                return;
            }
        }
        if (i2 == 1) {
            N.MUs2wv$Q(pwaBottomSheetController.g);
        }
        ((m) pwaBottomSheetController.h).o(pwaBottomSheetController.i);
        pwaBottomSheetController.j = null;
        N.MGZHTWtH(pwaBottomSheetController.g);
        pwaBottomSheetController.g = 0L;
    }
}
