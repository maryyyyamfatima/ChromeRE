package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oR3 */
/* loaded from: classes2.dex */
public final class C8341oR3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarTablet a;

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        ToolbarTablet toolbarTablet = this.a;
        if (toolbarTablet.x.isFocusable()) {
            return toolbarTablet.x;
        }
        if (toolbarTablet.w.getVisibility() == 0) {
            return toolbarTablet.findViewById(R.id.home_button);
        }
        return toolbarTablet.findViewById(R.id.menu_button);
    }

    public C8341oR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        return this.a.findViewById(R.id.refresh_button);
    }
}
