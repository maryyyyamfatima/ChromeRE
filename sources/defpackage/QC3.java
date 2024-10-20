package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.n;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QC3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ ZC3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        ZC3 zc3 = this.a;
        zc3.B = true;
        zc3.E = tabModel.index();
        AbstractC7158kz3 d = ((AbstractC11276wz3) zc3.k).c.d();
        LD2 ld2 = AbstractC1678Mx3.b;
        boolean isIncognito = d.isIncognito();
        PropertyModel propertyModel = zc3.j;
        propertyModel.k(ld2, isIncognito);
        C0759Fv3 c0759Fv3 = zc3.w;
        if (c0759Fv3 != null) {
            c0759Fv3.g.e(false);
            c0759Fv3.a.h();
        }
        if (propertyModel.j(AbstractC1678Mx3.a)) {
            ((n) zc3.i).u(d, false, zc3.G);
            if (tabModel.isIncognito() && tabModel.getCount() == 0 && tabModel2.getCount() > 0) {
                tabModel2.getTabAt(tabModel2.index()).hide(0);
            }
            zc3.f();
        }
    }

    public QC3(ZC3 zc3) {
        this.a = zc3;
    }
}
