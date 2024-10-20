package defpackage;

import org.chromium.chrome.browser.password_manager.AutoSigninSnackbarController;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gn */
/* loaded from: classes.dex */
public final class C0845Gn extends BA0 {
    public final /* synthetic */ AutoSigninSnackbarController a;

    public C0845Gn(AutoSigninSnackbarController autoSigninSnackbarController) {
        this.a = autoSigninSnackbarController;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        AutoSigninSnackbarController autoSigninSnackbarController = this.a;
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = autoSigninSnackbarController.a;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null && c1978Pf3.b.isShown()) {
            viewOnClickListenerC1069If3.a(autoSigninSnackbarController);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        AutoSigninSnackbarController autoSigninSnackbarController = this.a;
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = autoSigninSnackbarController.a;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null && c1978Pf3.b.isShown()) {
            viewOnClickListenerC1069If3.a(autoSigninSnackbarController);
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        AutoSigninSnackbarController autoSigninSnackbarController = this.a;
        ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3 = autoSigninSnackbarController.a;
        C1978Pf3 c1978Pf3 = viewOnClickListenerC1069If3.g;
        if (c1978Pf3 != null && c1978Pf3.b.isShown()) {
            viewOnClickListenerC1069If3.a(autoSigninSnackbarController);
        }
    }
}
