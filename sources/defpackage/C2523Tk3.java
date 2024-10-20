package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tk3 */
/* loaded from: classes2.dex */
public final class C2523Tk3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C2913Wk3 a;

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

    public C2523Tk3(C2913Wk3 c2913Wk3) {
        this.a = c2913Wk3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        boolean isIncognito = tabModel.isIncognito();
        C2913Wk3 c2913Wk3 = this.a;
        c2913Wk3.v = isIncognito;
        c2913Wk3.j();
    }
}
