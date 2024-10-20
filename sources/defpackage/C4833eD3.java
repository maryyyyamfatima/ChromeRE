package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eD3 */
/* loaded from: classes.dex */
public final class C4833eD3 extends BA0 {
    public final Tab a;
    public final Callback g;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public C4833eD3(C9209qx3 c9209qx3, Tab tab) {
        this.a = tab;
        this.g = c9209qx3;
        tab.v(this);
    }

    @Override // defpackage.BA0
    public final void O0(TabImpl tabImpl) {
        V0(tabImpl, false);
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        V0(tabImpl, false);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.l != 0) {
            V0(tabImpl, true);
        }
    }

    public final void V0(TabImpl tabImpl, boolean z) {
        int i = tabImpl.f11528J;
        if (z) {
            i = tabImpl.l.k();
        }
        this.g.onResult(Integer.valueOf(i));
    }
}
