package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TX2 implements NX2 {
    public final Runnable a;
    public final MX2 b;
    public ValueAnimator c;
    public ValueAnimator d;
    public Animator e;
    public PropertyModel f;
    public boolean g;
    public boolean h;
    public boolean i;

    public TX2(JX2 jx2, MX2 mx2) {
        this.a = jx2;
        this.b = mx2;
    }

    public final void a(boolean z) {
        if (this.i) {
            Animator animator = this.e;
            if (animator == null || z) {
                return;
            }
            animator.end();
            return;
        }
        if (this.d == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.d = ofFloat;
            ofFloat.setDuration(300);
            this.d.setInterpolator(InterpolatorC0485Dt.d);
            this.d.addListener(new SX2(this));
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: PX2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TX2 tx2 = TX2.this;
                    tx2.getClass();
                    tx2.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
        }
        this.i = true;
        this.d.setFloatValues(this.f.g(UX2.g), 0.0f);
        ValueAnimator valueAnimator = this.d;
        Animator animator2 = this.e;
        if (animator2 != valueAnimator || !animator2.isRunning()) {
            Animator animator3 = this.e;
            if (animator3 != null) {
                animator3.cancel();
            }
            this.e = valueAnimator;
            valueAnimator.start();
        }
        if (z) {
            return;
        }
        this.d.end();
    }

    public final void b(float f) {
        PropertyModel propertyModel = this.f;
        if (propertyModel == null) {
            return;
        }
        MD2 md2 = UX2.g;
        if (JM1.a(f, propertyModel.g(md2))) {
            return;
        }
        this.f.l(md2, f);
        boolean j = this.f.j(UX2.b);
        MX2 mx2 = this.b;
        if (j && mx2 != null) {
            mx2.a(f);
        }
        ArrayList b = this.f.b();
        LD2 ld2 = UX2.k;
        if (b.contains(ld2) && this.f.j(ld2) && mx2 != null) {
            mx2.b(f);
        }
        boolean z = f > 0.0f;
        PropertyModel propertyModel2 = this.f;
        JD2 jd2 = UX2.e;
        if (propertyModel2.i(jd2) != null && this.g != z) {
            ((Callback) this.f.i(jd2)).onResult(Boolean.valueOf(z));
        }
        this.g = z;
        if (!this.i || z || this.f == null) {
            return;
        }
        this.f = null;
        this.a.run();
    }
}
