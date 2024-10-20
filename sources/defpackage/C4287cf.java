package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4287cf extends Button implements InterfaceC0975Hn, JN3 {
    public final C3944bf a;
    public final C10132tg g;
    public C1584Mf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4287cf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FN3.a(context);
        AbstractC3838bK3.a(getContext(), this);
        C3944bf c3944bf = new C3944bf(this);
        this.a = c3944bf;
        c3944bf.d(attributeSet, i);
        C10132tg c10132tg = new C10132tg(this);
        this.g = c10132tg;
        c10132tg.d(attributeSet, i);
        c10132tg.b();
        if (this.h == null) {
            this.h = new C1584Mf(this);
        }
        this.h.b(attributeSet, i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3944bf c3944bf = this.a;
        if (c3944bf != null) {
            c3944bf.f(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C10132tg c10132tg = this.g;
        if (c10132tg != null) {
            c10132tg.e(context, i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(GJ3.e(callback, this));
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return GJ3.d(super.getCustomSelectionActionModeCallback());
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
    public final void setFilters(InputFilter[] inputFilterArr) {
        if (this.h == null) {
            this.h = new C1584Mf(this);
        }
        super.setFilters(this.h.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        if (this.h == null) {
            this.h = new C1584Mf(this);
        }
        this.h.c(z);
    }
}
