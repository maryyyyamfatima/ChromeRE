package defpackage;

import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataFragment;
import org.chromium.chrome.browser.sync.settings.ClearDataProgressDialog;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VS implements InterfaceC5642gb3 {
    public final /* synthetic */ DialogInterfaceOnCancelListenerC7423lm0 a;
    public final /* synthetic */ ClearBrowsingDataFragment b;

    public VS(ClearBrowsingDataFragment clearBrowsingDataFragment, ClearDataProgressDialog clearDataProgressDialog) {
        this.b = clearBrowsingDataFragment;
        this.a = clearDataProgressDialog;
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void b() {
        this.a.Q0(this.b.J(), "clear_data_progress");
    }

    @Override // defpackage.InterfaceC5642gb3
    public final void a() {
        this.a.dismissAllowingStateLoss();
    }
}
