package defpackage;

import J.N;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cY3 */
/* loaded from: classes.dex */
public final class C4251cY3 implements V02 {
    public final CustomTabsConnection a;
    public final PC g;

    public C4251cY3(PC pc, CustomTabsConnection customTabsConnection) {
        this.a = customTabsConnection;
        this.g = pc;
    }

    @Override // defpackage.V02
    public final void U() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("TrustedWebActivityPostMessage")) {
            return;
        }
        this.a.c.e(this.g.u(), null);
    }
}
