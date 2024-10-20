package defpackage;

import J.N;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Xi4 extends BA0 {
    public final /* synthetic */ VrShell a;

    @Override // defpackage.BA0
    public final void D0(Tab tab, float f) {
        VrShell vrShell = this.a;
        long j = vrShell.A;
        if (j == 0) {
            return;
        }
        N.M1COYGAS(j, vrShell, f);
    }

    @Override // defpackage.BA0
    public final void l0(Tab tab) {
        VrShell vrShell = this.a;
        Qc4 qc4 = vrShell.D;
        if (qc4 != null) {
            ((Tc4) qc4).f(true);
        }
        vrShell.D = null;
        if (vrShell.A == 0) {
            return;
        }
        float f = vrShell.f11533J;
        if (f != 0.0f) {
            vrShell.setContentCssSize(f, vrShell.K, vrShell.L);
        }
        if (tab != null && tab.y() != null && tab.b() != null) {
            tab.y().requestFocus();
            Tc4 c = Tc4.c(tab.b());
            vrShell.D = c;
            if (c != null) {
                c.f(true);
            }
        }
        N.Mt$XV3Tu(vrShell.A, vrShell, tab);
        vrShell.g();
    }

    public Xi4(VrShell vrShell) {
        this.a = vrShell;
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        ImeAdapterImpl b;
        l0(tab);
        WebContents b2 = tab.b();
        VrShell vrShell = this.a;
        vrShell.getClass();
        if (b2 == null || (b = ImeAdapterImpl.b(b2)) == null) {
            return;
        }
        Fi4 fi4 = new Fi4(vrShell);
        b.g = fi4;
        C11138wc0 c11138wc0 = b.m;
        if (c11138wc0 != null) {
            c11138wc0.r = fi4;
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        int i = VrShell.P;
        this.a.g();
    }

    @Override // defpackage.BA0
    public final void E0(TabImpl tabImpl, boolean z) {
        if (z) {
            int i = VrShell.P;
            this.a.g();
        }
    }

    @Override // defpackage.BA0
    public final void F0(TabImpl tabImpl, boolean z) {
        if (z) {
            int i = VrShell.P;
            this.a.g();
        }
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        int i = VrShell.P;
        this.a.g();
    }
}
