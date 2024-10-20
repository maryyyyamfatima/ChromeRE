package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qR3 */
/* loaded from: classes2.dex */
public final class C9027qR3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarTablet a;

    public C9027qR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        return this.a.findViewById(R.id.url_bar);
    }

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

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        Tab a = this.a.j.a();
        if (a != null) {
            return a.a();
        }
        return null;
    }
}
