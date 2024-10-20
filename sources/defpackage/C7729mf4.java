package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mf4 */
/* loaded from: classes.dex */
public final class C7729mf4 extends AnimatorListenerAdapter implements KV3 {
    public final View a;
    public final int g;
    public final ViewGroup h;
    public boolean j;
    public boolean k = false;
    public final boolean i = true;

    @Override // defpackage.KV3
    public final void a(QV3 qv3) {
    }

    @Override // defpackage.KV3
    public final void d() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C7729mf4(View view, int i) {
        this.a = view;
        this.g = i;
        this.h = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.k) {
            return;
        }
        De4.a.a(this.a, this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.k) {
            return;
        }
        De4.a.a(this.a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.k = true;
    }

    @Override // defpackage.KV3
    public final void b() {
        f(false);
    }

    @Override // defpackage.KV3
    public final void e() {
        f(true);
    }

    @Override // defpackage.KV3
    public final void c(QV3 qv3) {
        if (!this.k) {
            De4.a.a(this.a, this.g);
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        qv3.w(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.k) {
            De4.a.a(this.a, this.g);
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    public final void f(boolean z) {
        ViewGroup viewGroup;
        if (!this.i || this.j == z || (viewGroup = this.h) == null) {
            return;
        }
        this.j = z;
        Wc4.a(viewGroup, z);
    }
}
