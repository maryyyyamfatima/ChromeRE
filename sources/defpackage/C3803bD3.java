package defpackage;

import org.chromium.chrome.browser.toolbar.top.TabSwitcherModeTopToolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bD3 */
/* loaded from: classes2.dex */
public final class C3803bD3 implements InterfaceC0442Dk1 {
    public final /* synthetic */ C4146cD3 a;

    @Override // defpackage.InterfaceC0442Dk1
    public final void a() {
        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = this.a.j;
        if (tabSwitcherModeTopToolbar != null) {
            tabSwitcherModeTopToolbar.c(true);
        }
    }

    @Override // defpackage.InterfaceC0442Dk1
    public final void b() {
        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = this.a.j;
        if (tabSwitcherModeTopToolbar != null) {
            tabSwitcherModeTopToolbar.c(false);
        }
    }

    public C3803bD3(C4146cD3 c4146cD3) {
        this.a = c4146cD3;
    }
}
