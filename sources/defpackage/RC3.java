package defpackage;

import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RC3 implements InterfaceC8876pz3 {
    public final /* synthetic */ WC3 a;
    public final /* synthetic */ XC3 g;
    public final /* synthetic */ ZC3 h;

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
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void y(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        ZC3 zc3 = this.h;
        if (((AbstractC11276wz3) zc3.k).g().getCount() != 1) {
            C0388Cz2 c0388Cz2 = zc3.z;
            if (c0388Cz2 != null) {
                C12304zz2 c12304zz2 = c0388Cz2.f;
                if ((c12304zz2 == null ? -1 : c12304zz2.a) == tab.getId()) {
                    ((n) this.g).j.j(6, 3);
                    return;
                }
                return;
            }
            return;
        }
        c cVar = ((n) this.a).j;
        cVar.j(3, 5);
        cVar.j(6, 4);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void L() {
        ZC3 zc3 = this.h;
        if (zc3.j.j(AbstractC1678Mx3.a)) {
            ((n) zc3.i).u(((AbstractC11276wz3) zc3.k).c.d(), false, zc3.G);
            zc3.e();
            zc3.f();
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        ZC3 zc3 = this.h;
        if (((AbstractC11276wz3) zc3.k).i) {
            zc3.b();
            if (i == 0 || zc3.B || i == 5) {
                zc3.B = false;
                return;
            }
            if (zc3.F) {
                zc3.F = false;
                InterfaceC10590uz3 interfaceC10590uz3 = zc3.k;
                AbstractC7158kz3 d = ((AbstractC11276wz3) interfaceC10590uz3).c.d();
                if (d instanceof C1024Hw3) {
                    ((C1024Hw3) d).e0(tab);
                }
                if (i == 3) {
                    AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
                    Tab c = AbstractC1558Lz3.c(abstractC11276wz3.g(), i2);
                    int i3 = zc3.C;
                    int i4 = abstractC11276wz3.e;
                    int i5 = zc3.f11478J;
                    if (i3 != i4) {
                        if (AbstractC1558Lz3.d(abstractC11276wz3.g(), tab.getId()) == zc3.E) {
                            FI2.a("MobileTabSwitched");
                        }
                        if (!AbstractC5177fD3.e(zc3.K) || zc3.a(tab.getId()).size() == 1) {
                            FI2.a("MobileTabSwitched.GridTabSwitcher");
                        }
                    } else if (tab.getId() == zc3.D) {
                        if (i5 == 2) {
                            FI2.a("MobileTabReturnedToCurrentTab.TabCarousel");
                        } else if (i5 == 0) {
                            FI2.a("MobileTabReturnedToCurrentTab.TabGrid");
                        }
                        FI2.a("MobileTabReturnedToCurrentTab");
                        EI2.m(0, "Tabs.TabOffsetOfSwitch.GridTabSwitcher");
                    } else {
                        C7502lz3 c7502lz3 = abstractC11276wz3.c;
                        int s = c7502lz3.d().s(c);
                        int s2 = c7502lz3.d().s(tab);
                        if (s != s2) {
                            if (zc3.a(tab.getId()).size() == 1) {
                                FI2.a("MobileTabSwitched.GridTabSwitcher");
                            }
                            EI2.m(s - s2, "Tabs.TabOffsetOfSwitch.GridTabSwitcher");
                        }
                    }
                    if (i5 == 0) {
                        TabModel g = abstractC11276wz3.g();
                        Q83 q83 = AbstractC2077Pz2.a;
                        if ((!g.b().i()) && AbstractC2077Pz2.c()) {
                            int i6 = C10307u93.u;
                            C10307u93 c10307u93 = (C10307u93) AbstractC4368cs2.d(tab, C10307u93.class);
                            FI2.a("Commerce.TabGridSwitched.".concat((c10307u93 == null || c10307u93.q() == null) ? false : true ? "HasPriceDrop" : "NoPriceDrop"));
                        }
                    }
                }
            }
            if (zc3.j.j(AbstractC1678Mx3.a)) {
                zc3.c(tab.getId(), false);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        ZC3 zc3 = this.h;
        C0388Cz2 c0388Cz2 = zc3.z;
        if (c0388Cz2 != null) {
            C12304zz2 c12304zz2 = c0388Cz2.f;
            if ((c12304zz2 == null ? -1 : c12304zz2.a) == tab.getId()) {
                C0388Cz2 c0388Cz22 = zc3.z;
                c0388Cz22.f = null;
                c0388Cz22.d();
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        ZC3 zc3 = this.h;
        if (((AbstractC11276wz3) zc3.k).i) {
            zc3.B = false;
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        ZC3 zc3 = this.h;
        if (((AbstractC11276wz3) zc3.k).g().getCount() == 1) {
            ((n) this.a).w();
        }
        C0388Cz2 c0388Cz2 = zc3.z;
        if (c0388Cz2 != null) {
            C12304zz2 c12304zz2 = c0388Cz2.f;
            if ((c12304zz2 == null ? -1 : c12304zz2.a) == tab.getId()) {
                ((n) this.g).s(3);
            }
        }
    }

    public RC3(ZC3 zc3, WC3 wc3, XC3 xc3) {
        this.h = zc3;
        this.a = wc3;
        this.g = xc3;
    }
}
