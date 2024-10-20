package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kj3 */
/* loaded from: classes2.dex */
public final class C1349Kj3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C1608Mj3 a;

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
        C1608Mj3 c1608Mj3 = this.a;
        c1608Mj3.a.k(AbstractC1738Nj3.j, ((AbstractC11276wz3) c1608Mj3.m).o());
        c1608Mj3.a((C8610pD) c1608Mj3.e.get());
    }

    public C1349Kj3(C1608Mj3 c1608Mj3) {
        this.a = c1608Mj3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        C1608Mj3 c1608Mj3 = this.a;
        if (c1608Mj3.g.a()) {
            PD2 pd2 = AbstractC1738Nj3.s;
            C10226tv3 c10226tv3 = c1608Mj3.n;
            PropertyModel propertyModel = c1608Mj3.a;
            propertyModel.o(pd2, c10226tv3);
            propertyModel.o(AbstractC1738Nj3.t, c1608Mj3.m);
        }
    }
}
