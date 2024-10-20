package defpackage;

import org.chromium.chrome.browser.sync.settings.ClearDataProgressDialog;
import org.chromium.chrome.browser.sync.settings.ManageSyncSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YK1 implements InterfaceC5642gb3 {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;
    public final /* synthetic */ ManageSyncSettings b;

    public YK1(ManageSyncSettings manageSyncSettings, ClearDataProgressDialog clearDataProgressDialog) {
        this.b = manageSyncSettings;
        this.a = clearDataProgressDialog;
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void b() {
        this.a.Q0(this.b.J(), "clear_data_progress");
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void a() {
        DialogInterfaceOnCancelListenerC7423lm0 dialogInterfaceOnCancelListenerC7423lm0 = this.a;
        if (dialogInterfaceOnCancelListenerC7423lm0.W()) {
            dialogInterfaceOnCancelListenerC7423lm0.dismissAllowingStateLoss();
        }
    }
}
