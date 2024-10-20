package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sy3 */
/* loaded from: classes.dex */
public final class C9899sy3 extends AbstractC11339xA0 {
    public final /* synthetic */ C1553Ly3 a;

    @Override // defpackage.AbstractC11339xA0
    public final void a(List list, ArrayList arrayList, boolean z) {
    }

    @Override // defpackage.AbstractC11339xA0
    public final void b(Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        if (c1553Ly3.q) {
            InterfaceC10590uz3 interfaceC10590uz3 = c1553Ly3.g;
            TabModel g = ((AbstractC11276wz3) interfaceC10590uz3).g();
            List h = c1553Ly3.h(tab.getId());
            C1813Ny3 c1813Ny3 = c1553Ly3.e;
            c1813Ny3.getClass();
            int i = -1;
            int i2 = -1;
            for (int s = g.s((Tab) h.get(h.size() - 1)); s >= 0; s--) {
                Tab tabAt = g.getTabAt(s);
                if (!h.contains(tabAt)) {
                    break;
                }
                int G = c1813Ny3.G(tabAt.getId());
                if (G != -1 && i2 == -1) {
                    i2 = G;
                } else if (G != -1 && i == -1) {
                    i = G;
                }
            }
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            int intValue = ((Integer) pair.second).intValue();
            int intValue2 = ((Integer) pair.first).intValue();
            if (c1553Ly3.k(intValue) && c1553Ly3.k(intValue2)) {
                boolean t = n.t(c1553Ly3.f);
                Tab tabAt2 = t ? ((AbstractC11276wz3) interfaceC10590uz3).c.d().getTabAt(((AbstractC11276wz3) interfaceC10590uz3).c.d().s(((AbstractC11276wz3) interfaceC10590uz3).m(((C7272lK1) c1813Ny3.get(intValue2)).b.h(AbstractC9627sA3.a)))) : null;
                c1813Ny3.y(intValue);
                if (c1553Ly3.h(tab.getId()).size() == 2) {
                    FI2.a("TabGroup.Created.DropToMerge");
                } else {
                    FI2.a("TabGrid.Drag.DropToMerge");
                }
                if (intValue <= intValue2) {
                    intValue2 = c1813Ny3.F(intValue2);
                }
                if (!t) {
                    tabAt2 = ((AbstractC11276wz3) interfaceC10590uz3).c.d().getTabAt(c1813Ny3.E(intValue2));
                }
                boolean z = ((AbstractC11276wz3) interfaceC10590uz3).h() == tabAt2;
                this.a.r(intValue2, IE2.a(tabAt2), z, true, false);
                if (z && t && intValue2 != 0) {
                    c1813Ny3.w(intValue2, 0);
                }
            }
        }
    }

    @Override // defpackage.AbstractC11339xA0
    public final void c(int i, int i2, Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        if (!c1553Ly3.q || i2 == i) {
            return;
        }
        InterfaceC10590uz3 interfaceC10590uz3 = c1553Ly3.g;
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) interfaceC10590uz3).c.d();
        List h = c1553Ly3.h(tab.getId());
        Tab a = AbstractC7492lx3.a(interfaceC10590uz3, tab);
        TabModel g = ((AbstractC11276wz3) interfaceC10590uz3).g();
        int id = a.getId();
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        int G = c1813Ny3.G(id);
        if (G == -1) {
            if (c1813Ny3.size() == 0) {
                return;
            }
            c1813Ny3.M(c1813Ny3.H(c1024Hw3.s(g.getTabAt(i))), a);
            G = c1813Ny3.G(a.getId());
        }
        if (c1553Ly3.k(G)) {
            Tab tabAt = g.getTabAt(i2 > i ? i2 - h.size() : i2 + 1);
            Tab a2 = AbstractC7492lx3.a(interfaceC10590uz3, tabAt);
            int G2 = c1813Ny3.G(a2.getId());
            if (G2 == -1) {
                c1813Ny3.M(c1813Ny3.H(c1024Hw3.s(tabAt) + (i2 > i ? 1 : -1)), a2);
                G2 = c1813Ny3.G(a2.getId());
            }
            if (c1553Ly3.k(G2)) {
                c1813Ny3.w(G, G2);
            }
        }
    }

    @Override // defpackage.AbstractC11339xA0
    public final void d(int i, Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        C1024Hw3 c1024Hw3 = (C1024Hw3) ((AbstractC11276wz3) c1553Ly3.g).c.d();
        Tab tabAt = c1024Hw3.getTabAt(i);
        boolean z = tabAt.getId() == tab.getId();
        boolean z2 = c1553Ly3.q;
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        if (!z2) {
            int G = c1813Ny3.G(tab.getId());
            if (c1553Ly3.k(G)) {
                c1813Ny3.y(G);
                C2188Qv3 c2188Qv3 = c1553Ly3.l;
                if (c2188Qv3 != null) {
                    int id = z ? -1 : c1024Hw3.getTabAt(i).getId();
                    C2318Rv3 c2318Rv3 = c2188Qv3.a;
                    c2318Rv3.v = id;
                    c2318Rv3.i();
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        InterfaceC10590uz3 interfaceC10590uz3 = c1553Ly3.g;
        Tab h = ((AbstractC11276wz3) interfaceC10590uz3).h();
        if (!n.t(c1553Ly3.f)) {
            c1553Ly3.c(IE2.a(tab), c1813Ny3.H(AbstractC1558Lz3.d(((AbstractC11276wz3) interfaceC10590uz3).c.d(), tab.getId())), h.getId() == tab.getId());
            c1553Ly3.r(c1553Ly3.e.H(i), IE2.a(c1024Hw3.getTabAt(i)), ((AbstractC11276wz3) interfaceC10590uz3).i() == c1024Hw3.getTabAt(i).getId(), true, false);
            return;
        }
        int G2 = c1813Ny3.G(tabAt.getId());
        if (G2 == -1) {
            G2 = c1813Ny3.G(tab.getId());
        }
        if (c1553Ly3.k(G2)) {
            boolean z3 = ((AbstractC11276wz3) interfaceC10590uz3).i() == tabAt.getId();
            int D = c1813Ny3.D(tabAt.getId());
            this.a.r(G2, IE2.a(tabAt), z3, true, false);
            if (G2 != D) {
                if (G2 < D) {
                    D--;
                }
                c1813Ny3.w(G2, D);
            }
            c1553Ly3.c(IE2.a(tab), c1813Ny3.D(tab.getId()), h.getId() == tab.getId());
        }
    }

    @Override // defpackage.AbstractC11339xA0
    public final void e(int i, int i2, Tab tab) {
        if (i2 == i) {
            return;
        }
        C1553Ly3 c1553Ly3 = this.a;
        int G = c1553Ly3.e.G(tab.getId());
        TabModel g = ((AbstractC11276wz3) c1553Ly3.g).g();
        if (c1553Ly3.k(G)) {
            int id = g.getTabAt(i2 > i ? i2 - 1 : i2 + 1).getId();
            C1813Ny3 c1813Ny3 = c1553Ly3.e;
            int G2 = c1813Ny3.G(id);
            if (c1553Ly3.k(G2)) {
                c1813Ny3.w(G, G2);
            }
        }
    }

    public C9899sy3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }
}
