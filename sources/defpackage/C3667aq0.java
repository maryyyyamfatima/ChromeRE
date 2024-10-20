package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aq0 */
/* loaded from: classes.dex */
public final class C3667aq0 extends BA0 {
    public final /* synthetic */ C4354cq0 a;

    public C3667aq0(C4354cq0 c4354cq0) {
        this.a = c4354cq0;
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        this.a.g.c();
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        this.a.g.c();
    }

    @Override // defpackage.BA0
    public final void g0(Tab tab, WindowAndroid windowAndroid) {
        C3325Zp0 c3325Zp0 = this.a.g;
        if (windowAndroid == null) {
            C1751Nm1 c1751Nm1 = c3325Zp0.h;
            if (c1751Nm1 != null) {
                c1751Nm1.g.d(c3325Zp0);
                c3325Zp0.h = null;
            }
            c3325Zp0.e(null);
            c3325Zp0.a = null;
            return;
        }
        c3325Zp0.b();
    }
}
