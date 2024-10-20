package defpackage;

import org.chromium.chrome.browser.sync.settings.AccountManagementFragment;
import org.chromium.chrome.browser.sync.settings.ClearDataProgressDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O2 implements InterfaceC5642gb3 {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;
    public final /* synthetic */ AccountManagementFragment b;

    public O2(AccountManagementFragment accountManagementFragment, ClearDataProgressDialog clearDataProgressDialog) {
        this.b = accountManagementFragment;
        this.a = clearDataProgressDialog;
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void a() {
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = this.a;
        if (dialogInterfaceOnCancelListenerC7423lm0.W()) {
            dialogInterfaceOnCancelListenerC7423lm0.dismissAllowingStateLoss();
        }
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void b() {
        this.a.Q0(this.b.x, "clear_data_progress");
    }
}
