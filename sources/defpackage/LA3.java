package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class LA3 extends BA0 {
    public final KA3 a = new KA3(this);
    public final /* synthetic */ MA3 g;

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        if (this.g.k) {
            KA3 ka3 = this.a;
            if (ka3.hasMessages(1)) {
                return;
            }
            ka3.sendEmptyMessageDelayed(1, 3000L);
        }
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        if (z && this.g.k) {
            KA3 ka3 = this.a;
            if (ka3.hasMessages(1)) {
                return;
            }
            ka3.sendEmptyMessageDelayed(1, 3000L);
        }
    }

    public LA3(MA3 ma3) {
        this.g = ma3;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.a.removeMessages(1);
        MA3 ma3 = this.g;
        if (ma3.k) {
            ma3.k = false;
            ma3.u();
        }
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        this.a.removeMessages(1);
        MA3 ma3 = this.g;
        if (ma3.k) {
            ma3.k = false;
            ma3.u();
        }
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        WebContents b = tab.b();
        MA3 ma3 = this.g;
        if (ma3.j == b) {
            return;
        }
        ma3.j = b;
        if (b == null) {
            return;
        }
        ImeAdapterImpl.b(b).n.add(ma3);
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.a.removeMessages(1);
        boolean z = !AbstractC2290Rq0.b(gurl.i());
        MA3 ma3 = this.g;
        if (ma3.k == z) {
            return;
        }
        ma3.k = z;
        ma3.u();
    }

    @Override // defpackage.BA0
    public final void O0(TabImpl tabImpl) {
        this.g.u();
    }

    @Override // defpackage.BA0
    public final void L0(Tab tab, boolean z) {
        this.g.u();
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.g.u();
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            this.g.u();
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a) {
            KA3 ka3 = this.a;
            ka3.removeMessages(1);
            ka3.sendEmptyMessageDelayed(1, 3000L);
        }
    }
}
