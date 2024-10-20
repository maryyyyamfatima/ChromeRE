package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S04 extends AbstractC0909Gz3 {
    public final /* synthetic */ U04 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void B() {
        U04 u04 = this.h;
        Integer num = u04.l;
        if (num != null) {
            d(num.intValue());
            U04.a(u04);
        }
        u04.b();
        u04.a.clear();
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        Tab tabAt;
        U04 u04 = this.h;
        if (u04.m != null || tab.isIncognito()) {
            return;
        }
        int id = tab.getId();
        TabModel j = ((AbstractC11276wz3) u04.g).j(false);
        if (!u04.n && u04.p) {
            u04.a.add(Integer.valueOf(id));
        }
        int index = j.index();
        if (index <= -1 || index >= j.getCount() || (tabAt = j.getTabAt(index)) == null || id != tabAt.getId()) {
            return;
        }
        u04.l = Integer.valueOf(id);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        if (i == 3 || i == 4 || i == 2) {
            this.h.b();
        }
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void V(boolean z) {
        Tab tabAt;
        if (z) {
            return;
        }
        U04 u04 = this.h;
        TabModel g = ((AbstractC11276wz3) u04.g).g();
        int index = g.index();
        u04.m = Boolean.TRUE;
        if (index <= -1 || index >= g.getCount() || (tabAt = g.getTabAt(index)) == null) {
            return;
        }
        u04.l = Integer.valueOf(tabAt.getId());
        if (u04.n || !u04.p) {
            return;
        }
        u04.a.add(Integer.valueOf(tabAt.getId()));
    }

    public final void d(int i) {
        U04 u04 = this.h;
        if (u04.a.contains(Integer.valueOf(i))) {
            FI2.a("TabletTabStrip.UndoCloseTab");
            u04.a.remove(Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void o(Tab tab) {
        U04 u04 = this.h;
        if (u04.m != null) {
            return;
        }
        int id = tab.getId();
        d(id);
        Integer num = u04.l;
        if (num == null || num.intValue() != id) {
            return;
        }
        U04.a(u04);
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void u(boolean z) {
        if (z) {
            return;
        }
        U04 u04 = this.h;
        u04.b();
        u04.a.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S04(U04 u04, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = u04;
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        if (tab.isIncognito()) {
            return;
        }
        U04 u04 = this.h;
        u04.b();
        u04.a.clear();
    }
}
