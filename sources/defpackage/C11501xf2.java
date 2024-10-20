package defpackage;

import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xf2 */
/* loaded from: classes.dex */
public final class C11501xf2 extends InterceptNavigationDelegate {
    public final C12055zG0 a;
    public final /* synthetic */ OverlayPanelContent b;

    public C11501xf2(OverlayPanelContent overlayPanelContent) {
        this.b = overlayPanelContent;
        Tab tab = (Tab) overlayPanelContent.c.get();
        this.a = (tab == null || tab.b() == null) ? null : new C12055zG0(new C5877hG0(tab));
    }

    @Override // org.chromium.components.navigation_interception.InterceptNavigationDelegate
    public final boolean shouldIgnoreNavigation(NavigationHandle navigationHandle, GURL gurl) {
        C12055zG0 c12055zG0 = this.a;
        if (c12055zG0 == null || navigationHandle == null) {
            return true;
        }
        ContextualSearchManager contextualSearchManager = ((G70) this.b.o).a;
        contextualSearchManager.y.c(navigationHandle.d, navigationHandle.p, navigationHandle.o, ((Long) contextualSearchManager.q.get()).longValue(), -1, true, navigationHandle.b);
        return !(c12055zG0.v(new BG0(gurl, false, navigationHandle.f, navigationHandle.d, navigationHandle.p, true, contextualSearchManager.y, false, false, false, navigationHandle.a, false, null, false, null)).a != 3 ? false : !navigationHandle.q);
    }
}
