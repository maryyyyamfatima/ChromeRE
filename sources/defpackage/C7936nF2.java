package defpackage;

import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.webapps.bottomsheet.PwaBottomSheetController;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nF2 */
/* loaded from: classes2.dex */
public final class C7936nF2 extends Fl4 {
    public final /* synthetic */ PwaBottomSheetController g;

    @Override // defpackage.Fl4
    public final void didFinishNavigation(NavigationHandle navigationHandle) {
        if (navigationHandle.a && navigationHandle.g) {
            PwaBottomSheetController pwaBottomSheetController = this.g;
            ((m) pwaBottomSheetController.h).l(pwaBottomSheetController.j, true, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7936nF2(PwaBottomSheetController pwaBottomSheetController, WebContents webContents) {
        super(webContents);
        this.g = pwaBottomSheetController;
    }
}
