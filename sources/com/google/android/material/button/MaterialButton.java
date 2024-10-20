package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import defpackage.AM1;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC9363rQ2;
import defpackage.C3944bf;
import defpackage.C4287cf;
import defpackage.C6129i;
import defpackage.C7970nM1;
import defpackage.CM1;
import defpackage.DM1;
import defpackage.EM1;
import defpackage.Ec4;
import defpackage.Ee4;
import defpackage.GM1;
import defpackage.InterfaceC12004z63;
import defpackage.JG2;
import defpackage.R53;
import defpackage.S53;
import defpackage.SJ3;
import defpackage.X5;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MaterialButton extends C4287cf implements Checkable, InterfaceC12004z63 {
    public static final int[] u = {R.attr.state_checkable};
    public static final int[] v = {R.attr.state_checked};
    public final C7970nM1 i;
    public final LinkedHashSet j;
    public final PorterDuff.Mode k;
    public final ColorStateList l;
    public Drawable m;
    public final int n;
    public int o;
    public int p;
    public final int q;
    public boolean r;
    public boolean s;
    public final int t;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public boolean h;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeInt(this.h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.h = parcel.readInt() == 1;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, com.android.chrome.R.attr.f9910_resource_name_obfuscated_res_0x7f05030c, com.android.chrome.R.style.f112620_resource_name_obfuscated_res_0x7f15082f), attributeSet, com.android.chrome.R.attr.f9910_resource_name_obfuscated_res_0x7f05030c);
        boolean z;
        this.j = new LinkedHashSet();
        this.r = false;
        this.s = false;
        Context context2 = getContext();
        TypedArray d = SJ3.d(context2, attributeSet, JG2.i0, com.android.chrome.R.attr.f9910_resource_name_obfuscated_res_0x7f05030c, com.android.chrome.R.style.f112620_resource_name_obfuscated_res_0x7f15082f, new int[0]);
        int dimensionPixelSize = d.getDimensionPixelSize(12, 0);
        this.q = dimensionPixelSize;
        this.k = Ee4.b(d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.l = AM1.b(getContext(), d, 14);
        this.m = AM1.c(getContext(), d, 10);
        this.t = d.getInteger(11, 1);
        this.n = d.getDimensionPixelSize(13, 0);
        C7970nM1 c7970nM1 = new C7970nM1(this, new S53(S53.a(context2, attributeSet, com.android.chrome.R.attr.f9910_resource_name_obfuscated_res_0x7f05030c, com.android.chrome.R.style.f112620_resource_name_obfuscated_res_0x7f15082f)));
        this.i = c7970nM1;
        c7970nM1.c = d.getDimensionPixelOffset(1, 0);
        c7970nM1.d = d.getDimensionPixelOffset(2, 0);
        c7970nM1.e = d.getDimensionPixelOffset(3, 0);
        c7970nM1.f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize2 = d.getDimensionPixelSize(8, -1);
            S53 s53 = c7970nM1.b;
            float f = dimensionPixelSize2;
            s53.getClass();
            R53 r53 = new R53(s53);
            r53.e = new C6129i(f);
            r53.f = new C6129i(f);
            r53.g = new C6129i(f);
            r53.h = new C6129i(f);
            c7970nM1.c(new S53(r53));
        }
        c7970nM1.g = d.getDimensionPixelSize(20, 0);
        c7970nM1.h = Ee4.b(d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c7970nM1.i = AM1.b(getContext(), d, 6);
        c7970nM1.j = AM1.b(getContext(), d, 19);
        c7970nM1.k = AM1.b(getContext(), d, 16);
        c7970nM1.n = d.getBoolean(5, false);
        c7970nM1.q = d.getDimensionPixelSize(9, 0);
        c7970nM1.o = d.getBoolean(21, true);
        WeakHashMap weakHashMap = Ec4.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            c7970nM1.m = true;
            g(c7970nM1.i);
            h(c7970nM1.h);
            z = false;
        } else {
            DM1 dm1 = new DM1(c7970nM1.b);
            dm1.g(getContext());
            dm1.setTintList(c7970nM1.i);
            PorterDuff.Mode mode = c7970nM1.h;
            if (mode != null) {
                dm1.setTintMode(mode);
            }
            float f2 = c7970nM1.g;
            ColorStateList colorStateList = c7970nM1.j;
            dm1.a.k = f2;
            dm1.invalidateSelf();
            CM1 cm1 = dm1.a;
            if (cm1.d != colorStateList) {
                cm1.d = colorStateList;
                dm1.onStateChange(dm1.getState());
            }
            DM1 dm12 = new DM1(c7970nM1.b);
            dm12.setTint(0);
            dm12.a.k = c7970nM1.g;
            dm12.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(0);
            CM1 cm12 = dm12.a;
            if (cm12.d != valueOf) {
                cm12.d = valueOf;
                dm12.onStateChange(dm12.getState());
            }
            DM1 dm13 = new DM1(c7970nM1.b);
            c7970nM1.l = dm13;
            dm13.setTint(-1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC9363rQ2.b(c7970nM1.k), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{dm12, dm1}), c7970nM1.c, c7970nM1.e, c7970nM1.d, c7970nM1.f), c7970nM1.l);
            c7970nM1.p = rippleDrawable;
            e(rippleDrawable);
            z = false;
            DM1 b = c7970nM1.b(false);
            if (b != null) {
                b.i(c7970nM1.q);
                b.setState(getDrawableState());
            }
        }
        setPaddingRelative(paddingStart + c7970nM1.c, paddingTop + c7970nM1.e, paddingEnd + c7970nM1.d, paddingBottom + c7970nM1.f);
        d.recycle();
        setCompoundDrawablePadding(dimensionPixelSize);
        i(this.m != null ? true : z);
    }

    @Override // defpackage.C4287cf, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C7970nM1 c7970nM1 = this.i;
        accessibilityNodeInfo.setClassName((c7970nM1 != null && c7970nM1.n ? CompoundButton.class : Button.class).getName());
        accessibilityNodeInfo.setCheckable(c7970nM1 != null && c7970nM1.n);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.C4287cf, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C7970nM1 c7970nM1 = this.i;
        accessibilityEvent.setClassName((c7970nM1 != null && c7970nM1.n ? CompoundButton.class : Button.class).getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.h = this.r;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setChecked(savedState.h);
    }

    public final void g(ColorStateList colorStateList) {
        if (!c()) {
            C3944bf c3944bf = this.a;
            if (c3944bf != null) {
                c3944bf.h(colorStateList);
                return;
            }
            return;
        }
        C7970nM1 c7970nM1 = this.i;
        if (c7970nM1.i != colorStateList) {
            c7970nM1.i = colorStateList;
            if (c7970nM1.b(false) != null) {
                c7970nM1.b(false).setTintList(c7970nM1.i);
            }
        }
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        if (!c()) {
            C3944bf c3944bf = this.a;
            if (c3944bf != null) {
                return c3944bf.b();
            }
            return null;
        }
        return this.i.i;
    }

    public final void h(PorterDuff.Mode mode) {
        if (!c()) {
            C3944bf c3944bf = this.a;
            if (c3944bf != null) {
                c3944bf.i(mode);
                return;
            }
            return;
        }
        C7970nM1 c7970nM1 = this.i;
        if (c7970nM1.h != mode) {
            c7970nM1.h = mode;
            if (c7970nM1.b(false) == null || c7970nM1.h == null) {
                return;
            }
            c7970nM1.b(false).setTintMode(c7970nM1.h);
        }
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        if (!c()) {
            C3944bf c3944bf = this.a;
            if (c3944bf != null) {
                return c3944bf.c();
            }
            return null;
        }
        return this.i.h;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.i.o) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        g(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        h(mode);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (c()) {
            C7970nM1 c7970nM1 = this.i;
            if (c7970nM1.b(false) != null) {
                c7970nM1.b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C4287cf, android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC2884Wf.a(getContext(), i) : null);
    }

    @Override // defpackage.C4287cf, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                C7970nM1 c7970nM1 = this.i;
                c7970nM1.m = true;
                ColorStateList colorStateList = c7970nM1.i;
                MaterialButton materialButton = c7970nM1.a;
                materialButton.g(colorStateList);
                materialButton.h(c7970nM1.h);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C4287cf, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.C4287cf, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (c()) {
            EM1.b(this, this.i.b(false));
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (c()) {
            this.i.b(false).i(f);
        }
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.m != null) {
            if (this.m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void j(int i, int i2) {
        Layout.Alignment alignment;
        int min;
        if (this.m == null || getLayout() == null) {
            return;
        }
        int i3 = this.t;
        boolean z = i3 == 1 || i3 == 2;
        int i4 = this.q;
        int i5 = this.n;
        if (!z) {
            if (!(i3 == 3 || i3 == 4)) {
                if (i3 == 16 || i3 == 32) {
                    this.o = 0;
                    if (i3 == 16) {
                        this.p = 0;
                        i(false);
                        return;
                    }
                    if (i5 == 0) {
                        i5 = this.m.getIntrinsicHeight();
                    }
                    if (getLineCount() > 1) {
                        min = getLayout().getHeight();
                    } else {
                        TextPaint paint = getPaint();
                        String charSequence = getText().toString();
                        if (getTransformationMethod() != null) {
                            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                        }
                        Rect rect = new Rect();
                        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                        min = Math.min(rect.height(), getLayout().getHeight());
                    }
                    int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i5) - i4) - getPaddingBottom()) / 2);
                    if (this.p != max) {
                        this.p = max;
                        i(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.p = 0;
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            int gravity = getGravity() & 8388615;
            if (gravity == 1) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (gravity == 5 || gravity == 8388613) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
        } else if (textAlignment == 6 || textAlignment == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (textAlignment == 4) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.o = 0;
            i(false);
            return;
        }
        if (i5 == 0) {
            i5 = this.m.getIntrinsicWidth();
        }
        int lineCount = getLineCount();
        int i6 = 0;
        for (int i7 = 0; i7 < lineCount; i7++) {
            CharSequence subSequence = getText().subSequence(getLayout().getLineStart(i7), getLayout().getLineEnd(i7));
            TextPaint paint2 = getPaint();
            String charSequence2 = subSequence.toString();
            if (getTransformationMethod() != null) {
                charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
            }
            i6 = Math.max(i6, Math.min((int) paint2.measureText(charSequence2), getLayout().getEllipsizedWidth()));
        }
        WeakHashMap weakHashMap = Ec4.a;
        int paddingEnd = ((((i - i6) - getPaddingEnd()) - i5) - i4) - getPaddingStart();
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (i3 == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.o != paddingEnd) {
            this.o = paddingEnd;
            i(false);
        }
    }

    public final void e(RippleDrawable rippleDrawable) {
        super.setBackgroundDrawable(rippleDrawable);
    }

    public final void i(boolean z) {
        Drawable drawable = this.m;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.m = mutate;
            mutate.setTintList(this.l);
            PorterDuff.Mode mode = this.k;
            if (mode != null) {
                this.m.setTintMode(mode);
            }
            int i = this.n;
            int intrinsicWidth = i != 0 ? i : this.m.getIntrinsicWidth();
            if (i == 0) {
                i = this.m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.m;
            int i2 = this.o;
            int i3 = this.p;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, i + i3);
            this.m.setVisible(true, z);
        }
        if (z) {
            d();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.t;
        if (!(i4 == 1 || i4 == 2) || drawable3 == this.m) {
            if (!(i4 == 3 || i4 == 4) || drawable5 == this.m) {
                if (!(i4 == 16 || i4 == 32) || drawable4 == this.m) {
                    z2 = false;
                }
            }
        }
        if (z2) {
            d();
        }
    }

    public final void d() {
        int i = this.t;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.m, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.m, null);
            return;
        }
        if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.m, null, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C7970nM1 c7970nM1 = this.i;
        if (c7970nM1 != null && c7970nM1.n) {
            View.mergeDrawableStates(onCreateDrawableState, u);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.r;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.r);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        C7970nM1 c7970nM1 = this.i;
        if ((c7970nM1 != null && c7970nM1.n) && isEnabled() && this.r != z) {
            this.r = z;
            refreshDrawableState();
            getParent();
            if (this.s) {
                return;
            }
            this.s = true;
            Iterator it = this.j.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            this.s = false;
        }
    }

    @Override // defpackage.InterfaceC12004z63
    public final void b(S53 s53) {
        if (c()) {
            this.i.c(s53);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
    }

    public final boolean c() {
        C7970nM1 c7970nM1 = this.i;
        return (c7970nM1 == null || c7970nM1.m) ? false : true;
    }
}
