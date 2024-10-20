package defpackage;

import org.chromium.chrome.browser.sync.settings.ClearDataProgressDialog;
import org.chromium.chrome.browser.sync.settings.GoogleServicesSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z31 implements InterfaceC5642gb3 {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;
    public final /* synthetic */ GoogleServicesSettings b;

    public Z31(GoogleServicesSettings googleServicesSettings, ClearDataProgressDialog clearDataProgressDialog) {
        this.b = googleServicesSettings;
        this.a = clearDataProgressDialog;
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void a() {
        this.a.dismissAllowingStateLoss();
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void b() {
        this.a.Q0(this.b.x, "clear_data_progress");
    }
}
