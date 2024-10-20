package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import org.chromium.chrome.browser.omnibox.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mc2 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC7709mc2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public int a;
    public WindowInsets g;
    public final Rect h = new Rect();
    public final /* synthetic */ C9425rc2 i;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        C9425rc2 c9425rc2 = this.i;
        View view = c9425rc2.X0;
        int i = 0;
        while (true) {
            i += view.getTop();
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            } else {
                view = (View) parent;
            }
        }
        boolean z2 = this.a != i;
        this.a = i;
        if (!z2) {
            if (Build.VERSION.SDK_INT < 30) {
                View decorView = ((a) c9425rc2.V0).l.a.getDecorView();
                Rect rect = c9425rc2.S0;
                decorView.getWindowVisibleDisplayFrame(rect);
                Rect rect2 = this.h;
                boolean z3 = !rect.equals(rect2);
                rect2.set(rect);
                z = z3;
            } else {
                WindowInsets rootWindowInsets = c9425rc2.X0.getRootWindowInsets();
                z = !rootWindowInsets.equals(this.g);
                this.g = rootWindowInsets;
            }
            if (!z) {
                return;
            }
        }
        c9425rc2.requestLayout();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC7709mc2(C9425rc2 c9425rc2) {
        this.i = c9425rc2;
    }
}
