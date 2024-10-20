package defpackage;

import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: py3 */
/* loaded from: classes.dex */
public final class C8871py3 implements InterfaceC8876pz3 {
    public final /* synthetic */ C1553Ly3 a;

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
    public final /* synthetic */ void L() {
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
        C1553Ly3 c1553Ly3 = this.a;
        if (c1553Ly3.e.G(tab.getId()) == -1) {
            return;
        }
        tab.w(c1553Ly3.z);
        int id = tab.getId();
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        c1813Ny3.y(c1813Ny3.G(id));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        if (c1553Ly3.e.G(tab.getId()) == -1) {
            return;
        }
        int id = tab.getId();
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        c1813Ny3.y(c1813Ny3.G(id));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        c1553Ly3.t = -1;
        if (tab.getId() == i2) {
            return;
        }
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        int G = c1813Ny3.G(i2);
        c1553Ly3.G = G;
        InterfaceC1424Ky3 interfaceC1424Ky3 = c1553Ly3.p;
        if (G != -1) {
            ((C7272lK1) c1813Ny3.get(G)).b.k(AbstractC9627sA3.i, false);
            if (c1553Ly3.q && interfaceC1424Ky3 != null && c1553Ly3.a) {
                ((C7272lK1) c1813Ny3.get(G)).b.o(AbstractC9627sA3.e, new C1294Jy3(interfaceC1424Ky3, i2, true, false));
            }
        }
        int G2 = c1813Ny3.G(tab.getId());
        if (G2 == -1) {
            return;
        }
        ((C7272lK1) c1813Ny3.get(G2)).b.k(AbstractC9627sA3.i, true);
        if (interfaceC1424Ky3 == null || !c1553Ly3.a) {
            return;
        }
        ((C7272lK1) c1813Ny3.get(G2)).b.o(AbstractC9627sA3.e, new C1294Jy3(interfaceC1424Ky3, tab.getId(), true, false));
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Y(int i, int i2, Tab tab) {
        C1553Ly3 c1553Ly3 = this.a;
        if (((AbstractC11276wz3) c1553Ly3.g).c.d() instanceof C1024Hw3) {
            return;
        }
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        int H = c1813Ny3.H(i);
        int H2 = c1813Ny3.H(i2);
        if ((((AbstractC11276wz3) c1553Ly3.g).c.d() instanceof AA0) && c1553Ly3.k(H2) && c1553Ly3.k(H)) {
            c1813Ny3.w(H2, H);
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        AbstractC7158kz3 d;
        int s;
        C1553Ly3 c1553Ly3 = this.a;
        if (((AbstractC11276wz3) c1553Ly3.g).i) {
            boolean z = c1553Ly3.q;
            C1553Ly3.a(c1553Ly3, tab, !z);
            if (i == 3 && z && (s = (d = ((AbstractC11276wz3) c1553Ly3.g).c.d()).s(tab)) != -1) {
                Tab tabAt = d.getTabAt(s);
                C1813Ny3 c1813Ny3 = c1553Ly3.e;
                int H = c1813Ny3.H(s);
                if (c1813Ny3.G(tabAt.getId()) != H) {
                    return;
                }
                this.a.r(H, IE2.a(tabAt), ((C7272lK1) c1813Ny3.get(H)).b.j(AbstractC9627sA3.i), false, false);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        AbstractC7158kz3 d;
        int s;
        C1553Ly3 c1553Ly3 = this.a;
        C1553Ly3.a(c1553Ly3, tab, !c1553Ly3.q);
        boolean a = AbstractC5177fD3.a();
        InterfaceC10590uz3 interfaceC10590uz3 = c1553Ly3.g;
        if (a) {
            ((AbstractC11276wz3) interfaceC10590uz3).g().q(AbstractC1558Lz3.d(((AbstractC11276wz3) interfaceC10590uz3).g(), tab.getId()), 3, false);
        }
        HashMap hashMap = C1553Ly3.I;
        if (hashMap.containsKey(Integer.valueOf(tab.getId()))) {
            int intValue = ((Integer) hashMap.get(Integer.valueOf(tab.getId()))).intValue();
            if (intValue == 0) {
                FI2.a("TabStrip.UndoCloseTab");
            } else if (intValue == 2) {
                FI2.a("GridTabSwitch.UndoCloseTab");
            } else if (intValue == 3) {
                FI2.a("GridTabSwitcher.UndoCloseTabGroup");
            }
            hashMap.remove(Integer.valueOf(tab.getId()));
        }
        if (!c1553Ly3.q || (s = (d = ((AbstractC11276wz3) interfaceC10590uz3).c.d()).s(tab)) == -1 || c1553Ly3.h(tab.getId()).size() == 1) {
            return;
        }
        C1813Ny3 c1813Ny3 = c1553Ly3.e;
        if (s >= c1813Ny3.size()) {
            return;
        }
        Tab tabAt = d.getTabAt(s);
        int H = c1813Ny3.H(s);
        this.a.r(H, IE2.a(tabAt), ((C7272lK1) c1813Ny3.get(H)).b.j(AbstractC9627sA3.i), false, false);
    }

    public C8871py3(C1553Ly3 c1553Ly3) {
        this.a = c1553Ly3;
    }
}
