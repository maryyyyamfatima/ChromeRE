package defpackage;

import J.N;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yz3 */
/* loaded from: classes.dex */
public final class C11962yz3 extends AbstractC1429Kz3 {
    public final /* synthetic */ C0129Az3 i;

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        TabContentManager tabContentManager = this.i.s;
        int id = tab.getId();
        GURL url = tab.getUrl();
        long j = tabContentManager.f;
        if (j != 0) {
            N.MO5IR90z(j, tabContentManager, id, url);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11962yz3(C0129Az3 c0129Az3, C0129Az3 c0129Az32) {
        super(c0129Az32);
        this.i = c0129Az3;
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        int id = tabImpl.getId();
        C0129Az3 c0129Az3 = this.i;
        if (c0129Az3.k(id) == c0129Az3.g()) {
            TabContentManager tabContentManager = c0129Az3.s;
            int id2 = tabImpl.getId();
            GURL url = tabImpl.getUrl();
            long j = tabContentManager.f;
            if (j != 0) {
                N.MO5IR90z(j, tabContentManager, id2, url);
            }
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        if (C8693pT2.W0(tabImpl)) {
            this.i.s.h(tabImpl.getId());
        }
    }

    @Override // defpackage.BA0
    public final void j0(TabImpl tabImpl) {
        this.i.e(tabImpl);
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid == null) {
            C0129Az3 c0129Az3 = this.i;
            if (c0129Az3.k) {
                return;
            }
            c0129Az3.j(tab.isIncognito()).n(tab);
        }
    }
}
