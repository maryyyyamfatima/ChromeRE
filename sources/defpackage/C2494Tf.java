package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2494Tf extends RadioButton implements JN3 {
    public final C6006hf a;
    public final C3944bf g;
    public final C10132tg h;
    public C1584Mf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2494Tf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1);
        FN3.a(context);
        AbstractC3838bK3.a(getContext(), this);
        C6006hf c6006hf = new C6006hf(this);
        this.a = c6006hf;
        c6006hf.b(attributeSet, R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1);
        C3944bf c3944bf = new C3944bf(this);
        this.g = c3944bf;
        c3944bf.d(attributeSet, R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1);
        C10132tg c10132tg = new C10132tg(this);
        this.h = c10132tg;
        c10132tg.d(attributeSet, R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1);
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        this.i.b(attributeSet, R.attr.f11720_resource_name_obfuscated_res_0x7f0503c1);
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.i == null) {
            this.i = new C1584Mf(this);
        }
        super.setFilters(this.i.a(inputFilterArr));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C6006hf c6006hf = this.a;
        if (c6006hf != null) {
            if (c6006hf.f) {
                c6006hf.f = false;
            } else {
                c6006hf.f = true;
                c6006hf.a();
            }
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC2884Wf.a(getContext(), i));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C6006hf c6006hf = this.a;
        if (c6006hf != null) {
            c6006hf.getClass();
        }
        return compoundPaddingLeft;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3944bf c3944bf = this.g;
        if (c3944bf != null) {
            c3944bf.a();
        }
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10132tg c10132tg = this.h;
        if (c10132tg != null) {
            c10132tg.b();
        }
    }

    @Override // defpackage.JN3
    public final void f(ColorStateList colorStateList) {
        C10132tg c10132tg = this.h;
        c10132tg.i(colorStateList);
        c10132tg.b();
    }

    @Override // defpackage.JN3
    public final void a(PorterDuff.Mode mode) {
        C10132tg c10132tg = this.h;
        c10132tg.j(mode);
        c10132tg.b();
    }
}
