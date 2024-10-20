package defpackage;

import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mR3 */
/* loaded from: classes2.dex */
public final class C7653mR3 extends AbstractViewOnKeyListenerC10567uv1 {
    public final /* synthetic */ ToolbarTablet a;

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View b() {
        ToolbarTablet toolbarTablet = this.a;
        if (toolbarTablet.x.isFocusable()) {
            return toolbarTablet.findViewById(R.id.back_button);
        }
        if (toolbarTablet.y.isFocusable()) {
            return toolbarTablet.findViewById(R.id.forward_button);
        }
        return toolbarTablet.findViewById(R.id.refresh_button);
    }

    public C7653mR3(ToolbarTablet toolbarTablet) {
        this.a = toolbarTablet;
    }

    @Override // defpackage.AbstractViewOnKeyListenerC10567uv1
    public final View a() {
        return this.a.findViewById(R.id.menu_button);
    }
}
