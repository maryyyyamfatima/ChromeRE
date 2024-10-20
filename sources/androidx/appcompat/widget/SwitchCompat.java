package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.AbstractC3085Xt0;
import defpackage.AbstractC3838bK3;
import defpackage.AbstractC7499lz0;
import defpackage.C10132tg;
import defpackage.C1584Mf;
import defpackage.C2433Ss3;
import defpackage.C6679jc4;
import defpackage.C7208l8;
import defpackage.Ec4;
import defpackage.GJ3;
import defpackage.He4;
import defpackage.IN3;
import defpackage.JG2;
import defpackage.Y50;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final C2433Ss3 V = new C2433Ss3();
    public static final int[] W = {R.attr.state_checked};
    public float A;
    public float B;
    public final VelocityTracker C;
    public final int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f11482J;
    public int K;
    public int L;
    public final boolean M;
    public final TextPaint N;
    public ColorStateList O;
    public StaticLayout P;
    public StaticLayout Q;
    public C7208l8 R;
    public ObjectAnimator S;
    public C1584Mf T;
    public final Rect U;
    public Drawable a;
    public ColorStateList g;
    public final PorterDuff.Mode h;
    public boolean i;
    public final boolean j;
    public Drawable k;
    public ColorStateList l;
    public final PorterDuff.Mode m;
    public boolean n;
    public final boolean o;
    public final int p;
    public final int q;
    public final int r;
    public final boolean s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public final boolean x;
    public int y;
    public final int z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, com.android.chrome.R.attr.f13150_resource_name_obfuscated_res_0x7f050450);
        Typeface typeface;
        Typeface create;
        int resourceId;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        this.M = true;
        this.U = new Rect();
        AbstractC3838bK3.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = JG2.Q0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.android.chrome.R.attr.f13150_resource_name_obfuscated_res_0x7f050450, 0);
        IN3 in3 = new IN3(context, obtainStyledAttributes);
        Ec4.l(this, context, iArr, attributeSet, obtainStyledAttributes, com.android.chrome.R.attr.f13150_resource_name_obfuscated_res_0x7f050450, 0);
        Drawable e = in3.e(2);
        this.a = e;
        if (e != null) {
            e.setCallback(this);
        }
        Drawable e2 = in3.e(11);
        this.k = e2;
        if (e2 != null) {
            e2.setCallback(this);
        }
        h(in3.k(0));
        g(in3.k(1));
        this.x = in3.a(3, true);
        this.p = in3.d(8, 0);
        this.q = in3.d(5, 0);
        this.r = in3.d(6, 0);
        this.s = in3.a(4, false);
        ColorStateList b = in3.b(9);
        if (b != null) {
            this.g = b;
            this.i = true;
        }
        PorterDuff.Mode c = AbstractC3085Xt0.c(in3.h(10, -1), null);
        if (c != null) {
            this.h = c;
            this.j = true;
        }
        if (this.i || this.j) {
            a();
        }
        ColorStateList b2 = in3.b(12);
        if (b2 != null) {
            this.l = b2;
            this.n = true;
        }
        PorterDuff.Mode c2 = AbstractC3085Xt0.c(in3.h(13, -1), null);
        if (c2 != null) {
            this.m = c2;
            this.o = true;
        }
        if (this.n || this.o) {
            b();
        }
        int i2 = in3.i(7, 0);
        if (i2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, JG2.X0);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = Y50.b(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.O = colorStateList;
            } else {
                this.O = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = obtainStyledAttributes2.getInt(1, -1);
            int i4 = obtainStyledAttributes2.getInt(2, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                typeface = Typeface.SERIF;
            } else {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            }
            if (i4 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i4);
                } else {
                    create = Typeface.create(typeface, i4);
                }
                f(create);
                int i5 = (~(create != null ? create.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                f(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.R = new C7208l8(getContext());
            } else {
                this.R = null;
            }
            h(this.t);
            g(this.v);
            obtainStyledAttributes2.recycle();
        }
        new C10132tg(this).d(attributeSet, com.android.chrome.R.attr.f13150_resource_name_obfuscated_res_0x7f050450);
        in3.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        c().b(attributeSet, com.android.chrome.R.attr.f13150_resource_name_obfuscated_res_0x7f050450);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void f(Typeface typeface) {
        TextPaint textPaint = this.N;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.k;
        if (drawable != null) {
            boolean z = this.n;
            boolean z2 = this.o;
            if (z || z2) {
                Drawable mutate = drawable.mutate();
                this.k = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (z2) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(getDrawableState());
                }
            }
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            boolean z = this.i;
            boolean z2 = this.j;
            if (z || z2) {
                Drawable mutate = drawable.mutate();
                this.a = mutate;
                if (this.i) {
                    mutate.setTintList(this.g);
                }
                if (z2) {
                    this.a.setTintMode(this.h);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    public final void h(CharSequence charSequence) {
        this.t = charSequence;
        C1584Mf c = c();
        TransformationMethod e = c.b.a.e(this.R);
        if (e != null) {
            charSequence = e.getTransformation(charSequence, this);
        }
        this.u = charSequence;
        this.P = null;
        if (this.x && this.T.b.a.b()) {
            Object obj = AbstractC7499lz0.a;
        }
    }

    public final void g(CharSequence charSequence) {
        this.v = charSequence;
        C1584Mf c = c();
        TransformationMethod e = c.b.a.e(this.R);
        if (e != null) {
            charSequence = e.getTransformation(charSequence, this);
        }
        this.w = charSequence;
        this.Q = null;
        if (this.x && this.T.b.a.b()) {
            Object obj = AbstractC7499lz0.a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = this.x;
        if (z) {
            if (this.P == null) {
                this.P = e(this.u);
            }
            if (this.Q == null) {
                this.Q = e(this.w);
            }
        }
        Drawable drawable = this.a;
        int i6 = 0;
        Rect rect = this.U;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (z) {
            i5 = (this.p * 2) + Math.max(this.P.getWidth(), this.Q.getWidth());
        } else {
            i5 = 0;
        }
        this.H = Math.max(i5, i3);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect b = AbstractC3085Xt0.b(drawable3);
            i7 = Math.max(i7, b.left);
            i8 = Math.max(i8, b.right);
        }
        boolean z2 = this.M;
        int i9 = this.q;
        if (z2) {
            i9 = Math.max(i9, (this.H * 2) + i7 + i8);
        }
        int max = Math.max(i6, i4);
        this.F = i9;
        this.G = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public final StaticLayout e(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.N, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:            if (r1 != 3) goto L90;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.t;
                if (obj == null) {
                    obj = getResources().getString(com.android.chrome.R.string.f65420_resource_name_obfuscated_res_0x7f140107);
                }
                WeakHashMap weakHashMap = Ec4.a;
                new C6679jc4().e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.v;
            if (obj2 == null) {
                obj2 = getResources().getString(com.android.chrome.R.string.f65410_resource_name_obfuscated_res_0x7f140106);
            }
            WeakHashMap weakHashMap2 = Ec4.a;
            new C6679jc4().e(this, obj2);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = Ec4.a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, V, isChecked ? 1.0f : 0.0f);
                this.S = ofFloat;
                ofFloat.setDuration(250L);
                this.S.setAutoCancel(true);
                this.S.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.S;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.E = isChecked ? 1.0f : 0.0f;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.a != null) {
            Drawable drawable = this.k;
            Rect rect = this.U;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = AbstractC3085Xt0.b(this.a);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (He4.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.F + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.F) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.G;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.G + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.G;
        }
        this.I = i6;
        this.f11482J = i8;
        this.L = i7;
        this.K = width;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        Rect rect;
        int i;
        int i2;
        int i3 = this.I;
        int i4 = this.f11482J;
        int i5 = this.K;
        int i6 = this.L;
        if (He4.a(this)) {
            f = 1.0f - this.E;
        } else {
            f = this.E;
        }
        int d = ((int) ((f * d()) + 0.5f)) + i3;
        Drawable drawable = this.a;
        if (drawable != null) {
            rect = AbstractC3085Xt0.b(drawable);
        } else {
            rect = AbstractC3085Xt0.c;
        }
        Drawable drawable2 = this.k;
        Rect rect2 = this.U;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            d += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = d - rect2.left;
            int i16 = d + this.H + rect2.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.k;
        Rect rect = this.U;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f11482J;
        int i2 = this.L;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (this.s && drawable2 != null) {
                Rect b = AbstractC3085Xt0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = (this.E > 0.5f ? 1 : (this.E == 0.5f ? 0 : -1)) > 0 ? this.P : this.Q;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.O;
            TextPaint textPaint = this.N;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!He4.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (He4.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    public final int d() {
        Rect rect;
        Drawable drawable = this.k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.U;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            rect = AbstractC3085Xt0.b(drawable2);
        } else {
            rect = AbstractC3085Xt0.c;
        }
        return ((((this.F - this.H) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, W);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.S.end();
        this.S = null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(GJ3.e(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return GJ3.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c().c(z);
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(c().a(inputFilterArr));
    }

    public final C1584Mf c() {
        if (this.T == null) {
            this.T = new C1584Mf(this);
        }
        return this.T;
    }
}
