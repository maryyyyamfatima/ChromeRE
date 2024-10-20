package defpackage;

import org.chromium.chrome.browser.toolbar.IncognitoToggleTabLayout;
import org.chromium.chrome.browser.toolbar.top.TabSwitcherModeTopToolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dD3 */
/* loaded from: classes2.dex */
public final class C4490dD3 extends HF {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ TabSwitcherModeTopToolbar h;

    public C4490dD3(TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar, boolean z) {
        this.h = tabSwitcherModeTopToolbar;
        this.g = z;
    }

    @Override // defpackage.HF
    public final void b() {
        TabSwitcherModeTopToolbar tabSwitcherModeTopToolbar = this.h;
        tabSwitcherModeTopToolbar.setAlpha(1.0f);
        if (!this.g) {
            tabSwitcherModeTopToolbar.setVisibility(8);
        }
        IncognitoToggleTabLayout incognitoToggleTabLayout = tabSwitcherModeTopToolbar.l;
        if (incognitoToggleTabLayout != null) {
            incognitoToggleTabLayout.setClickable(true);
        }
        tabSwitcherModeTopToolbar.u = null;
    }
}
