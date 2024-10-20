package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Na2 */
/* loaded from: classes.dex */
public final class C1692Na2 extends BA0 {
    public final /* synthetic */ C1822Oa2 a;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.a.j = null;
        tab.w(this);
        V0();
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        this.a.j = null;
        tabImpl.w(this);
        V0();
    }

    public final void V0() {
        C1822Oa2 c1822Oa2 = this.a;
        c1822Oa2.d(c1822Oa2.i.j == 4);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.j = null;
        tab.w(this);
        V0();
    }

    public C1692Na2(C1822Oa2 c1822Oa2) {
        this.a = c1822Oa2;
    }
}
