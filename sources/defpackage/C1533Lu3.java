package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lu3 */
/* loaded from: classes.dex */
public final class C1533Lu3 extends BA0 {
    public final /* synthetic */ C1663Mu3 a;

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
    }

    public C1533Lu3(C1663Mu3 c1663Mu3) {
        this.a = c1663Mu3;
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        tab.w(this);
    }

    @Override // defpackage.BA0
    public final void B0(String str) {
        if (str != null) {
            this.a.g = str;
        }
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        if ((loadUrlParams.d & 33554432) == 33554432) {
            this.a.g = null;
        }
    }
}
