package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kx3 */
/* loaded from: classes.dex */
public final class C7148kx3 extends AbstractC1429Kz3 {
    public C7148kx3(AbstractC11276wz3 abstractC11276wz3) {
        super(abstractC11276wz3);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.a && !tabImpl.isIncognito() && navigationHandle.g) {
            if (navigationHandle.k || (navigationHandle.d & 255) == 5) {
                AbstractC7492lx3.b("IPH_TabGroupsQuicklyComparePages", tabImpl.a(), null);
                AbstractC7492lx3.a.destroy();
            }
        }
    }
}
