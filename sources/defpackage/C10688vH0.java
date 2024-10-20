package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vH0 */
/* loaded from: classes.dex */
public final class C10688vH0 extends AnimatorListenerAdapter {
    public final View a;
    public boolean g = false;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Re4 re4 = De4.a;
        View view = this.a;
        re4.c(view, 1.0f);
        if (this.g) {
            view.setLayerType(0, null);
        }
    }

    public C10688vH0(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        WeakHashMap weakHashMap = Ec4.a;
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.g = true;
            view.setLayerType(2, null);
        }
    }
}
