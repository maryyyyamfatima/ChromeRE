package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC9988tE1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ P84 a;
    public final /* synthetic */ LithoScrollView g;

    public ViewTreeObserverOnPreDrawListenerC9988tE1(LithoScrollView lithoScrollView, P84 p84) {
        this.g = lithoScrollView;
        this.a = p84;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.a.a;
        LithoScrollView lithoScrollView = this.g;
        lithoScrollView.setScrollY(i);
        ViewTreeObserver viewTreeObserver = lithoScrollView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
