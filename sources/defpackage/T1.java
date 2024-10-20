package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T1 extends AbstractC5822h6 {
    public final /* synthetic */ C1948Oz3 i;
    public final /* synthetic */ U1 j;

    @Override // defpackage.AbstractC5822h6
    public final void V0(Tab tab) {
        U1 u1 = this.j;
        TabImpl tabImpl = u1.g;
        if (tabImpl == tab) {
            return;
        }
        TabImpl tabImpl2 = (TabImpl) tab;
        C1948Oz3 c1948Oz3 = this.i;
        if (tabImpl != null) {
            c1948Oz3.b.d(tabImpl);
        }
        if (tabImpl2 != null) {
            c1948Oz3.b.a(tabImpl2);
        }
        u1.g = tabImpl2;
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        this.j.g.o(this.i.a.b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(U1 u1, C6166i6 c6166i6, C1948Oz3 c1948Oz3) {
        super(c6166i6);
        this.j = u1;
        this.i = c1948Oz3;
    }
}
