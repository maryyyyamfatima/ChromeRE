package defpackage;

import android.view.View;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GQ3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarPhone a;

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final boolean c() {
        MenuButton menuButton;
        LS1 ls1 = this.a.s;
        InterfaceViewOnTouchListenerC0040Ai interfaceViewOnTouchListenerC0040Ai = ls1.d;
        if (interfaceViewOnTouchListenerC0040Ai == null || (menuButton = ls1.e) == null) {
            return false;
        }
        return ((C0170Bi) interfaceViewOnTouchListenerC0040Ai).a(menuButton.a, false);
    }

    public GQ3(ToolbarPhone toolbarPhone) {
        this.a = toolbarPhone;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        return this.a.y;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        Tab a = this.a.j.a();
        if (a != null) {
            return a.a();
        }
        return null;
    }
}
