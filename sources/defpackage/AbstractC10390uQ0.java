package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.android.chrome.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uQ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10390uQ0 {
    public S53 a;
    public DM1 b;
    public Drawable c;
    public C9971tB d;
    public LayerDrawable e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public int j;
    public Animator k;
    public C8722pZ1 l;
    public C8722pZ1 m;
    public float n;
    public int p;
    public final FloatingActionButton r;
    public final C6271iQ0 s;
    public ViewTreeObserverOnPreDrawListenerC8333oQ0 x;
    public static final GH0 y = AbstractC0270Cc.c;
    public static final int z = R.attr.f10730_resource_name_obfuscated_res_0x7f05035e;
    public static final int A = R.attr.f10890_resource_name_obfuscated_res_0x7f05036e;
    public static final int B = R.attr.f10760_resource_name_obfuscated_res_0x7f050361;
    public static final int C = R.attr.f10870_resource_name_obfuscated_res_0x7f05036c;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];
    public float o = 1.0f;
    public int q = 0;
    public final Rect t = new Rect();
    public final RectF u = new RectF();
    public final RectF v = new RectF();
    public final Matrix w = new Matrix();

    public abstract float e();

    public abstract void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    public abstract void h();

    public abstract void i(int[] iArr);

    public abstract void j(float f, float f2, float f3);

    public abstract boolean l();

    public abstract void m();

    public AbstractC10390uQ0(FloatingActionButton floatingActionButton, C6271iQ0 c6271iQ0) {
        this.r = floatingActionButton;
        this.s = c6271iQ0;
        C8102nk3 c8102nk3 = new C8102nk3();
        C11076wQ0 c11076wQ0 = (C11076wQ0) this;
        c8102nk3.a(D, d(new C9361rQ0(c11076wQ0)));
        c8102nk3.a(E, d(new C9019qQ0(c11076wQ0)));
        c8102nk3.a(F, d(new C9019qQ0(c11076wQ0)));
        c8102nk3.a(G, d(new C9019qQ0(c11076wQ0)));
        c8102nk3.a(H, d(new C9704sQ0(c11076wQ0)));
        c8102nk3.a(I, d(new C8676pQ0(c11076wQ0)));
        this.n = floatingActionButton.getRotation();
    }

    public final void a(float f, Matrix matrix) {
        matrix.reset();
        if (this.r.getDrawable() == null || this.p == 0) {
            return;
        }
        RectF rectF = this.u;
        RectF rectF2 = this.v;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.p;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.p;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    public final void k(S53 s53) {
        this.a = s53;
        DM1 dm1 = this.b;
        if (dm1 != null) {
            dm1.b(s53);
        }
        Object obj = this.c;
        if (obj instanceof InterfaceC12004z63) {
            ((InterfaceC12004z63) obj).b(s53);
        }
        C9971tB c9971tB = this.d;
        if (c9971tB != null) {
            c9971tB.o = s53;
            c9971tB.invalidateSelf();
        }
    }

    public final AnimatorSet b(C8722pZ1 c8722pZ1, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.r;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c8722pZ1.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        c8722pZ1.c("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C7989nQ0());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        c8722pZ1.c("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C7989nQ0());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.w;
        a(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C1596Mh1(), new C7301lQ0(this), new Matrix(matrix));
        c8722pZ1.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC1180Jc.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.r;
        ofFloat.addUpdateListener(new C7645mQ0(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.o, f3, new Matrix(this.w)));
        arrayList.add(ofFloat);
        AbstractC1180Jc.a(animatorSet, arrayList);
        Context context = floatingActionButton.getContext();
        int integer = floatingActionButton.getContext().getResources().getInteger(R.integer.f54760_resource_name_obfuscated_res_0x7f0c006b);
        TypedValue a = AbstractC6594jM1.a(context, i);
        if (a != null && a.type == 16) {
            integer = a.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = floatingActionButton.getContext();
        TimeInterpolator timeInterpolator = AbstractC0270Cc.b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(i2, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (!(AbstractC9407rZ1.b(valueOf, "cubic-bezier") || AbstractC9407rZ1.b(valueOf, "path"))) {
                timeInterpolator = AnimationUtils.loadInterpolator(context2, typedValue.resourceId);
            } else if (AbstractC9407rZ1.b(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length != 4) {
                    throw new IllegalArgumentException(AbstractC9076qb1.a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ", split.length));
                }
                timeInterpolator = new PathInterpolator(AbstractC9407rZ1.a(0, split), AbstractC9407rZ1.a(1, split), AbstractC9407rZ1.a(2, split), AbstractC9407rZ1.a(3, split));
            } else if (AbstractC9407rZ1.b(valueOf, "path")) {
                timeInterpolator = new PathInterpolator(AbstractC2927Wn2.d(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final void n() {
        Rect rect = this.t;
        f(rect);
        boolean l = l();
        C6271iQ0 c6271iQ0 = this.s;
        if (l) {
            FloatingActionButton.d(c6271iQ0.a, new InsetDrawable((Drawable) this.e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.e;
            if (layerDrawable != null) {
                FloatingActionButton.d(c6271iQ0.a, layerDrawable);
            } else {
                c6271iQ0.getClass();
            }
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton floatingActionButton = c6271iQ0.a;
        floatingActionButton.n.set(i, i2, i3, i4);
        int i5 = floatingActionButton.k;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public void f(Rect rect) {
        int i;
        if (this.f) {
            int i2 = this.j;
            FloatingActionButton floatingActionButton = this.r;
            i = (i2 - floatingActionButton.f(floatingActionButton.i)) / 2;
        } else {
            i = 0;
        }
        int max = Math.max(i, (int) Math.ceil(e() + this.i));
        int max2 = Math.max(i, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public static ValueAnimator d(AbstractC10047tQ0 abstractC10047tQ0) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(y);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC10047tQ0);
        valueAnimator.addUpdateListener(abstractC10047tQ0);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }
}
