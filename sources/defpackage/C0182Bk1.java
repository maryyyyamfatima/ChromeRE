package defpackage;

import java.util.Iterator;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bk1 */
/* loaded from: classes.dex */
public final class C0182Bk1 implements InterfaceC12216zk1 {
    public final InterfaceC0052Ak1 a;
    public final C12157za2 g = new C12157za2();
    public final C12157za2 h = new C12157za2();
    public TabModel i = AbstractC11682yA0.a;
    public int j;
    public boolean k;

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void a() {
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final boolean isIncognito() {
        return true;
    }

    public C0182Bk1(C0312Ck1 c0312Ck1) {
        this.a = c0312Ck1;
    }

    public final void u() {
        Profile a;
        Object obj = ThreadUtils.a;
        if (!(this.i instanceof C12025zA0)) {
            return;
        }
        C0312Ck1 c0312Ck1 = (C0312Ck1) this.a;
        int i = c0312Ck1.i;
        if (i == 0) {
            a = Profile.d().f(true);
        } else {
            a = i == 1 ? AbstractC1741Nk1.a((WindowAndroid) c0312Ck1.h.get()) : null;
        }
        this.i = new C8190nz3(a, c0312Ck1.i, c0312Ck1.a, c0312Ck1.b, c0312Ck1.c, c0312Ck1.d, c0312Ck1.e, c0312Ck1.f, c0312Ck1.g, false);
        Iterator it = this.g.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                this.i.g((InterfaceC8876pz3) c11814ya2.next());
            }
        }
    }

    public final void o() {
        Object obj = ThreadUtils.a;
        if (!(h().getCount() == 0) || (this.i instanceof C12025zA0) || this.j != 0) {
            return;
        }
        Iterator it = this.h.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (c11814ya2.hasNext()) {
                ((InterfaceC0442Dk1) c11814ya2.next()).b();
            } else {
                this.i.destroy();
                this.i = AbstractC11682yA0.a;
                return;
            }
        }
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void l() {
        if (h().getCount() == 0) {
            return;
        }
        this.i.l();
        o();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final Profile b() {
        return this.i.b();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean f(Tab tab) {
        this.j++;
        boolean f = this.i.f(tab);
        this.j--;
        o();
        return f;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean k(Tab tab, boolean z, boolean z2) {
        this.j++;
        boolean k = this.i.k(tab, z, z2);
        this.j--;
        o();
        return k;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean d(Tab tab, Tab tab2, boolean z, boolean z2) {
        this.j++;
        boolean d = this.i.d(tab, tab2, z, z2);
        this.j--;
        o();
        return d;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final Tab c(int i, boolean z) {
        return this.i.c(i, z);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void p(List list) {
        this.j++;
        this.i.p(list);
        this.j--;
        o();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void j() {
        this.j++;
        this.i.j();
        this.j--;
        o();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void w(boolean z) {
        this.j++;
        this.i.w(z);
        this.j--;
        o();
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int getCount() {
        return this.i.getCount();
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final Tab getTabAt(int i) {
        return this.i.getTabAt(i);
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int s(Tab tab) {
        return this.i.s(tab);
    }

    @Override // defpackage.InterfaceC1548Lx3
    public final int index() {
        return this.i.index();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void q(int i, int i2, boolean z) {
        this.i.q(i, i2, z);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean isActiveModel() {
        return this.k;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void t(int i, int i2) {
        this.i.t(i, i2);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void destroy() {
        this.i.destroy();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean z(int i) {
        return this.i.z(i);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final boolean v() {
        return this.i.v();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final InterfaceC1548Lx3 h() {
        return this.i.h();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void C(int i) {
        this.i.C(i);
        o();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void m(int i) {
        this.i.m(i);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void x() {
        this.i.x();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void e(Tab tab, int i, int i2, int i3) {
        this.j++;
        u();
        boolean z = getCount() == 0;
        this.i.e(tab, i, i2, i3);
        if (z) {
            Iterator it = this.h.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((InterfaceC0442Dk1) c11814ya2.next()).a();
                }
            }
        }
        this.j--;
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void g(InterfaceC8876pz3 interfaceC8876pz3) {
        this.g.a(interfaceC8876pz3);
        this.i.g(interfaceC8876pz3);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void i(InterfaceC8876pz3 interfaceC8876pz3) {
        this.g.d(interfaceC8876pz3);
        this.i.i(interfaceC8876pz3);
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void r(boolean z) {
        this.k = z;
        if (z) {
            u();
        }
        this.i.r(z);
        if (z) {
            return;
        }
        o();
    }

    @Override // org.chromium.chrome.browser.tabmodel.TabModel
    public final void n(Tab tab) {
        this.j++;
        this.i.n(tab);
        this.j--;
        o();
    }
}
