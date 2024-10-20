package defpackage;

import J.N;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WD3 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ YD3 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        YD3 yd3 = this.g;
        Tab tab = yd3.a;
        if (tab != null) {
            tab.q().c(yd3.h);
        }
        if (yd3.j != null) {
            yd3.j = null;
        }
        if (this.a) {
            Tab tab2 = yd3.a;
            WebContents b = tab2 != null ? tab2.b() : null;
            if (b != null && !b.isDestroyed()) {
                WindowAndroid Q0 = b.Q0();
                Activity activity = Q0 != null ? (Activity) Q0.k().get() : null;
                View currentFocus = activity != null ? activity.getCurrentFocus() : null;
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                WebContentsAccessibilityImpl k = WebContentsAccessibilityImpl.k(b);
                if (k != null) {
                    long j = k.k;
                    if (j != 0) {
                        N.MPQKLw45(j, k.t, -1);
                        k.t = -1;
                        k.A(k.m, 256);
                        k.m = -1;
                    }
                }
            }
        }
        yd3.n = false;
        yd3.o = false;
    }

    public WD3(YD3 yd3, boolean z) {
        this.g = yd3;
        this.a = z;
    }
}
