package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5644gc extends AnimatorListenerAdapter {
    public final /* synthetic */ C6674jc a;

    public C5644gc(C6674jc c6674jc) {
        this.a = c6674jc;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C6674jc c6674jc = this.a;
        ArrayList arrayList = new ArrayList(c6674jc.j);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4607db) arrayList.get(i)).c(c6674jc);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C6674jc c6674jc = this.a;
        ArrayList arrayList = new ArrayList(c6674jc.j);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4607db) arrayList.get(i)).b(c6674jc);
        }
    }
}
