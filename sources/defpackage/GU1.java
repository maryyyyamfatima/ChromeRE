package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GU1 implements InterfaceC10551us3 {
    public static final OvershootInterpolator r = AbstractC8142nr1.h;
    public static final LinearInterpolator s = AbstractC8142nr1.f;
    public static final GH0 t = AbstractC8142nr1.d;
    public final PropertyModel a;
    public final InterfaceC0079Ap3 g;
    public final float h;
    public final float i;
    public final EU1 j;
    public final Runnable k;
    public final Callback l;
    public Animator m;
    public int n = 0;
    public int o;
    public float p;
    public boolean q;

    public static boolean a(int i) {
        return i == 3 || i == 4;
    }

    public GU1(PropertyModel propertyModel, InterfaceC0079Ap3 interfaceC0079Ap3, Resources resources, RunnableC7710mc3 runnableC7710mc3, Callback callback) {
        this.a = propertyModel;
        this.g = interfaceC0079Ap3;
        this.h = resources.getDimensionPixelSize(R.dimen.f35860_resource_name_obfuscated_res_0x7f0804ef);
        this.i = resources.getDimensionPixelSize(R.dimen.f35720_resource_name_obfuscated_res_0x7f0804e1);
        this.j = new EU1(resources);
        this.k = runnableC7710mc3;
        this.l = callback;
    }

    @Override // defpackage.InterfaceC10551us3
    public final void s0(int i) {
        this.n = 3;
        this.o = i;
        this.p = this.a.g(a(i) ? HU1.A : HU1.z);
        this.q = false;
    }

    @Override // defpackage.InterfaceC10551us3
    public final void O(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        float abs;
        float floatValue;
        boolean a = a(this.o);
        MD2 md2 = HU1.A;
        MD2 md22 = HU1.z;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.g;
        EU1 eu1 = this.j;
        PropertyModel propertyModel = this.a;
        if (a) {
            propertyModel.l(md2, JM1.b(this.p + f2, -((Integer) interfaceC0079Ap3.get()).intValue(), 0.0f));
        } else {
            propertyModel.l(md22, JM1.b(this.p + f, -((Float) eu1.get()).floatValue(), ((Float) eu1.get()).floatValue()));
        }
        MD2 md23 = HU1.B;
        if (a(this.o)) {
            abs = Math.abs(propertyModel.g(md2));
            floatValue = ((Integer) interfaceC0079Ap3.get()).intValue();
        } else {
            abs = Math.abs(propertyModel.g(md22));
            floatValue = ((Float) eu1.get()).floatValue();
        }
        propertyModel.l(md23, 1.0f - (abs / floatValue));
    }

    @Override // defpackage.InterfaceC10551us3
    public final void V() {
        float f;
        if (this.q) {
            return;
        }
        Animator animator = this.m;
        if (animator != null) {
            animator.cancel();
        }
        this.m = null;
        MD2 md2 = HU1.A;
        PropertyModel propertyModel = this.a;
        float g = propertyModel.g(md2);
        MD2 md22 = HU1.z;
        if (g == 0.0f && propertyModel.g(md22) == 0.0f) {
            this.n = 2;
            return;
        }
        boolean a = a(this.o);
        if (a) {
            if (propertyModel.g(md2) <= (-this.h)) {
                f = -((Integer) this.g.get()).intValue();
            }
            f = 0.0f;
        } else {
            float g2 = propertyModel.g(md22);
            if (!(Math.abs(g2) < this.i)) {
                float floatValue = ((Float) this.j.get()).floatValue();
                f = g2 < 0.0f ? -floatValue : floatValue;
            }
            f = 0.0f;
        }
        b(a, f, false, f != 0.0f ? this.k : new DU1());
    }

    @Override // defpackage.InterfaceC10551us3
    public final void J(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
        float f5;
        this.q = true;
        boolean a = a(this.o);
        if (a) {
            f3 = f4;
        }
        PropertyModel propertyModel = this.a;
        if (a) {
            if (propertyModel.g(HU1.A) < 0.0f) {
                f5 = -((Integer) this.g.get()).intValue();
            }
            f5 = 0.0f;
        } else {
            float g = propertyModel.g(HU1.z);
            if (Math.abs(g) >= this.i) {
                float floatValue = ((Float) this.j.get()).floatValue();
                f5 = (g > 0.0f ? 1 : (g == 0.0f ? 0 : -1)) < 0 ? -floatValue : floatValue;
            }
            f5 = 0.0f;
        }
        b(a(this.o), f5, f3 != 0.0f, f5 != 0.0f ? this.k : new DU1());
    }

    @Override // defpackage.InterfaceC10551us3
    public final boolean X(int i) {
        return i != 0 && this.n == 2;
    }

    public final void b(boolean z, float f, boolean z2, Runnable runnable) {
        long j = f == 0.0f ? 600L : 300L;
        boolean z3 = f == 0.0f;
        float f2 = z3 ? 1.0f : 0.0f;
        MD2 md2 = HU1.B;
        PropertyModel propertyModel = this.a;
        ObjectAnimator a = RD2.a(propertyModel, md2, f2);
        TimeInterpolator timeInterpolator = t;
        a.setInterpolator(z3 ? s : timeInterpolator);
        a.setDuration(j);
        ObjectAnimator a2 = RD2.a(propertyModel, z ? HU1.A : HU1.z, f);
        if (z3) {
            timeInterpolator = r;
        }
        a2.setInterpolator(timeInterpolator);
        a2.setDuration(j);
        if (!z2) {
            (z3 ? a2 : a).setStartDelay(100L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a, a2);
        animatorSet.addListener(new FU1(this, z3, runnable));
        this.m = animatorSet;
        this.l.onResult(animatorSet);
    }
}
