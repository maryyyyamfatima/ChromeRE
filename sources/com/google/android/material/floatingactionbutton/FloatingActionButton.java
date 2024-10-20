package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.chrome.R;
import com.google.android.material.stateful.ExtendableSavedState;
import defpackage.AM1;
import defpackage.AbstractC10390uQ0;
import defpackage.AbstractC3779b90;
import defpackage.AbstractC8417of4;
import defpackage.C11076wQ0;
import defpackage.C1439Lb3;
import defpackage.C1974Pf;
import defpackage.C5927hQ0;
import defpackage.C6271iQ0;
import defpackage.C6613jQ0;
import defpackage.C6957kQ0;
import defpackage.C8722pZ1;
import defpackage.C9971tB;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.Ee4;
import defpackage.GM1;
import defpackage.InterfaceC12004z63;
import defpackage.InterfaceC3435a90;
import defpackage.JG2;
import defpackage.S53;
import defpackage.SJ3;
import defpackage.ViewTreeObserverOnPreDrawListenerC8333oQ0;
import defpackage.YE0;
import defpackage.ZE0;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FloatingActionButton extends AbstractC8417of4 implements YE0, InterfaceC12004z63, InterfaceC3435a90 {
    public ColorStateList g;
    public PorterDuff.Mode h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public final boolean m;
    public final Rect n;
    public final Rect o;
    public final C1974Pf p;
    public final ZE0 q;
    public C11076wQ0 r;

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        c(i, true);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.f7660_resource_name_obfuscated_res_0x7f05022b, R.style.f108090_resource_name_obfuscated_res_0x7f15066a), attributeSet);
        this.n = new Rect();
        this.o = new Rect();
        Context context2 = getContext();
        TypedArray d = SJ3.d(context2, attributeSet, JG2.O, R.attr.f7660_resource_name_obfuscated_res_0x7f05022b, R.style.f108090_resource_name_obfuscated_res_0x7f15066a, new int[0]);
        this.g = AM1.b(context2, d, 1);
        this.h = Ee4.b(d.getInt(2, -1), null);
        ColorStateList b = AM1.b(context2, d, 12);
        this.i = d.getInt(7, -1);
        this.j = d.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d.getDimensionPixelSize(3, 0);
        float dimension = d.getDimension(4, 0.0f);
        float dimension2 = d.getDimension(9, 0.0f);
        float dimension3 = d.getDimension(11, 0.0f);
        this.m = d.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f36780_resource_name_obfuscated_res_0x7f080581);
        int dimensionPixelSize3 = d.getDimensionPixelSize(10, 0);
        this.l = dimensionPixelSize3;
        AbstractC10390uQ0 e = e();
        if (e.p != dimensionPixelSize3) {
            e.p = dimensionPixelSize3;
            float f = e.o;
            e.o = f;
            Matrix matrix = e.w;
            e.a(f, matrix);
            e.r.setImageMatrix(matrix);
        }
        C8722pZ1 a = C8722pZ1.a(context2, d, 15);
        C8722pZ1 a2 = C8722pZ1.a(context2, d, 8);
        S53 s53 = new S53(S53.b(context2, attributeSet, R.attr.f7660_resource_name_obfuscated_res_0x7f05022b, R.style.f108090_resource_name_obfuscated_res_0x7f15066a, S53.m));
        boolean z = d.getBoolean(5, false);
        setEnabled(d.getBoolean(0, true));
        d.recycle();
        C1974Pf c1974Pf = new C1974Pf(this);
        this.p = c1974Pf;
        c1974Pf.b(attributeSet, R.attr.f7660_resource_name_obfuscated_res_0x7f05022b);
        this.q = new ZE0(this);
        e().k(s53);
        e().g(this.g, this.h, b, dimensionPixelSize);
        e().j = dimensionPixelSize2;
        AbstractC10390uQ0 e2 = e();
        if (e2.g != dimension) {
            e2.g = dimension;
            e2.j(dimension, e2.h, e2.i);
        }
        AbstractC10390uQ0 e3 = e();
        if (e3.h != dimension2) {
            e3.h = dimension2;
            e3.j(e3.g, dimension2, e3.i);
        }
        AbstractC10390uQ0 e4 = e();
        if (e4.i != dimension3) {
            e4.i = dimension3;
            e4.j(e4.g, e4.h, dimension3);
        }
        e().l = a;
        e().m = a2;
        e().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // defpackage.InterfaceC3435a90
    public final AbstractC3779b90 a() {
        return new C5927hQ0();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.g;
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            AbstractC10390uQ0 e = e();
            DM1 dm1 = e.b;
            if (dm1 != null) {
                dm1.setTintList(colorStateList);
            }
            C9971tB c9971tB = e.d;
            if (c9971tB != null) {
                if (colorStateList != null) {
                    c9971tB.m = colorStateList.getColorForState(c9971tB.getState(), c9971tB.m);
                }
                c9971tB.p = colorStateList;
                c9971tB.n = true;
                c9971tB.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.h;
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            DM1 dm1 = e().b;
            if (dm1 != null) {
                dm1.setTintMode(mode);
            }
        }
    }

    public final void h() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.p.c(i);
        h();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AbstractC10390uQ0 e = e();
            float f = e.o;
            e.o = f;
            Matrix matrix = e.w;
            e.a(f, matrix);
            e.r.setImageMatrix(matrix);
        }
    }

    @Override // defpackage.InterfaceC12004z63
    public final void b(S53 s53) {
        e().k(s53);
    }

    public final void j() {
        AnimatorSet c;
        AbstractC10390uQ0 e = e();
        FloatingActionButton floatingActionButton = e.r;
        if (floatingActionButton.getVisibility() == 0 ? e.q != 1 : e.q == 2) {
            return;
        }
        Animator animator = e.k;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = e.l == null;
        WeakHashMap weakHashMap = Ec4.a;
        FloatingActionButton floatingActionButton2 = e.r;
        boolean z2 = floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode();
        Matrix matrix = e.w;
        if (z2) {
            if (floatingActionButton.getVisibility() != 0) {
                floatingActionButton.setAlpha(0.0f);
                floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
                floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
                float f = z ? 0.4f : 0.0f;
                e.o = f;
                e.a(f, matrix);
                floatingActionButton2.setImageMatrix(matrix);
            }
            C8722pZ1 c8722pZ1 = e.l;
            if (c8722pZ1 != null) {
                c = e.b(c8722pZ1, 1.0f, 1.0f, 1.0f);
            } else {
                c = e.c(1.0f, 1.0f, 1.0f, AbstractC10390uQ0.z, AbstractC10390uQ0.A);
            }
            c.addListener(new C6957kQ0(e));
            c.start();
            return;
        }
        floatingActionButton.c(0, false);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        e.o = 1.0f;
        e.a(1.0f, matrix);
        floatingActionButton2.setImageMatrix(matrix);
    }

    public final void g() {
        AnimatorSet c;
        AbstractC10390uQ0 e = e();
        FloatingActionButton floatingActionButton = e.r;
        if (floatingActionButton.getVisibility() != 0 ? e.q != 2 : e.q == 1) {
            return;
        }
        Animator animator = e.k;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = Ec4.a;
        FloatingActionButton floatingActionButton2 = e.r;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            C8722pZ1 c8722pZ1 = e.m;
            if (c8722pZ1 != null) {
                c = e.b(c8722pZ1, 0.0f, 0.0f, 0.0f);
            } else {
                c = e.c(0.0f, 0.4f, 0.4f, AbstractC10390uQ0.B, AbstractC10390uQ0.C);
            }
            c.addListener(new C6613jQ0(e));
            c.start();
            return;
        }
        floatingActionButton.c(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int f = f(this.i);
        this.k = (f - this.l) / 2;
        e().n();
        int min = Math.min(i(f, i), i(f, i2));
        Rect rect = this.n;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public final int f(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.f30700_resource_name_obfuscated_res_0x7f080199);
            }
            return resources.getDimensionPixelSize(R.dimen.f30710_resource_name_obfuscated_res_0x7f08019a);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return f(1);
        }
        return f(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC10390uQ0 e = e();
        DM1 dm1 = e.b;
        FloatingActionButton floatingActionButton = e.r;
        if (dm1 != null) {
            EM1.b(floatingActionButton, dm1);
        }
        if (!(e instanceof C11076wQ0)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (e.x == null) {
                e.x = new ViewTreeObserverOnPreDrawListenerC8333oQ0(e);
            }
            viewTreeObserver.addOnPreDrawListener(e.x);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC10390uQ0 e = e();
        ViewTreeObserver viewTreeObserver = e.r.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC8333oQ0 viewTreeObserverOnPreDrawListenerC8333oQ0 = e.x;
        if (viewTreeObserverOnPreDrawListenerC8333oQ0 != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8333oQ0);
            e.x = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e().i(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        e().h();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        C1439Lb3 c1439Lb3 = extendableSavedState.h;
        ZE0 ze0 = this.q;
        ze0.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", ze0.b);
        bundle.putInt("expandedComponentIdHint", ze0.c);
        c1439Lb3.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a);
        Bundle bundle = (Bundle) extendableSavedState.h.get("expandableWidgetHelper");
        ZE0 ze0 = this.q;
        ze0.getClass();
        ze0.b = bundle.getBoolean("expanded", false);
        ze0.c = bundle.getInt("expandedComponentIdHint", 0);
        if (ze0.b) {
            View view = ze0.a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c(view);
            }
        }
    }

    public static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = Ec4.a;
            boolean isLaidOut = isLaidOut();
            Rect rect = this.o;
            if (isLaidOut) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.n;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        DM1 dm1 = e().b;
        if (dm1 != null) {
            dm1.i(f);
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        e().getClass();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        e().getClass();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        e().getClass();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        e().getClass();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        e().getClass();
    }

    public final AbstractC10390uQ0 e() {
        if (this.r == null) {
            this.r = new C11076wQ0(this, new C6271iQ0(this));
        }
        return this.r;
    }
}
