package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mk1 */
/* loaded from: classes2.dex */
public final class C1611Mk1 implements InterfaceC0259Bz3 {
    public final /* synthetic */ IncognitoToggleTabLayout a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void l(int i, Tab tab) {
    }

    public C1611Mk1(IncognitoToggleTabLayout incognitoToggleTabLayout) {
        this.a = incognitoToggleTabLayout;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void c(TabModel tabModel, TabModel tabModel2) {
        int i = IncognitoToggleTabLayout.j0;
        this.a.x();
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void a() {
        int i = IncognitoToggleTabLayout.j0;
        IncognitoToggleTabLayout incognitoToggleTabLayout = this.a;
        incognitoToggleTabLayout.b0.e(((AbstractC11276wz3) incognitoToggleTabLayout.g0).c.e(false).getCount(), false);
    }
}
