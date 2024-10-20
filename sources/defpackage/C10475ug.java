package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ug, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10475ug extends TextView implements JN3, InterfaceC0975Hn {
    public final C3944bf a;
    public final C10132tg g;
    public final C6698jg h;
    public C1584Mf i;
    public boolean j;

    public C10475ug(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10475ug(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FN3.a(context);
        this.j = false;
        AbstractC3838bK3.a(getContext(), this);
        C3944bf c3944bf = new C3944bf(this);
        this.a = c3944bf;
        c3944bf.d(attributeSet, i);
        C10132tg c10132tg = new C10132tg(this);
        this.g = c10132tg;
        c10132tg.d(attributeSet, i);
        c10132tg.b();
        this.h = new C6698jg(this);
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        this.i.b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        super.setFilters(this.i.a(inputFilterArr));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        this.i.c(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.a();
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C10132tg c10132tg = this.g;
        if (c10132tg == null || InterfaceC0975Hn.b) {
            return;
        }
        c10132tg.i.a();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = InterfaceC0975Hn.b;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C10132tg c10132tg = this.g;
        if (c10132tg == null || z) {
            return;
        }
        C0030Ag c0030Ag = c10132tg.i;
        if (c0030Ag.i() && c0030Ag.a != 0) {
            return;
        }
        c0030Ag.f(i, f);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C10132tg c10132tg = this.g;
        if (c10132tg == null || InterfaceC0975Hn.b) {
            return;
        }
        C0030Ag c0030Ag = c10132tg.i;
        if (c0030Ag.i() && c0030Ag.a != 0) {
            c0030Ag.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0975Hn.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.h(i);
        }
    }

    @Override // android.widget.TextView, defpackage.InterfaceC0975Hn
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0975Hn.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0975Hn.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (InterfaceC0975Hn.b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            return c10132tg.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (InterfaceC0975Hn.b) {
            return super.getAutoSizeStepGranularity();
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            return Math.round(c10132tg.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (InterfaceC0975Hn.b) {
            return super.getAutoSizeMinTextSize();
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            return Math.round(c10132tg.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (InterfaceC0975Hn.b) {
            return super.getAutoSizeMaxTextSize();
        }
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            return Math.round(c10132tg.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0975Hn.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C10132tg c10132tg = this.g;
        return c10132tg != null ? c10132tg.i.f : new int[0];
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.g.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            AbstractC1800Nw0.c(editorInfo, getText());
        }
        AbstractC1714Nf.a(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            GJ3.a(i, this);
        }
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            GJ3.b(i, this);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        GJ3.c(i, this);
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
    public final CharSequence getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        C6698jg c6698jg;
        if (Build.VERSION.SDK_INT < 28 && (c6698jg = this.h) != null) {
            c6698jg.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        C6698jg c6698jg;
        if (Build.VERSION.SDK_INT < 28 && (c6698jg = this.h) != null) {
            TextClassifier textClassifier = c6698jg.b;
            return textClassifier == null ? AbstractC6355ig.a(c6698jg.a) : textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC2884Wf.a(context, i) : null, i2 != 0 ? AbstractC2884Wf.a(context, i2) : null, i3 != 0 ? AbstractC2884Wf.a(context, i3) : null, i4 != 0 ? AbstractC2884Wf.a(context, i4) : null);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC2884Wf.a(context, i) : null, i2 != 0 ? AbstractC2884Wf.a(context, i2) : null, i3 != 0 ? AbstractC2884Wf.a(context, i3) : null, i4 != 0 ? AbstractC2884Wf.a(context, i4) : null);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // defpackage.JN3
    public final void f(ColorStateList colorStateList) {
        C10132tg c10132tg = this.g;
        c10132tg.i(colorStateList);
        c10132tg.b();
    }

    @Override // defpackage.JN3
    public final void a(PorterDuff.Mode mode) {
        C10132tg c10132tg = this.g;
        c10132tg.j(mode);
        c10132tg.b();
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.j) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            EZ3 ez3 = AbstractC10095tZ3.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.j = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.j = false;
        }
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }
}
