package defpackage;

import androidx.browser.customtabs.CustomTabsSessionToken;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qd0 */
/* loaded from: classes.dex */
public final class C2095Qd0 extends BA0 {
    public final CustomTabsSessionToken a;
    public final CustomTabsConnection g;

    public C2095Qd0(PC pc, CustomTabsConnection customTabsConnection) {
        this.a = pc.u();
        this.g = customTabsConnection;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.g.p(this.a, 1);
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        this.g.p(this.a, 2);
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        this.g.p(this.a, i == -3 ? 4 : 3);
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.g.p(this.a, 5);
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.g.p(this.a, 6);
    }
}
