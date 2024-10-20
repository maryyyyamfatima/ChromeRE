package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cq0 */
/* loaded from: classes.dex */
public final class C4354cq0 implements J44 {
    public final Tab a;
    public final C3325Zp0 g;
    public final C3667aq0 h;

    public C4354cq0(TabImpl tabImpl) {
        C3667aq0 c3667aq0 = new C3667aq0(this);
        this.h = c3667aq0;
        this.a = tabImpl;
        tabImpl.v(c3667aq0);
        this.g = new C3325Zp0(new C4011bq0(tabImpl));
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this.h);
        C3325Zp0 c3325Zp0 = this.g;
        C1751Nm1 c1751Nm1 = c3325Zp0.h;
        if (c1751Nm1 != null) {
            c1751Nm1.g.d(c3325Zp0);
            c3325Zp0.h = null;
        }
        c3325Zp0.e(null);
        c3325Zp0.a = null;
    }
}
