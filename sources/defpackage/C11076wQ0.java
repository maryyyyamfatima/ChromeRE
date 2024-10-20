package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.android.chrome.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11076wQ0 extends AbstractC10390uQ0 {

    /* renamed from: J, reason: collision with root package name */
    public StateListAnimator f11547J;

    @Override // defpackage.AbstractC10390uQ0
    public final void h() {
    }

    @Override // defpackage.AbstractC10390uQ0
    public final void i(int[] iArr) {
    }

    @Override // defpackage.AbstractC10390uQ0
    public final void m() {
    }

    public C11076wQ0(FloatingActionButton floatingActionButton, C6271iQ0 c6271iQ0) {
        super(floatingActionButton, c6271iQ0);
    }

    @Override // defpackage.AbstractC10390uQ0
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        DM1 p = p();
        this.b = p;
        p.setTintList(colorStateList);
        if (mode != null) {
            this.b.setTintMode(mode);
        }
        DM1 dm1 = this.b;
        FloatingActionButton floatingActionButton = this.r;
        dm1.g(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            C9971tB c9971tB = new C9971tB(this.a);
            Object obj = Y50.a;
            int color = context.getColor(R.color.f18630_resource_name_obfuscated_res_0x7f07017c);
            int color2 = context.getColor(R.color.f18620_resource_name_obfuscated_res_0x7f07017b);
            int color3 = context.getColor(R.color.f18600_resource_name_obfuscated_res_0x7f070179);
            int color4 = context.getColor(R.color.f18610_resource_name_obfuscated_res_0x7f07017a);
            c9971tB.i = color;
            c9971tB.j = color2;
            c9971tB.k = color3;
            c9971tB.l = color4;
            float f = i;
            if (c9971tB.h != f) {
                c9971tB.h = f;
                c9971tB.b.setStrokeWidth(f * 1.3333f);
                c9971tB.n = true;
                c9971tB.invalidateSelf();
            }
            if (colorStateList != null) {
                c9971tB.m = colorStateList.getColorForState(c9971tB.getState(), c9971tB.m);
            }
            c9971tB.p = colorStateList;
            c9971tB.n = true;
            c9971tB.invalidateSelf();
            this.d = c9971tB;
            drawable = new LayerDrawable(new Drawable[]{this.d, this.b});
        } else {
            this.d = null;
            drawable = this.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC9363rQ2.b(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // defpackage.AbstractC10390uQ0
    public final void j(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.r;
        if (floatingActionButton.getStateListAnimator() == this.f11547J) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AbstractC10390uQ0.D, o(f, f3));
            stateListAnimator.addState(AbstractC10390uQ0.E, o(f, f2));
            stateListAnimator.addState(AbstractC10390uQ0.F, o(f, f2));
            stateListAnimator.addState(AbstractC10390uQ0.G, o(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AbstractC10390uQ0.y);
            stateListAnimator.addState(AbstractC10390uQ0.H, animatorSet);
            stateListAnimator.addState(AbstractC10390uQ0.I, o(0.0f, 0.0f));
            this.f11547J = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (l()) {
            n();
        }
    }

    public final AnimatorSet o(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.r;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(AbstractC10390uQ0.y);
        return animatorSet;
    }

    @Override // defpackage.AbstractC10390uQ0
    public final float e() {
        return this.r.getElevation();
    }

    public final DM1 p() {
        return new C10733vQ0(this.a);
    }

    @Override // defpackage.AbstractC10390uQ0
    public final void f(Rect rect) {
        if (this.s.a.m) {
            super.f(rect);
            return;
        }
        boolean z = this.f;
        FloatingActionButton floatingActionButton = this.r;
        if (!z || floatingActionButton.f(floatingActionButton.i) >= this.j) {
            rect.set(0, 0, 0, 0);
        } else {
            int f = (this.j - floatingActionButton.f(floatingActionButton.i)) / 2;
            rect.set(f, f, f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.AbstractC10390uQ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r4 = this;
            iQ0 r0 = r4.s
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.a
            boolean r0 = r0.m
            r1 = 1
            if (r0 != 0) goto L22
            boolean r0 = r4.f
            r2 = 0
            if (r0 == 0) goto L1d
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r4.r
            int r3 = r0.i
            int r0 = r0.f(r3)
            int r3 = r4.j
            if (r0 < r3) goto L1b
            goto L1d
        L1b:
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L21
            goto L22
        L21:
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11076wQ0.l():boolean");
    }
}
