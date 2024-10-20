package defpackage;

import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder;
import org.chromium.chrome.browser.vr.VrShellDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kj4 */
/* loaded from: classes4.dex */
public final class C7065kj4 implements SimpleConfirmInfoBarBuilder.Listener {
    public final /* synthetic */ Tab a;

    @Override // org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Listener
    public final void b() {
    }

    @Override // org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Listener
    public final void c() {
    }

    public C7065kj4(Tab tab) {
        this.a = tab;
    }

    @Override // org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Listener
    public final void a(boolean z) {
        if (!z) {
            O83.a.p("VR_FEEDBACK_OPT_OUT", true);
            return;
        }
        VrShellDelegate vrShellDelegate = VrShellDelegate.F;
        C12008z71 a = C12008z71.a();
        Tab tab = this.a;
        a.f(AbstractC7239lD3.b(tab), Profile.b(tab.b()), tab.getUrl().i(), V60.a.getPackageName() + ".USER_INITIATED_FEEDBACK_REPORT_VR");
    }
}
