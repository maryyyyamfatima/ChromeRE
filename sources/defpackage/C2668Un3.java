package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Un3 */
/* loaded from: classes.dex */
public final class C2668Un3 extends AbstractC1429Kz3 {
    public final /* synthetic */ C3188Yn3 i;

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        int i2 = loadUrlParams.d;
        if (i2 == 67108864 || (i2 & 33554432) == 33554432) {
            this.i.d(tab.isIncognito()).a(SystemClock.uptimeMillis(), true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668Un3(C3188Yn3 c3188Yn3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.i = c3188Yn3;
    }

    @Override // defpackage.BA0
    public final void E0(TabImpl tabImpl, boolean z) {
        C5720go3 g = this.i.d(tabImpl.isIncognito()).g(tabImpl.getId());
        if (g != null) {
            C3113Xy3 c3113Xy3 = g.d;
            if (!c3113Xy3.c) {
                c3113Xy3.c = true;
                ((C9897sy1) c3113Xy3.b.a.a).N(null);
            }
            c3113Xy3.a.removeCallbacks(c3113Xy3.e);
        }
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        C5720go3 g = this.i.d(tabImpl.isIncognito()).g(tabImpl.getId());
        if (g != null) {
            C3113Xy3 c3113Xy3 = g.d;
            if (c3113Xy3.c) {
                Handler handler = c3113Xy3.a;
                RunnableC2853Vy3 runnableC2853Vy3 = c3113Xy3.e;
                handler.removeCallbacks(runnableC2853Vy3);
                handler.postDelayed(runnableC2853Vy3, 100L);
            }
        }
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        C5720go3 g = this.i.d(tab.isIncognito()).g(tab.getId());
        if (g != null) {
            C3113Xy3 c3113Xy3 = g.d;
            if (!c3113Xy3.d) {
                c3113Xy3.d = true;
                ((C9897sy1) c3113Xy3.b.a.a).N(null);
            }
            c3113Xy3.a.removeCallbacks(c3113Xy3.f);
        }
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        this.i.d(tab.isIncognito()).z(tab.getId());
    }

    @Override // defpackage.BA0
    public final void I0(int i, Tab tab) {
        this.i.d(tab.isIncognito()).z(tab.getId());
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.i.d(tabImpl.isIncognito()).z(tabImpl.getId());
    }

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        C3188Yn3.a(this.i, tab);
    }

    @Override // defpackage.BA0
    public final void x0(Tab tab, Bitmap bitmap) {
        C3188Yn3.a(this.i, tab);
    }
}
