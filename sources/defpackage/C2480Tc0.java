package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.GestureListenerManagerImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tc0 */
/* loaded from: classes.dex */
public final class C2480Tc0 extends BA0 {
    public final /* synthetic */ C3130Yc0 a;

    public C2480Tc0(C3130Yc0 c3130Yc0) {
        this.a = c3130Yc0;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        if (tab.b() != null) {
            C3130Yc0 c3130Yc0 = this.a;
            c3130Yc0.h.w(c3130Yc0.z, tab.b());
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("CCTRealTimeEngagementSignals")) {
                if (c3130Yc0.C == null) {
                    c3130Yc0.C = new C3000Xc0(c3130Yc0);
                }
                if (c3130Yc0.B == null) {
                    c3130Yc0.B = new C2870Wc0(c3130Yc0);
                }
                GestureListenerManagerImpl d = GestureListenerManagerImpl.d(tab.b());
                if (d.g.b(c3130Yc0.B)) {
                    return;
                }
                d.b(c3130Yc0.B);
            }
        }
    }

    @Override // defpackage.BA0
    public final void U0(Tab tab) {
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("CCTRealTimeEngagementSignals") || tab.b() == null) {
            return;
        }
        C3130Yc0 c3130Yc0 = this.a;
        if (c3130Yc0.B != null) {
            GestureListenerManagerImpl.d(tab.b()).f(c3130Yc0.B);
        }
    }
}
