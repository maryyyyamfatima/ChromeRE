package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Qm4 extends BA0 {
    public final /* synthetic */ Rm4 a;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        Rm4 rm4 = this.a;
        rm4.i.c.a(rm4);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        Rm4 rm4 = this.a;
        rm4.i.c.a(rm4);
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        Rm4 rm4 = this.a;
        if (rm4.g.equals(gurl)) {
            return;
        }
        rm4.i.c.a(rm4);
    }

    public Qm4(Pm4 pm4) {
        this.a = pm4;
    }
}
