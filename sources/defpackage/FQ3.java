package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.toolbar.menu_button.MenuButton;
import org.chromium.chrome.browser.toolbar.top.ToolbarPhone;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FQ3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarPhone a;

    public FQ3(ToolbarPhone toolbarPhone) {
        this.a = toolbarPhone;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        int i = ToolbarPhone.L0;
        ToolbarPhone toolbarPhone = this.a;
        MenuButton menuButton = toolbarPhone.s.e;
        if (menuButton != null && menuButton.getVisibility() == 0) {
            return toolbarPhone.s.e;
        }
        Tab a = toolbarPhone.j.a();
        if (a != null) {
            return a.a();
        }
        return null;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        return this.a.findViewById(R.id.url_bar);
    }
}
