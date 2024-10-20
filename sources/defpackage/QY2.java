package defpackage;

import J.N;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewResourceFrameLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class QY2 extends ViewOnLayoutChangeListenerC10125te4 {
    public final /* synthetic */ ScrollingBottomViewResourceFrameLayout m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QY2(ScrollingBottomViewResourceFrameLayout scrollingBottomViewResourceFrameLayout, View view) {
        super(view, false);
        this.m = scrollingBottomViewResourceFrameLayout;
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4, defpackage.InterfaceC3470aG
    public final void c(Canvas canvas, Rect rect) {
        EI2.h(2, 3, "Android.Toolbar.BitmapCapture");
        ScrollingBottomViewResourceFrameLayout scrollingBottomViewResourceFrameLayout = this.m;
        scrollingBottomViewResourceFrameLayout.i.set(rect);
        if (scrollingBottomViewResourceFrameLayout.i.intersect(0, 0, scrollingBottomViewResourceFrameLayout.getWidth(), scrollingBottomViewResourceFrameLayout.j)) {
            canvas.save();
            canvas.clipRect(scrollingBottomViewResourceFrameLayout.i);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.restore();
        }
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4
    public final boolean g() {
        C7928nE c7928nE = UN.a;
        if (N.M09VlOh_("ToolbarScrollAblationAndroid")) {
            return false;
        }
        return super.g();
    }
}
