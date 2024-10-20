package org.chromium.components.browser_ui.widget;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.android.chrome.R;
import defpackage.C2720Uy0;
import defpackage.JG2;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SurfaceColorDrawable extends GradientDrawable {
    public float a;
    public float b;

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.Callback getCallback() {
        return null;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return null;
    }

    public final void a(Resources.Theme theme) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.f6670_resource_name_obfuscated_res_0x7f0501c8, typedValue, true);
        boolean z = typedValue.data != 0;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(R.attr.f6660_resource_name_obfuscated_res_0x7f0501c7, typedValue2, true);
        int i = typedValue2.data;
        TypedValue typedValue3 = new TypedValue();
        theme.resolveAttribute(R.attr.f6650_resource_name_obfuscated_res_0x7f0501c6, typedValue3, true);
        int i2 = typedValue3.data;
        TypedValue typedValue4 = new TypedValue();
        theme.resolveAttribute(R.attr.f5490_resource_name_obfuscated_res_0x7f050152, typedValue4, true);
        int i3 = typedValue4.data;
        int b = new C2720Uy0(z, i, i2, i3, this.b).b(i3, this.a);
        if (getColors() == null) {
            setColor(b);
        } else {
            setTint(b);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, JG2.O0);
        this.a = obtainAttributes.getDimensionPixelSize(0, 0);
        obtainAttributes.recycle();
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        this.b = resources.getDisplayMetrics().density;
        if (theme != null) {
            a(theme);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        a(theme);
    }
}
