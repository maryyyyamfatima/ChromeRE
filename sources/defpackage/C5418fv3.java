package defpackage;

import J.N;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fv3 */
/* loaded from: classes.dex */
public final class C5418fv3 extends AbstractC1429Kz3 {
    public final TabContentManager i;
    public final ZU0 j;
    public final C5074ev3 k;
    public boolean l;
    public Tab m;

    public C5418fv3(TabContentManager tabContentManager, XU0 xu0, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = tabContentManager;
        this.j = xu0;
        C5074ev3 c5074ev3 = new C5074ev3(this);
        this.k = c5074ev3;
        xu0.a(c5074ev3);
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        Tab tab2;
        if (z && this.l && (tab2 = this.m) != null) {
            this.i.h(tab2.getId());
            this.l = false;
            this.m = null;
        }
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void destroy() {
        super.destroy();
        ((XU0) this.j).k(this.k);
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void W0(Tab tab) {
        TabContentManager tabContentManager = this.i;
        long j = tabContentManager.f;
        if (j == 0) {
            return;
        }
        N.MRvrWXuI(j, tabContentManager, tab, tab.getId());
    }

    @Override // defpackage.AbstractC1429Kz3
    public final void X0(Tab tab) {
        TabContentManager tabContentManager = this.i;
        long j = tabContentManager.f;
        if (j == 0) {
            return;
        }
        N.M6M_espa(j, tabContentManager, tab, tab.getId());
    }
}
