package defpackage;

import android.transition.Transition;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ou2 */
/* loaded from: classes2.dex */
public final class C8505ou2 implements Transition.TransitionListener {
    public final /* synthetic */ HashSet a;
    public final /* synthetic */ ViewOnClickListenerC9876su2 g;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.g;
        viewOnClickListenerC9876su2.y = false;
        C7526m33 c7526m33 = viewOnClickListenerC9876su2.q;
        c7526m33.c = this.a;
        c7526m33.f();
    }

    public C8505ou2(ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2, HashSet hashSet) {
        this.g = viewOnClickListenerC9876su2;
        this.a = hashSet;
    }
}
