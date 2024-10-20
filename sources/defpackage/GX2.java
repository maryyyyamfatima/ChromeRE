package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class GX2 extends BA0 implements J44 {
    public int a;
    public int g;
    public Tab h;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public static GX2 V0(Tab tab) {
        if (tab == null || !tab.isInitialized()) {
            return null;
        }
        GX2 gx2 = tab.isInitialized() ? (GX2) tab.F().b(GX2.class) : null;
        if (gx2 != null) {
            return gx2;
        }
        GX2 gx22 = (GX2) tab.F().d(GX2.class, new GX2(tab));
        tab.v(gx22);
        return gx22;
    }

    public GX2(Tab tab) {
        this.h = tab;
        tab.v(this);
        this.g = 0;
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.h.w(this);
        this.h = null;
    }

    @Override // defpackage.BA0
    public final void k0(Tab tab, boolean z) {
        W0(tab);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        W0(tab);
    }

    @Override // defpackage.BA0
    public final void E0(TabImpl tabImpl, boolean z) {
        W0(tabImpl);
    }

    public final void W0(Tab tab) {
        int i = this.a;
        if (i > 0) {
            EI2.e(i, "Tab.Screenshot.ScreenshotsPerPage");
            EI2.h(this.g, 3, "Tab.Screenshot.Action");
            WebContents b = tab.b();
            if (b != null) {
                N.M$ejnyHh(b, "Tab.Screenshot", "HasOccurred");
            }
        }
        this.a = 0;
        this.g = 0;
    }
}
