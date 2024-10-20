package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TM1 extends BA0 {
    public final /* synthetic */ UM1 a;

    @Override // defpackage.BA0
    public final void i0(TabImpl tabImpl, int i, int i2, int i3, int i4, int i5) {
        UM1 um1 = this.a;
        if (tabImpl == um1.i) {
            um1.b();
        }
    }

    public TM1(UM1 um1) {
        this.a = um1;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        UM1 um1 = this.a;
        if (!z || tab == um1.i) {
            if (z || tab != um1.i) {
                return;
            }
            um1.g.setVisibility(8);
            um1.i = null;
            return;
        }
        um1.i = tab;
        um1.b();
        um1.g.setVisibility(0);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        this.a.a(tab);
    }
}
