package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Rm4 implements InterfaceC0679Ff3, VK0 {
    public Tab a;
    public GURL g;
    public Qm4 h;
    public final /* synthetic */ Sm4 i;

    public Rm4(Sm4 sm4) {
        this.i = sm4;
        WK0.a().b.a(this);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        c();
    }

    public final void c() {
        Qm4 qm4 = this.h;
        if (qm4 != null) {
            this.a.w(qm4);
            this.h = null;
        }
        WK0.a().b.d(this);
    }
}
