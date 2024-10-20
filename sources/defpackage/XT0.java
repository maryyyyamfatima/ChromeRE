package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XT0 implements Transition.TransitionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Object h = null;
    public final /* synthetic */ ArrayList i = null;
    public final /* synthetic */ Object j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ C3541aU0 l;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    public XT0(C3541aU0 c3541aU0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.l = c3541aU0;
        this.a = obj;
        this.g = arrayList;
        this.j = obj2;
        this.k = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C3541aU0 c3541aU0 = this.l;
        Object obj = this.a;
        if (obj != null) {
            c3541aU0.t(obj, this.g, null);
        }
        Object obj2 = this.h;
        if (obj2 != null) {
            c3541aU0.t(obj2, this.i, null);
        }
        Object obj3 = this.j;
        if (obj3 != null) {
            c3541aU0.t(obj3, this.k, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
