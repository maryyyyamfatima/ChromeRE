package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wu3 */
/* loaded from: classes.dex */
public final class C2963Wu3 extends BA0 {
    public final /* synthetic */ C3093Xu3 a;

    @Override // defpackage.BA0
    public final void B0(String str) {
        this.a.f();
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        C3093Xu3 c3093Xu3 = this.a;
        if (c3093Xu3.b() != 1 || C3223Yu3.V0(tab).g != 0) {
            c3093Xu3.e();
        } else {
            c3093Xu3.d(1, false);
        }
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        if (windowAndroid != null) {
            this.a.f();
        }
    }

    public C2963Wu3(C3093Xu3 c3093Xu3) {
        this.a = c3093Xu3;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void t0(TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.a) {
            boolean z = navigationHandle.g;
            C3093Xu3 c3093Xu3 = this.a;
            if (c3093Xu3.b() != 1 || !z || C3223Yu3.V0(tabImpl).g != 0) {
                c3093Xu3.e();
            } else {
                c3093Xu3.d(1, false);
            }
        }
    }
}
