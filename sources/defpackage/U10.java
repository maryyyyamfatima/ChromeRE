package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U10 extends AnimatorListenerAdapter {
    public final /* synthetic */ C4424d20 a;
    public final /* synthetic */ V10 g;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = this.g.a;
        C4424d20 c4424d20 = this.a;
        arrayList.remove(c4424d20);
        c4424d20.removeListener(this);
    }

    public U10(V10 v10, C4424d20 c4424d20) {
        this.g = v10;
        this.a = c4424d20;
    }
}
