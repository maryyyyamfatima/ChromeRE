package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.AM1;
import defpackage.AbstractC0270Cc;
import defpackage.AbstractC0292Cg1;
import defpackage.AbstractC11878yl0;
import defpackage.AbstractC3085Xt0;
import defpackage.AbstractC6990kW3;
import defpackage.AbstractC9685sM1;
import defpackage.C0101Au0;
import defpackage.C10127tf0;
import defpackage.C10475ug;
import defpackage.C11031wH0;
import defpackage.C1195Jf;
import defpackage.C1415Kx;
import defpackage.C4315cj3;
import defpackage.C5356fl1;
import defpackage.C5700gl1;
import defpackage.C6129i;
import defpackage.C7626mM1;
import defpackage.CI3;
import defpackage.CM1;
import defpackage.DI3;
import defpackage.DM1;
import defpackage.EI3;
import defpackage.Ec4;
import defpackage.FI3;
import defpackage.GI3;
import defpackage.InterfaceC11333x90;
import defpackage.KH;
import defpackage.KR0;
import defpackage.KZ3;
import defpackage.QV;
import defpackage.R53;
import defpackage.S53;
import defpackage.WA0;
import defpackage.Y50;
import defpackage.ZA0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public boolean A0;
    public C11031wH0 B;
    public boolean B0;
    public C11031wH0 C;
    public ColorStateList D;
    public ColorStateList E;
    public final boolean F;
    public CharSequence G;
    public boolean H;
    public DM1 I;

    /* renamed from: J */
    public DM1 f11502J;
    public StateListDrawable K;
    public boolean L;
    public DM1 M;
    public DM1 N;
    public S53 O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final int V;
    public int W;
    public final FrameLayout a;
    public int a0;
    public final Rect b0;
    public final Rect c0;
    public final RectF d0;
    public ColorDrawable e0;
    public int f0;
    public final C4315cj3 g;
    public final LinkedHashSet g0;
    public final ZA0 h;
    public ColorDrawable h0;
    public EditText i;
    public int i0;
    public CharSequence j;
    public Drawable j0;
    public int k;
    public ColorStateList k0;
    public int l;
    public ColorStateList l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public final C5700gl1 o;
    public int o0;
    public boolean p;
    public ColorStateList p0;
    public int q;
    public final int q0;
    public boolean r;
    public final int r0;
    public final KH s;
    public final int s0;
    public C10475ug t;
    public final int t0;
    public int u;
    public int u0;
    public int v;
    public boolean v0;
    public CharSequence w;
    public final QV w0;
    public boolean x;
    public final boolean x0;
    public C10475ug y;
    public final boolean y0;
    public ColorStateList z;
    public ValueAnimator z0;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new a();
        public CharSequence h;
        public boolean i;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            TextUtils.writeToParcel(this.h, parcel, i);
            parcel.writeInt(this.i ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.i = parcel.readInt() == 1;
        }

        public final String toString() {
            return KR0.a("TextInputLayout.SavedState{", Integer.toHexString(System.identityHashCode(this)), " error=", String.valueOf(this.h), "}");
        }
    }

    public final void q(int i, TextView textView) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(com.android.chrome.R.style.f99620_resource_name_obfuscated_res_0x7f150317);
            Context context = getContext();
            Object obj = Y50.a;
            textView.setTextColor(context.getColor(com.android.chrome.R.color.0_resource_name_obfuscated_res_0x7f070175));
        }
    }

    public final void m(boolean z) {
        C5700gl1 c5700gl1 = this.o;
        if (c5700gl1.k == z) {
            return;
        }
        c5700gl1.c();
        TextInputLayout textInputLayout = c5700gl1.b;
        if (z) {
            C10475ug c10475ug = new C10475ug(c5700gl1.a, null);
            c5700gl1.l = c10475ug;
            c10475ug.setId(com.android.chrome.R.id.textinput_error);
            c5700gl1.l.setTextAlignment(5);
            int i = c5700gl1.n;
            c5700gl1.n = i;
            C10475ug c10475ug2 = c5700gl1.l;
            if (c10475ug2 != null) {
                textInputLayout.q(i, c10475ug2);
            }
            ColorStateList colorStateList = c5700gl1.o;
            c5700gl1.o = colorStateList;
            C10475ug c10475ug3 = c5700gl1.l;
            if (c10475ug3 != null && colorStateList != null) {
                c10475ug3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c5700gl1.m;
            c5700gl1.m = charSequence;
            C10475ug c10475ug4 = c5700gl1.l;
            if (c10475ug4 != null) {
                c10475ug4.setContentDescription(charSequence);
            }
            c5700gl1.l.setVisibility(4);
            c5700gl1.l.setAccessibilityLiveRegion(1);
            c5700gl1.a(0, c5700gl1.l);
        } else {
            c5700gl1.f();
            c5700gl1.g(0, c5700gl1.l);
            c5700gl1.l = null;
            textInputLayout.v();
            textInputLayout.B();
        }
        c5700gl1.k = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b2  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void l(CharSequence charSequence) {
        C5700gl1 c5700gl1 = this.o;
        if (!c5700gl1.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                m(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            c5700gl1.c();
            c5700gl1.j = charSequence;
            c5700gl1.l.setText(charSequence);
            int i = c5700gl1.h;
            if (i != 1) {
                c5700gl1.i = 1;
            }
            c5700gl1.i(i, c5700gl1.i, c5700gl1.h(c5700gl1.l, charSequence));
            return;
        }
        c5700gl1.f();
    }

    public final void n(boolean z) {
        C5700gl1 c5700gl1 = this.o;
        if (c5700gl1.q == z) {
            return;
        }
        c5700gl1.c();
        if (!z) {
            c5700gl1.c();
            int i = c5700gl1.h;
            if (i == 2) {
                c5700gl1.i = 0;
            }
            c5700gl1.i(i, c5700gl1.i, c5700gl1.h(c5700gl1.r, ""));
            c5700gl1.g(1, c5700gl1.r);
            c5700gl1.r = null;
            TextInputLayout textInputLayout = c5700gl1.b;
            textInputLayout.v();
            textInputLayout.B();
        } else {
            C10475ug c10475ug = new C10475ug(c5700gl1.a, null);
            c5700gl1.r = c10475ug;
            c10475ug.setId(com.android.chrome.R.id.textinput_helper_text);
            c5700gl1.r.setTextAlignment(5);
            c5700gl1.r.setVisibility(4);
            c5700gl1.r.setAccessibilityLiveRegion(1);
            int i2 = c5700gl1.s;
            c5700gl1.s = i2;
            C10475ug c10475ug2 = c5700gl1.r;
            if (c10475ug2 != null) {
                c10475ug2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = c5700gl1.t;
            c5700gl1.t = colorStateList;
            C10475ug c10475ug3 = c5700gl1.r;
            if (c10475ug3 != null && colorStateList != null) {
                c10475ug3.setTextColor(colorStateList);
            }
            c5700gl1.a(1, c5700gl1.r);
            c5700gl1.r.setAccessibilityDelegate(new C5356fl1(c5700gl1));
        }
        c5700gl1.q = z;
    }

    public final boolean r() {
        C5700gl1 c5700gl1 = this.o;
        return (c5700gl1.i != 1 || c5700gl1.l == null || TextUtils.isEmpty(c5700gl1.j)) ? false : true;
    }

    public final void a(float f) {
        QV qv = this.w0;
        if (qv.b == f) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0270Cc.b);
            this.z0.setDuration(167L);
            this.z0.addUpdateListener(new FI3(this));
        }
        this.z0.setFloatValues(qv.b, f);
        this.z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        x();
        EditText editText = (EditText) view;
        if (this.i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        ZA0 za0 = this.h;
        if (za0.m != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.i = editText;
        int i2 = this.k;
        if (i2 != -1) {
            this.k = i2;
            if (editText != null && i2 != -1) {
                editText.setMinEms(i2);
            }
        } else {
            int i3 = this.m;
            this.m = i3;
            if (editText != null && i3 != -1) {
                editText.setMinWidth(i3);
            }
        }
        int i4 = this.l;
        if (i4 != -1) {
            this.l = i4;
            EditText editText2 = this.i;
            if (editText2 != null && i4 != -1) {
                editText2.setMaxEms(i4);
            }
        } else {
            int i5 = this.n;
            this.n = i5;
            EditText editText3 = this.i;
            if (editText3 != null && i5 != -1) {
                editText3.setMaxWidth(i5);
            }
        }
        this.L = false;
        h();
        GI3 gi3 = new GI3(this);
        EditText editText4 = this.i;
        if (editText4 != null) {
            Ec4.m(editText4, gi3);
        }
        Typeface typeface = this.i.getTypeface();
        QV qv = this.w0;
        boolean j = qv.j(typeface);
        if (qv.w != typeface) {
            qv.w = typeface;
            Typeface a = KZ3.a(qv.a.getContext().getResources().getConfiguration(), typeface);
            qv.v = a;
            if (a == null) {
                a = qv.w;
            }
            qv.u = a;
            z = true;
        } else {
            z = false;
        }
        if (j || z) {
            qv.h(false);
        }
        float textSize = this.i.getTextSize();
        if (qv.h != textSize) {
            qv.h = textSize;
            qv.h(false);
        }
        float letterSpacing = this.i.getLetterSpacing();
        if (qv.W != letterSpacing) {
            qv.W = letterSpacing;
            qv.h(false);
        }
        int gravity = this.i.getGravity();
        int i6 = (gravity & (-113)) | 48;
        if (qv.g != i6) {
            qv.g = i6;
            qv.h(false);
        }
        if (qv.f != gravity) {
            qv.f = gravity;
            qv.h(false);
        }
        this.i.addTextChangedListener(new CI3(this));
        if (this.k0 == null) {
            this.k0 = this.i.getHintTextColors();
        }
        if (this.F) {
            if (TextUtils.isEmpty(this.G)) {
                CharSequence hint = this.i.getHint();
                this.j = hint;
                o(hint);
                this.i.setHint((CharSequence) null);
            }
            this.H = true;
        }
        if (this.t != null) {
            s(this.i.getText());
        }
        v();
        this.o.b();
        this.g.bringToFront();
        za0.bringToFront();
        Iterator it = this.g0.iterator();
        while (it.hasNext()) {
            ((WA0) it.next()).a(this);
        }
        za0.k();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        y(false, true);
    }

    public final void h() {
        int i = this.R;
        if (i == 0) {
            this.I = null;
            this.M = null;
            this.N = null;
        } else if (i == 1) {
            this.I = new DM1(this.O);
            this.M = new DM1();
            this.N = new DM1();
        } else if (i == 2) {
            if (this.F && !(this.I instanceof C10127tf0)) {
                this.I = new C10127tf0(this.O);
            } else {
                this.I = new DM1(this.O);
            }
            this.M = null;
            this.N = null;
        } else {
            throw new IllegalArgumentException(this.R + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        w();
        B();
        if (this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.S = getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b6);
            } else if (AM1.d(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b5);
            }
        }
        if (this.i != null && this.R == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.i;
                WeakHashMap weakHashMap = Ec4.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b4), this.i.getPaddingEnd(), getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b3));
            } else if (AM1.d(getContext())) {
                EditText editText2 = this.i;
                WeakHashMap weakHashMap2 = Ec4.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b2), this.i.getPaddingEnd(), getResources().getDimensionPixelSize(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0804b1));
            }
        }
        if (this.R != 0) {
            x();
        }
        EditText editText3 = this.i;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.R;
                if (i2 == 2) {
                    if (this.f11502J == null) {
                        this.f11502J = e(true);
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.f11502J);
                } else if (i2 == 1) {
                    if (this.K == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.K = stateListDrawable;
                        int[] iArr = {R.attr.state_above_anchor};
                        if (this.f11502J == null) {
                            this.f11502J = e(true);
                        }
                        stateListDrawable.addState(iArr, this.f11502J);
                        this.K.addState(new int[0], e(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.K);
                }
            }
        }
    }

    public final void w() {
        Drawable drawable;
        EditText editText = this.i;
        if (editText == null || this.I == null) {
            return;
        }
        if ((this.L || editText.getBackground() == null) && this.R != 0) {
            EditText editText2 = this.i;
            if (editText2 instanceof AutoCompleteTextView) {
                if (!(editText2.getInputType() != 0)) {
                    int d = AbstractC9685sM1.d(this.i, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050113);
                    int i = this.R;
                    int[][] iArr = C0;
                    if (i == 2) {
                        Context context = getContext();
                        DM1 dm1 = this.I;
                        int c = AbstractC9685sM1.c(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050152, context, "TextInputLayout");
                        DM1 dm12 = new DM1(dm1.a.a);
                        int e = AbstractC9685sM1.e(0.1f, d, c);
                        dm12.j(new ColorStateList(iArr, new int[]{e, 0}));
                        dm12.setTint(c);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{e, c});
                        DM1 dm13 = new DM1(dm1.a.a);
                        dm13.setTint(-1);
                        drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, dm12, dm13), dm1});
                    } else if (i == 1) {
                        DM1 dm14 = this.I;
                        int i2 = this.a0;
                        drawable = new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC9685sM1.e(0.1f, d, i2), i2}), dm14, dm14);
                    } else {
                        drawable = null;
                    }
                    WeakHashMap weakHashMap = Ec4.a;
                    editText2.setBackground(drawable);
                    this.L = true;
                }
            }
            drawable = this.I;
            WeakHashMap weakHashMap2 = Ec4.a;
            editText2.setBackground(drawable);
            this.L = true;
        }
    }

    public final DM1 e(boolean z) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0805c6);
        float f = z ? dimensionPixelOffset2 : 0.0f;
        EditText editText = this.i;
        if (editText instanceof C7626mM1) {
            dimensionPixelOffset = ((C7626mM1) editText).m;
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f08056d);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f08056f);
        R53 r53 = new R53();
        r53.e = new C6129i(f);
        r53.f = new C6129i(f);
        r53.h = new C6129i(dimensionPixelOffset2);
        r53.g = new C6129i(dimensionPixelOffset2);
        S53 s53 = new S53(r53);
        Context context = getContext();
        Paint paint = DM1.B;
        int c = AbstractC9685sM1.c(com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f050152, context, DM1.class.getSimpleName());
        DM1 dm1 = new DM1();
        dm1.g(context);
        dm1.j(ColorStateList.valueOf(c));
        dm1.i(dimensionPixelOffset);
        dm1.b(s53);
        CM1 cm1 = dm1.a;
        if (cm1.h == null) {
            cm1.h = new Rect();
        }
        dm1.a.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        dm1.invalidateSelf();
        return dm1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.j != null) {
            boolean z = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.i.setHint(this.j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.i.setHint(hint);
                this.H = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.i) {
                newChild.setHint(this.F ? this.G : null);
            }
        }
    }

    public final void x() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c = c();
            if (c != layoutParams.topMargin) {
                layoutParams.topMargin = c;
                frameLayout.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.i;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public final void y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C10475ug c10475ug;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.i;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.i;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.k0;
        QV qv = this.w0;
        if (colorStateList2 != null) {
            qv.i(colorStateList2);
            ColorStateList colorStateList3 = this.k0;
            if (qv.j != colorStateList3) {
                qv.j = colorStateList3;
                qv.h(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.k0;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.u0);
            } else {
                i = this.u0;
            }
            qv.i(ColorStateList.valueOf(i));
            ColorStateList valueOf = ColorStateList.valueOf(i);
            if (qv.j != valueOf) {
                qv.j = valueOf;
                qv.h(false);
            }
        } else if (r()) {
            C10475ug c10475ug2 = this.o.l;
            qv.i(c10475ug2 != null ? c10475ug2.getTextColors() : null);
        } else if (this.r && (c10475ug = this.t) != null) {
            qv.i(c10475ug.getTextColors());
        } else if (z4 && (colorStateList = this.l0) != null) {
            qv.i(colorStateList);
        }
        ZA0 za0 = this.h;
        C4315cj3 c4315cj3 = this.g;
        boolean z5 = this.y0;
        if (z3 || !this.x0 || (isEnabled() && z4)) {
            if (z2 || this.v0) {
                ValueAnimator valueAnimator = this.z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z0.cancel();
                }
                if (z && z5) {
                    a(1.0f);
                } else {
                    qv.k(1.0f);
                }
                this.v0 = false;
                if (d()) {
                    i();
                }
                EditText editText3 = this.i;
                z(editText3 != null ? editText3.getText() : null);
                c4315cj3.n = false;
                c4315cj3.b();
                za0.u = false;
                za0.l();
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            ValueAnimator valueAnimator2 = this.z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z0.cancel();
            }
            if (z && z5) {
                a(0.0f);
            } else {
                qv.k(0.0f);
            }
            if (d() && (!((C10127tf0) this.I).C.isEmpty()) && d()) {
                ((C10127tf0) this.I).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.v0 = true;
            C10475ug c10475ug3 = this.y;
            if (c10475ug3 != null && this.x) {
                c10475ug3.setText((CharSequence) null);
                AbstractC6990kW3.a(this.a, this.C);
                this.y.setVisibility(4);
            }
            c4315cj3.n = true;
            c4315cj3.b();
            za0.u = true;
            za0.l();
        }
    }

    public final void o(CharSequence charSequence) {
        if (this.F) {
            if (!TextUtils.equals(charSequence, this.G)) {
                this.G = charSequence;
                QV qv = this.w0;
                if (charSequence == null || !TextUtils.equals(qv.A, charSequence)) {
                    qv.A = charSequence;
                    qv.B = null;
                    Bitmap bitmap = qv.E;
                    if (bitmap != null) {
                        bitmap.recycle();
                        qv.E = null;
                    }
                    qv.h(false);
                }
                if (!this.v0) {
                    i();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void k(boolean z) {
        if (this.p != z) {
            C5700gl1 c5700gl1 = this.o;
            if (z) {
                C10475ug c10475ug = new C10475ug(getContext(), null);
                this.t = c10475ug;
                c10475ug.setId(com.android.chrome.R.id.textinput_counter);
                this.t.setMaxLines(1);
                c5700gl1.a(2, this.t);
                ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.android.chrome.R.dimen.0_resource_name_obfuscated_res_0x7f0805e0));
                t();
                if (this.t != null) {
                    EditText editText = this.i;
                    s(editText != null ? editText.getText() : null);
                }
            } else {
                c5700gl1.g(2, this.t);
                this.t = null;
            }
            this.p = z;
        }
    }

    public final void s(Editable editable) {
        this.s.getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.r;
        int i = this.q;
        if (i == -1) {
            this.t.setText(String.valueOf(length));
            this.t.setContentDescription(null);
            this.r = false;
        } else {
            this.r = length > i;
            Context context = getContext();
            this.t.setContentDescription(context.getString(this.r ? com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140329 : com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140328, Integer.valueOf(length), Integer.valueOf(this.q)));
            if (z != this.r) {
                t();
            }
            this.t.setText(C1415Kx.c().d(getContext().getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f14032a, Integer.valueOf(length), Integer.valueOf(this.q))));
        }
        if (this.i == null || z == this.r) {
            return;
        }
        y(false, false);
        B();
        v();
    }

    public final void p(boolean z) {
        if (this.x == z) {
            return;
        }
        if (z) {
            C10475ug c10475ug = this.y;
            if (c10475ug != null) {
                this.a.addView(c10475ug);
                this.y.setVisibility(0);
            }
        } else {
            C10475ug c10475ug2 = this.y;
            if (c10475ug2 != null) {
                c10475ug2.setVisibility(8);
            }
            this.y = null;
        }
        this.x = z;
    }

    public final void z(Editable editable) {
        this.s.getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length == 0 && !this.v0) {
            if (this.y == null || !this.x || TextUtils.isEmpty(this.w)) {
                return;
            }
            this.y.setText(this.w);
            AbstractC6990kW3.a(frameLayout, this.B);
            this.y.setVisibility(0);
            this.y.bringToFront();
            announceForAccessibility(this.w);
            return;
        }
        C10475ug c10475ug = this.y;
        if (c10475ug == null || !this.x) {
            return;
        }
        c10475ug.setText((CharSequence) null);
        AbstractC6990kW3.a(frameLayout, this.C);
        this.y.setVisibility(4);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C10475ug c10475ug = this.t;
        if (c10475ug != null) {
            q(this.r ? this.u : this.v, c10475ug);
            if (!this.r && (colorStateList2 = this.D) != null) {
                this.t.setTextColor(colorStateList2);
            }
            if (!this.r || (colorStateList = this.E) == null) {
                return;
            }
            this.t.setTextColor(colorStateList);
        }
    }

    public final int c() {
        float d;
        if (!this.F) {
            return 0;
        }
        int i = this.R;
        QV qv = this.w0;
        if (i == 0) {
            d = qv.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = qv.d() / 2.0f;
        }
        return (int) d;
    }

    public final int f(int i, boolean z) {
        int compoundPaddingLeft = this.i.getCompoundPaddingLeft() + i;
        C4315cj3 c4315cj3 = this.g;
        if (c4315cj3.h == null || z) {
            return compoundPaddingLeft;
        }
        C10475ug c10475ug = c4315cj3.g;
        return (compoundPaddingLeft - c10475ug.getMeasuredWidth()) + c10475ug.getPaddingLeft();
    }

    public final int g(int i, boolean z) {
        int compoundPaddingRight = i - this.i.getCompoundPaddingRight();
        C4315cj3 c4315cj3 = this.g;
        if (c4315cj3.h == null || !z) {
            return compoundPaddingRight;
        }
        C10475ug c10475ug = c4315cj3.g;
        return compoundPaddingRight + (c10475ug.getMeasuredWidth() - c10475ug.getPaddingRight());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            DM1 r0 = r7.I
            if (r0 != 0) goto L5
            return
        L5:
            CM1 r1 = r0.a
            S53 r1 = r1.a
            S53 r2 = r7.O
            if (r1 == r2) goto L10
            r0.b(r2)
        L10:
            int r0 = r7.R
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.T
            if (r0 <= r2) goto L22
            int r0 = r7.W
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            DM1 r0 = r7.I
            int r1 = r7.T
            float r1 = (float) r1
            int r5 = r7.W
            CM1 r6 = r0.a
            r6.k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            CM1 r5 = r0.a
            android.content.res.ColorStateList r6 = r5.d
            if (r6 == r1) goto L4b
            r5.d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.a0
            int r1 = r7.R
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2131034450(0x7f050152, float:1.7679418E38)
            int r0 = defpackage.AbstractC9685sM1.b(r1, r3, r0)
            int r1 = r7.a0
            int r0 = defpackage.AbstractC4242cX.f(r1, r0)
        L62:
            r7.a0 = r0
            DM1 r1 = r7.I
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            DM1 r0 = r7.M
            if (r0 == 0) goto La7
            DM1 r1 = r7.N
            if (r1 != 0) goto L76
            goto La7
        L76:
            int r1 = r7.T
            if (r1 <= r2) goto L7f
            int r1 = r7.W
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La4
            android.widget.EditText r1 = r7.i
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L90
            int r1 = r7.m0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L96
        L90:
            int r1 = r7.W
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L96:
            r0.j(r1)
            DM1 r0 = r7.N
            int r1 = r7.W
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        La4:
            r7.invalidate()
        La7:
            r7.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final void v() {
        Drawable background;
        C10475ug c10475ug;
        EditText editText = this.i;
        if (editText == null || this.R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC3085Xt0.a;
        Drawable mutate = background.mutate();
        if (r()) {
            C10475ug c10475ug2 = this.o.l;
            mutate.setColorFilter(C1195Jf.c(c10475ug2 != null ? c10475ug2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (!this.r || (c10475ug = this.t) == null) {
            mutate.clearColorFilter();
            this.i.refreshDrawableState();
        } else {
            mutate.setColorFilter(C1195Jf.c(c10475ug.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (r()) {
            C5700gl1 c5700gl1 = this.o;
            savedState.h = c5700gl1.k ? c5700gl1.j : null;
        }
        ZA0 za0 = this.h;
        savedState.i = (za0.m != 0) && za0.k.isChecked();
        return savedState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        l(savedState.h);
        if (savedState.i) {
            post(new DI3(this));
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        boolean z2 = this.P;
        if (z != z2) {
            boolean z3 = z && !z2;
            InterfaceC11333x90 interfaceC11333x90 = this.O.e;
            RectF rectF = this.d0;
            float a = interfaceC11333x90.a(rectF);
            float a2 = this.O.f.a(rectF);
            float a3 = this.O.h.a(rectF);
            float a4 = this.O.g.a(rectF);
            float f = z3 ? a : a2;
            if (z3) {
                a = a2;
            }
            float f2 = z3 ? a3 : a4;
            if (z3) {
                a3 = a4;
            }
            WeakHashMap weakHashMap = Ec4.a;
            boolean z4 = getLayoutDirection() == 1;
            this.P = z4;
            float f3 = z4 ? a : f;
            if (!z4) {
                f = a;
            }
            float f4 = z4 ? a3 : f2;
            if (!z4) {
                f2 = a3;
            }
            DM1 dm1 = this.I;
            if (dm1 != null && dm1.a.a.e.a(dm1.f()) == f3) {
                DM1 dm12 = this.I;
                if (dm12.a.a.f.a(dm12.f()) == f) {
                    DM1 dm13 = this.I;
                    if (dm13.a.a.h.a(dm13.f()) == f4) {
                        DM1 dm14 = this.I;
                        if (dm14.a.a.g.a(dm14.f()) == f2) {
                            return;
                        }
                    }
                }
            }
            S53 s53 = this.O;
            s53.getClass();
            R53 r53 = new R53(s53);
            r53.e = new C6129i(f3);
            r53.f = new C6129i(f);
            r53.h = new C6129i(f4);
            r53.g = new C6129i(f2);
            this.O = new S53(r53);
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        EditText editText2 = this.i;
        ZA0 za0 = this.h;
        if (editText2 != null && this.i.getMeasuredHeight() < (max = Math.max(za0.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.i.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean u = u();
        if (z || u) {
            this.i.post(new EI3(this));
        }
        if (this.y != null && (editText = this.i) != null) {
            this.y.setGravity(editText.getGravity());
            this.y.setPadding(this.i.getCompoundPaddingLeft(), this.i.getCompoundPaddingTop(), this.i.getCompoundPaddingRight(), this.i.getCompoundPaddingBottom());
        }
        za0.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:            if (r2.c() != false) goto L361;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:            if (r2.s != null) goto L361;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.u():boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.i;
        if (editText != null) {
            Rect rect = this.b0;
            AbstractC11878yl0.a(this, editText, rect);
            DM1 dm1 = this.M;
            if (dm1 != null) {
                int i5 = rect.bottom;
                dm1.setBounds(rect.left, i5 - this.U, rect.right, i5);
            }
            DM1 dm12 = this.N;
            if (dm12 != null) {
                int i6 = rect.bottom;
                dm12.setBounds(rect.left, i6 - this.V, rect.right, i6);
            }
            if (this.F) {
                float textSize = this.i.getTextSize();
                QV qv = this.w0;
                if (qv.h != textSize) {
                    qv.h = textSize;
                    qv.h(false);
                }
                int gravity = this.i.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (qv.g != i7) {
                    qv.g = i7;
                    qv.h(false);
                }
                if (qv.f != gravity) {
                    qv.f = gravity;
                    qv.h(false);
                }
                if (this.i == null) {
                    throw new IllegalStateException();
                }
                WeakHashMap weakHashMap = Ec4.a;
                boolean z2 = getLayoutDirection() == 1;
                int i8 = rect.bottom;
                Rect rect2 = this.c0;
                rect2.bottom = i8;
                int i9 = this.R;
                if (i9 == 1) {
                    rect2.left = f(rect.left, z2);
                    rect2.top = rect.top + this.S;
                    rect2.right = g(rect.right, z2);
                } else if (i9 != 2) {
                    rect2.left = f(rect.left, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = g(rect.right, z2);
                } else {
                    rect2.left = this.i.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.i.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = qv.d;
                if (!(rect3.left == i10 && rect3.top == i11 && rect3.right == i12 && rect3.bottom == i13)) {
                    rect3.set(i10, i11, i12, i13);
                    qv.M = true;
                }
                if (this.i == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = qv.O;
                textPaint.setTextSize(qv.h);
                textPaint.setTypeface(qv.u);
                textPaint.setLetterSpacing(qv.W);
                float f = -textPaint.ascent();
                rect2.left = this.i.getCompoundPaddingLeft() + rect.left;
                rect2.top = this.R == 1 && this.i.getMinLines() <= 1 ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.i.getCompoundPaddingTop();
                rect2.right = rect.right - this.i.getCompoundPaddingRight();
                int compoundPaddingBottom = this.R == 1 && this.i.getMinLines() <= 1 ? (int) (rect2.top + f) : rect.bottom - this.i.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = qv.c;
                if (!(rect4.left == i14 && rect4.top == i15 && rect4.right == i16 && rect4.bottom == compoundPaddingBottom)) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    qv.M = true;
                }
                qv.h(false);
                if (!d() || this.v0) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        DM1 dm1;
        super.draw(canvas);
        boolean z = this.F;
        QV qv = this.w0;
        if (z) {
            qv.getClass();
            int save = canvas.save();
            if (qv.B != null) {
                RectF rectF = qv.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = qv.N;
                    textPaint.setTextSize(qv.G);
                    float f = qv.p;
                    float f2 = qv.q;
                    float f3 = qv.F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (qv.d0 > 1 && !qv.C) {
                        float lineStart = qv.p - qv.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (qv.b0 * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            textPaint.setShadowLayer(qv.H, qv.I, qv.f11462J, AbstractC9685sM1.a(qv.K, textPaint.getAlpha()));
                        }
                        qv.Y.draw(canvas);
                        textPaint.setAlpha((int) (qv.a0 * f4));
                        if (i >= 31) {
                            textPaint.setShadowLayer(qv.H, qv.I, qv.f11462J, AbstractC9685sM1.a(qv.K, textPaint.getAlpha()));
                        }
                        int lineBaseline = qv.Y.getLineBaseline(0);
                        CharSequence charSequence = qv.c0;
                        float f5 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(qv.H, qv.I, qv.f11462J, qv.K);
                        }
                        String trim = qv.c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(qv.Y.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        qv.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.N == null || (dm1 = this.M) == null) {
            return;
        }
        dm1.draw(canvas);
        if (this.i.isFocused()) {
            Rect bounds = this.N.getBounds();
            Rect bounds2 = this.M.getBounds();
            float f6 = qv.b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0270Cc.b(f6, centerX, bounds2.left);
            bounds.right = AbstractC0270Cc.b(f6, centerX, bounds2.right);
            this.N.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.g(configuration);
    }

    public final boolean d() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof C10127tf0);
    }

    public final void i() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        int i2;
        if (d()) {
            int width = this.i.getWidth();
            int gravity = this.i.getGravity();
            QV qv = this.w0;
            boolean b = qv.b(qv.A);
            qv.C = b;
            Rect rect = qv.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = qv.Z;
                    }
                } else if (b) {
                    f = rect.right;
                    f2 = qv.Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.d0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (qv.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (qv.C) {
                        f4 = qv.Z + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (qv.C) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f4 = qv.Z + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = qv.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f5 = rectF.left;
                float f6 = this.Q;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.T);
                C10127tf0 c10127tf0 = (C10127tf0) this.I;
                c10127tf0.getClass();
                c10127tf0.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = qv.Z / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.d0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (qv.Z / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = qv.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        QV qv = this.w0;
        if (qv != null) {
            qv.L = drawableState;
            ColorStateList colorStateList2 = qv.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = qv.j) != null && colorStateList.isStateful())) {
                qv.h(false);
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.i != null) {
            WeakHashMap weakHashMap = Ec4.a;
            y(isLaidOut() && isEnabled(), false);
        }
        v();
        B();
        if (z) {
            invalidate();
        }
        this.A0 = false;
    }

    public final void B() {
        C10475ug c10475ug;
        EditText editText;
        EditText editText2;
        if (this.I == null || this.R == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.i) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.i) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.W = this.u0;
        } else if (r()) {
            if (this.p0 != null) {
                A(z2, z);
            } else {
                C10475ug c10475ug2 = this.o.l;
                this.W = c10475ug2 != null ? c10475ug2.getCurrentTextColor() : -1;
            }
        } else if (!this.r || (c10475ug = this.t) == null) {
            if (z2) {
                this.W = this.o0;
            } else if (z) {
                this.W = this.n0;
            } else {
                this.W = this.m0;
            }
        } else if (this.p0 != null) {
            A(z2, z);
        } else {
            this.W = c10475ug.getCurrentTextColor();
        }
        ZA0 za0 = this.h;
        za0.j();
        ColorStateList colorStateList = za0.i;
        CheckableImageButton checkableImageButton = za0.h;
        TextInputLayout textInputLayout = za0.a;
        AbstractC0292Cg1.b(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = za0.o;
        CheckableImageButton checkableImageButton2 = za0.k;
        AbstractC0292Cg1.b(textInputLayout, checkableImageButton2, colorStateList2);
        if (za0.b() instanceof C0101Au0) {
            if (!textInputLayout.r() || checkableImageButton2.getDrawable() == null) {
                AbstractC0292Cg1.a(textInputLayout, checkableImageButton2, za0.o, za0.p);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                C10475ug c10475ug3 = textInputLayout.o.l;
                mutate.setTint(c10475ug3 != null ? c10475ug3.getCurrentTextColor() : -1);
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        C4315cj3 c4315cj3 = this.g;
        AbstractC0292Cg1.b(c4315cj3.a, c4315cj3.i, c4315cj3.j);
        if (this.R == 2) {
            int i = this.T;
            if (z2 && isEnabled()) {
                this.T = this.V;
            } else {
                this.T = this.U;
            }
            if (this.T != i && d() && !this.v0) {
                if (d()) {
                    ((C10127tf0) this.I).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                i();
            }
        }
        if (this.R == 1) {
            if (!isEnabled()) {
                this.a0 = this.r0;
            } else if (z && !z2) {
                this.a0 = this.t0;
            } else if (z2) {
                this.a0 = this.s0;
            } else {
                this.a0 = this.q0;
            }
        }
        b();
    }

    public final void A(boolean z, boolean z2) {
        int defaultColor = this.p0.getDefaultColor();
        int colorForState = this.p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.W = colorForState2;
        } else if (z2) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }
}
