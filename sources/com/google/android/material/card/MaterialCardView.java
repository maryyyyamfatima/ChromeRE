package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.AM1;
import defpackage.AbstractC5246fR2;
import defpackage.AbstractC9363rQ2;
import defpackage.AbstractC9685sM1;
import defpackage.C4902eR2;
import defpackage.C8657pM1;
import defpackage.CM1;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.GM1;
import defpackage.InterfaceC12004z63;
import defpackage.JG2;
import defpackage.LG;
import defpackage.S53;
import defpackage.SJ3;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC12004z63 {
    public static final int[] o = {R.attr.state_checkable};
    public static final int[] p = {R.attr.state_checked};
    public final C8657pM1 l;
    public final boolean m;
    public boolean n;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050320, com.android.chrome.R.style.f112740_resource_name_obfuscated_res_0x7f15083b), attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050320);
        this.n = false;
        this.m = true;
        TypedArray d = SJ3.d(getContext(), attributeSet, JG2.j0, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050320, com.android.chrome.R.style.f112740_resource_name_obfuscated_res_0x7f15083b, new int[0]);
        C8657pM1 c8657pM1 = new C8657pM1(this, attributeSet);
        this.l = c8657pM1;
        ColorStateList colorStateList = ((C4902eR2) this.j.a).h;
        DM1 dm1 = c8657pM1.c;
        dm1.j(colorStateList);
        Rect rect = this.h;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        Rect rect2 = c8657pM1.b;
        rect2.set(i, i2, i3, i4);
        MaterialCardView materialCardView = c8657pM1.a;
        float f = 0.0f;
        float a = (materialCardView.g && !dm1.h()) || c8657pM1.f() ? c8657pM1.a() : 0.0f;
        boolean z = materialCardView.g;
        LG lg = materialCardView.j;
        if (z && materialCardView.a) {
            f = (float) ((1.0d - C8657pM1.t) * ((C4902eR2) lg.a).a);
        }
        int i5 = (int) (a - f);
        materialCardView.h.set(rect2.left + i5, rect2.top + i5, rect2.right + i5, rect2.bottom + i5);
        CardView cardView = lg.b;
        if (cardView.a) {
            C4902eR2 c4902eR2 = (C4902eR2) lg.a;
            float f2 = c4902eR2.e;
            boolean z2 = cardView.g;
            float f3 = c4902eR2.a;
            int ceil = (int) Math.ceil(AbstractC5246fR2.a(f2, f3, z2));
            int ceil2 = (int) Math.ceil(AbstractC5246fR2.b(f2, f3, lg.b.g));
            lg.a(ceil, ceil2, ceil, ceil2);
        } else {
            lg.a(0, 0, 0, 0);
        }
        ColorStateList b = AM1.b(materialCardView.getContext(), d, 11);
        c8657pM1.n = b;
        if (b == null) {
            c8657pM1.n = ColorStateList.valueOf(-1);
        }
        c8657pM1.h = d.getDimensionPixelSize(12, 0);
        boolean z3 = d.getBoolean(0, false);
        c8657pM1.s = z3;
        materialCardView.setLongClickable(z3);
        c8657pM1.l = AM1.b(materialCardView.getContext(), d, 6);
        Drawable c = AM1.c(materialCardView.getContext(), d, 2);
        if (c != null) {
            Drawable mutate = c.mutate();
            c8657pM1.j = mutate;
            mutate.setTintList(c8657pM1.l);
            boolean isChecked = materialCardView.isChecked();
            Drawable drawable = c8657pM1.j;
            if (drawable != null) {
                drawable.setAlpha(isChecked ? 255 : 0);
            }
        } else {
            c8657pM1.j = C8657pM1.u;
        }
        LayerDrawable layerDrawable = c8657pM1.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.android.chrome.R.id.mtrl_card_checked_layer_id, c8657pM1.j);
        }
        c8657pM1.f = d.getDimensionPixelSize(5, 0);
        c8657pM1.e = d.getDimensionPixelSize(4, 0);
        c8657pM1.g = d.getInteger(3, 8388661);
        ColorStateList b2 = AM1.b(materialCardView.getContext(), d, 7);
        c8657pM1.k = b2;
        if (b2 == null) {
            c8657pM1.k = ColorStateList.valueOf(AbstractC9685sM1.d(materialCardView, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050113));
        }
        ColorStateList b3 = AM1.b(materialCardView.getContext(), d, 1);
        b3 = b3 == null ? ColorStateList.valueOf(0) : b3;
        DM1 dm12 = c8657pM1.d;
        dm12.j(b3);
        int[] iArr = AbstractC9363rQ2.a;
        RippleDrawable rippleDrawable = c8657pM1.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(c8657pM1.k);
        }
        dm1.i(materialCardView.j.b.getElevation());
        float f4 = c8657pM1.h;
        ColorStateList colorStateList2 = c8657pM1.n;
        dm12.a.k = f4;
        dm12.invalidateSelf();
        CM1 cm1 = dm12.a;
        if (cm1.d != colorStateList2) {
            cm1.d = colorStateList2;
            dm12.onStateChange(dm12.getState());
        }
        super.setBackgroundDrawable(c8657pM1.d(dm1));
        Drawable c2 = materialCardView.isClickable() ? c8657pM1.c() : dm12;
        c8657pM1.i = c2;
        materialCardView.setForeground(c8657pM1.d(c2));
        d.recycle();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C8657pM1 c8657pM1 = this.l;
        accessibilityNodeInfo.setCheckable(c8657pM1 != null && c8657pM1.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C8657pM1 c8657pM1 = this.l;
        if (c8657pM1.p != null) {
            MaterialCardView materialCardView = c8657pM1.a;
            if (materialCardView.a) {
                i3 = (int) Math.ceil(((((C4902eR2) materialCardView.j.a).e * 1.5f) + (c8657pM1.f() ? c8657pM1.a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((((C4902eR2) materialCardView.j.a).e + (c8657pM1.f() ? c8657pM1.a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = c8657pM1.g;
            int i8 = (i7 & 8388613) == 8388613 ? ((measuredWidth - c8657pM1.e) - c8657pM1.f) - i4 : c8657pM1.e;
            int i9 = (i7 & 80) == 80 ? c8657pM1.e : ((measuredHeight - c8657pM1.e) - c8657pM1.f) - i3;
            int i10 = (i7 & 8388613) == 8388613 ? c8657pM1.e : ((measuredWidth - c8657pM1.e) - c8657pM1.f) - i4;
            int i11 = (i7 & 80) == 80 ? ((measuredHeight - c8657pM1.e) - c8657pM1.f) - i3 : c8657pM1.e;
            WeakHashMap weakHashMap = Ec4.a;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i10;
                i5 = i8;
            } else {
                i5 = i10;
                i6 = i8;
            }
            c8657pM1.p.setLayerInset(2, i6, i11, i5, i9);
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        C8657pM1 c8657pM1 = this.l;
        if (c8657pM1 != null) {
            Drawable drawable = c8657pM1.i;
            MaterialCardView materialCardView = c8657pM1.a;
            Drawable c = materialCardView.isClickable() ? c8657pM1.c() : c8657pM1.d;
            c8657pM1.i = c;
            if (drawable != c) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
                } else {
                    materialCardView.setForeground(c8657pM1.d(c));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EM1.b(this, this.l.c);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.m) {
            C8657pM1 c8657pM1 = this.l;
            if (!c8657pM1.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                c8657pM1.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.n != z) {
            toggle();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        RippleDrawable rippleDrawable;
        C8657pM1 c8657pM1 = this.l;
        if ((c8657pM1 != null && c8657pM1.s) && isEnabled()) {
            this.n = true ^ this.n;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = c8657pM1.o) != null) {
                Rect bounds = rippleDrawable.getBounds();
                int i = bounds.bottom;
                c8657pM1.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                c8657pM1.o.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            boolean z = this.n;
            Drawable drawable = c8657pM1.j;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C8657pM1 c8657pM1 = this.l;
        if (c8657pM1 != null && c8657pM1.s) {
            View.mergeDrawableStates(onCreateDrawableState, o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, p);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.InterfaceC12004z63
    public final void b(S53 s53) {
        RectF rectF = new RectF();
        C8657pM1 c8657pM1 = this.l;
        rectF.set(c8657pM1.c.getBounds());
        setClipToOutline(s53.d(rectF));
        c8657pM1.e(s53);
    }
}
