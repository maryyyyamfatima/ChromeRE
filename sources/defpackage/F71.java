package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F71 extends BA0 {
    public WindowAndroid a;
    public final /* synthetic */ H71 g;

    public F71(H71 h71, WindowAndroid windowAndroid) {
        this.g = h71;
        this.a = windowAndroid;
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        this.a.destroy();
        this.a = null;
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.destroy();
        this.a = null;
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        H71 h71 = this.g;
        G71 g71 = h71.a;
        if (g71 == null) {
            return;
        }
        g71.c.destroy();
        h71.a = null;
    }
}
