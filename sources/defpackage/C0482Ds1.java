package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ds1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482Ds1 implements Animator.AnimatorListener {
    public final float a;
    public final float g;
    public final float h;
    public final float i;
    public final d j;
    public final int k;
    public final ValueAnimator l;
    public boolean m;
    public float n;
    public float o;
    public boolean p = false;
    public boolean q = false;
    public float r;
    public final /* synthetic */ int s;
    public final /* synthetic */ d t;
    public final /* synthetic */ C1521Ls1 u;

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final /* bridge */ /* synthetic */ void onAnimationStart(Animator animator) {
    }

    public C0482Ds1(C1521Ls1 c1521Ls1, d dVar, int i, float f, float f2, float f3, float f4, int i2, d dVar2) {
        this.u = c1521Ls1;
        this.s = i2;
        this.t = dVar2;
        this.k = i;
        this.j = dVar;
        this.a = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.l = ofFloat;
        ofFloat.addUpdateListener(new C1262Js1(this));
        ofFloat.setTarget(dVar.a);
        ofFloat.addListener(this);
        this.r = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.p) {
            return;
        }
        int i = this.s;
        d dVar = this.t;
        C1521Ls1 c1521Ls1 = this.u;
        if (i <= 0) {
            c1521Ls1.r.b(c1521Ls1.w, dVar);
        } else {
            c1521Ls1.a.add(dVar.a);
            this.m = true;
            if (i > 0) {
                c1521Ls1.w.post(new RunnableC0612Es1(c1521Ls1, this, i));
            }
        }
        View view = c1521Ls1.B;
        View view2 = dVar.a;
        if (view == view2) {
            c1521Ls1.s(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.r = 1.0f;
    }

    public final void a(Animator animator) {
        if (!this.q) {
            this.j.s(true);
        }
        this.q = true;
    }
}
