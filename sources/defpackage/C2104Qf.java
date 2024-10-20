package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qf */
/* loaded from: classes.dex */
public final class C2104Qf extends MultiAutoCompleteTextView implements JN3 {
    public static final int[] i = {R.attr.popupBackground};
    public final C3944bf a;
    public final C10132tg g;
    public final C1455Lf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2104Qf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05003c);
        FN3.a(context);
        AbstractC3838bK3.a(getContext(), this);
        IN3 m = IN3.m(getContext(), attributeSet, i, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05003c);
        if (m.l(0)) {
            setDropDownBackgroundDrawable(m.e(0));
        }
        m.n();
        C3944bf c3944bf = new C3944bf(this);
        this.a = c3944bf;
        c3944bf.d(attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05003c);
        C10132tg c10132tg = new C10132tg(this);
        this.g = c10132tg;
        c10132tg.d(attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05003c);
        c10132tg.b();
        C1455Lf c1455Lf = new C1455Lf(this);
        this.h = c1455Lf;
        c1455Lf.b(attributeSet, com.android.chrome.R.attr.0_resource_name_obfuscated_res_0x7f05003c);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a = c1455Lf.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(AbstractC2884Wf.a(getContext(), i2));
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i2);
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

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.e(context, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1714Nf.a(this, editorInfo, onCreateInputConnection);
        return this.h.c(onCreateInputConnection);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.a(keyListener));
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
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
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
}
