package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wz3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11276wz3 implements InterfaceC10590uz3, InterfaceC0442Dk1, InterfaceC6814jz3 {
    public InterfaceC12216zk1 b;
    public final C9360rQ d;
    public int e;
    public C1347Kj1 h;
    public boolean i;
    public boolean k;
    public final InterfaceC10912vv3 l;
    public final ArrayList a = new ArrayList();
    public final C7502lz3 c = new C7502lz3();
    public final C12157za2 f = new C12157za2();
    public final C12157za2 g = new C12157za2();
    public boolean j = false;

    public abstract void f();

    public abstract void p();

    public abstract void t(boolean z);

    public AbstractC11276wz3(InterfaceC10912vv3 interfaceC10912vv3, C9360rQ c9360rQ) {
        this.l = interfaceC10912vv3;
        this.d = c9360rQ;
    }

    public final Tab h() {
        return AbstractC1558Lz3.a(g());
    }

    public final int i() {
        Tab h = h();
        if (h != null) {
            return h.getId();
        }
        return -1;
    }

    public final TabModel k(int i) {
        TabModel tabModel;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                return null;
            }
            tabModel = (TabModel) arrayList.get(i2);
            if (AbstractC1558Lz3.c(tabModel, i) != null || tabModel.z(i)) {
                break;
            }
            i2++;
        }
        return tabModel;
    }

    public final TabModel g() {
        ArrayList arrayList = this.a;
        return arrayList.size() == 0 ? AbstractC11682yA0.a : (TabModel) arrayList.get(this.e);
    }

    public final TabModel j(boolean z) {
        int l = l(z);
        if (l == -1) {
            return AbstractC11682yA0.a;
        }
        return (TabModel) this.a.get(l);
    }

    public final int l(boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (z == ((TabModel) arrayList.get(i)).isIncognito()) {
                return i;
            }
            i++;
        }
    }

    public final boolean o() {
        return this.a.size() == 0 ? this.j : g().isIncognito();
    }

    public final void d(boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((TabModel) arrayList.get(i)).w(z);
            i++;
        }
    }

    public final boolean e(TabImpl tabImpl) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return false;
            }
            TabModel tabModel = (TabModel) arrayList.get(i);
            if (tabModel.s(tabImpl) >= 0) {
                return tabModel.f(tabImpl);
            }
            i++;
        }
    }

    public final Tab m(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                return null;
            }
            Tab c = AbstractC1558Lz3.c((InterfaceC1548Lx3) arrayList.get(i2), i);
            if (c != null) {
                return c;
            }
            i2++;
        }
    }

    public final int n() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return i2;
            }
            i2 += ((TabModel) arrayList.get(i)).getCount();
            i++;
        }
    }

    public final Tab r(LoadUrlParams loadUrlParams, int i, Tab tab, boolean z) {
        return this.l.b(z).b(i, tab, loadUrlParams);
    }

    public final void c(InterfaceC0259Bz3 interfaceC0259Bz3) {
        C12157za2 c12157za2 = this.f;
        if (c12157za2.b(interfaceC0259Bz3)) {
            return;
        }
        c12157za2.a(interfaceC0259Bz3);
    }

    public final void s(InterfaceC0259Bz3 interfaceC0259Bz3) {
        this.f.d(interfaceC0259Bz3);
    }

    public final void q() {
        Iterator it = this.f.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0259Bz3) c11814ya2.next()).h();
            }
        }
    }

    @Override // defpackage.InterfaceC0442Dk1
    public final void a() {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0442Dk1) c11814ya2.next()).a();
            }
        }
    }

    @Override // defpackage.InterfaceC0442Dk1
    public final void b() {
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC0442Dk1) c11814ya2.next()).b();
            }
        }
    }
}
