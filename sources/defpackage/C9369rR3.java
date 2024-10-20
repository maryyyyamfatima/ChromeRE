package defpackage;

import android.widget.ImageView;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rR3 */
/* loaded from: classes2.dex */
public final class C9369rR3 extends HF {
    public final /* synthetic */ ToolbarTablet g;

    @Override // defpackage.HF
    public final void b() {
        ToolbarTablet toolbarTablet = this.g;
        toolbarTablet.setVisibility(toolbarTablet.E ? 8 : 0);
        if (toolbarTablet.E) {
            return;
        }
        toolbarTablet.N.t(true);
        int i = toolbarTablet.E ? 4 : 0;
        ImageView imageView = toolbarTablet.K;
        if (imageView == null || imageView.getVisibility() == i) {
            return;
        }
        toolbarTablet.K.setVisibility(i);
    }

    public C9369rR3(ToolbarTablet toolbarTablet) {
        this.g = toolbarTablet;
    }
}
