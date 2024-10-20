package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VD3 extends BA0 {
    public final /* synthetic */ YD3 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public VD3(YD3 yd3) {
        this.a = yd3;
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        YD3 yd3 = this.a;
        if (yd3.c()) {
            C3799bD c3799bD = yd3.k;
            if (c3799bD != null && yd3.p == -1) {
                yd3.p = c3799bD.v();
            }
            YD3.a(yd3, true);
        }
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        YD3 yd3 = this.a;
        C3799bD c3799bD = yd3.k;
        if (c3799bD != null) {
            c3799bD.u(yd3.p);
            yd3.p = -1;
        }
        YD3.a(yd3, false);
    }
}
