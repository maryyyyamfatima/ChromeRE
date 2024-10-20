package defpackage;

import java.util.List;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ww3 */
/* loaded from: classes.dex */
public final class C2973Ww3 implements InterfaceC8876pz3 {
    public int a = -1;
    public final /* synthetic */ C4742dx3 g;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void I(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void J(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void V(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void X(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Z(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        C4742dx3 c4742dx3 = this.g;
        if (c4742dx3.B) {
            if (c4742dx3.d(tab.getId()).size() == (AbstractC5177fD3.e(c4742dx3.a) ? 1 : 2)) {
                c4742dx3.e(-1);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void L() {
        C4742dx3 c4742dx3 = this.g;
        Tab h = ((AbstractC11276wz3) c4742dx3.j).h();
        if (h != null) {
            InterfaceC1422Ky1 interfaceC1422Ky1 = c4742dx3.w;
            if (interfaceC1422Ky1 == null || !((C9897sy1) interfaceC1422Ky1).G(2)) {
                c4742dx3.e(h.getId());
                FI2.a("TabStrip.SessionVisibility.".concat(c4742dx3.B ? "Visible" : "Hidden"));
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        C4742dx3 c4742dx3 = this.g;
        if (c4742dx3.B) {
            return;
        }
        c4742dx3.e(tab.getId());
    }

    public C2973Ww3(C4742dx3 c4742dx3) {
        this.g = c4742dx3;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        if (i == 2) {
            this.a = tab.getId();
        }
        int id = tab.getId();
        C4742dx3 c4742dx3 = this.g;
        if (i2 != id) {
            C1978Pf3 c1978Pf3 = c4742dx3.r.g;
            if (c1978Pf3 != null && c1978Pf3.b.isShown()) {
                c4742dx3.r.a(c4742dx3);
            }
        }
        if (i == 3) {
            if (tab.getId() == this.a || tab.getId() == i2) {
                this.a = -1;
            } else {
                C4742dx3.c(c4742dx3, 0);
            }
        }
        if (i == 0) {
            return;
        }
        if (AbstractC5177fD3.e(c4742dx3.a) && c4742dx3.d(i2).contains(tab)) {
            return;
        }
        if (AbstractC5177fD3.a() && c4742dx3.B) {
            return;
        }
        c4742dx3.e(tab.getId());
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        C4742dx3 c4742dx3 = this.g;
        if (i == 2 || i == 5) {
            C4742dx3.c(c4742dx3, i == 5 ? 2 : 1);
        }
        if (i == 2 || i == 3 || i == 11) {
            return;
        }
        if (i != 5 || CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true)) {
            if (i == 13 && c4742dx3.B) {
                c4742dx3.g.o(AbstractC5086ex3.f, Integer.valueOf(c4742dx3.d(tab.getId()).size() - 1));
            }
            if (c4742dx3.B) {
                return;
            }
            c4742dx3.e(tab.getId());
        }
    }
}
