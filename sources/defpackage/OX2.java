package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class OX2 {
    public final KX2 a;
    public final TX2 b;
    public VX2 c;
    public UD2 d;

    /* JADX WARN: Type inference failed for: r1v0, types: [JX2] */
    public OX2(Context context, MX2 mx2, ViewGroup viewGroup, int i) {
        this.b = new TX2(new Runnable() { // from class: JX2
            @Override // java.lang.Runnable
            public final void run() {
                OX2 ox2 = OX2.this;
                UD2 ud2 = ox2.d;
                if (ud2 != null) {
                    ud2.b();
                }
                VX2 vx2 = ox2.c;
                if (vx2 != null) {
                    AbstractC8540p04.i(vx2);
                }
                ox2.c = null;
                ox2.d = null;
            }
        }, mx2);
        this.a = new KX2(this, context, viewGroup, i);
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void b(PropertyModel propertyModel) {
        final TX2 tx2 = this.b;
        if (tx2.f != null) {
            tx2.a(false);
        }
        UD2 ud2 = this.d;
        if (ud2 != null) {
            ud2.b();
        }
        VX2 vx2 = (VX2) this.a.get();
        this.c = vx2;
        this.d = UD2.a(propertyModel, vx2, new TD2() { // from class: LX2
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                ViewGroup viewGroup;
                final PropertyModel propertyModel2 = (PropertyModel) wd2;
                VX2 vx22 = (VX2) obj;
                FD2 fd2 = (FD2) obj2;
                if (UX2.a == fd2 || UX2.b == fd2) {
                    return;
                }
                JD2 jd2 = UX2.c;
                if (jd2 == fd2) {
                    View view = (View) propertyModel2.i(jd2);
                    AbstractC8540p04.i(vx22);
                    if (view == null) {
                        return;
                    }
                    boolean j = propertyModel2.j(UX2.d);
                    while (true) {
                        ViewParent parent = view.getParent();
                        viewGroup = vx22.a;
                        if (parent == viewGroup) {
                            break;
                        } else {
                            view = (View) view.getParent();
                        }
                    }
                    if (!j) {
                        AbstractC8540p04.f(viewGroup, vx22, view, false);
                    } else {
                        AbstractC8540p04.f(viewGroup, vx22, view, true);
                    }
                    ((ViewGroup.MarginLayoutParams) vx22.getLayoutParams()).topMargin = propertyModel2.h(UX2.a);
                    return;
                }
                if (UX2.d == fd2) {
                    return;
                }
                JD2 jd22 = UX2.f;
                if (jd22 == fd2) {
                    if (propertyModel2.i(jd22) != null) {
                        vx22.setOnClickListener(new View.OnClickListener() { // from class: WX2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                ((Runnable) PropertyModel.this.i(UX2.f)).run();
                            }
                        });
                        return;
                    }
                    return;
                }
                if (UX2.e == fd2) {
                    return;
                }
                MD2 md2 = UX2.g;
                if (md2 == fd2) {
                    float g = propertyModel2.g(md2);
                    vx22.setAlpha(g);
                    int i = g <= 0.0f ? 8 : 0;
                    if (vx22.getVisibility() != i) {
                        vx22.setVisibility(i);
                        return;
                    }
                    return;
                }
                ND2 nd2 = UX2.h;
                if (nd2 == fd2) {
                    if (propertyModel2.i(UX2.i) != null) {
                        return;
                    }
                    vx22.setBackgroundColor(propertyModel2.h(nd2));
                } else {
                    PD2 pd2 = UX2.i;
                    if (pd2 != fd2 || propertyModel2.i(pd2) == null) {
                        return;
                    }
                    vx22.setBackgroundDrawable((Drawable) propertyModel2.i(pd2));
                }
            }
        });
        tx2.f = propertyModel;
        tx2.i = false;
        tx2.b(0.0f);
        if (tx2.c == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            tx2.c = ofFloat;
            ofFloat.setDuration(300);
            tx2.c.setInterpolator(InterpolatorC0485Dt.e);
            tx2.c.addListener(new RX2(tx2));
            tx2.c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: QX2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TX2 tx22 = TX2.this;
                    tx22.getClass();
                    tx22.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
        }
        ArrayList b = propertyModel.b();
        PD2 pd2 = UX2.j;
        if (b.contains(pd2)) {
            tx2.h = propertyModel.i(pd2) != null;
        }
        tx2.c.setFloatValues(tx2.f.g(UX2.g), 1.0f);
        ValueAnimator valueAnimator = tx2.c;
        Animator animator = tx2.e;
        if (animator == valueAnimator && animator.isRunning()) {
            return;
        }
        Animator animator2 = tx2.e;
        if (animator2 != null) {
            animator2.cancel();
        }
        tx2.e = valueAnimator;
        valueAnimator.start();
    }
}
