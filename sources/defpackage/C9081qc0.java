package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qc0 */
/* loaded from: classes.dex */
public final class C9081qc0 extends AbstractC2338Rz3 {
    public final /* synthetic */ C9766sc0 a;

    public C9081qc0(C9766sc0 c9766sc0) {
        this.a = c9766sc0;
    }

    @Override // defpackage.AbstractC2338Rz3
    public final void W0(Tab tab) {
        this.a.b(tab.getUrl().i());
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            this.a.b(navigationHandle.e.i());
        }
    }
}
