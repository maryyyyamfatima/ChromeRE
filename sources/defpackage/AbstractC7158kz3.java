package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kz3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7158kz3 implements InterfaceC8876pz3, InterfaceC1548Lx3 {
    public static final List j = Collections.unmodifiableList(new ArrayList());
    public final TabModel a;
    public final C12157za2 g = new C12157za2();
    public boolean h;
    public boolean i;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    public abstract void E(Tab tab);

    public abstract void F(Tab tab);

    public boolean K(Tab tab) {
        return false;
    }

    public abstract void M();

    public abstract void N(Tab tab);

    public boolean P() {
        return true;
    }

    public abstract void n(Tab tab);

    public AbstractC7158kz3(TabModel tabModel) {
        this.a = tabModel;
        tabModel.g(this);
    }

    public List G(int i) {
        Tab c = AbstractC1558Lz3.c(this.a, i);
        if (c == null) {
            return j;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        return Collections.unmodifiableList(arrayList);
    }

    public final List H() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            TabModel tabModel = this.a;
            if (i < tabModel.getCount()) {
                Tab tabAt = tabModel.getTabAt(i);
                if (!K(tabAt)) {
                    arrayList.add(tabAt);
                }
                i++;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        N(tab);
        if (!P()) {
            return;
        }
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).R(i, i2, tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        F(tab);
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).D(tab, z);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).y(tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void A(List list) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).A(list);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void X(int i, Tab tab) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).X(i, tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        E(tab);
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).a0(i, i2, tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public void Y(int i, int i2, Tab tab) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).Y(i, i2, tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).I(tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void O(List list, boolean z) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).O(list, z);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        E(tab);
        M();
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).o(tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).Z(tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void V(boolean z) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).V(z);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void u(boolean z) {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).u(z);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        n(tab);
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).J(tab);
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void L() {
        this.h = true;
        if (getCount() != 0) {
            M();
        }
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8876pz3) c11814ya2.next()).L();
            }
        }
    }
}
