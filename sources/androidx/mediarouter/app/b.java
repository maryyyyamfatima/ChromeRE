package androidx.mediarouter.app;

import android.view.animation.Animation;
import defpackage.C7727mf2;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.I;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            C7727mf2 c7727mf2 = (C7727mf2) it.next();
            if (!c7727mf2.k) {
                c7727mf2.j = overlayListView.getDrawingTime();
                c7727mf2.k = true;
            }
        }
        dVar.I.postDelayed(dVar.s0, dVar.l0);
    }
}
