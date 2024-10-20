package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aA3 */
/* loaded from: classes.dex */
public final class C3444aA3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ C9284rA3 a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    public C3444aA3(C9284rA3 c9284rA3) {
        this.a = c9284rA3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void g(Tab tab) {
        C9284rA3 c9284rA3 = this.a;
        c9284rA3.b(tab);
        c9284rA3.r();
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        if (i == 3) {
            C9284rA3 c9284rA3 = this.a;
            c9284rA3.b(tab);
            c9284rA3.r();
        }
    }
}
