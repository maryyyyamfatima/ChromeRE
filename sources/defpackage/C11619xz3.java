package defpackage;

import J.N;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xz3 */
/* loaded from: classes.dex */
public final class C11619xz3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C0129Az3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    public C11619xz3(C0129Az3 c0129Az3) {
        this.a = c0129Az3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        C0129Az3 c0129Az3 = this.a;
        if (AbstractC1558Lz3.c(c0129Az3.g(), tab.getId()) != null) {
            TabContentManager tabContentManager = c0129Az3.s;
            int id = tab.getId();
            GURL url = tab.getUrl();
            long j = tabContentManager.f;
            if (j != 0) {
                N.MO5IR90z(j, tabContentManager, id, url);
            }
        }
    }
}
