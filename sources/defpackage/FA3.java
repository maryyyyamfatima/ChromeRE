package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FA3 implements InterfaceC0259Bz3 {
    public final /* synthetic */ GA3 a;

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

    public FA3(GA3 ga3) {
        this.a = ga3;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        this.a.d(tabModel.isIncognito());
    }
}
