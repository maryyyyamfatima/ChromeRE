package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent;
import org.chromium.ui.base.ViewAndroidDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yf2 */
/* loaded from: classes.dex */
public final class C11844yf2 extends ViewAndroidDelegate {
    public final /* synthetic */ OverlayPanelContent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11844yf2(OverlayPanelContent overlayPanelContent, Q50 q50) {
        super(q50);
        this.h = overlayPanelContent;
    }

    @Override // org.chromium.ui.base.ViewAndroidDelegate
    public final void setViewPosition(View view, float f, float f2, float f3, float f4, int i, int i2) {
        super.setViewPosition(view, f, f2, f3, f4, i, i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        OverlayPanelContent overlayPanelContent = this.h;
        marginLayoutParams.topMargin = overlayPanelContent.w + overlayPanelContent.v + i3;
    }
}
