package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wj3 */
/* loaded from: classes.dex */
public final class C2908Wj3 extends BA0 {
    public final /* synthetic */ C3038Xj3 a;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        C3038Xj3 c3038Xj3 = this.a;
        c3038Xj3.i();
        c3038Xj3.j(7);
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        C3038Xj3 c3038Xj3 = this.a;
        InterfaceC0079Ap3 interfaceC0079Ap3 = c3038Xj3.n;
        if (interfaceC0079Ap3 == null || !((Boolean) interfaceC0079Ap3.get()).booleanValue()) {
            return;
        }
        c3038Xj3.j(8);
    }

    @Override // defpackage.BA0
    public final void N0() {
        this.a.i = true;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.j(6);
    }

    @Override // defpackage.BA0
    public final void v0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        C3038Xj3 c3038Xj3 = this.a;
        if (c3038Xj3.i) {
            c3038Xj3.j(5);
        }
    }

    @Override // defpackage.BA0
    public final void w0(NavigationHandle navigationHandle) {
        boolean z = navigationHandle.a;
    }

    public C2908Wj3(C3038Xj3 c3038Xj3) {
        this.a = c3038Xj3;
    }
}
