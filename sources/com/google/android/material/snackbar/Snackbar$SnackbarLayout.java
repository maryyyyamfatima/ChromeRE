package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.chrome.R;
import defpackage.AM1;
import defpackage.AbstractC2969Ww;
import defpackage.AbstractC9685sM1;
import defpackage.DM1;
import defpackage.Ec4;
import defpackage.Ee4;
import defpackage.GM1;
import defpackage.JG2;
import defpackage.S53;
import defpackage.ViewOnTouchListenerC2839Vw;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Snackbar$SnackbarLayout extends FrameLayout {
    public static final ViewOnTouchListenerC2839Vw p = new ViewOnTouchListenerC2839Vw();
    public AbstractC2969Ww a;
    public final S53 g;
    public final int h;
    public final float i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public Rect n;
    public boolean o;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        d(i, i2);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, JG2.L0);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = Ec4.a;
            setElevation(dimensionPixelSize);
        }
        this.h = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.g = new S53(S53.a(context2, attributeSet, 0, 0));
        }
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AM1.b(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(Ee4.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(p);
        setFocusable(true);
        if (getBackground() == null) {
            int e = AbstractC9685sM1.e(f, AbstractC9685sM1.d(this, R.attr.f5490_resource_name_obfuscated_res_0x7f050152), AbstractC9685sM1.d(this, R.attr.f5130_resource_name_obfuscated_res_0x7f05012e));
            S53 s53 = this.g;
            if (s53 != null) {
                Handler handler = AbstractC2969Ww.n;
                DM1 dm1 = new DM1(s53);
                dm1.j(ColorStateList.valueOf(e));
                gradientDrawable = dm1;
            } else {
                Resources resources = getResources();
                Handler handler2 = AbstractC2969Ww.n;
                float dimension = resources.getDimension(R.dimen.f37120_resource_name_obfuscated_res_0x7f0805d1);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(e);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.l;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = Ec4.a;
            setBackgroundDrawable(gradientDrawable);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.l != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.l);
            drawable.setTintMode(this.m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : p);
        super.setOnClickListener(onClickListener);
    }

    public final void d(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC2969Ww abstractC2969Ww = this.a;
        if (abstractC2969Ww == null || !abstractC2969Ww.k) {
            return;
        }
        abstractC2969Ww.e();
        abstractC2969Ww.k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC2969Ww abstractC2969Ww = this.a;
        if (abstractC2969Ww != null) {
            abstractC2969Ww.b();
        }
        WeakHashMap weakHashMap = Ec4.a;
        requestApplyInsets();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // android.view.ViewGroup, android.view.View
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r6 = this;
            super.onDetachedFromWindow()
            Ww r0 = r6.a
            if (r0 == 0) goto L44
            Jf3 r1 = defpackage.C1199Jf3.b()
            Ow r2 = r0.m
            java.lang.Object r3 = r1.a
            monitor-enter(r3)
            boolean r4 = r1.c(r2)     // Catch: java.lang.Throwable -> L28
            r5 = 1
            if (r4 != 0) goto L34
            Hf3 r1 = r1.d     // Catch: java.lang.Throwable -> L28
            r4 = 0
            if (r1 == 0) goto L2f
            if (r2 == 0) goto L2a
            java.lang.ref.WeakReference r1 = r1.a     // Catch: java.lang.Throwable -> L28
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L28
            if (r1 != r2) goto L2a
            r1 = r5
            goto L2b
        L28:
            r0 = move-exception
            goto L42
        L2a:
            r1 = r4
        L2b:
            if (r1 == 0) goto L2f
            r1 = r5
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r1 == 0) goto L33
            goto L34
        L33:
            r5 = r4
        L34:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L44
            android.os.Handler r1 = defpackage.AbstractC2969Ww.n
            Pw r2 = new Pw
            r2.<init>(r0)
            r1.post(r2)
            goto L44
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
            throw r0
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar$SnackbarLayout.onDetachedFromWindow():void");
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.o || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.n = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        AbstractC2969Ww abstractC2969Ww = this.a;
        if (abstractC2969Ww != null) {
            Handler handler = AbstractC2969Ww.n;
            abstractC2969Ww.f();
        }
    }
}
