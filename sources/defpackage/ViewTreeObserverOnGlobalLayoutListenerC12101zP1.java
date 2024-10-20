package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.d;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zP1 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC12101zP1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ d a;

    public ViewTreeObserverOnGlobalLayoutListenerC12101zP1(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d dVar = this.a;
        dVar.I.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = dVar.L;
        if (hashSet == null || hashSet.size() == 0) {
            dVar.i(true);
            return;
        }
        AP1 ap1 = new AP1(dVar);
        int firstVisiblePosition = dVar.I.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < dVar.I.getChildCount(); i++) {
            View childAt = dVar.I.getChildAt(i);
            if (dVar.L.contains((DQ1) dVar.f11486J.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(dVar.m0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(ap1);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }
}
