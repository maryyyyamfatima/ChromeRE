package defpackage;

import org.chromium.chrome.browser.accessibility_tab_switcher.AccessibilityTabModelWrapper;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C1 implements InterfaceC0259Bz3 {
    public final /* synthetic */ AccessibilityTabModelWrapper a;

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void c(TabModel tabModel, TabModel tabModel2) {
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final /* synthetic */ void g(Tab tab) {
    }

    public C1(AccessibilityTabModelWrapper accessibilityTabModelWrapper) {
        this.a = accessibilityTabModelWrapper;
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void h() {
        int i = AccessibilityTabModelWrapper.t;
        AccessibilityTabModelWrapper accessibilityTabModelWrapper = this.a;
        accessibilityTabModelWrapper.a().notifyDataSetChanged();
        accessibilityTabModelWrapper.c();
    }

    @Override // defpackage.InterfaceC0259Bz3
    public final void l(int i, Tab tab) {
        int i2 = AccessibilityTabModelWrapper.t;
        this.a.a().notifyDataSetChanged();
    }
}
