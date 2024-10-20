package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bz3 */
/* loaded from: classes.dex */
public final class C4065bz3 extends BA0 {
    public final /* synthetic */ C4752dz3 a;

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        this.a.o();
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        C4752dz3 c4752dz3 = this.a;
        if (c4752dz3.u == tab) {
            c4752dz3.i.d(10);
        }
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        C4752dz3 c4752dz3 = this.a;
        if (c4752dz3.u == tab) {
            c4752dz3.i.d(7);
            c4752dz3.u = null;
        }
    }

    public C4065bz3(C4752dz3 c4752dz3) {
        this.a = c4752dz3;
    }
}
