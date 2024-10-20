package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oy3 */
/* loaded from: classes.dex */
public final class C8528oy3 extends BA0 {
    public final /* synthetic */ C1553Ly3 a;

    @Override // defpackage.BA0
    public final void Q0(Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        int G = c1553Ly3.e.G(tab.getId());
        if (G != -1) {
            if (((AbstractC11276wz3) c1553Ly3.g).m(tab.getId()) == null) {
                return;
            }
            ((C7272lK1) c1553Ly3.e.get(G)).b.o(AbstractC9627sA3.h, c1553Ly3.g(IE2.a(tab)));
        }
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        C1553Ly3 c1553Ly3 = this.a;
        if (AbstractC5177fD3.d(c1553Ly3.d)) {
            int id = tabImpl.getId();
            C1813Ny3 c1813Ny3 = c1553Ly3.e;
            int G = c1813Ny3.G(id);
            if (G == -1 && c1553Ly3.q) {
                Tab a = AbstractC7492lx3.a(c1553Ly3.g, tabImpl);
                if (a == null) {
                    return;
                } else {
                    G = c1813Ny3.G(a.getId());
                }
            }
            if (G == -1) {
                return;
            }
            ((C7272lK1) c1813Ny3.get(G)).b.o(AbstractC9627sA3.t, c1553Ly3.e(tabImpl));
        }
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.c || T34.k(tabImpl.getUrl())) {
            return;
        }
        C1553Ly3 c1553Ly3 = this.a;
        if (c1553Ly3.e.G(tabImpl.getId()) == -1) {
            return;
        }
        int id = tabImpl.getId();
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        ((C7272lK1) c1813Ny3.get(c1813Ny3.G(id))).b.o(AbstractC9627sA3.d, c1553Ly3.n.e(tabImpl.isIncognito()));
    }

    public C8528oy3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }

    @Override // defpackage.BA0
    public final void x0(Tab tab, Bitmap bitmap) {
        this.a.o(IE2.a(tab), bitmap);
    }
}
