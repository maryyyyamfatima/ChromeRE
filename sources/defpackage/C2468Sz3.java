package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.metrics.PageLoadMetrics;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sz3 */
/* loaded from: classes.dex */
public final class C2468Sz3 implements InterfaceC8876pz3, InterfaceC0186Bl0 {
    public final C4620dd0 a;
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public final C12157za2 i = new C12157za2();
    public Tab j;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void D(Tab tab, boolean z) {
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
    public final /* synthetic */ void R(int i, int i2, Tab tab) {
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
    public final /* synthetic */ void o(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    public final void d(AbstractC2338Rz3 abstractC2338Rz3) {
        this.i.a(abstractC2338Rz3);
        Tab tab = this.a.b;
        if (tab != null) {
            tab.v(abstractC2338Rz3);
            abstractC2338Rz3.V0();
        }
    }

    public final void j(AbstractC2338Rz3 abstractC2338Rz3) {
        this.i.d(abstractC2338Rz3);
        Tab tab = this.a.b;
        if (tab != null) {
            tab.w(abstractC2338Rz3);
        }
    }

    public C2468Sz3(I5 i5, C4620dd0 c4620dd0) {
        C2208Qz3 c2208Qz3 = new C2208Qz3(this);
        this.a = c4620dd0;
        c4620dd0.a.a(c2208Qz3);
        i5.b(this);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        b(tab);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        h();
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        h();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            tab.w((BA0) it.next());
        }
    }

    public final void b(Tab tab) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            PageLoadMetrics.a((InterfaceC0948Hh2) it.next());
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            tab.v((BA0) it2.next());
        }
    }

    public final void h() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            InterfaceC0948Hh2 interfaceC0948Hh2 = (InterfaceC0948Hh2) it.next();
            Object obj = ThreadUtils.a;
            C12157za2 c12157za2 = PageLoadMetrics.a;
            if (c12157za2 != null) {
                c12157za2.d(interfaceC0948Hh2);
            }
        }
    }

    public static void a(C2468Sz3 c2468Sz3) {
        Tab tab = c2468Sz3.j;
        C12157za2 c12157za2 = c2468Sz3.i;
        if (tab != null) {
            Iterator it = c12157za2.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    tab.w((BA0) c11814ya2.next());
                }
            }
        }
        Tab tab2 = c2468Sz3.a.b;
        c2468Sz3.j = tab2;
        if (tab2 == null) {
            return;
        }
        Iterator it2 = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya22 = (C11814ya2) it2;
            if (!c11814ya22.hasNext()) {
                return;
            } else {
                tab2.v((BA0) c11814ya22.next());
            }
        }
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        h();
    }
}
