package defpackage;

import J.N;
import android.app.Activity;
import android.view.ViewTreeObserver;
import android.view.Window;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.b;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hP */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC5921hP implements InterfaceC11179wj, ViewTreeObserver.OnDrawListener {
    public static ViewTreeObserverOnDrawListenerC5921hP g;
    public boolean a;

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (activity instanceof ChromeActivity) {
            boolean z = i == 2 || i == 3;
            Window window = activity.getWindow();
            if (window != null) {
                ViewTreeObserver viewTreeObserver = window.getDecorView().getRootView().getViewTreeObserver();
                if (z && !this.a) {
                    viewTreeObserver.addOnDrawListener(this);
                    this.a = true;
                } else if (!z && this.a) {
                    viewTreeObserver.removeOnDrawListener(this);
                    this.a = false;
                }
            }
            if (b.n.f()) {
                N.M8QP$v4z(z);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        TraceEvent.f("ChromePowerModeVoter.onDraw");
        if (b.n.f()) {
            N.Mff4VNfS();
        }
    }
}
