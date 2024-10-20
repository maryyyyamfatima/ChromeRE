package org.chromium.components.browser_ui.settings;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.AbstractC2884Wf;
import defpackage.AbstractC4871eL1;
import defpackage.C1812Ny2;
import defpackage.FI2;
import defpackage.InterfaceC4184cL1;
import defpackage.JG2;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeBasePreference extends Preference {
    public final ColorStateList T;
    public InterfaceC4184cL1 U;
    public Boolean V;
    public Boolean W;
    public final String X;

    public ChromeBasePreference(Context context) {
        this(context, null);
    }

    public ChromeBasePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        N();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.D);
        this.T = obtainStyledAttributes.getColorStateList(0);
        this.X = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void v(C1812Ny2 c1812Ny2) {
        ColorStateList colorStateList;
        int i;
        super.v(c1812Ny2);
        if (this.p == null && (i = this.o) != 0) {
            this.p = AbstractC2884Wf.a(this.a, i);
        }
        Drawable drawable = this.p;
        if (drawable != null && (colorStateList = this.T) != null) {
            drawable.setColorFilter(colorStateList.getDefaultColor(), PorterDuff.Mode.SRC_IN);
        }
        AbstractC4871eL1.c(this.U, this, c1812Ny2.a);
        Boolean bool = this.V;
        if (bool != null) {
            c1812Ny2.C = bool.booleanValue();
        }
        Boolean bool2 = this.W;
        if (bool2 != null) {
            c1812Ny2.D = bool2.booleanValue();
        }
    }

    public final void W(boolean z) {
        this.W = Boolean.valueOf(z);
    }

    @Override // androidx.preference.Preference
    public final void w() {
        String str;
        if (AbstractC4871eL1.d(this.U, this) || (str = this.X) == null) {
            return;
        }
        FI2.a(str);
    }
}
