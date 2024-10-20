package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z20 */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC11977z20 implements View.OnLayoutChangeListener {
    public final /* synthetic */ CompositorViewHolder a;

    public ViewOnLayoutChangeListenerC11977z20(CompositorViewHolder compositorViewHolder) {
        this.a = compositorViewHolder;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = CompositorViewHolder.W;
        CompositorViewHolder compositorViewHolder = this.a;
        Tab h = compositorViewHolder.h();
        if (h != null && h.isNativePage()) {
            View a = h.a();
            if ((a == null || a.getWindowToken() == null) ? false : true) {
                Point i10 = compositorViewHolder.i();
                compositorViewHolder.w(h.b(), h.a(), i10.x, i10.y);
            }
        }
        compositorViewHolder.t();
        if (compositorViewHolder.r != null) {
            new Handler().postDelayed(compositorViewHolder.r, 30L);
            compositorViewHolder.r = null;
        }
    }
}
