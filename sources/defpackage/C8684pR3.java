package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pR3 */
/* loaded from: classes2.dex */
public final class C8684pR3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarTablet a;

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        ToolbarTablet toolbarTablet = this.a;
        return toolbarTablet.y.isFocusable() ? toolbarTablet.y : toolbarTablet.x.isFocusable() ? toolbarTablet.x : toolbarTablet.w.getVisibility() == 0 ? toolbarTablet.findViewById(R.id.home_button) : toolbarTablet.findViewById(R.id.menu_button);
    }

    public C8684pR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        return this.a.findViewById(R.id.url_bar);
    }
}
