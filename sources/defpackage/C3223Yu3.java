package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yu3 */
/* loaded from: classes.dex */
public final class C3223Yu3 extends BA0 implements J44 {
    public TabImpl a;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public static C3223Yu3 V0(Tab tab) {
        C3223Yu3 c3223Yu3 = (C3223Yu3) tab.F().b(C3223Yu3.class);
        if (c3223Yu3 != null) {
            return c3223Yu3;
        }
        C3223Yu3 c3223Yu32 = new C3223Yu3(tab);
        tab.F().d(C3223Yu3.class, c3223Yu32);
        return c3223Yu32;
    }

    public C3223Yu3(Tab tab) {
        this.a = (TabImpl) tab;
        tab.v(this);
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this);
        this.a = null;
    }

    public final void W0() {
        this.l = true;
        C11814ya2 P = this.a.P();
        while (P.hasNext()) {
            ((BA0) P.next()).i0(this.a, this.g, this.h, this.i, this.j, this.k);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.l = false;
    }
}
