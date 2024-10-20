package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Yi4 implements InterfaceC0259Bz3 {
    public final /* synthetic */ VrShell a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        VrShell vrShell = this.a;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        N.MT175_UO(j, vrShell, tab.isIncognito(), tab.getId(), tab.getTitle());
    }

    public Yi4(VrShell vrShell) {
        this.a = vrShell;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        VrShell vrShell = this.a;
        Tab tab = (Tab) vrShell.p.get();
        if (tab == vrShell.C) {
            return;
        }
        vrShell.f(tab);
    }
}
